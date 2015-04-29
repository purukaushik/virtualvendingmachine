package vendingmachine.plugin.ui;

import java.io.IOException;
import java.text.DecimalFormat;

import org.eclipse.core.databinding.Binding;
import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.command.BasicCommandStack;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Shell;

import virtualVendingMachine.virtualVendingMachine.Product;
import virtualVendingMachine.virtualVendingMachine.VirtualVendingMachine;

public class SelectorPanelDialog extends Dialog {

	private SelectorButton[] buttons;
	private DataBindingContext context;
	private Binding bindValue;
	private ComposedAdapterFactory composedAdapterFactory;
	private Resource resource;
	private Product[] products;
	

	protected SelectorPanelDialog(Shell parentShell) {
		super(parentShell);

	}

	@Override
	protected Control createDialogArea(Composite parent) {
		context = new DataBindingContext();

		Composite root = (Composite) super.createDialogArea(parent);
		root.setLayout(new GridLayout(5, true));

		buttons = new SelectorButton[5];
		for (int i = 0; i < 5; i++) {
			buttons[i] = new SelectorButton(root, this);
			buttons[i].setProduct(products[i]);
		}

		root.layout();
		parent.pack();
		return parent;
	}

	protected void loadContent(IFile file) throws IOException {
		AdapterFactoryEditingDomain editingDomain = new AdapterFactoryEditingDomain(
				getAdapterFactory(), new BasicCommandStack());
		resource = editingDomain.createResource(file.getFullPath().toString());
		resource.load(null);
		// EObject eObject = resource.getContents().get(0); TODO: what to set
		// here?
		// setLeague((League) eObject);
		
		EObject eObject = resource.getContents().get(0); // vending Machine
		VirtualVendingMachine machine = (VirtualVendingMachine) eObject;
		products = (Product[]) machine.getM_pdProducts().getProducts().toArray();
		
	}

	

	protected AdapterFactory getAdapterFactory() {
		if (composedAdapterFactory == null) {
			composedAdapterFactory = new ComposedAdapterFactory(
					ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
		}
		return composedAdapterFactory;
	}

	class SelectorButton extends Composite {
		private SelectorPanelDialog selectorPanelDialog;

		private Composite buyInfoPanel;
		private Button buyButton;
		private Button infoButton;
		private Product product;
		private Label priceLabel;

		// private Product m_piProduct;
		private boolean m_bIsSelected;

		public SelectorButton(Composite spParent,
				SelectorPanelDialog selectorPanelDialog) {

			super(spParent, SWT.None);
			this.selectorPanelDialog = selectorPanelDialog;

			buyInfoPanel = new Composite(this, SWT.None);
			buyButton = new Button(buyInfoPanel, SWT.None);
			infoButton = new Button(buyInfoPanel, SWT.None);
			FillLayout fillLayout = new FillLayout();
			fillLayout.type = SWT.HORIZONTAL;
			buyInfoPanel.setLayout(fillLayout);

			priceLabel = new Label(buyInfoPanel, SWT.LEFT);

			m_bIsSelected = false;

			this.setLayout(new GridLayout());

			buyButton.addListener(SWT.Selection, new Listener() {

				@Override
				public void handleEvent(Event arg0) {
					SelectorButton.this.selectorPanelDialog.buyItem(product);

				}
			});
			infoButton.addListener(SWT.Selection, new Listener() {

				@Override
				public void handleEvent(Event arg0) {
					SelectorButton.this.selectorPanelDialog.showInfo(product);

				}
			});
			m_bIsSelected = false;
			this.setProduct(product);
		}

		public void setProduct(Product piProduct) {
			product = piProduct;

			if (piProduct == null) {
				priceLabel.setImage(null);
				priceLabel.setText("");
				buyButton.setEnabled(false);
				infoButton.setEnabled(false);
				buyInfoPanel.setBackground(new Color(Display.getCurrent(), 255,
						0, 0));
				this.setBackground(new Color(Display.getCurrent(), 211, 211,
						211));
			} else {
				String strPrice = DecimalFormat.getCurrencyInstance().format(
						piProduct.getM_dPrice());

				// priceLabel.setImage(piProduct.getM_iIcon()); TODO: handle
				// icons
				priceLabel.setText(strPrice);

				if (piProduct.getM_iQuantity() > 0) {
					buyButton.setEnabled(true);
					infoButton.setEnabled(true);
					Color darkGray = new Color(Display.getCurrent(), 128, 128,
							128);
					buyInfoPanel.setBackground(darkGray);
					this.setBackground(darkGray);
				} else {
					buyButton.setEnabled(false);
					infoButton.setEnabled(true);
					Color red = new Color(Display.getCurrent(), 255, 0, 0);
					buyInfoPanel.setBackground(red);
					this.setBackground(red);
				}
			}
		}

		/*
		 * public Product getProduct() { return m_piProduct; }
		 */
		public void setSelected(boolean bSelected) {
			if (bSelected == true) {
				Color selectedColor = new Color(Display.getCurrent(), 0, 200, 0);
				buyInfoPanel.setBackground(selectedColor);
				this.setBackground(selectedColor);
			} else {
				setProduct(product);
			}
		}
	}

	protected void buyItem(Product product) {
		// TODO Auto-generated method stub

	}

	protected void showInfo(Product product) {
		// TODO Auto-generated method stub

	}

}
