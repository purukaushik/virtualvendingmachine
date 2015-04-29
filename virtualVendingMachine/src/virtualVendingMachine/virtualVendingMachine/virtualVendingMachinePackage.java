/**
 */
package virtualVendingMachine.virtualVendingMachine;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see virtualVendingMachine.virtualVendingMachine.virtualVendingMachineFactory
 * @model kind="package"
 * @generated
 */
public interface virtualVendingMachinePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "virtualVendingMachine";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://virtualVendingMachine";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "virtualVendingMachine";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	virtualVendingMachinePackage eINSTANCE = virtualVendingMachine.virtualVendingMachine.impl.virtualVendingMachinePackageImpl.init();

	/**
	 * The meta object id for the '{@link virtualVendingMachine.virtualVendingMachine.impl.VirtualVendingMachineImpl <em>Virtual Vending Machine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see virtualVendingMachine.virtualVendingMachine.impl.VirtualVendingMachineImpl
	 * @see virtualVendingMachine.virtualVendingMachine.impl.virtualVendingMachinePackageImpl#getVirtualVendingMachine()
	 * @generated
	 */
	int VIRTUAL_VENDING_MACHINE = 0;

	/**
	 * The feature id for the '<em><b>MbOut Of Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_VENDING_MACHINE__MBOUT_OF_ORDER = 0;

	/**
	 * The feature id for the '<em><b>Mpd Products</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_VENDING_MACHINE__MPD_PRODUCTS = 1;

	/**
	 * The feature id for the '<em><b>Mps Product Selector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_VENDING_MACHINE__MPS_PRODUCT_SELECTOR = 2;

	/**
	 * The feature id for the '<em><b>Mod Output Display</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_VENDING_MACHINE__MOD_OUTPUT_DISPLAY = 3;

	/**
	 * The feature id for the '<em><b>Mpm Pay Machine</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_VENDING_MACHINE__MPM_PAY_MACHINE = 4;

	/**
	 * The feature id for the '<em><b>Mpd Dispenser</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_VENDING_MACHINE__MPD_DISPENSER = 5;

	/**
	 * The number of structural features of the '<em>Virtual Vending Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_VENDING_MACHINE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Virtual Vending Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_VENDING_MACHINE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link virtualVendingMachine.virtualVendingMachine.impl.PayMachineImpl <em>Pay Machine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see virtualVendingMachine.virtualVendingMachine.impl.PayMachineImpl
	 * @see virtualVendingMachine.virtualVendingMachine.impl.virtualVendingMachinePackageImpl#getPayMachine()
	 * @generated
	 */
	int PAY_MACHINE = 1;

	/**
	 * The feature id for the '<em><b>Mvvm Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAY_MACHINE__MVVM_OWNER = 0;

	/**
	 * The feature id for the '<em><b>MdMaximum Balance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAY_MACHINE__MDMAXIMUM_BALANCE = 1;

	/**
	 * The feature id for the '<em><b>Mcr Register</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAY_MACHINE__MCR_REGISTER = 2;

	/**
	 * The feature id for the '<em><b>MdBalance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAY_MACHINE__MDBALANCE = 3;

	/**
	 * The feature id for the '<em><b>MbOut Of Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAY_MACHINE__MBOUT_OF_ORDER = 4;

	/**
	 * The number of structural features of the '<em>Pay Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAY_MACHINE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Pay Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAY_MACHINE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link virtualVendingMachine.virtualVendingMachine.impl.ProductSelectorImpl <em>Product Selector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see virtualVendingMachine.virtualVendingMachine.impl.ProductSelectorImpl
	 * @see virtualVendingMachine.virtualVendingMachine.impl.virtualVendingMachinePackageImpl#getProductSelector()
	 * @generated
	 */
	int PRODUCT_SELECTOR = 2;

	/**
	 * The feature id for the '<em><b>Mvvm Machine</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_SELECTOR__MVVM_MACHINE = 0;

	/**
	 * The number of structural features of the '<em>Product Selector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_SELECTOR_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Product Selector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_SELECTOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link virtualVendingMachine.virtualVendingMachine.impl.CashRegisterImpl <em>Cash Register</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see virtualVendingMachine.virtualVendingMachine.impl.CashRegisterImpl
	 * @see virtualVendingMachine.virtualVendingMachine.impl.virtualVendingMachinePackageImpl#getCashRegister()
	 * @generated
	 */
	int CASH_REGISTER = 3;

	/**
	 * The feature id for the '<em><b>MiNum Quarters</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASH_REGISTER__MINUM_QUARTERS = 0;

	/**
	 * The feature id for the '<em><b>MiNum Dimes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASH_REGISTER__MINUM_DIMES = 1;

	/**
	 * The feature id for the '<em><b>MiNum Nickels</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASH_REGISTER__MINUM_NICKELS = 2;

	/**
	 * The feature id for the '<em><b>MiNum Dollars</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASH_REGISTER__MINUM_DOLLARS = 3;

	/**
	 * The feature id for the '<em><b>Mal Receipts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASH_REGISTER__MAL_RECEIPTS = 4;

	/**
	 * The number of structural features of the '<em>Cash Register</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASH_REGISTER_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Cash Register</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASH_REGISTER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link virtualVendingMachine.virtualVendingMachine.impl.SunCardReceiptImpl <em>Sun Card Receipt</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see virtualVendingMachine.virtualVendingMachine.impl.SunCardReceiptImpl
	 * @see virtualVendingMachine.virtualVendingMachine.impl.virtualVendingMachinePackageImpl#getSunCardReceipt()
	 * @generated
	 */
	int SUN_CARD_RECEIPT = 4;

	/**
	 * The feature id for the '<em><b>MiAccount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUN_CARD_RECEIPT__MIACCOUNT = 0;

	/**
	 * The feature id for the '<em><b>MdAmount Deducted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUN_CARD_RECEIPT__MDAMOUNT_DEDUCTED = 1;

	/**
	 * The number of structural features of the '<em>Sun Card Receipt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUN_CARD_RECEIPT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Sun Card Receipt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUN_CARD_RECEIPT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link virtualVendingMachine.virtualVendingMachine.impl.ProductDispenserImpl <em>Product Dispenser</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see virtualVendingMachine.virtualVendingMachine.impl.ProductDispenserImpl
	 * @see virtualVendingMachine.virtualVendingMachine.impl.virtualVendingMachinePackageImpl#getProductDispenser()
	 * @generated
	 */
	int PRODUCT_DISPENSER = 5;

	/**
	 * The number of structural features of the '<em>Product Dispenser</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_DISPENSER_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Product Dispenser</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_DISPENSER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link virtualVendingMachine.virtualVendingMachine.impl.ProductDatabaseImpl <em>Product Database</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see virtualVendingMachine.virtualVendingMachine.impl.ProductDatabaseImpl
	 * @see virtualVendingMachine.virtualVendingMachine.impl.virtualVendingMachinePackageImpl#getProductDatabase()
	 * @generated
	 */
	int PRODUCT_DATABASE = 6;

	/**
	 * The feature id for the '<em><b>Products</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_DATABASE__PRODUCTS = 0;

	/**
	 * The number of structural features of the '<em>Product Database</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_DATABASE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Product Database</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_DATABASE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link virtualVendingMachine.virtualVendingMachine.impl.ProductImpl <em>Product</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see virtualVendingMachine.virtualVendingMachine.impl.ProductImpl
	 * @see virtualVendingMachine.virtualVendingMachine.impl.virtualVendingMachinePackageImpl#getProduct()
	 * @generated
	 */
	int PRODUCT = 7;

	/**
	 * The feature id for the '<em><b>MiID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__MIID = 0;

	/**
	 * The feature id for the '<em><b>MsName</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__MSNAME = 1;

	/**
	 * The feature id for the '<em><b>MsDescription</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__MSDESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>MdPrice</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__MDPRICE = 3;

	/**
	 * The feature id for the '<em><b>MiQuantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__MIQUANTITY = 4;

	/**
	 * The feature id for the '<em><b>MiIcon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__MIICON = 5;

	/**
	 * The number of structural features of the '<em>Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link virtualVendingMachine.virtualVendingMachine.impl.OutputDisplayImpl <em>Output Display</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see virtualVendingMachine.virtualVendingMachine.impl.OutputDisplayImpl
	 * @see virtualVendingMachine.virtualVendingMachine.impl.virtualVendingMachinePackageImpl#getOutputDisplay()
	 * @generated
	 */
	int OUTPUT_DISPLAY = 8;

	/**
	 * The feature id for the '<em><b>MsCurrent Output</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_DISPLAY__MSCURRENT_OUTPUT = 0;

	/**
	 * The number of structural features of the '<em>Output Display</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_DISPLAY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Output Display</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_DISPLAY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '<em>Icon</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javax.swing.Icon
	 * @see virtualVendingMachine.virtualVendingMachine.impl.virtualVendingMachinePackageImpl#getIcon()
	 * @generated
	 */
	int ICON = 9;


	/**
	 * Returns the meta object for class '{@link virtualVendingMachine.virtualVendingMachine.VirtualVendingMachine <em>Virtual Vending Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Virtual Vending Machine</em>'.
	 * @see virtualVendingMachine.virtualVendingMachine.VirtualVendingMachine
	 * @generated
	 */
	EClass getVirtualVendingMachine();

	/**
	 * Returns the meta object for the attribute '{@link virtualVendingMachine.virtualVendingMachine.VirtualVendingMachine#isM_bOutOfOrder <em>MbOut Of Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>MbOut Of Order</em>'.
	 * @see virtualVendingMachine.virtualVendingMachine.VirtualVendingMachine#isM_bOutOfOrder()
	 * @see #getVirtualVendingMachine()
	 * @generated
	 */
	EAttribute getVirtualVendingMachine_M_bOutOfOrder();

	/**
	 * Returns the meta object for the containment reference '{@link virtualVendingMachine.virtualVendingMachine.VirtualVendingMachine#getM_pdProducts <em>Mpd Products</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mpd Products</em>'.
	 * @see virtualVendingMachine.virtualVendingMachine.VirtualVendingMachine#getM_pdProducts()
	 * @see #getVirtualVendingMachine()
	 * @generated
	 */
	EReference getVirtualVendingMachine_M_pdProducts();

	/**
	 * Returns the meta object for the containment reference '{@link virtualVendingMachine.virtualVendingMachine.VirtualVendingMachine#getM_psProductSelector <em>Mps Product Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mps Product Selector</em>'.
	 * @see virtualVendingMachine.virtualVendingMachine.VirtualVendingMachine#getM_psProductSelector()
	 * @see #getVirtualVendingMachine()
	 * @generated
	 */
	EReference getVirtualVendingMachine_M_psProductSelector();

	/**
	 * Returns the meta object for the containment reference '{@link virtualVendingMachine.virtualVendingMachine.VirtualVendingMachine#getM_odOutputDisplay <em>Mod Output Display</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mod Output Display</em>'.
	 * @see virtualVendingMachine.virtualVendingMachine.VirtualVendingMachine#getM_odOutputDisplay()
	 * @see #getVirtualVendingMachine()
	 * @generated
	 */
	EReference getVirtualVendingMachine_M_odOutputDisplay();

	/**
	 * Returns the meta object for the containment reference '{@link virtualVendingMachine.virtualVendingMachine.VirtualVendingMachine#getM_pmPayMachine <em>Mpm Pay Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mpm Pay Machine</em>'.
	 * @see virtualVendingMachine.virtualVendingMachine.VirtualVendingMachine#getM_pmPayMachine()
	 * @see #getVirtualVendingMachine()
	 * @generated
	 */
	EReference getVirtualVendingMachine_M_pmPayMachine();

	/**
	 * Returns the meta object for the containment reference '{@link virtualVendingMachine.virtualVendingMachine.VirtualVendingMachine#getM_pdDispenser <em>Mpd Dispenser</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mpd Dispenser</em>'.
	 * @see virtualVendingMachine.virtualVendingMachine.VirtualVendingMachine#getM_pdDispenser()
	 * @see #getVirtualVendingMachine()
	 * @generated
	 */
	EReference getVirtualVendingMachine_M_pdDispenser();

	/**
	 * Returns the meta object for class '{@link virtualVendingMachine.virtualVendingMachine.PayMachine <em>Pay Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pay Machine</em>'.
	 * @see virtualVendingMachine.virtualVendingMachine.PayMachine
	 * @generated
	 */
	EClass getPayMachine();

	/**
	 * Returns the meta object for the container reference '{@link virtualVendingMachine.virtualVendingMachine.PayMachine#getM_vvmOwner <em>Mvvm Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Mvvm Owner</em>'.
	 * @see virtualVendingMachine.virtualVendingMachine.PayMachine#getM_vvmOwner()
	 * @see #getPayMachine()
	 * @generated
	 */
	EReference getPayMachine_M_vvmOwner();

	/**
	 * Returns the meta object for the attribute '{@link virtualVendingMachine.virtualVendingMachine.PayMachine#getM_dMaximumBalance <em>MdMaximum Balance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>MdMaximum Balance</em>'.
	 * @see virtualVendingMachine.virtualVendingMachine.PayMachine#getM_dMaximumBalance()
	 * @see #getPayMachine()
	 * @generated
	 */
	EAttribute getPayMachine_M_dMaximumBalance();

	/**
	 * Returns the meta object for the reference '{@link virtualVendingMachine.virtualVendingMachine.PayMachine#getM_crRegister <em>Mcr Register</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Mcr Register</em>'.
	 * @see virtualVendingMachine.virtualVendingMachine.PayMachine#getM_crRegister()
	 * @see #getPayMachine()
	 * @generated
	 */
	EReference getPayMachine_M_crRegister();

	/**
	 * Returns the meta object for the attribute '{@link virtualVendingMachine.virtualVendingMachine.PayMachine#getM_dBalance <em>MdBalance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>MdBalance</em>'.
	 * @see virtualVendingMachine.virtualVendingMachine.PayMachine#getM_dBalance()
	 * @see #getPayMachine()
	 * @generated
	 */
	EAttribute getPayMachine_M_dBalance();

	/**
	 * Returns the meta object for the attribute '{@link virtualVendingMachine.virtualVendingMachine.PayMachine#isM_bOutOfOrder <em>MbOut Of Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>MbOut Of Order</em>'.
	 * @see virtualVendingMachine.virtualVendingMachine.PayMachine#isM_bOutOfOrder()
	 * @see #getPayMachine()
	 * @generated
	 */
	EAttribute getPayMachine_M_bOutOfOrder();

	/**
	 * Returns the meta object for class '{@link virtualVendingMachine.virtualVendingMachine.ProductSelector <em>Product Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Selector</em>'.
	 * @see virtualVendingMachine.virtualVendingMachine.ProductSelector
	 * @generated
	 */
	EClass getProductSelector();

	/**
	 * Returns the meta object for the container reference '{@link virtualVendingMachine.virtualVendingMachine.ProductSelector#getM_vvmMachine <em>Mvvm Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Mvvm Machine</em>'.
	 * @see virtualVendingMachine.virtualVendingMachine.ProductSelector#getM_vvmMachine()
	 * @see #getProductSelector()
	 * @generated
	 */
	EReference getProductSelector_M_vvmMachine();

	/**
	 * Returns the meta object for class '{@link virtualVendingMachine.virtualVendingMachine.CashRegister <em>Cash Register</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cash Register</em>'.
	 * @see virtualVendingMachine.virtualVendingMachine.CashRegister
	 * @generated
	 */
	EClass getCashRegister();

	/**
	 * Returns the meta object for the attribute '{@link virtualVendingMachine.virtualVendingMachine.CashRegister#getM_iNumQuarters <em>MiNum Quarters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>MiNum Quarters</em>'.
	 * @see virtualVendingMachine.virtualVendingMachine.CashRegister#getM_iNumQuarters()
	 * @see #getCashRegister()
	 * @generated
	 */
	EAttribute getCashRegister_M_iNumQuarters();

	/**
	 * Returns the meta object for the attribute '{@link virtualVendingMachine.virtualVendingMachine.CashRegister#getM_iNumDimes <em>MiNum Dimes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>MiNum Dimes</em>'.
	 * @see virtualVendingMachine.virtualVendingMachine.CashRegister#getM_iNumDimes()
	 * @see #getCashRegister()
	 * @generated
	 */
	EAttribute getCashRegister_M_iNumDimes();

	/**
	 * Returns the meta object for the attribute '{@link virtualVendingMachine.virtualVendingMachine.CashRegister#getM_iNumNickels <em>MiNum Nickels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>MiNum Nickels</em>'.
	 * @see virtualVendingMachine.virtualVendingMachine.CashRegister#getM_iNumNickels()
	 * @see #getCashRegister()
	 * @generated
	 */
	EAttribute getCashRegister_M_iNumNickels();

	/**
	 * Returns the meta object for the attribute '{@link virtualVendingMachine.virtualVendingMachine.CashRegister#getM_iNumDollars <em>MiNum Dollars</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>MiNum Dollars</em>'.
	 * @see virtualVendingMachine.virtualVendingMachine.CashRegister#getM_iNumDollars()
	 * @see #getCashRegister()
	 * @generated
	 */
	EAttribute getCashRegister_M_iNumDollars();

	/**
	 * Returns the meta object for the reference list '{@link virtualVendingMachine.virtualVendingMachine.CashRegister#getM_alReceipts <em>Mal Receipts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Mal Receipts</em>'.
	 * @see virtualVendingMachine.virtualVendingMachine.CashRegister#getM_alReceipts()
	 * @see #getCashRegister()
	 * @generated
	 */
	EReference getCashRegister_M_alReceipts();

	/**
	 * Returns the meta object for class '{@link virtualVendingMachine.virtualVendingMachine.SunCardReceipt <em>Sun Card Receipt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sun Card Receipt</em>'.
	 * @see virtualVendingMachine.virtualVendingMachine.SunCardReceipt
	 * @generated
	 */
	EClass getSunCardReceipt();

	/**
	 * Returns the meta object for the attribute '{@link virtualVendingMachine.virtualVendingMachine.SunCardReceipt#getM_iAccount <em>MiAccount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>MiAccount</em>'.
	 * @see virtualVendingMachine.virtualVendingMachine.SunCardReceipt#getM_iAccount()
	 * @see #getSunCardReceipt()
	 * @generated
	 */
	EAttribute getSunCardReceipt_M_iAccount();

	/**
	 * Returns the meta object for the attribute '{@link virtualVendingMachine.virtualVendingMachine.SunCardReceipt#getM_dAmountDeducted <em>MdAmount Deducted</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>MdAmount Deducted</em>'.
	 * @see virtualVendingMachine.virtualVendingMachine.SunCardReceipt#getM_dAmountDeducted()
	 * @see #getSunCardReceipt()
	 * @generated
	 */
	EAttribute getSunCardReceipt_M_dAmountDeducted();

	/**
	 * Returns the meta object for class '{@link virtualVendingMachine.virtualVendingMachine.ProductDispenser <em>Product Dispenser</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Dispenser</em>'.
	 * @see virtualVendingMachine.virtualVendingMachine.ProductDispenser
	 * @generated
	 */
	EClass getProductDispenser();

	/**
	 * Returns the meta object for class '{@link virtualVendingMachine.virtualVendingMachine.ProductDatabase <em>Product Database</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Database</em>'.
	 * @see virtualVendingMachine.virtualVendingMachine.ProductDatabase
	 * @generated
	 */
	EClass getProductDatabase();

	/**
	 * Returns the meta object for the containment reference list '{@link virtualVendingMachine.virtualVendingMachine.ProductDatabase#getProducts <em>Products</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Products</em>'.
	 * @see virtualVendingMachine.virtualVendingMachine.ProductDatabase#getProducts()
	 * @see #getProductDatabase()
	 * @generated
	 */
	EReference getProductDatabase_Products();

	/**
	 * Returns the meta object for class '{@link virtualVendingMachine.virtualVendingMachine.Product <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product</em>'.
	 * @see virtualVendingMachine.virtualVendingMachine.Product
	 * @generated
	 */
	EClass getProduct();

	/**
	 * Returns the meta object for the attribute '{@link virtualVendingMachine.virtualVendingMachine.Product#getM_iID <em>MiID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>MiID</em>'.
	 * @see virtualVendingMachine.virtualVendingMachine.Product#getM_iID()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_M_iID();

	/**
	 * Returns the meta object for the attribute '{@link virtualVendingMachine.virtualVendingMachine.Product#getM_sName <em>MsName</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>MsName</em>'.
	 * @see virtualVendingMachine.virtualVendingMachine.Product#getM_sName()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_M_sName();

	/**
	 * Returns the meta object for the attribute '{@link virtualVendingMachine.virtualVendingMachine.Product#getM_sDescription <em>MsDescription</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>MsDescription</em>'.
	 * @see virtualVendingMachine.virtualVendingMachine.Product#getM_sDescription()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_M_sDescription();

	/**
	 * Returns the meta object for the attribute '{@link virtualVendingMachine.virtualVendingMachine.Product#getM_dPrice <em>MdPrice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>MdPrice</em>'.
	 * @see virtualVendingMachine.virtualVendingMachine.Product#getM_dPrice()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_M_dPrice();

	/**
	 * Returns the meta object for the attribute '{@link virtualVendingMachine.virtualVendingMachine.Product#getM_iQuantity <em>MiQuantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>MiQuantity</em>'.
	 * @see virtualVendingMachine.virtualVendingMachine.Product#getM_iQuantity()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_M_iQuantity();

	/**
	 * Returns the meta object for the attribute '{@link virtualVendingMachine.virtualVendingMachine.Product#getM_iIcon <em>MiIcon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>MiIcon</em>'.
	 * @see virtualVendingMachine.virtualVendingMachine.Product#getM_iIcon()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_M_iIcon();

	/**
	 * Returns the meta object for class '{@link virtualVendingMachine.virtualVendingMachine.OutputDisplay <em>Output Display</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output Display</em>'.
	 * @see virtualVendingMachine.virtualVendingMachine.OutputDisplay
	 * @generated
	 */
	EClass getOutputDisplay();

	/**
	 * Returns the meta object for the attribute '{@link virtualVendingMachine.virtualVendingMachine.OutputDisplay#getM_sCurrentOutput <em>MsCurrent Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>MsCurrent Output</em>'.
	 * @see virtualVendingMachine.virtualVendingMachine.OutputDisplay#getM_sCurrentOutput()
	 * @see #getOutputDisplay()
	 * @generated
	 */
	EAttribute getOutputDisplay_M_sCurrentOutput();

	/**
	 * Returns the meta object for data type '{@link javax.swing.Icon <em>Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Icon</em>'.
	 * @see javax.swing.Icon
	 * @model instanceClass="javax.swing.Icon"
	 * @generated
	 */
	EDataType getIcon();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	virtualVendingMachineFactory getvirtualVendingMachineFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link virtualVendingMachine.virtualVendingMachine.impl.VirtualVendingMachineImpl <em>Virtual Vending Machine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see virtualVendingMachine.virtualVendingMachine.impl.VirtualVendingMachineImpl
		 * @see virtualVendingMachine.virtualVendingMachine.impl.virtualVendingMachinePackageImpl#getVirtualVendingMachine()
		 * @generated
		 */
		EClass VIRTUAL_VENDING_MACHINE = eINSTANCE.getVirtualVendingMachine();

		/**
		 * The meta object literal for the '<em><b>MbOut Of Order</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIRTUAL_VENDING_MACHINE__MBOUT_OF_ORDER = eINSTANCE.getVirtualVendingMachine_M_bOutOfOrder();

		/**
		 * The meta object literal for the '<em><b>Mpd Products</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIRTUAL_VENDING_MACHINE__MPD_PRODUCTS = eINSTANCE.getVirtualVendingMachine_M_pdProducts();

		/**
		 * The meta object literal for the '<em><b>Mps Product Selector</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIRTUAL_VENDING_MACHINE__MPS_PRODUCT_SELECTOR = eINSTANCE.getVirtualVendingMachine_M_psProductSelector();

		/**
		 * The meta object literal for the '<em><b>Mod Output Display</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIRTUAL_VENDING_MACHINE__MOD_OUTPUT_DISPLAY = eINSTANCE.getVirtualVendingMachine_M_odOutputDisplay();

		/**
		 * The meta object literal for the '<em><b>Mpm Pay Machine</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIRTUAL_VENDING_MACHINE__MPM_PAY_MACHINE = eINSTANCE.getVirtualVendingMachine_M_pmPayMachine();

		/**
		 * The meta object literal for the '<em><b>Mpd Dispenser</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIRTUAL_VENDING_MACHINE__MPD_DISPENSER = eINSTANCE.getVirtualVendingMachine_M_pdDispenser();

		/**
		 * The meta object literal for the '{@link virtualVendingMachine.virtualVendingMachine.impl.PayMachineImpl <em>Pay Machine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see virtualVendingMachine.virtualVendingMachine.impl.PayMachineImpl
		 * @see virtualVendingMachine.virtualVendingMachine.impl.virtualVendingMachinePackageImpl#getPayMachine()
		 * @generated
		 */
		EClass PAY_MACHINE = eINSTANCE.getPayMachine();

		/**
		 * The meta object literal for the '<em><b>Mvvm Owner</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAY_MACHINE__MVVM_OWNER = eINSTANCE.getPayMachine_M_vvmOwner();

		/**
		 * The meta object literal for the '<em><b>MdMaximum Balance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAY_MACHINE__MDMAXIMUM_BALANCE = eINSTANCE.getPayMachine_M_dMaximumBalance();

		/**
		 * The meta object literal for the '<em><b>Mcr Register</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAY_MACHINE__MCR_REGISTER = eINSTANCE.getPayMachine_M_crRegister();

		/**
		 * The meta object literal for the '<em><b>MdBalance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAY_MACHINE__MDBALANCE = eINSTANCE.getPayMachine_M_dBalance();

		/**
		 * The meta object literal for the '<em><b>MbOut Of Order</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAY_MACHINE__MBOUT_OF_ORDER = eINSTANCE.getPayMachine_M_bOutOfOrder();

		/**
		 * The meta object literal for the '{@link virtualVendingMachine.virtualVendingMachine.impl.ProductSelectorImpl <em>Product Selector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see virtualVendingMachine.virtualVendingMachine.impl.ProductSelectorImpl
		 * @see virtualVendingMachine.virtualVendingMachine.impl.virtualVendingMachinePackageImpl#getProductSelector()
		 * @generated
		 */
		EClass PRODUCT_SELECTOR = eINSTANCE.getProductSelector();

		/**
		 * The meta object literal for the '<em><b>Mvvm Machine</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_SELECTOR__MVVM_MACHINE = eINSTANCE.getProductSelector_M_vvmMachine();

		/**
		 * The meta object literal for the '{@link virtualVendingMachine.virtualVendingMachine.impl.CashRegisterImpl <em>Cash Register</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see virtualVendingMachine.virtualVendingMachine.impl.CashRegisterImpl
		 * @see virtualVendingMachine.virtualVendingMachine.impl.virtualVendingMachinePackageImpl#getCashRegister()
		 * @generated
		 */
		EClass CASH_REGISTER = eINSTANCE.getCashRegister();

		/**
		 * The meta object literal for the '<em><b>MiNum Quarters</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CASH_REGISTER__MINUM_QUARTERS = eINSTANCE.getCashRegister_M_iNumQuarters();

		/**
		 * The meta object literal for the '<em><b>MiNum Dimes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CASH_REGISTER__MINUM_DIMES = eINSTANCE.getCashRegister_M_iNumDimes();

		/**
		 * The meta object literal for the '<em><b>MiNum Nickels</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CASH_REGISTER__MINUM_NICKELS = eINSTANCE.getCashRegister_M_iNumNickels();

		/**
		 * The meta object literal for the '<em><b>MiNum Dollars</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CASH_REGISTER__MINUM_DOLLARS = eINSTANCE.getCashRegister_M_iNumDollars();

		/**
		 * The meta object literal for the '<em><b>Mal Receipts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CASH_REGISTER__MAL_RECEIPTS = eINSTANCE.getCashRegister_M_alReceipts();

		/**
		 * The meta object literal for the '{@link virtualVendingMachine.virtualVendingMachine.impl.SunCardReceiptImpl <em>Sun Card Receipt</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see virtualVendingMachine.virtualVendingMachine.impl.SunCardReceiptImpl
		 * @see virtualVendingMachine.virtualVendingMachine.impl.virtualVendingMachinePackageImpl#getSunCardReceipt()
		 * @generated
		 */
		EClass SUN_CARD_RECEIPT = eINSTANCE.getSunCardReceipt();

		/**
		 * The meta object literal for the '<em><b>MiAccount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUN_CARD_RECEIPT__MIACCOUNT = eINSTANCE.getSunCardReceipt_M_iAccount();

		/**
		 * The meta object literal for the '<em><b>MdAmount Deducted</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUN_CARD_RECEIPT__MDAMOUNT_DEDUCTED = eINSTANCE.getSunCardReceipt_M_dAmountDeducted();

		/**
		 * The meta object literal for the '{@link virtualVendingMachine.virtualVendingMachine.impl.ProductDispenserImpl <em>Product Dispenser</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see virtualVendingMachine.virtualVendingMachine.impl.ProductDispenserImpl
		 * @see virtualVendingMachine.virtualVendingMachine.impl.virtualVendingMachinePackageImpl#getProductDispenser()
		 * @generated
		 */
		EClass PRODUCT_DISPENSER = eINSTANCE.getProductDispenser();

		/**
		 * The meta object literal for the '{@link virtualVendingMachine.virtualVendingMachine.impl.ProductDatabaseImpl <em>Product Database</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see virtualVendingMachine.virtualVendingMachine.impl.ProductDatabaseImpl
		 * @see virtualVendingMachine.virtualVendingMachine.impl.virtualVendingMachinePackageImpl#getProductDatabase()
		 * @generated
		 */
		EClass PRODUCT_DATABASE = eINSTANCE.getProductDatabase();

		/**
		 * The meta object literal for the '<em><b>Products</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_DATABASE__PRODUCTS = eINSTANCE.getProductDatabase_Products();

		/**
		 * The meta object literal for the '{@link virtualVendingMachine.virtualVendingMachine.impl.ProductImpl <em>Product</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see virtualVendingMachine.virtualVendingMachine.impl.ProductImpl
		 * @see virtualVendingMachine.virtualVendingMachine.impl.virtualVendingMachinePackageImpl#getProduct()
		 * @generated
		 */
		EClass PRODUCT = eINSTANCE.getProduct();

		/**
		 * The meta object literal for the '<em><b>MiID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT__MIID = eINSTANCE.getProduct_M_iID();

		/**
		 * The meta object literal for the '<em><b>MsName</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT__MSNAME = eINSTANCE.getProduct_M_sName();

		/**
		 * The meta object literal for the '<em><b>MsDescription</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT__MSDESCRIPTION = eINSTANCE.getProduct_M_sDescription();

		/**
		 * The meta object literal for the '<em><b>MdPrice</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT__MDPRICE = eINSTANCE.getProduct_M_dPrice();

		/**
		 * The meta object literal for the '<em><b>MiQuantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT__MIQUANTITY = eINSTANCE.getProduct_M_iQuantity();

		/**
		 * The meta object literal for the '<em><b>MiIcon</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT__MIICON = eINSTANCE.getProduct_M_iIcon();

		/**
		 * The meta object literal for the '{@link virtualVendingMachine.virtualVendingMachine.impl.OutputDisplayImpl <em>Output Display</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see virtualVendingMachine.virtualVendingMachine.impl.OutputDisplayImpl
		 * @see virtualVendingMachine.virtualVendingMachine.impl.virtualVendingMachinePackageImpl#getOutputDisplay()
		 * @generated
		 */
		EClass OUTPUT_DISPLAY = eINSTANCE.getOutputDisplay();

		/**
		 * The meta object literal for the '<em><b>MsCurrent Output</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT_DISPLAY__MSCURRENT_OUTPUT = eINSTANCE.getOutputDisplay_M_sCurrentOutput();

		/**
		 * The meta object literal for the '<em>Icon</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javax.swing.Icon
		 * @see virtualVendingMachine.virtualVendingMachine.impl.virtualVendingMachinePackageImpl#getIcon()
		 * @generated
		 */
		EDataType ICON = eINSTANCE.getIcon();

	}

} //virtualVendingMachinePackage
