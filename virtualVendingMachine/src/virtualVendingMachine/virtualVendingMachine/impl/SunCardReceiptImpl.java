/**
 */
package virtualVendingMachine.virtualVendingMachine.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import virtualVendingMachine.virtualVendingMachine.SunCardReceipt;
import virtualVendingMachine.virtualVendingMachine.virtualVendingMachinePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sun Card Receipt</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link virtualVendingMachine.virtualVendingMachine.impl.SunCardReceiptImpl#getM_iAccount <em>MiAccount</em>}</li>
 *   <li>{@link virtualVendingMachine.virtualVendingMachine.impl.SunCardReceiptImpl#getM_dAmountDeducted <em>MdAmount Deducted</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SunCardReceiptImpl extends MinimalEObjectImpl.Container implements SunCardReceipt {
	/**
	 * The default value of the '{@link #getM_iAccount() <em>MiAccount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getM_iAccount()
	 * @generated
	 * @ordered
	 */
	protected static final int MIACCOUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getM_iAccount() <em>MiAccount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getM_iAccount()
	 * @generated
	 * @ordered
	 */
	protected int m_iAccount = MIACCOUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getM_dAmountDeducted() <em>MdAmount Deducted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getM_dAmountDeducted()
	 * @generated
	 * @ordered
	 */
	protected static final double MDAMOUNT_DEDUCTED_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getM_dAmountDeducted() <em>MdAmount Deducted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getM_dAmountDeducted()
	 * @generated
	 * @ordered
	 */
	protected double m_dAmountDeducted = MDAMOUNT_DEDUCTED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SunCardReceiptImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return virtualVendingMachinePackage.Literals.SUN_CARD_RECEIPT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getM_iAccount() {
		return m_iAccount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setM_iAccount(int newM_iAccount) {
		int oldM_iAccount = m_iAccount;
		m_iAccount = newM_iAccount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, virtualVendingMachinePackage.SUN_CARD_RECEIPT__MIACCOUNT, oldM_iAccount, m_iAccount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getM_dAmountDeducted() {
		return m_dAmountDeducted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setM_dAmountDeducted(double newM_dAmountDeducted) {
		double oldM_dAmountDeducted = m_dAmountDeducted;
		m_dAmountDeducted = newM_dAmountDeducted;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, virtualVendingMachinePackage.SUN_CARD_RECEIPT__MDAMOUNT_DEDUCTED, oldM_dAmountDeducted, m_dAmountDeducted));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case virtualVendingMachinePackage.SUN_CARD_RECEIPT__MIACCOUNT:
				return getM_iAccount();
			case virtualVendingMachinePackage.SUN_CARD_RECEIPT__MDAMOUNT_DEDUCTED:
				return getM_dAmountDeducted();
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
			case virtualVendingMachinePackage.SUN_CARD_RECEIPT__MIACCOUNT:
				setM_iAccount((Integer)newValue);
				return;
			case virtualVendingMachinePackage.SUN_CARD_RECEIPT__MDAMOUNT_DEDUCTED:
				setM_dAmountDeducted((Double)newValue);
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
			case virtualVendingMachinePackage.SUN_CARD_RECEIPT__MIACCOUNT:
				setM_iAccount(MIACCOUNT_EDEFAULT);
				return;
			case virtualVendingMachinePackage.SUN_CARD_RECEIPT__MDAMOUNT_DEDUCTED:
				setM_dAmountDeducted(MDAMOUNT_DEDUCTED_EDEFAULT);
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
			case virtualVendingMachinePackage.SUN_CARD_RECEIPT__MIACCOUNT:
				return m_iAccount != MIACCOUNT_EDEFAULT;
			case virtualVendingMachinePackage.SUN_CARD_RECEIPT__MDAMOUNT_DEDUCTED:
				return m_dAmountDeducted != MDAMOUNT_DEDUCTED_EDEFAULT;
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
		result.append(" (m_iAccount: ");
		result.append(m_iAccount);
		result.append(", m_dAmountDeducted: ");
		result.append(m_dAmountDeducted);
		result.append(')');
		return result.toString();
	}

} //SunCardReceiptImpl
