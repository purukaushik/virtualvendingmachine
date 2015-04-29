/**
 */
package virtualVendingMachine.virtualVendingMachine.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import virtualVendingMachine.virtualVendingMachine.CashRegister;
import virtualVendingMachine.virtualVendingMachine.SunCardReceipt;
import virtualVendingMachine.virtualVendingMachine.virtualVendingMachinePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cash Register</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link virtualVendingMachine.virtualVendingMachine.impl.CashRegisterImpl#getM_iNumQuarters <em>MiNum Quarters</em>}</li>
 *   <li>{@link virtualVendingMachine.virtualVendingMachine.impl.CashRegisterImpl#getM_iNumDimes <em>MiNum Dimes</em>}</li>
 *   <li>{@link virtualVendingMachine.virtualVendingMachine.impl.CashRegisterImpl#getM_iNumNickels <em>MiNum Nickels</em>}</li>
 *   <li>{@link virtualVendingMachine.virtualVendingMachine.impl.CashRegisterImpl#getM_iNumDollars <em>MiNum Dollars</em>}</li>
 *   <li>{@link virtualVendingMachine.virtualVendingMachine.impl.CashRegisterImpl#getM_alReceipts <em>Mal Receipts</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CashRegisterImpl extends MinimalEObjectImpl.Container implements CashRegister {
	/**
	 * The default value of the '{@link #getM_iNumQuarters() <em>MiNum Quarters</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getM_iNumQuarters()
	 * @generated
	 * @ordered
	 */
	protected static final int MINUM_QUARTERS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getM_iNumQuarters() <em>MiNum Quarters</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getM_iNumQuarters()
	 * @generated
	 * @ordered
	 */
	protected int m_iNumQuarters = MINUM_QUARTERS_EDEFAULT;

	/**
	 * The default value of the '{@link #getM_iNumDimes() <em>MiNum Dimes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getM_iNumDimes()
	 * @generated
	 * @ordered
	 */
	protected static final int MINUM_DIMES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getM_iNumDimes() <em>MiNum Dimes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getM_iNumDimes()
	 * @generated
	 * @ordered
	 */
	protected int m_iNumDimes = MINUM_DIMES_EDEFAULT;

	/**
	 * The default value of the '{@link #getM_iNumNickels() <em>MiNum Nickels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getM_iNumNickels()
	 * @generated
	 * @ordered
	 */
	protected static final int MINUM_NICKELS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getM_iNumNickels() <em>MiNum Nickels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getM_iNumNickels()
	 * @generated
	 * @ordered
	 */
	protected int m_iNumNickels = MINUM_NICKELS_EDEFAULT;

	/**
	 * The default value of the '{@link #getM_iNumDollars() <em>MiNum Dollars</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getM_iNumDollars()
	 * @generated
	 * @ordered
	 */
	protected static final int MINUM_DOLLARS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getM_iNumDollars() <em>MiNum Dollars</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getM_iNumDollars()
	 * @generated
	 * @ordered
	 */
	protected int m_iNumDollars = MINUM_DOLLARS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getM_alReceipts() <em>Mal Receipts</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getM_alReceipts()
	 * @generated
	 * @ordered
	 */
	protected EList<SunCardReceipt> m_alReceipts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CashRegisterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return virtualVendingMachinePackage.Literals.CASH_REGISTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getM_iNumQuarters() {
		return m_iNumQuarters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setM_iNumQuarters(int newM_iNumQuarters) {
		int oldM_iNumQuarters = m_iNumQuarters;
		m_iNumQuarters = newM_iNumQuarters;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, virtualVendingMachinePackage.CASH_REGISTER__MINUM_QUARTERS, oldM_iNumQuarters, m_iNumQuarters));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getM_iNumDimes() {
		return m_iNumDimes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setM_iNumDimes(int newM_iNumDimes) {
		int oldM_iNumDimes = m_iNumDimes;
		m_iNumDimes = newM_iNumDimes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, virtualVendingMachinePackage.CASH_REGISTER__MINUM_DIMES, oldM_iNumDimes, m_iNumDimes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getM_iNumNickels() {
		return m_iNumNickels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setM_iNumNickels(int newM_iNumNickels) {
		int oldM_iNumNickels = m_iNumNickels;
		m_iNumNickels = newM_iNumNickels;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, virtualVendingMachinePackage.CASH_REGISTER__MINUM_NICKELS, oldM_iNumNickels, m_iNumNickels));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getM_iNumDollars() {
		return m_iNumDollars;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setM_iNumDollars(int newM_iNumDollars) {
		int oldM_iNumDollars = m_iNumDollars;
		m_iNumDollars = newM_iNumDollars;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, virtualVendingMachinePackage.CASH_REGISTER__MINUM_DOLLARS, oldM_iNumDollars, m_iNumDollars));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SunCardReceipt> getM_alReceipts() {
		if (m_alReceipts == null) {
			m_alReceipts = new EObjectResolvingEList<SunCardReceipt>(SunCardReceipt.class, this, virtualVendingMachinePackage.CASH_REGISTER__MAL_RECEIPTS);
		}
		return m_alReceipts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case virtualVendingMachinePackage.CASH_REGISTER__MINUM_QUARTERS:
				return getM_iNumQuarters();
			case virtualVendingMachinePackage.CASH_REGISTER__MINUM_DIMES:
				return getM_iNumDimes();
			case virtualVendingMachinePackage.CASH_REGISTER__MINUM_NICKELS:
				return getM_iNumNickels();
			case virtualVendingMachinePackage.CASH_REGISTER__MINUM_DOLLARS:
				return getM_iNumDollars();
			case virtualVendingMachinePackage.CASH_REGISTER__MAL_RECEIPTS:
				return getM_alReceipts();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case virtualVendingMachinePackage.CASH_REGISTER__MINUM_QUARTERS:
				setM_iNumQuarters((Integer)newValue);
				return;
			case virtualVendingMachinePackage.CASH_REGISTER__MINUM_DIMES:
				setM_iNumDimes((Integer)newValue);
				return;
			case virtualVendingMachinePackage.CASH_REGISTER__MINUM_NICKELS:
				setM_iNumNickels((Integer)newValue);
				return;
			case virtualVendingMachinePackage.CASH_REGISTER__MINUM_DOLLARS:
				setM_iNumDollars((Integer)newValue);
				return;
			case virtualVendingMachinePackage.CASH_REGISTER__MAL_RECEIPTS:
				getM_alReceipts().clear();
				getM_alReceipts().addAll((Collection<? extends SunCardReceipt>)newValue);
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
			case virtualVendingMachinePackage.CASH_REGISTER__MINUM_QUARTERS:
				setM_iNumQuarters(MINUM_QUARTERS_EDEFAULT);
				return;
			case virtualVendingMachinePackage.CASH_REGISTER__MINUM_DIMES:
				setM_iNumDimes(MINUM_DIMES_EDEFAULT);
				return;
			case virtualVendingMachinePackage.CASH_REGISTER__MINUM_NICKELS:
				setM_iNumNickels(MINUM_NICKELS_EDEFAULT);
				return;
			case virtualVendingMachinePackage.CASH_REGISTER__MINUM_DOLLARS:
				setM_iNumDollars(MINUM_DOLLARS_EDEFAULT);
				return;
			case virtualVendingMachinePackage.CASH_REGISTER__MAL_RECEIPTS:
				getM_alReceipts().clear();
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
			case virtualVendingMachinePackage.CASH_REGISTER__MINUM_QUARTERS:
				return m_iNumQuarters != MINUM_QUARTERS_EDEFAULT;
			case virtualVendingMachinePackage.CASH_REGISTER__MINUM_DIMES:
				return m_iNumDimes != MINUM_DIMES_EDEFAULT;
			case virtualVendingMachinePackage.CASH_REGISTER__MINUM_NICKELS:
				return m_iNumNickels != MINUM_NICKELS_EDEFAULT;
			case virtualVendingMachinePackage.CASH_REGISTER__MINUM_DOLLARS:
				return m_iNumDollars != MINUM_DOLLARS_EDEFAULT;
			case virtualVendingMachinePackage.CASH_REGISTER__MAL_RECEIPTS:
				return m_alReceipts != null && !m_alReceipts.isEmpty();
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
		result.append(" (m_iNumQuarters: ");
		result.append(m_iNumQuarters);
		result.append(", m_iNumDimes: ");
		result.append(m_iNumDimes);
		result.append(", m_iNumNickels: ");
		result.append(m_iNumNickels);
		result.append(", m_iNumDollars: ");
		result.append(m_iNumDollars);
		result.append(')');
		return result.toString();
	}

} //CashRegisterImpl
