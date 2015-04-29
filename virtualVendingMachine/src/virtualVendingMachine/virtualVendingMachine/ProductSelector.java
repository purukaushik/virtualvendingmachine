/**
 */
package virtualVendingMachine.virtualVendingMachine;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product Selector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link virtualVendingMachine.virtualVendingMachine.ProductSelector#getM_vvmMachine <em>Mvvm Machine</em>}</li>
 * </ul>
 * </p>
 *
 * @see virtualVendingMachine.virtualVendingMachine.virtualVendingMachinePackage#getProductSelector()
 * @model
 * @generated
 */
public interface ProductSelector extends EObject {
	/**
	 * Returns the value of the '<em><b>Mvvm Machine</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link virtualVendingMachine.virtualVendingMachine.VirtualVendingMachine#getM_psProductSelector <em>Mps Product Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mvvm Machine</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mvvm Machine</em>' container reference.
	 * @see #setM_vvmMachine(VirtualVendingMachine)
	 * @see virtualVendingMachine.virtualVendingMachine.virtualVendingMachinePackage#getProductSelector_M_vvmMachine()
	 * @see virtualVendingMachine.virtualVendingMachine.VirtualVendingMachine#getM_psProductSelector
	 * @model opposite="m_psProductSelector" transient="false"
	 * @generated
	 */
	VirtualVendingMachine getM_vvmMachine();

	/**
	 * Sets the value of the '{@link virtualVendingMachine.virtualVendingMachine.ProductSelector#getM_vvmMachine <em>Mvvm Machine</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mvvm Machine</em>' container reference.
	 * @see #getM_vvmMachine()
	 * @generated
	 */
	void setM_vvmMachine(VirtualVendingMachine value);

} // ProductSelector
