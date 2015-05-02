/**
 */
package virtualVendingMachine.virtualVendingMachine.impl;

import javax.swing.Icon;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import virtualVendingMachine.virtualVendingMachine.CashRegister;
import virtualVendingMachine.virtualVendingMachine.OutputDisplay;
import virtualVendingMachine.virtualVendingMachine.PayMachine;
import virtualVendingMachine.virtualVendingMachine.Product;
import virtualVendingMachine.virtualVendingMachine.ProductDatabase;
import virtualVendingMachine.virtualVendingMachine.ProductDispenser;
import virtualVendingMachine.virtualVendingMachine.ProductSelector;
import virtualVendingMachine.virtualVendingMachine.SunCardReceipt;
import virtualVendingMachine.virtualVendingMachine.VirtualVendingMachine;
import virtualVendingMachine.virtualVendingMachine.virtualVendingMachineFactory;
import virtualVendingMachine.virtualVendingMachine.virtualVendingMachinePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class virtualVendingMachinePackageImpl extends EPackageImpl implements virtualVendingMachinePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass virtualVendingMachineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass payMachineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productSelectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cashRegisterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sunCardReceiptEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productDispenserEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productDatabaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outputDisplayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType iconEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see virtualVendingMachine.virtualVendingMachine.virtualVendingMachinePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private virtualVendingMachinePackageImpl() {
		super(eNS_URI, virtualVendingMachineFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link virtualVendingMachinePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static virtualVendingMachinePackage init() {
		if (isInited) return (virtualVendingMachinePackage)EPackage.Registry.INSTANCE.getEPackage(virtualVendingMachinePackage.eNS_URI);

		// Obtain or create and register package
		virtualVendingMachinePackageImpl thevirtualVendingMachinePackage = (virtualVendingMachinePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof virtualVendingMachinePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new virtualVendingMachinePackageImpl());

		isInited = true;

		// Create package meta-data objects
		thevirtualVendingMachinePackage.createPackageContents();

		// Initialize created meta-data
		thevirtualVendingMachinePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thevirtualVendingMachinePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(virtualVendingMachinePackage.eNS_URI, thevirtualVendingMachinePackage);
		return thevirtualVendingMachinePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVirtualVendingMachine() {
		return virtualVendingMachineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVirtualVendingMachine_M_bOutOfOrder() {
		return (EAttribute)virtualVendingMachineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVirtualVendingMachine_M_pdProducts() {
		return (EReference)virtualVendingMachineEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVirtualVendingMachine_M_psProductSelector() {
		return (EReference)virtualVendingMachineEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVirtualVendingMachine_M_odOutputDisplay() {
		return (EReference)virtualVendingMachineEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVirtualVendingMachine_M_pmPayMachine() {
		return (EReference)virtualVendingMachineEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVirtualVendingMachine_M_pdDispenser() {
		return (EReference)virtualVendingMachineEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPayMachine() {
		return payMachineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPayMachine_M_vvmOwner() {
		return (EReference)payMachineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPayMachine_M_dMaximumBalance() {
		return (EAttribute)payMachineEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPayMachine_M_crRegister() {
		return (EReference)payMachineEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPayMachine_M_dBalance() {
		return (EAttribute)payMachineEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPayMachine_M_bOutOfOrder() {
		return (EAttribute)payMachineEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProductSelector() {
		return productSelectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProductSelector_M_vvmMachine() {
		return (EReference)productSelectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCashRegister() {
		return cashRegisterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCashRegister_M_iNumQuarters() {
		return (EAttribute)cashRegisterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCashRegister_M_iNumDimes() {
		return (EAttribute)cashRegisterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCashRegister_M_iNumNickels() {
		return (EAttribute)cashRegisterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCashRegister_M_iNumDollars() {
		return (EAttribute)cashRegisterEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCashRegister_M_alReceipts() {
		return (EReference)cashRegisterEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSunCardReceipt() {
		return sunCardReceiptEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSunCardReceipt_M_iAccount() {
		return (EAttribute)sunCardReceiptEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSunCardReceipt_M_dAmountDeducted() {
		return (EAttribute)sunCardReceiptEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProductDispenser() {
		return productDispenserEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProductDatabase() {
		return productDatabaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProductDatabase_Products() {
		return (EReference)productDatabaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProduct() {
		return productEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProduct_M_iID() {
		return (EAttribute)productEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProduct_M_sName() {
		return (EAttribute)productEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProduct_M_sDescription() {
		return (EAttribute)productEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProduct_M_dPrice() {
		return (EAttribute)productEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProduct_M_iQuantity() {
		return (EAttribute)productEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProduct_M_iIcon() {
		return (EAttribute)productEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOutputDisplay() {
		return outputDisplayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutputDisplay_M_sCurrentOutput() {
		return (EAttribute)outputDisplayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getIcon() {
		return iconEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public virtualVendingMachineFactory getvirtualVendingMachineFactory() {
		return (virtualVendingMachineFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		virtualVendingMachineEClass = createEClass(VIRTUAL_VENDING_MACHINE);
		createEAttribute(virtualVendingMachineEClass, VIRTUAL_VENDING_MACHINE__MBOUT_OF_ORDER);
		createEReference(virtualVendingMachineEClass, VIRTUAL_VENDING_MACHINE__MPD_PRODUCTS);
		createEReference(virtualVendingMachineEClass, VIRTUAL_VENDING_MACHINE__MPS_PRODUCT_SELECTOR);
		createEReference(virtualVendingMachineEClass, VIRTUAL_VENDING_MACHINE__MOD_OUTPUT_DISPLAY);
		createEReference(virtualVendingMachineEClass, VIRTUAL_VENDING_MACHINE__MPM_PAY_MACHINE);
		createEReference(virtualVendingMachineEClass, VIRTUAL_VENDING_MACHINE__MPD_DISPENSER);

		payMachineEClass = createEClass(PAY_MACHINE);
		createEReference(payMachineEClass, PAY_MACHINE__MVVM_OWNER);
		createEAttribute(payMachineEClass, PAY_MACHINE__MDMAXIMUM_BALANCE);
		createEReference(payMachineEClass, PAY_MACHINE__MCR_REGISTER);
		createEAttribute(payMachineEClass, PAY_MACHINE__MDBALANCE);
		createEAttribute(payMachineEClass, PAY_MACHINE__MBOUT_OF_ORDER);

		productSelectorEClass = createEClass(PRODUCT_SELECTOR);
		createEReference(productSelectorEClass, PRODUCT_SELECTOR__MVVM_MACHINE);

		cashRegisterEClass = createEClass(CASH_REGISTER);
		createEAttribute(cashRegisterEClass, CASH_REGISTER__MINUM_QUARTERS);
		createEAttribute(cashRegisterEClass, CASH_REGISTER__MINUM_DIMES);
		createEAttribute(cashRegisterEClass, CASH_REGISTER__MINUM_NICKELS);
		createEAttribute(cashRegisterEClass, CASH_REGISTER__MINUM_DOLLARS);
		createEReference(cashRegisterEClass, CASH_REGISTER__MAL_RECEIPTS);

		sunCardReceiptEClass = createEClass(SUN_CARD_RECEIPT);
		createEAttribute(sunCardReceiptEClass, SUN_CARD_RECEIPT__MIACCOUNT);
		createEAttribute(sunCardReceiptEClass, SUN_CARD_RECEIPT__MDAMOUNT_DEDUCTED);

		productDispenserEClass = createEClass(PRODUCT_DISPENSER);

		productDatabaseEClass = createEClass(PRODUCT_DATABASE);
		createEReference(productDatabaseEClass, PRODUCT_DATABASE__PRODUCTS);

		productEClass = createEClass(PRODUCT);
		createEAttribute(productEClass, PRODUCT__MIID);
		createEAttribute(productEClass, PRODUCT__MSNAME);
		createEAttribute(productEClass, PRODUCT__MSDESCRIPTION);
		createEAttribute(productEClass, PRODUCT__MDPRICE);
		createEAttribute(productEClass, PRODUCT__MIQUANTITY);
		createEAttribute(productEClass, PRODUCT__MIICON);

		outputDisplayEClass = createEClass(OUTPUT_DISPLAY);
		createEAttribute(outputDisplayEClass, OUTPUT_DISPLAY__MSCURRENT_OUTPUT);

		// Create data types
		iconEDataType = createEDataType(ICON);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(virtualVendingMachineEClass, VirtualVendingMachine.class, "VirtualVendingMachine", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVirtualVendingMachine_M_bOutOfOrder(), ecorePackage.getEBoolean(), "m_bOutOfOrder", "false", 0, 1, VirtualVendingMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVirtualVendingMachine_M_pdProducts(), this.getProductDatabase(), null, "m_pdProducts", null, 0, 1, VirtualVendingMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVirtualVendingMachine_M_psProductSelector(), this.getProductSelector(), this.getProductSelector_M_vvmMachine(), "m_psProductSelector", null, 0, 1, VirtualVendingMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVirtualVendingMachine_M_odOutputDisplay(), this.getOutputDisplay(), null, "m_odOutputDisplay", null, 0, 1, VirtualVendingMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVirtualVendingMachine_M_pmPayMachine(), this.getPayMachine(), this.getPayMachine_M_vvmOwner(), "m_pmPayMachine", null, 0, 1, VirtualVendingMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVirtualVendingMachine_M_pdDispenser(), this.getProductDispenser(), null, "m_pdDispenser", null, 0, 1, VirtualVendingMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(payMachineEClass, PayMachine.class, "PayMachine", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPayMachine_M_vvmOwner(), this.getVirtualVendingMachine(), this.getVirtualVendingMachine_M_pmPayMachine(), "m_vvmOwner", null, 0, 1, PayMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPayMachine_M_dMaximumBalance(), ecorePackage.getEDouble(), "m_dMaximumBalance", null, 0, 1, PayMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPayMachine_M_crRegister(), this.getCashRegister(), null, "m_crRegister", null, 0, 1, PayMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPayMachine_M_dBalance(), ecorePackage.getEDouble(), "m_dBalance", "0.00", 0, 1, PayMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPayMachine_M_bOutOfOrder(), ecorePackage.getEBoolean(), "m_bOutOfOrder", "false", 0, 1, PayMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(productSelectorEClass, ProductSelector.class, "ProductSelector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProductSelector_M_vvmMachine(), this.getVirtualVendingMachine(), this.getVirtualVendingMachine_M_psProductSelector(), "m_vvmMachine", null, 0, 1, ProductSelector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cashRegisterEClass, CashRegister.class, "CashRegister", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCashRegister_M_iNumQuarters(), ecorePackage.getEInt(), "m_iNumQuarters", null, 0, 1, CashRegister.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCashRegister_M_iNumDimes(), ecorePackage.getEInt(), "m_iNumDimes", null, 0, 1, CashRegister.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCashRegister_M_iNumNickels(), ecorePackage.getEInt(), "m_iNumNickels", null, 0, 1, CashRegister.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCashRegister_M_iNumDollars(), ecorePackage.getEInt(), "m_iNumDollars", null, 0, 1, CashRegister.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCashRegister_M_alReceipts(), this.getSunCardReceipt(), null, "m_alReceipts", null, 0, -1, CashRegister.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sunCardReceiptEClass, SunCardReceipt.class, "SunCardReceipt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSunCardReceipt_M_iAccount(), ecorePackage.getEInt(), "m_iAccount", null, 0, 1, SunCardReceipt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSunCardReceipt_M_dAmountDeducted(), ecorePackage.getEDouble(), "m_dAmountDeducted", null, 0, 1, SunCardReceipt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(productDispenserEClass, ProductDispenser.class, "ProductDispenser", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(productDatabaseEClass, ProductDatabase.class, "ProductDatabase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProductDatabase_Products(), this.getProduct(), null, "products", null, 0, -1, ProductDatabase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(productEClass, Product.class, "Product", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProduct_M_iID(), ecorePackage.getEInt(), "m_iID", null, 0, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProduct_M_sName(), ecorePackage.getEString(), "m_sName", null, 0, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProduct_M_sDescription(), ecorePackage.getEString(), "m_sDescription", null, 0, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProduct_M_dPrice(), ecorePackage.getEDouble(), "m_dPrice", null, 0, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProduct_M_iQuantity(), ecorePackage.getEInt(), "m_iQuantity", null, 0, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProduct_M_iIcon(), ecorePackage.getEString(), "m_iIcon", null, 0, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(outputDisplayEClass, OutputDisplay.class, "OutputDisplay", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOutputDisplay_M_sCurrentOutput(), ecorePackage.getEString(), "m_sCurrentOutput", null, 0, 1, OutputDisplay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize data types
		initEDataType(iconEDataType, Icon.class, "Icon", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //virtualVendingMachinePackageImpl
