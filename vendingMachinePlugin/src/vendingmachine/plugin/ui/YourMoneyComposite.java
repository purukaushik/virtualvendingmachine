package vendingmachine.plugin.ui;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.List;

import org.eclipse.core.databinding.Binding;
import org.eclipse.core.databinding.DataBindingContext;
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

import vendingmachine.plugin.ui.SelectorPanelDialog.Coin;
import virtualVendingMachine.virtualVendingMachine.Product;
import org.eclipse.wb.swt.SWTResourceManager;

public class YourMoneyComposite extends Composite {

	private static final int QRTR_BUTTON_ID = 1;
	private static final int NICKEL_BUTTON_ID = 2;
	private static final int DIME_BUTTON_ID = 3;
	private static final int DOLLAR_BUTTON_ID = 4;
	private SelectorButton[] productSelectorButtons;
	private SelectorPanelDialog panelDialog;
	private List<Product> products;

	private Text cashAdded_1;

	public Text getCashAdded_1() {
		return cashAdded_1;
	}

	public void setCashAdded_1(Text cashAdded_1) {
		this.cashAdded_1 = cashAdded_1;
	}

	private DataBindingContext context;
	private Binding bindValue;
	private Text notEnoughMoneyLabel;
	private Text infoText;

	public Text getReturnedChange() {
		return returnedChange;
	}

	public void setReturnedChange(Text returnedChange) {
		this.returnedChange = returnedChange;
	}

	private Text returnedChange;
	private Label lblReturnedChange;

	public Text getInfoText() {
		return infoText;
	}

	public Text getNotEnoughMoneyLabel() {
		return notEnoughMoneyLabel;
	}

	public void setNotEnoughMoneyLabel(Text notEnoughMoneyLabel) {
		this.notEnoughMoneyLabel = notEnoughMoneyLabel;
	}

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
		quartersButton.addListener(SWT.Selection, new CoinListener(panelDialog,
				Coin.QUARTER));

		Button dimeButton = new Button(this, SWT.NONE);
		FormData fd_dimeButton = new FormData();
		fd_dimeButton.top = new FormAttachment(0, 5);
		fd_dimeButton.left = new FormAttachment(0, 84);
		dimeButton.setLayoutData(fd_dimeButton);
		dimeButton
				.setImage(SWTResourceManager
						.getImage("/home/kaushik/vendingmachine/vendingmachine/virtualVendingMachineFinal/images/DIME.JPG"));
		dimeButton.addListener(SWT.Selection, new CoinListener(panelDialog,
				Coin.DIME));
		Button nickelButton = new Button(this, SWT.NONE);
		FormData fd_nickelButton = new FormData();
		fd_nickelButton.top = new FormAttachment(quartersButton, 0, SWT.TOP);
		fd_nickelButton.left = new FormAttachment(dimeButton, 6);
		nickelButton.setLayoutData(fd_nickelButton);
		nickelButton
				.setImage(SWTResourceManager
						.getImage("/home/kaushik/vendingmachine/vendingmachine/virtualVendingMachineFinal/images/NICKEL.JPG"));
		nickelButton.addListener(SWT.Selection, new CoinListener(panelDialog,
				Coin.NICKEL));
		Composite selectorButtons = new Composite(this, SWT.NONE);
		FormData fd_selectorButtons = new FormData();
		fd_selectorButtons.top = new FormAttachment(quartersButton, 0, SWT.TOP);
		fd_selectorButtons.right = new FormAttachment(100, -30);
		fd_selectorButtons.bottom = new FormAttachment(0, 475);
		fd_selectorButtons.left = new FormAttachment(0, 664);
		selectorButtons.setLayoutData(fd_selectorButtons);
		selectorButtons.setLayout(new GridLayout(1, false));

		cashAdded_1 = new Text(this, SWT.NONE);
		FormData fd_cashAdded_1 = new FormData();
		fd_cashAdded_1.right = new FormAttachment(0, 100);
		fd_cashAdded_1.top = new FormAttachment(0, 107);
		fd_cashAdded_1.left = new FormAttachment(0, 5);
		cashAdded_1.setLayoutData(fd_cashAdded_1);
		cashAdded_1.setForeground(SWTResourceManager.getColor(SWT.COLOR_RED));
		cashAdded_1.setEnabled(false);
		cashAdded_1.setEditable(false);
		float roundOff = getCurrencyRounded(this.panelDialog.getPayMachine()
				.getM_dBalance());
		cashAdded_1.setText("" + roundOff);

		notEnoughMoneyLabel = new Text(this, SWT.NONE);
		FormData fd_notEnoughMoneyLabel = new FormData();
		fd_notEnoughMoneyLabel.right = new FormAttachment(0, 201);
		fd_notEnoughMoneyLabel.top = new FormAttachment(0, 142);
		fd_notEnoughMoneyLabel.left = new FormAttachment(0, 5);
		notEnoughMoneyLabel.setLayoutData(fd_notEnoughMoneyLabel);
		notEnoughMoneyLabel.setBackground(SWTResourceManager
				.getColor(SWT.COLOR_RED));
		notEnoughMoneyLabel.setText(" ");
		notEnoughMoneyLabel.setForeground(SWTResourceManager
				.getColor(SWT.COLOR_WHITE));
		notEnoughMoneyLabel.setEnabled(false);
		notEnoughMoneyLabel.setEditable(false);

		infoText = new Text(this, SWT.WRAP);
		infoText.setEnabled(false);
		infoText.setEditable(false);
		FormData fd_text = new FormData();
		fd_text.right = new FormAttachment(selectorButtons, -427);
		fd_text.left = new FormAttachment(0, 5);
		fd_text.top = new FormAttachment(notEnoughMoneyLabel, 26);
		fd_text.bottom = new FormAttachment(100);
		infoText.setLayoutData(fd_text);

		this.productSelectorButtons = new SelectorButton[products.size()];

		Button btnNewButton = new Button(this, SWT.NONE);
		btnNewButton.setImage(SWTResourceManager
				.getImage("/home/kaushik/images/DOLLAR.JPG"));
		FormData fd_btnNewButton = new FormData();
		fd_btnNewButton.top = new FormAttachment(quartersButton, 0, SWT.TOP);
		fd_btnNewButton.left = new FormAttachment(nickelButton, 6);
		btnNewButton.setLayoutData(fd_btnNewButton);

		returnedChange = new Text(this, SWT.BORDER);
		returnedChange.setEnabled(false);
		returnedChange.setEditable(false);
		FormData rtc_text = new FormData();
		rtc_text.top = new FormAttachment(btnNewButton);
		rtc_text.right = new FormAttachment(selectorButtons, -192);
		returnedChange.setLayoutData(rtc_text);

		lblReturnedChange = new Label(this, SWT.NONE);
		FormData fd_lblReturnedChange = new FormData();
		fd_lblReturnedChange.bottom = new FormAttachment(cashAdded_1, 0,
				SWT.BOTTOM);
		fd_lblReturnedChange.right = new FormAttachment(returnedChange, -17);
		lblReturnedChange.setLayoutData(fd_lblReturnedChange);
		lblReturnedChange.setVisible(false);
		lblReturnedChange.setText("Returned Change:");
		btnNewButton.addListener(SWT.Selection, new CoinListener(panelDialog,
				Coin.DOLLAR));
		for (int i = 0; i < products.size(); i++) {
			productSelectorButtons[i] = new SelectorButton(selectorButtons,
					this, products.get(i));

		}

		// setLayoutData(new RowData(332, 265));

	}

	public Label getLblReturnedChange() {
		return lblReturnedChange;
	}

	public void setLblReturnedChange(Label lblReturnedChange) {
		this.lblReturnedChange = lblReturnedChange;
	}

	public static float getCurrencyRounded(double doubleValue) {
		BigDecimal value = new BigDecimal(
				Math.round(doubleValue * 100.0) / 100.0);

		float roundOff = value.stripTrailingZeros().floatValue();
		return roundOff;
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

	public void updateDisplay(Product product) {

		for (SelectorButton selectorButton : productSelectorButtons) {
			if ((product.getM_iID() == selectorButton.getProduct().getM_iID())) {
				selectorButton.setProduct(product);
			}
		}
	}

	class SelectorButton extends Composite {
		private YourMoneyComposite yourMoneyComposite;

		private Composite buyInfoPanel;
		private Button buyButton;
		private Button infoButton;
		private Product product;

		public Product getProduct() {
			return product;
		}

		private Label priceLabel;
		private Image productImage;
		private Label imageLabel;
		// private Product m_piProduct;
		private boolean m_bIsSelected;
		private int quantity = 0;

		public int getQuantity() {
			return quantity;
		}

		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}

		public SelectorButton(Composite parent,
				YourMoneyComposite yourMoneyComposite, Product product) {

			super(parent, SWT.None);
			this.yourMoneyComposite = yourMoneyComposite;

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
			this.setProduct(product);
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

class CoinListener implements Listener {
	private SelectorPanelDialog panelDialog;
	private Coin coin;

	public CoinListener(SelectorPanelDialog panelDialog, Coin coin) {
		this.panelDialog = panelDialog;
		this.coin = coin;
	}

	@Override
	public void handleEvent(Event arg0) {
		if (!coin.equals(Coin.DOLLAR)) {
			this.panelDialog.insertCoin(coin);
		} else {
			this.panelDialog.insertDollar();
		}
		this.panelDialog.setText();

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
		boolean isEnoughMoney = this.panelDialog.buyItem(product);
		if (!isEnoughMoney) {

			panelDialog.setLabel("Not Enough money");
		}
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