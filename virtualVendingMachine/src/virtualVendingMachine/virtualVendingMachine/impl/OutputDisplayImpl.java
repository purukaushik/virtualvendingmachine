/**
 */
package virtualVendingMachine.virtualVendingMachine.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import virtualVendingMachine.virtualVendingMachine.OutputDisplay;
import virtualVendingMachine.virtualVendingMachine.virtualVendingMachinePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Output Display</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link virtualVendingMachine.virtualVendingMachine.impl.OutputDisplayImpl#getM_sCurrentOutput <em>MsCurrent Output</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OutputDisplayImpl extends MinimalEObjectImpl.Container implements OutputDisplay {
	/**
	 * The default value of the '{@link #getM_sCurrentOutput() <em>MsCurrent Output</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getM_sCurrentOutput()
	 * @generated
	 * @ordered
	 */
	protected static final String MSCURRENT_OUTPUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getM_sCurrentOutput() <em>MsCurrent Output</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getM_sCurrentOutput()
	 * @generated
	 * @ordered
	 */
	protected String m_sCurrentOutput = MSCURRENT_OUTPUT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OutputDisplayImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return virtualVendingMachinePackage.Literals.OUTPUT_DISPLAY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getM_sCurrentOutput() {
		return m_sCurrentOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setM_sCurrentOutput(String newM_sCurrentOutput) {
		String oldM_sCurrentOutput = m_sCurrentOutput;
		m_sCurrentOutput = newM_sCurrentOutput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, virtualVendingMachinePackage.OUTPUT_DISPLAY__MSCURRENT_OUTPUT, oldM_sCurrentOutput, m_sCurrentOutput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case virtualVendingMachinePackage.OUTPUT_DISPLAY__MSCURRENT_OUTPUT:
				return getM_sCurrentOutput();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case virtualVendingMachinePackage.OUTPUT_DISPLAY__MSCURRENT_OUTPUT:
				setM_sCurrentOutput((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case virtualVendingMachinePackage.OUTPUT_DISPLAY__MSCURRENT_OUTPUT:
				setM_sCurrentOutput(MSCURRENT_OUTPUT_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case virtualVendingMachinePackage.OUTPUT_DISPLAY__MSCURRENT_OUTPUT:
				return MSCURRENT_OUTPUT_EDEFAULT == null ? m_sCurrentOutput != null : !MSCURRENT_OUTPUT_EDEFAULT.equals(m_sCurrentOutput);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (m_sCurrentOutput: ");
		result.append(m_sCurrentOutput);
		result.append(')');
		return result.toString();
	}

} //OutputDisplayImpl
