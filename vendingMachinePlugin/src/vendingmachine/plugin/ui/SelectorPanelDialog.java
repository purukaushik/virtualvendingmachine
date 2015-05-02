package vendingmachine.plugin.ui;

import java.io.IOException;
import java.util.List;

import org.eclipse.core.databinding.Binding;
import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.command.BasicCommandStack;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;

import virtualVendingMachine.virtualVendingMachine.CashRegister;
import virtualVendingMachine.virtualVendingMachine.PayMachine;
import virtualVendingMachine.virtualVendingMachine.Product;
import virtualVendingMachine.virtualVendingMachine.ProductDatabase;
import virtualVendingMachine.virtualVendingMachine.VirtualVendingMachine;
import virtualVendingMachine.virtualVendingMachine.virtualVendingMachinePackage;

public class SelectorPanelDialog extends Dialog {

	private ComposedAdapterFactory composedAdapterFactory;
	private Resource resource;
	private List<Product> products;
	private ProductDatabase productDatabase;
	private CashRegister cashRegister;
	private PayMachine payMachine;
	private YourMoneyComposite root;

	public ComposedAdapterFactory getComposedAdapterFactory() {
		return composedAdapterFactory;
	}

	public Resource getResource() {
		return resource;
	}

	public List<Product> getProducts() {
		return products;
	}

	public ProductDatabase getProductDatabase() {
		return productDatabase;
	}

	public CashRegister getCashRegister() {
		return cashRegister;
	}

	public PayMachine getPayMachine() {
		return payMachine;
	}

	protected SelectorPanelDialog(Shell parentShell) {
		super(parentShell);

	}

	@Override
	protected Control createDialogArea(Composite parent) {

		root = new YourMoneyComposite(parent, SWT.NONE, products, this);

		root.layout();
		parent.pack();
		return parent;
	}

	protected void loadContent(IFile file) throws IOException {
		AdapterFactoryEditingDomain editingDomain = new AdapterFactoryEditingDomain(
				getAdapterFactory(), new BasicCommandStack());
		resource = editingDomain.createResource(file.getFullPath().toString());
		resource.load(null);

		EObject eObject = resource.getContents().get(0); // vending Machine
		VirtualVendingMachine virtualVendingMachine = (VirtualVendingMachine) eObject;
		this.payMachine = virtualVendingMachine.getM_pmPayMachine();
		this.cashRegister = virtualVendingMachine.getM_pmPayMachine()
				.getM_crRegister();
		this.productDatabase = virtualVendingMachine.getM_pdProducts();
		products = (List<Product>) productDatabase.getProducts();

	}

	protected AdapterFactory getAdapterFactory() {
		if (composedAdapterFactory == null) {
			composedAdapterFactory = new ComposedAdapterFactory(
					ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
		}
		return composedAdapterFactory;
	}

	protected boolean buyItem(Product param) {

		int productId = param.getM_iID();

		for (Product pdt : products) {
			if (productId == pdt.getM_iID()) {
				double money = this.payMachine.getM_dBalance();
				double price = pdt.getM_dPrice();
				if (money >= price) {
					pdt.setM_iQuantity(pdt.getM_iQuantity() - 1);
					param = pdt;
					this.payMachine.setM_dBalance(money - price);
					
					try {
						resource.save(null);
					} catch (IOException e) {

						e.printStackTrace();
					}
					this.setText();
				} else {
					return false;
				}
			}
		}
		/*
		 * EditingDomain editingDomain = AdapterFactoryEditingDomain
		 * .getEditingDomainFor(productDatabase);
		 * 
		 * Command command = SetCommand.create(editingDomain, productDatabase,
		 * virtualVendingMachinePackage.eINSTANCE
		 * .getProductDatabase_Products(), products);
		 * 
		 * editingDomain.getCommandStack().execute(command);/
		 * 
		 * EObject eObject = resource.getContents().get(0); // vending Machine
		 * VirtualVendingMachine virtualVendingMachine = (VirtualVendingMachine)
		 * eObject;
		 * 
		 * ProductDatabase productDatabase =
		 * virtualVendingMachine.getM_pdProducts();
		 * 
		 * products = (List<Product>) productDatabase.getProducts();
		 * 
		 * this.productDatabase = productDatabase;
		 */

		return true;
	}

	protected void showInfo(Product product) {
		root.getInfoText().setText(product.getM_sDescription());

	}

	public double maximumChange(CashRegister cashRegister) {

		double m_dNickelsAndDimes = 0.10 * cashRegister.getM_iNumDimes() + 0.05
				* cashRegister.getM_iNumNickels();

		if (cashRegister.getM_iNumNickels() == 0)
			return 0;
		else if (m_dNickelsAndDimes < 0.20)
			return m_dNickelsAndDimes;
		else
			return 0.25 * cashRegister.getM_iNumQuarters() + m_dNickelsAndDimes;
	}

	class CoinCount {
		public int NUM_QUARTERS = 0;
		public int NUM_DIMES = 0;
		public int NUM_NICKELS = 0;
	}

	public void insertQuarter() {
		if (payMachine.getM_dBalance() <= payMachine.getM_dMaximumBalance() - 0.25) {
			payMachine.setM_dBalance(payMachine.getM_dBalance() + 0.25);
			payMachine.getM_crRegister().setM_iNumQuarters(
					payMachine.getM_crRegister().getM_iNumQuarters() + 1);
		} else {
			returnChange(1, 0, 0);
		}
		balanceUpdated(payMachine.getM_dBalance());

	}

	public void insertDime() {
		if (payMachine.getM_dBalance() <= payMachine.getM_dMaximumBalance() - 0.10) {
			payMachine.setM_dBalance(payMachine.getM_dBalance() + 0.10);
			payMachine.getM_crRegister().setM_iNumDimes(
					payMachine.getM_crRegister().getM_iNumDimes() + 1);
		} else {
			returnChange(0, 1, 0);

		}
		balanceUpdated(payMachine.getM_dBalance());

	}

	public void insertNickel() {
		if (payMachine.getM_dBalance() <= payMachine.getM_dMaximumBalance() - 0.05) {
			payMachine.setM_dBalance(payMachine.getM_dBalance() + 0.05);
			payMachine.getM_crRegister().setM_iNumNickels(
					payMachine.getM_crRegister().getM_iNumNickels() + 1);
		} else {
			returnChange(0, 0, 1);

		}

		balanceUpdated(payMachine.getM_dBalance());

	}

	public boolean insertDollar() {
		double dNewBalance = payMachine.getM_dBalance() + 1.00;

		if (dNewBalance <= payMachine.getM_dMaximumBalance()) {
			if (maximumChange(payMachine.getM_crRegister()) >= dNewBalance) {
				payMachine.setM_dBalance(dNewBalance);
				payMachine.getM_crRegister().setM_iNumDollars(
						payMachine.getM_crRegister().getM_iNumDollars());
				balanceUpdated(payMachine.getM_dBalance());
				return true;
			}
		}

		return false;
	}

	public void balanceUpdated(double dBalance) {
		// jtfBalance.setText(NumberFormat.getCurrencyInstance().format(dBalance));
	}

	public void returnChange(int iQuarters, int iDimes, int iNickels) {
		/*
		 * TODO: animation if (m_ymfYourMoney != null) {
		 * m_ymfYourMoney.coinReturn(iQuarters, iDimes, iNickels); }
		 */
	}

	public void setText() {
		root.getCashAdded_1().setText(
				""
						+ YourMoneyComposite.getDisplayableText(this.payMachine
								.getM_dBalance()));
	}

	public void setLabel(String arg) {
		root.getNotEnoughMoneyLabel().setText(arg);
		root.redraw();
		root.update();
	}
}
