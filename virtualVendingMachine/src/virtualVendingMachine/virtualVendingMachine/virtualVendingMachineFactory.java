/**
 */
package virtualVendingMachine.virtualVendingMachine;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see virtualVendingMachine.virtualVendingMachine.virtualVendingMachinePackage
 * @generated
 */
public interface virtualVendingMachineFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	virtualVendingMachineFactory eINSTANCE = virtualVendingMachine.virtualVendingMachine.impl.virtualVendingMachineFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Virtual Vending Machine</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Virtual Vending Machine</em>'.
	 * @generated
	 */
	VirtualVendingMachine createVirtualVendingMachine();

	/**
	 * Returns a new object of class '<em>Pay Machine</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pay Machine</em>'.
	 * @generated
	 */
	PayMachine createPayMachine();

	/**
	 * Returns a new object of class '<em>Product Selector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Product Selector</em>'.
	 * @generated
	 */
	ProductSelector createProductSelector();

	/**
	 * Returns a new object of class '<em>Cash Register</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cash Register</em>'.
	 * @generated
	 */
	CashRegister createCashRegister();

	/**
	 * Returns a new object of class '<em>Sun Card Receipt</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sun Card Receipt</em>'.
	 * @generated
	 */
	SunCardReceipt createSunCardReceipt();

	/**
	 * Returns a new object of class '<em>Product Dispenser</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Product Dispenser</em>'.
	 * @generated
	 */
	ProductDispenser createProductDispenser();

	/**
	 * Returns a new object of class '<em>Product Database</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Product Database</em>'.
	 * @generated
	 */
	ProductDatabase createProductDatabase();

	/**
	 * Returns a new object of class '<em>Product</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Product</em>'.
	 * @generated
	 */
	Product createProduct();

	/**
	 * Returns a new object of class '<em>Output Display</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Output Display</em>'.
	 * @generated
	 */
	OutputDisplay createOutputDisplay();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	virtualVendingMachinePackage getvirtualVendingMachinePackage();

} //virtualVendingMachineFactory
