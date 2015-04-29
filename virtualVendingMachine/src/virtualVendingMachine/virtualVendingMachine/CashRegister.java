/**
 */
package virtualVendingMachine.virtualVendingMachine;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cash Register</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link virtualVendingMachine.virtualVendingMachine.CashRegister#getM_iNumQuarters <em>MiNum Quarters</em>}</li>
 *   <li>{@link virtualVendingMachine.virtualVendingMachine.CashRegister#getM_iNumDimes <em>MiNum Dimes</em>}</li>
 *   <li>{@link virtualVendingMachine.virtualVendingMachine.CashRegister#getM_iNumNickels <em>MiNum Nickels</em>}</li>
 *   <li>{@link virtualVendingMachine.virtualVendingMachine.CashRegister#getM_iNumDollars <em>MiNum Dollars</em>}</li>
 *   <li>{@link virtualVendingMachine.virtualVendingMachine.CashRegister#getM_alReceipts <em>Mal Receipts</em>}</li>
 * </ul>
 * </p>
 *
 * @see virtualVendingMachine.virtualVendingMachine.virtualVendingMachinePackage#getCashRegister()
 * @model
 * @generated
 */
public interface CashRegister extends EObject {
	/**
	 * Returns the value of the '<em><b>MiNum Quarters</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MiNum Quarters</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MiNum Quarters</em>' attribute.
	 * @see #setM_iNumQuarters(int)
	 * @see virtualVendingMachine.virtualVendingMachine.virtualVendingMachinePackage#getCashRegister_M_iNumQuarters()
	 * @model
	 * @generated
	 */
	int getM_iNumQuarters();

	/**
	 * Sets the value of the '{@link virtualVendingMachine.virtualVendingMachine.CashRegister#getM_iNumQuarters <em>MiNum Quarters</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MiNum Quarters</em>' attribute.
	 * @see #getM_iNumQuarters()
	 * @generated
	 */
	void setM_iNumQuarters(int value);

	/**
	 * Returns the value of the '<em><b>MiNum Dimes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MiNum Dimes</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MiNum Dimes</em>' attribute.
	 * @see #setM_iNumDimes(int)
	 * @see virtualVendingMachine.virtualVendingMachine.virtualVendingMachinePackage#getCashRegister_M_iNumDimes()
	 * @model
	 * @generated
	 */
	int getM_iNumDimes();

	/**
	 * Sets the value of the '{@link virtualVendingMachine.virtualVendingMachine.CashRegister#getM_iNumDimes <em>MiNum Dimes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MiNum Dimes</em>' attribute.
	 * @see #getM_iNumDimes()
	 * @generated
	 */
	void setM_iNumDimes(int value);

	/**
	 * Returns the value of the '<em><b>MiNum Nickels</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MiNum Nickels</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MiNum Nickels</em>' attribute.
	 * @see #setM_iNumNickels(int)
	 * @see virtualVendingMachine.virtualVendingMachine.virtualVendingMachinePackage#getCashRegister_M_iNumNickels()
	 * @model
	 * @generated
	 */
	int getM_iNumNickels();

	/**
	 * Sets the value of the '{@link virtualVendingMachine.virtualVendingMachine.CashRegister#getM_iNumNickels <em>MiNum Nickels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MiNum Nickels</em>' attribute.
	 * @see #getM_iNumNickels()
	 * @generated
	 */
	void setM_iNumNickels(int value);

	/**
	 * Returns the value of the '<em><b>MiNum Dollars</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MiNum Dollars</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MiNum Dollars</em>' attribute.
	 * @see #setM_iNumDollars(int)
	 * @see virtualVendingMachine.virtualVendingMachine.virtualVendingMachinePackage#getCashRegister_M_iNumDollars()
	 * @model
	 * @generated
	 */
	int getM_iNumDollars();

	/**
	 * Sets the value of the '{@link virtualVendingMachine.virtualVendingMachine.CashRegister#getM_iNumDollars <em>MiNum Dollars</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MiNum Dollars</em>' attribute.
	 * @see #getM_iNumDollars()
	 * @generated
	 */
	void setM_iNumDollars(int value);

	/**
	 * Returns the value of the '<em><b>Mal Receipts</b></em>' reference list.
	 * The list contents are of type {@link virtualVendingMachine.virtualVendingMachine.SunCardReceipt}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mal Receipts</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mal Receipts</em>' reference list.
	 * @see virtualVendingMachine.virtualVendingMachine.virtualVendingMachinePackage#getCashRegister_M_alReceipts()
	 * @model
	 * @generated
	 */
	EList<SunCardReceipt> getM_alReceipts();

} // CashRegister
