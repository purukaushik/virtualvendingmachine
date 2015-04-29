/**
 */
package virtualVendingMachine.virtualVendingMachine;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pay Machine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link virtualVendingMachine.virtualVendingMachine.PayMachine#getM_vvmOwner <em>Mvvm Owner</em>}</li>
 *   <li>{@link virtualVendingMachine.virtualVendingMachine.PayMachine#getM_dMaximumBalance <em>MdMaximum Balance</em>}</li>
 *   <li>{@link virtualVendingMachine.virtualVendingMachine.PayMachine#getM_crRegister <em>Mcr Register</em>}</li>
 *   <li>{@link virtualVendingMachine.virtualVendingMachine.PayMachine#getM_dBalance <em>MdBalance</em>}</li>
 *   <li>{@link virtualVendingMachine.virtualVendingMachine.PayMachine#isM_bOutOfOrder <em>MbOut Of Order</em>}</li>
 * </ul>
 * </p>
 *
 * @see virtualVendingMachine.virtualVendingMachine.virtualVendingMachinePackage#getPayMachine()
 * @model
 * @generated
 */
public interface PayMachine extends EObject {
	/**
	 * Returns the value of the '<em><b>Mvvm Owner</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link virtualVendingMachine.virtualVendingMachine.VirtualVendingMachine#getM_pmPayMachine <em>Mpm Pay Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mvvm Owner</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mvvm Owner</em>' container reference.
	 * @see #setM_vvmOwner(VirtualVendingMachine)
	 * @see virtualVendingMachine.virtualVendingMachine.virtualVendingMachinePackage#getPayMachine_M_vvmOwner()
	 * @see virtualVendingMachine.virtualVendingMachine.VirtualVendingMachine#getM_pmPayMachine
	 * @model opposite="m_pmPayMachine" transient="false"
	 * @generated
	 */
	VirtualVendingMachine getM_vvmOwner();

	/**
	 * Sets the value of the '{@link virtualVendingMachine.virtualVendingMachine.PayMachine#getM_vvmOwner <em>Mvvm Owner</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mvvm Owner</em>' container reference.
	 * @see #getM_vvmOwner()
	 * @generated
	 */
	void setM_vvmOwner(VirtualVendingMachine value);

	/**
	 * Returns the value of the '<em><b>MdMaximum Balance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MdMaximum Balance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MdMaximum Balance</em>' attribute.
	 * @see #setM_dMaximumBalance(double)
	 * @see virtualVendingMachine.virtualVendingMachine.virtualVendingMachinePackage#getPayMachine_M_dMaximumBalance()
	 * @model
	 * @generated
	 */
	double getM_dMaximumBalance();

	/**
	 * Sets the value of the '{@link virtualVendingMachine.virtualVendingMachine.PayMachine#getM_dMaximumBalance <em>MdMaximum Balance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MdMaximum Balance</em>' attribute.
	 * @see #getM_dMaximumBalance()
	 * @generated
	 */
	void setM_dMaximumBalance(double value);

	/**
	 * Returns the value of the '<em><b>Mcr Register</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mcr Register</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mcr Register</em>' reference.
	 * @see #setM_crRegister(CashRegister)
	 * @see virtualVendingMachine.virtualVendingMachine.virtualVendingMachinePackage#getPayMachine_M_crRegister()
	 * @model
	 * @generated
	 */
	CashRegister getM_crRegister();

	/**
	 * Sets the value of the '{@link virtualVendingMachine.virtualVendingMachine.PayMachine#getM_crRegister <em>Mcr Register</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mcr Register</em>' reference.
	 * @see #getM_crRegister()
	 * @generated
	 */
	void setM_crRegister(CashRegister value);

	/**
	 * Returns the value of the '<em><b>MdBalance</b></em>' attribute.
	 * The default value is <code>"0.00"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MdBalance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MdBalance</em>' attribute.
	 * @see #setM_dBalance(double)
	 * @see virtualVendingMachine.virtualVendingMachine.virtualVendingMachinePackage#getPayMachine_M_dBalance()
	 * @model default="0.00"
	 * @generated
	 */
	double getM_dBalance();

	/**
	 * Sets the value of the '{@link virtualVendingMachine.virtualVendingMachine.PayMachine#getM_dBalance <em>MdBalance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MdBalance</em>' attribute.
	 * @see #getM_dBalance()
	 * @generated
	 */
	void setM_dBalance(double value);

	/**
	 * Returns the value of the '<em><b>MbOut Of Order</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MbOut Of Order</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MbOut Of Order</em>' attribute.
	 * @see #setM_bOutOfOrder(boolean)
	 * @see virtualVendingMachine.virtualVendingMachine.virtualVendingMachinePackage#getPayMachine_M_bOutOfOrder()
	 * @model default="false"
	 * @generated
	 */
	boolean isM_bOutOfOrder();

	/**
	 * Sets the value of the '{@link virtualVendingMachine.virtualVendingMachine.PayMachine#isM_bOutOfOrder <em>MbOut Of Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MbOut Of Order</em>' attribute.
	 * @see #isM_bOutOfOrder()
	 * @generated
	 */
	void setM_bOutOfOrder(boolean value);

} // PayMachine
