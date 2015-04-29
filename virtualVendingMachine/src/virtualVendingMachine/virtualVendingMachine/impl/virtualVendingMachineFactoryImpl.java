/**
 */
package virtualVendingMachine.virtualVendingMachine.impl;

import javax.swing.Icon;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import virtualVendingMachine.virtualVendingMachine.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class virtualVendingMachineFactoryImpl extends EFactoryImpl implements virtualVendingMachineFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static virtualVendingMachineFactory init() {
		try {
			virtualVendingMachineFactory thevirtualVendingMachineFactory = (virtualVendingMachineFactory)EPackage.Registry.INSTANCE.getEFactory(virtualVendingMachinePackage.eNS_URI);
			if (thevirtualVendingMachineFactory != null) {
				return thevirtualVendingMachineFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new virtualVendingMachineFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public virtualVendingMachineFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case virtualVendingMachinePackage.VIRTUAL_VENDING_MACHINE: return createVirtualVendingMachine();
			case virtualVendingMachinePackage.PAY_MACHINE: return createPayMachine();
			case virtualVendingMachinePackage.PRODUCT_SELECTOR: return createProductSelector();
			case virtualVendingMachinePackage.CASH_REGISTER: return createCashRegister();
			case virtualVendingMachinePackage.SUN_CARD_RECEIPT: return createSunCardReceipt();
			case virtualVendingMachinePackage.PRODUCT_DISPENSER: return createProductDispenser();
			case virtualVendingMachinePackage.PRODUCT_DATABASE: return createProductDatabase();
			case virtualVendingMachinePackage.PRODUCT: return createProduct();
			case virtualVendingMachinePackage.OUTPUT_DISPLAY: return createOutputDisplay();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case virtualVendingMachinePackage.ICON:
				return createIconFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case virtualVendingMachinePackage.ICON:
				return convertIconToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VirtualVendingMachine createVirtualVendingMachine() {
		VirtualVendingMachineImpl virtualVendingMachine = new VirtualVendingMachineImpl();
		return virtualVendingMachine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PayMachine createPayMachine() {
		PayMachineImpl payMachine = new PayMachineImpl();
		return payMachine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductSelector createProductSelector() {
		ProductSelectorImpl productSelector = new ProductSelectorImpl();
		return productSelector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CashRegister createCashRegister() {
		CashRegisterImpl cashRegister = new CashRegisterImpl();
		return cashRegister;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SunCardReceipt createSunCardReceipt() {
		SunCardReceiptImpl sunCardReceipt = new SunCardReceiptImpl();
		return sunCardReceipt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductDispenser createProductDispenser() {
		ProductDispenserImpl productDispenser = new ProductDispenserImpl();
		return productDispenser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductDatabase createProductDatabase() {
		ProductDatabaseImpl productDatabase = new ProductDatabaseImpl();
		return productDatabase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Product createProduct() {
		ProductImpl product = new ProductImpl();
		return product;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputDisplay createOutputDisplay() {
		OutputDisplayImpl outputDisplay = new OutputDisplayImpl();
		return outputDisplay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Icon createIconFromString(EDataType eDataType, String initialValue) {
		return (Icon)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIconToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public virtualVendingMachinePackage getvirtualVendingMachinePackage() {
		return (virtualVendingMachinePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static virtualVendingMachinePackage getPackage() {
		return virtualVendingMachinePackage.eINSTANCE;
	}

} //virtualVendingMachineFactoryImpl
