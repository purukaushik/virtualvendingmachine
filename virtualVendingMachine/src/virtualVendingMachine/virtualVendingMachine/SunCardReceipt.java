/**
 */
package virtualVendingMachine.virtualVendingMachine;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sun Card Receipt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link virtualVendingMachine.virtualVendingMachine.SunCardReceipt#getM_iAccount <em>MiAccount</em>}</li>
 *   <li>{@link virtualVendingMachine.virtualVendingMachine.SunCardReceipt#getM_dAmountDeducted <em>MdAmount Deducted</em>}</li>
 * </ul>
 * </p>
 *
 * @see virtualVendingMachine.virtualVendingMachine.virtualVendingMachinePackage#getSunCardReceipt()
 * @model
 * @generated
 */
public interface SunCardReceipt extends EObject {
	/**
	 * Returns the value of the '<em><b>MiAccount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MiAccount</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MiAccount</em>' attribute.
	 * @see #setM_iAccount(int)
	 * @see virtualVendingMachine.virtualVendingMachine.virtualVendingMachinePackage#getSunCardReceipt_M_iAccount()
	 * @model
	 * @generated
	 */
	int getM_iAccount();

	/**
	 * Sets the value of the '{@link virtualVendingMachine.virtualVendingMachine.SunCardReceipt#getM_iAccount <em>MiAccount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MiAccount</em>' attribute.
	 * @see #getM_iAccount()
	 * @generated
	 */
	void setM_iAccount(int value);

	/**
	 * Returns the value of the '<em><b>MdAmount Deducted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MdAmount Deducted</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MdAmount Deducted</em>' attribute.
	 * @see #setM_dAmountDeducted(double)
	 * @see virtualVendingMachine.virtualVendingMachine.virtualVendingMachinePackage#getSunCardReceipt_M_dAmountDeducted()
	 * @model
	 * @generated
	 */
	double getM_dAmountDeducted();

	/**
	 * Sets the value of the '{@link virtualVendingMachine.virtualVendingMachine.SunCardReceipt#getM_dAmountDeducted <em>MdAmount Deducted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MdAmount Deducted</em>' attribute.
	 * @see #getM_dAmountDeducted()
	 * @generated
	 */
	void setM_dAmountDeducted(double value);

} // SunCardReceipt
