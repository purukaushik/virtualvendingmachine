/**
 */
package virtualVendingMachine.virtualVendingMachine.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import virtualVendingMachine.virtualVendingMachine.CashRegister;
import virtualVendingMachine.virtualVendingMachine.PayMachine;
import virtualVendingMachine.virtualVendingMachine.VirtualVendingMachine;
import virtualVendingMachine.virtualVendingMachine.virtualVendingMachinePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pay Machine</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link virtualVendingMachine.virtualVendingMachine.impl.PayMachineImpl#getM_vvmOwner <em>Mvvm Owner</em>}</li>
 *   <li>{@link virtualVendingMachine.virtualVendingMachine.impl.PayMachineImpl#getM_dMaximumBalance <em>MdMaximum Balance</em>}</li>
 *   <li>{@link virtualVendingMachine.virtualVendingMachine.impl.PayMachineImpl#getM_crRegister <em>Mcr Register</em>}</li>
 *   <li>{@link virtualVendingMachine.virtualVendingMachine.impl.PayMachineImpl#getM_dBalance <em>MdBalance</em>}</li>
 *   <li>{@link virtualVendingMachine.virtualVendingMachine.impl.PayMachineImpl#isM_bOutOfOrder <em>MbOut Of Order</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PayMachineImpl extends MinimalEObjectImpl.Container implements PayMachine {
	/**
	 * The default value of the '{@link #getM_dMaximumBalance() <em>MdMaximum Balance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getM_dMaximumBalance()
	 * @generated
	 * @ordered
	 */
	protected static final double MDMAXIMUM_BALANCE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getM_dMaximumBalance() <em>MdMaximum Balance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getM_dMaximumBalance()
	 * @generated
	 * @ordered
	 */
	protected double m_dMaximumBalance = MDMAXIMUM_BALANCE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getM_crRegister() <em>Mcr Register</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getM_crRegister()
	 * @generated
	 * @ordered
	 */
	protected CashRegister m_crRegister;

	/**
	 * The default value of the '{@link #getM_dBalance() <em>MdBalance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getM_dBalance()
	 * @generated
	 * @ordered
	 */
	protected static final double MDBALANCE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getM_dBalance() <em>MdBalance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getM_dBalance()
	 * @generated
	 * @ordered
	 */
	protected double m_dBalance = MDBALANCE_EDEFAULT;

	/**
	 * The default value of the '{@link #isM_bOutOfOrder() <em>MbOut Of Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isM_bOutOfOrder()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MBOUT_OF_ORDER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isM_bOutOfOrder() <em>MbOut Of Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isM_bOutOfOrder()
	 * @generated
	 * @ordered
	 */
	protected boolean m_bOutOfOrder = MBOUT_OF_ORDER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PayMachineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return virtualVendingMachinePackage.Literals.PAY_MACHINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VirtualVendingMachine getM_vvmOwner() {
		if (eContainerFeatureID() != virtualVendingMachinePackage.PAY_MACHINE__MVVM_OWNER) return null;
		return (VirtualVendingMachine)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetM_vvmOwner(VirtualVendingMachine newM_vvmOwner, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newM_vvmOwner, virtualVendingMachinePackage.PAY_MACHINE__MVVM_OWNER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setM_vvmOwner(VirtualVendingMachine newM_vvmOwner) {
		if (newM_vvmOwner != eInternalContainer() || (eContainerFeatureID() != virtualVendingMachinePackage.PAY_MACHINE__MVVM_OWNER && newM_vvmOwner != null)) {
			if (EcoreUtil.isAncestor(this, newM_vvmOwner))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newM_vvmOwner != null)
				msgs = ((InternalEObject)newM_vvmOwner).eInverseAdd(this, virtualVendingMachinePackage.VIRTUAL_VENDING_MACHINE__MPM_PAY_MACHINE, VirtualVendingMachine.class, msgs);
			msgs = basicSetM_vvmOwner(newM_vvmOwner, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, virtualVendingMachinePackage.PAY_MACHINE__MVVM_OWNER, newM_vvmOwner, newM_vvmOwner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getM_dMaximumBalance() {
		return m_dMaximumBalance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setM_dMaximumBalance(double newM_dMaximumBalance) {
		double oldM_dMaximumBalance = m_dMaximumBalance;
		m_dMaximumBalance = newM_dMaximumBalance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, virtualVendingMachinePackage.PAY_MACHINE__MDMAXIMUM_BALANCE, oldM_dMaximumBalance, m_dMaximumBalance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CashRegister getM_crRegister() {
		if (m_crRegister != null && m_crRegister.eIsProxy()) {
			InternalEObject oldM_crRegister = (InternalEObject)m_crRegister;
			m_crRegister = (CashRegister)eResolveProxy(oldM_crRegister);
			if (m_crRegister != oldM_crRegister) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, virtualVendingMachinePackage.PAY_MACHINE__MCR_REGISTER, oldM_crRegister, m_crRegister));
			}
		}
		return m_crRegister;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CashRegister basicGetM_crRegister() {
		return m_crRegister;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setM_crRegister(CashRegister newM_crRegister) {
		CashRegister oldM_crRegister = m_crRegister;
		m_crRegister = newM_crRegister;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, virtualVendingMachinePackage.PAY_MACHINE__MCR_REGISTER, oldM_crRegister, m_crRegister));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getM_dBalance() {
		return m_dBalance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setM_dBalance(double newM_dBalance) {
		double oldM_dBalance = m_dBalance;
		m_dBalance = newM_dBalance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, virtualVendingMachinePackage.PAY_MACHINE__MDBALANCE, oldM_dBalance, m_dBalance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isM_bOutOfOrder() {
		return m_bOutOfOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setM_bOutOfOrder(boolean newM_bOutOfOrder) {
		boolean oldM_bOutOfOrder = m_bOutOfOrder;
		m_bOutOfOrder = newM_bOutOfOrder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, virtualVendingMachinePackage.PAY_MACHINE__MBOUT_OF_ORDER, oldM_bOutOfOrder, m_bOutOfOrder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case virtualVendingMachinePackage.PAY_MACHINE__MVVM_OWNER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetM_vvmOwner((VirtualVendingMachine)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case virtualVendingMachinePackage.PAY_MACHINE__MVVM_OWNER:
				return basicSetM_vvmOwner(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case virtualVendingMachinePackage.PAY_MACHINE__MVVM_OWNER:
				return eInternalContainer().eInverseRemove(this, virtualVendingMachinePackage.VIRTUAL_VENDING_MACHINE__MPM_PAY_MACHINE, VirtualVendingMachine.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case virtualVendingMachinePackage.PAY_MACHINE__MVVM_OWNER:
				return getM_vvmOwner();
			case virtualVendingMachinePackage.PAY_MACHINE__MDMAXIMUM_BALANCE:
				return getM_dMaximumBalance();
			case virtualVendingMachinePackage.PAY_MACHINE__MCR_REGISTER:
				if (resolve) return getM_crRegister();
				return basicGetM_crRegister();
			case virtualVendingMachinePackage.PAY_MACHINE__MDBALANCE:
				return getM_dBalance();
			case virtualVendingMachinePackage.PAY_MACHINE__MBOUT_OF_ORDER:
				return isM_bOutOfOrder();
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
			case virtualVendingMachinePackage.PAY_MACHINE__MVVM_OWNER:
				setM_vvmOwner((VirtualVendingMachine)newValue);
				return;
			case virtualVendingMachinePackage.PAY_MACHINE__MDMAXIMUM_BALANCE:
				setM_dMaximumBalance((Double)newValue);
				return;
			case virtualVendingMachinePackage.PAY_MACHINE__MCR_REGISTER:
				setM_crRegister((CashRegister)newValue);
				return;
			case virtualVendingMachinePackage.PAY_MACHINE__MDBALANCE:
				setM_dBalance((Double)newValue);
				return;
			case virtualVendingMachinePackage.PAY_MACHINE__MBOUT_OF_ORDER:
				setM_bOutOfOrder((Boolean)newValue);
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
			case virtualVendingMachinePackage.PAY_MACHINE__MVVM_OWNER:
				setM_vvmOwner((VirtualVendingMachine)null);
				return;
			case virtualVendingMachinePackage.PAY_MACHINE__MDMAXIMUM_BALANCE:
				setM_dMaximumBalance(MDMAXIMUM_BALANCE_EDEFAULT);
				return;
			case virtualVendingMachinePackage.PAY_MACHINE__MCR_REGISTER:
				setM_crRegister((CashRegister)null);
				return;
			case virtualVendingMachinePackage.PAY_MACHINE__MDBALANCE:
				setM_dBalance(MDBALANCE_EDEFAULT);
				return;
			case virtualVendingMachinePackage.PAY_MACHINE__MBOUT_OF_ORDER:
				setM_bOutOfOrder(MBOUT_OF_ORDER_EDEFAULT);
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
			case virtualVendingMachinePackage.PAY_MACHINE__MVVM_OWNER:
				return getM_vvmOwner() != null;
			case virtualVendingMachinePackage.PAY_MACHINE__MDMAXIMUM_BALANCE:
				return m_dMaximumBalance != MDMAXIMUM_BALANCE_EDEFAULT;
			case virtualVendingMachinePackage.PAY_MACHINE__MCR_REGISTER:
				return m_crRegister != null;
			case virtualVendingMachinePackage.PAY_MACHINE__MDBALANCE:
				return m_dBalance != MDBALANCE_EDEFAULT;
			case virtualVendingMachinePackage.PAY_MACHINE__MBOUT_OF_ORDER:
				return m_bOutOfOrder != MBOUT_OF_ORDER_EDEFAULT;
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
		result.append(" (m_dMaximumBalance: ");
		result.append(m_dMaximumBalance);
		result.append(", m_dBalance: ");
		result.append(m_dBalance);
		result.append(", m_bOutOfOrder: ");
		result.append(m_bOutOfOrder);
		result.append(')');
		return result.toString();
	}

} //PayMachineImpl
