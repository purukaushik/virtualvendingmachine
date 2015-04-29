/**
 */
package virtualVendingMachine.virtualVendingMachine.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import virtualVendingMachine.virtualVendingMachine.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see virtualVendingMachine.virtualVendingMachine.virtualVendingMachinePackage
 * @generated
 */
public class virtualVendingMachineSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static virtualVendingMachinePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public virtualVendingMachineSwitch() {
		if (modelPackage == null) {
			modelPackage = virtualVendingMachinePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case virtualVendingMachinePackage.VIRTUAL_VENDING_MACHINE: {
				VirtualVendingMachine virtualVendingMachine = (VirtualVendingMachine)theEObject;
				T result = caseVirtualVendingMachine(virtualVendingMachine);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case virtualVendingMachinePackage.PAY_MACHINE: {
				PayMachine payMachine = (PayMachine)theEObject;
				T result = casePayMachine(payMachine);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case virtualVendingMachinePackage.PRODUCT_SELECTOR: {
				ProductSelector productSelector = (ProductSelector)theEObject;
				T result = caseProductSelector(productSelector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case virtualVendingMachinePackage.CASH_REGISTER: {
				CashRegister cashRegister = (CashRegister)theEObject;
				T result = caseCashRegister(cashRegister);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case virtualVendingMachinePackage.SUN_CARD_RECEIPT: {
				SunCardReceipt sunCardReceipt = (SunCardReceipt)theEObject;
				T result = caseSunCardReceipt(sunCardReceipt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case virtualVendingMachinePackage.PRODUCT_DISPENSER: {
				ProductDispenser productDispenser = (ProductDispenser)theEObject;
				T result = caseProductDispenser(productDispenser);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case virtualVendingMachinePackage.PRODUCT_DATABASE: {
				ProductDatabase productDatabase = (ProductDatabase)theEObject;
				T result = caseProductDatabase(productDatabase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case virtualVendingMachinePackage.PRODUCT: {
				Product product = (Product)theEObject;
				T result = caseProduct(product);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case virtualVendingMachinePackage.OUTPUT_DISPLAY: {
				OutputDisplay outputDisplay = (OutputDisplay)theEObject;
				T result = caseOutputDisplay(outputDisplay);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Virtual Vending Machine</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Virtual Vending Machine</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVirtualVendingMachine(VirtualVendingMachine object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pay Machine</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pay Machine</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePayMachine(PayMachine object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Product Selector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Product Selector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProductSelector(ProductSelector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cash Register</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cash Register</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCashRegister(CashRegister object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sun Card Receipt</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sun Card Receipt</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSunCardReceipt(SunCardReceipt object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Product Dispenser</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Product Dispenser</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProductDispenser(ProductDispenser object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Product Database</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Product Database</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProductDatabase(ProductDatabase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Product</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Product</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProduct(Product object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Output Display</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Output Display</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutputDisplay(OutputDisplay object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //virtualVendingMachineSwitch
