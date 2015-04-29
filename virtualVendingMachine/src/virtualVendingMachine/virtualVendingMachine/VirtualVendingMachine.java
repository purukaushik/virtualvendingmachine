/**
 */
package virtualVendingMachine.virtualVendingMachine;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Virtual Vending Machine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link virtualVendingMachine.virtualVendingMachine.VirtualVendingMachine#isM_bOutOfOrder <em>MbOut Of Order</em>}</li>
 *   <li>{@link virtualVendingMachine.virtualVendingMachine.VirtualVendingMachine#getM_pdProducts <em>Mpd Products</em>}</li>
 *   <li>{@link virtualVendingMachine.virtualVendingMachine.VirtualVendingMachine#getM_psProductSelector <em>Mps Product Selector</em>}</li>
 *   <li>{@link virtualVendingMachine.virtualVendingMachine.VirtualVendingMachine#getM_odOutputDisplay <em>Mod Output Display</em>}</li>
 *   <li>{@link virtualVendingMachine.virtualVendingMachine.VirtualVendingMachine#getM_pmPayMachine <em>Mpm Pay Machine</em>}</li>
 *   <li>{@link virtualVendingMachine.virtualVendingMachine.VirtualVendingMachine#getM_pdDispenser <em>Mpd Dispenser</em>}</li>
 * </ul>
 * </p>
 *
 * @see virtualVendingMachine.virtualVendingMachine.virtualVendingMachinePackage#getVirtualVendingMachine()
 * @model
 * @generated
 */
public interface VirtualVendingMachine extends EObject {
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
	 * @see virtualVendingMachine.virtualVendingMachine.virtualVendingMachinePackage#getVirtualVendingMachine_M_bOutOfOrder()
	 * @model default="false"
	 * @generated
	 */
	boolean isM_bOutOfOrder();

	/**
	 * Sets the value of the '{@link virtualVendingMachine.virtualVendingMachine.VirtualVendingMachine#isM_bOutOfOrder <em>MbOut Of Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MbOut Of Order</em>' attribute.
	 * @see #isM_bOutOfOrder()
	 * @generated
	 */
	void setM_bOutOfOrder(boolean value);

	/**
	 * Returns the value of the '<em><b>Mpd Products</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mpd Products</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mpd Products</em>' containment reference.
	 * @see #setM_pdProducts(ProductDatabase)
	 * @see virtualVendingMachine.virtualVendingMachine.virtualVendingMachinePackage#getVirtualVendingMachine_M_pdProducts()
	 * @model containment="true"
	 * @generated
	 */
	ProductDatabase getM_pdProducts();

	/**
	 * Sets the value of the '{@link virtualVendingMachine.virtualVendingMachine.VirtualVendingMachine#getM_pdProducts <em>Mpd Products</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mpd Products</em>' containment reference.
	 * @see #getM_pdProducts()
	 * @generated
	 */
	void setM_pdProducts(ProductDatabase value);

	/**
	 * Returns the value of the '<em><b>Mps Product Selector</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link virtualVendingMachine.virtualVendingMachine.ProductSelector#getM_vvmMachine <em>Mvvm Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mps Product Selector</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mps Product Selector</em>' containment reference.
	 * @see #setM_psProductSelector(ProductSelector)
	 * @see virtualVendingMachine.virtualVendingMachine.virtualVendingMachinePackage#getVirtualVendingMachine_M_psProductSelector()
	 * @see virtualVendingMachine.virtualVendingMachine.ProductSelector#getM_vvmMachine
	 * @model opposite="m_vvmMachine" containment="true"
	 * @generated
	 */
	ProductSelector getM_psProductSelector();

	/**
	 * Sets the value of the '{@link virtualVendingMachine.virtualVendingMachine.VirtualVendingMachine#getM_psProductSelector <em>Mps Product Selector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mps Product Selector</em>' containment reference.
	 * @see #getM_psProductSelector()
	 * @generated
	 */
	void setM_psProductSelector(ProductSelector value);

	/**
	 * Returns the value of the '<em><b>Mod Output Display</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mod Output Display</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mod Output Display</em>' containment reference.
	 * @see #setM_odOutputDisplay(OutputDisplay)
	 * @see virtualVendingMachine.virtualVendingMachine.virtualVendingMachinePackage#getVirtualVendingMachine_M_odOutputDisplay()
	 * @model containment="true"
	 * @generated
	 */
	OutputDisplay getM_odOutputDisplay();

	/**
	 * Sets the value of the '{@link virtualVendingMachine.virtualVendingMachine.VirtualVendingMachine#getM_odOutputDisplay <em>Mod Output Display</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mod Output Display</em>' containment reference.
	 * @see #getM_odOutputDisplay()
	 * @generated
	 */
	void setM_odOutputDisplay(OutputDisplay value);

	/**
	 * Returns the value of the '<em><b>Mpm Pay Machine</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link virtualVendingMachine.virtualVendingMachine.PayMachine#getM_vvmOwner <em>Mvvm Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mpm Pay Machine</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mpm Pay Machine</em>' containment reference.
	 * @see #setM_pmPayMachine(PayMachine)
	 * @see virtualVendingMachine.virtualVendingMachine.virtualVendingMachinePackage#getVirtualVendingMachine_M_pmPayMachine()
	 * @see virtualVendingMachine.virtualVendingMachine.PayMachine#getM_vvmOwner
	 * @model opposite="m_vvmOwner" containment="true"
	 * @generated
	 */
	PayMachine getM_pmPayMachine();

	/**
	 * Sets the value of the '{@link virtualVendingMachine.virtualVendingMachine.VirtualVendingMachine#getM_pmPayMachine <em>Mpm Pay Machine</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mpm Pay Machine</em>' containment reference.
	 * @see #getM_pmPayMachine()
	 * @generated
	 */
	void setM_pmPayMachine(PayMachine value);

	/**
	 * Returns the value of the '<em><b>Mpd Dispenser</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mpd Dispenser</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mpd Dispenser</em>' containment reference.
	 * @see #setM_pdDispenser(ProductDispenser)
	 * @see virtualVendingMachine.virtualVendingMachine.virtualVendingMachinePackage#getVirtualVendingMachine_M_pdDispenser()
	 * @model containment="true"
	 * @generated
	 */
	ProductDispenser getM_pdDispenser();

	/**
	 * Sets the value of the '{@link virtualVendingMachine.virtualVendingMachine.VirtualVendingMachine#getM_pdDispenser <em>Mpd Dispenser</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mpd Dispenser</em>' containment reference.
	 * @see #getM_pdDispenser()
	 * @generated
	 */
	void setM_pdDispenser(ProductDispenser value);

} // VirtualVendingMachine
