package vendingmachine.plugin.ui;

import java.text.DecimalFormat;
import java.util.List;

import org.eclipse.core.databinding.Binding;
import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.emf.databinding.EMFObservables;
import org.eclipse.jface.databinding.swt.ISWTObservableValue;
import org.eclipse.jface.databinding.swt.SWTObservables;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Text;

import virtualVendingMachine.virtualVendingMachine.Product;
import virtualVendingMachine.virtualVendingMachine.virtualVendingMachinePackage;

public class YourMoneyComposite extends Composite {
	private SelectorPanelDialog panelDialog;
	private List<Product> products;

	private Text cashAdded_1;
	private DataBindingContext context;
	private Binding bindValue;

	/**
	 * Create the composite.
	 * 
	 * @param parent
	 * @param style
	 */
	public YourMoneyComposite(Composite parent, int style,
			List<Product> products, SelectorPanelDialog panelDialog) {
		super(parent, style);
		this.panelDialog = panelDialog;
		context = new DataBindingContext();
		this.products = products;
		setLayout(new FormLayout());

		Button quartersButton = new Button(this, SWT.NONE);
		FormData fd_quartersButton = new FormData();
		fd_quartersButton.top = new FormAttachment(0, 5);
		fd_quartersButton.left = new FormAttachment(0, 5);
		quartersButton.setLayoutData(fd_quartersButton);
		quartersButton
				.setImage(SWTResourceManager
						.getImage("/home/kaushik/vendingmachine/vendingmachine/virtualVendingMachineFinal/images/QUARTER.JPG"));
		quartersButton.addListener(SWT.Selection, new QuarterListener(
				panelDialog));
		Button dimeButton = new Button(this, SWT.NONE);
		FormData fd_dimeButton = new FormData();
		fd_dimeButton.top = new FormAttachment(0, 5);
		fd_dimeButton.left = new FormAttachment(0, 84);
		dimeButton.setLayoutData(fd_dimeButton);
		dimeButton
				.setImage(SWTResourceManager
						.getImage("/home/kaushik/vendingmachine/vendingmachine/virtualVendingMachineFinal/images/DIME.JPG"));
		dimeButton.addListener(SWT.Selection, new DimeListener(panelDialog));
		Button nickelButton = new Button(this, SWT.NONE);
		FormData fd_nickelButton = new FormData();
		fd_nickelButton.top = new FormAttachment(0, 5);
		fd_nickelButton.left = new FormAttachment(0, 163);
		nickelButton.setLayoutData(fd_nickelButton);
		nickelButton
				.setImage(SWTResourceManager
						.getImage("/home/kaushik/vendingmachine/vendingmachine/virtualVendingMachineFinal/images/NICKEL.JPG"));
		nickelButton
				.addListener(SWT.Selection, new NickelListener(panelDialog));
		Composite selectorButtons = new Composite(this, SWT.NONE);
		FormData fd_selectorButtons = new FormData();
		fd_selectorButtons.bottom = new FormAttachment(0, 307);
		fd_selectorButtons.right = new FormAttachment(0, 619);
		fd_selectorButtons.top = new FormAttachment(0);
		fd_selectorButtons.left = new FormAttachment(0, 241);
		selectorButtons.setLayoutData(fd_selectorButtons);
		selectorButtons.setLayout(new GridLayout(1, false));

		cashAdded_1 = new Text(this, SWT.NONE);
		FormData fd_cashAdded_1 = new FormData();
		fd_cashAdded_1.top = new FormAttachment(quartersButton, 28);
		fd_cashAdded_1.left = new FormAttachment(quartersButton, 0, SWT.LEFT);
		cashAdded_1.setLayoutData(fd_cashAdded_1);

		// cashAdded.setText();

		SelectorButton[] buttons = new SelectorButton[products.size()];
		for (int i = 0; i < products.size(); i++) {
			buttons[i] = new SelectorButton(selectorButtons, this,
					products.get(i));

		}

		// setLayoutData(new RowData(332, 265));

	}

	public void bindValues() {
		cashAdded_1.setEnabled(false);
		ISWTObservableValue observeText = SWTObservables.observeText(
				cashAdded_1, SWT.Modify);
		IObservableValue observeValue = EMFObservables.observeValue(
				getPanelDialog().getPayMachine(),
				virtualVendingMachinePackage.eINSTANCE
						.getPayMachine_M_dBalance());
		bindValue = context.bindValue(observeText, observeValue);
	}

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}

	public SelectorPanelDialog getPanelDialog() {
		return panelDialog;
	}

	public void setPanelDialog(SelectorPanelDialog panelDialog) {
		this.panelDialog = panelDialog;
	}

	class SelectorButton extends Composite {
		private YourMoneyComposite yourMoneyComposite;

		private Composite buyInfoPanel;
		private Button buyButton;
		private Button infoButton;
		private Product product;
		private Label priceLabel;
		private Image productImage;
		private Label imageLabel;
		// private Product m_piProduct;
		private boolean m_bIsSelected;

		public SelectorButton(Composite parent,
				YourMoneyComposite yourMoneyComposite, Product product) {

			super(parent, SWT.None);
			this.yourMoneyComposite = yourMoneyComposite;
			this.product = product;
			buyInfoPanel = new Composite(this, SWT.None);
			imageLabel = new Label(buyInfoPanel, SWT.TOP);
			buyButton = new Button(buyInfoPanel, SWT.None);
			infoButton = new Button(buyInfoPanel, SWT.None);
			FillLayout fillLayout = new FillLayout();
			fillLayout.type = SWT.HORIZONTAL;
			buyInfoPanel.setLayout(fillLayout);

			priceLabel = new Label(buyInfoPanel, SWT.LEFT);

			m_bIsSelected = false;

			this.setLayout(new GridLayout());

			buyButton.addListener(SWT.Selection, new BuyListener(panelDialog,
					product));
			infoButton.addListener(SWT.Selection, new InfoListener(panelDialog,
					product));
			m_bIsSelected = false;

		}

		public void setProduct(Product piProduct) {
			product = piProduct;
			buyButton.setText("BUY");
			infoButton.setText("INFO");
			if (piProduct == null) {
				priceLabel.setImage(null);
				priceLabel.setText("");

				buyButton.setEnabled(false);
				infoButton.setEnabled(false);
				buyInfoPanel.setBackground(new Color(Display.getCurrent(), 255,
						0, 0));
				this.setBackground(new Color(Display.getCurrent(), 211, 211,
						211));
				return;
			}
			String strPrice = DecimalFormat.getCurrencyInstance().format(
					piProduct.getM_dPrice());

			productImage = new Image(Display.getCurrent(), new ImageData(
					piProduct.getM_iIcon()));

			priceLabel.setText(strPrice);
			imageLabel.setImage(productImage);

			if (piProduct.getM_iQuantity() > 0) {
				buyButton.setEnabled(true);
				infoButton.setEnabled(true);
				Color darkGray = new Color(Display.getCurrent(), 128, 128, 128);
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

}

class DimeListener implements Listener {
	private SelectorPanelDialog panelDialog;

	public DimeListener(SelectorPanelDialog panelDialog) {
		this.panelDialog = panelDialog;

	}

	@Override
	public void handleEvent(Event arg0) {
		this.panelDialog.insertDime();
		;

	}
}

class QuarterListener implements Listener {
	private SelectorPanelDialog panelDialog;

	public QuarterListener(SelectorPanelDialog panelDialog) {
		this.panelDialog = panelDialog;

	}

	@Override
	public void handleEvent(Event arg0) {
		this.panelDialog.insertQuarter();
		;

	}
}

class NickelListener implements Listener {
	private SelectorPanelDialog panelDialog;

	public NickelListener(SelectorPanelDialog panelDialog) {
		this.panelDialog = panelDialog;

	}

	@Override
	public void handleEvent(Event arg0) {
		this.panelDialog.insertNickel();
		;

	}
}

class BuyListener implements Listener {

	private Product product;
	private SelectorPanelDialog panelDialog;

	public BuyListener(SelectorPanelDialog panelDialog, Product product) {
		this.panelDialog = panelDialog;
		this.product = product;
	}

	@Override
	public void handleEvent(Event arg0) {
		this.panelDialog.buyItem(product);

	}
}

class InfoListener implements Listener {
	private SelectorPanelDialog panelDialog;
	private Product product;

	public InfoListener(SelectorPanelDialog panelDialog, Product product) {
		this.panelDialog = panelDialog;
		this.product = product;
	}

	@Override
	public void handleEvent(Event arg0) {
		this.panelDialog.showInfo(product);

	}
}
