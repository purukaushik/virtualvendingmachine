/**
 */
package virtualVendingMachine.virtualVendingMachine.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import virtualVendingMachine.virtualVendingMachine.OutputDisplay;
import virtualVendingMachine.virtualVendingMachine.PayMachine;
import virtualVendingMachine.virtualVendingMachine.ProductDatabase;
import virtualVendingMachine.virtualVendingMachine.ProductDispenser;
import virtualVendingMachine.virtualVendingMachine.ProductSelector;
import virtualVendingMachine.virtualVendingMachine.VirtualVendingMachine;
import virtualVendingMachine.virtualVendingMachine.virtualVendingMachinePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Virtual Vending Machine</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link virtualVendingMachine.virtualVendingMachine.impl.VirtualVendingMachineImpl#isM_bOutOfOrder <em>MbOut Of Order</em>}</li>
 *   <li>{@link virtualVendingMachine.virtualVendingMachine.impl.VirtualVendingMachineImpl#getM_pdProducts <em>Mpd Products</em>}</li>
 *   <li>{@link virtualVendingMachine.virtualVendingMachine.impl.VirtualVendingMachineImpl#getM_psProductSelector <em>Mps Product Selector</em>}</li>
 *   <li>{@link virtualVendingMachine.virtualVendingMachine.impl.VirtualVendingMachineImpl#getM_odOutputDisplay <em>Mod Output Display</em>}</li>
 *   <li>{@link virtualVendingMachine.virtualVendingMachine.impl.VirtualVendingMachineImpl#getM_pmPayMachine <em>Mpm Pay Machine</em>}</li>
 *   <li>{@link virtualVendingMachine.virtualVendingMachine.impl.VirtualVendingMachineImpl#getM_pdDispenser <em>Mpd Dispenser</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VirtualVendingMachineImpl extends MinimalEObjectImpl.Container implements VirtualVendingMachine {
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
	 * The cached value of the '{@link #getM_pdProducts() <em>Mpd Products</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getM_pdProducts()
	 * @generated
	 * @ordered
	 */
	protected ProductDatabase m_pdProducts;

	/**
	 * The cached value of the '{@link #getM_psProductSelector() <em>Mps Product Selector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getM_psProductSelector()
	 * @generated
	 * @ordered
	 */
	protected ProductSelector m_psProductSelector;

	/**
	 * The cached value of the '{@link #getM_odOutputDisplay() <em>Mod Output Display</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getM_odOutputDisplay()
	 * @generated
	 * @ordered
	 */
	protected OutputDisplay m_odOutputDisplay;

	/**
	 * The cached value of the '{@link #getM_pmPayMachine() <em>Mpm Pay Machine</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getM_pmPayMachine()
	 * @generated
	 * @ordered
	 */
	protected PayMachine m_pmPayMachine;

	/**
	 * The cached value of the '{@link #getM_pdDispenser() <em>Mpd Dispenser</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getM_pdDispenser()
	 * @generated
	 * @ordered
	 */
	protected ProductDispenser m_pdDispenser;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VirtualVendingMachineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return virtualVendingMachinePackage.Literals.VIRTUAL_VENDING_MACHINE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, virtualVendingMachinePackage.VIRTUAL_VENDING_MACHINE__MBOUT_OF_ORDER, oldM_bOutOfOrder, m_bOutOfOrder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductDatabase getM_pdProducts() {
		return m_pdProducts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetM_pdProducts(ProductDatabase newM_pdProducts, NotificationChain msgs) {
		ProductDatabase oldM_pdProducts = m_pdProducts;
		m_pdProducts = newM_pdProducts;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, virtualVendingMachinePackage.VIRTUAL_VENDING_MACHINE__MPD_PRODUCTS, oldM_pdProducts, newM_pdProducts);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setM_pdProducts(ProductDatabase newM_pdProducts) {
		if (newM_pdProducts != m_pdProducts) {
			NotificationChain msgs = null;
			if (m_pdProducts != null)
				msgs = ((InternalEObject)m_pdProducts).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - virtualVendingMachinePackage.VIRTUAL_VENDING_MACHINE__MPD_PRODUCTS, null, msgs);
			if (newM_pdProducts != null)
				msgs = ((InternalEObject)newM_pdProducts).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - virtualVendingMachinePackage.VIRTUAL_VENDING_MACHINE__MPD_PRODUCTS, null, msgs);
			msgs = basicSetM_pdProducts(newM_pdProducts, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, virtualVendingMachinePackage.VIRTUAL_VENDING_MACHINE__MPD_PRODUCTS, newM_pdProducts, newM_pdProducts));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductSelector getM_psProductSelector() {
		return m_psProductSelector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetM_psProductSelector(ProductSelector newM_psProductSelector, NotificationChain msgs) {
		ProductSelector oldM_psProductSelector = m_psProductSelector;
		m_psProductSelector = newM_psProductSelector;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, virtualVendingMachinePackage.VIRTUAL_VENDING_MACHINE__MPS_PRODUCT_SELECTOR, oldM_psProductSelector, newM_psProductSelector);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setM_psProductSelector(ProductSelector newM_psProductSelector) {
		if (newM_psProductSelector != m_psProductSelector) {
			NotificationChain msgs = null;
			if (m_psProductSelector != null)
				msgs = ((InternalEObject)m_psProductSelector).eInverseRemove(this, virtualVendingMachinePackage.PRODUCT_SELECTOR__MVVM_MACHINE, ProductSelector.class, msgs);
			if (newM_psProductSelector != null)
				msgs = ((InternalEObject)newM_psProductSelector).eInverseAdd(this, virtualVendingMachinePackage.PRODUCT_SELECTOR__MVVM_MACHINE, ProductSelector.class, msgs);
			msgs = basicSetM_psProductSelector(newM_psProductSelector, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, virtualVendingMachinePackage.VIRTUAL_VENDING_MACHINE__MPS_PRODUCT_SELECTOR, newM_psProductSelector, newM_psProductSelector));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputDisplay getM_odOutputDisplay() {
		return m_odOutputDisplay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetM_odOutputDisplay(OutputDisplay newM_odOutputDisplay, NotificationChain msgs) {
		OutputDisplay oldM_odOutputDisplay = m_odOutputDisplay;
		m_odOutputDisplay = newM_odOutputDisplay;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, virtualVendingMachinePackage.VIRTUAL_VENDING_MACHINE__MOD_OUTPUT_DISPLAY, oldM_odOutputDisplay, newM_odOutputDisplay);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setM_odOutputDisplay(OutputDisplay newM_odOutputDisplay) {
		if (newM_odOutputDisplay != m_odOutputDisplay) {
			NotificationChain msgs = null;
			if (m_odOutputDisplay != null)
				msgs = ((InternalEObject)m_odOutputDisplay).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - virtualVendingMachinePackage.VIRTUAL_VENDING_MACHINE__MOD_OUTPUT_DISPLAY, null, msgs);
			if (newM_odOutputDisplay != null)
				msgs = ((InternalEObject)newM_odOutputDisplay).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - virtualVendingMachinePackage.VIRTUAL_VENDING_MACHINE__MOD_OUTPUT_DISPLAY, null, msgs);
			msgs = basicSetM_odOutputDisplay(newM_odOutputDisplay, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, virtualVendingMachinePackage.VIRTUAL_VENDING_MACHINE__MOD_OUTPUT_DISPLAY, newM_odOutputDisplay, newM_odOutputDisplay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PayMachine getM_pmPayMachine() {
		return m_pmPayMachine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetM_pmPayMachine(PayMachine newM_pmPayMachine, NotificationChain msgs) {
		PayMachine oldM_pmPayMachine = m_pmPayMachine;
		m_pmPayMachine = newM_pmPayMachine;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, virtualVendingMachinePackage.VIRTUAL_VENDING_MACHINE__MPM_PAY_MACHINE, oldM_pmPayMachine, newM_pmPayMachine);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setM_pmPayMachine(PayMachine newM_pmPayMachine) {
		if (newM_pmPayMachine != m_pmPayMachine) {
			NotificationChain msgs = null;
			if (m_pmPayMachine != null)
				msgs = ((InternalEObject)m_pmPayMachine).eInverseRemove(this, virtualVendingMachinePackage.PAY_MACHINE__MVVM_OWNER, PayMachine.class, msgs);
			if (newM_pmPayMachine != null)
				msgs = ((InternalEObject)newM_pmPayMachine).eInverseAdd(this, virtualVendingMachinePackage.PAY_MACHINE__MVVM_OWNER, PayMachine.class, msgs);
			msgs = basicSetM_pmPayMachine(newM_pmPayMachine, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, virtualVendingMachinePackage.VIRTUAL_VENDING_MACHINE__MPM_PAY_MACHINE, newM_pmPayMachine, newM_pmPayMachine));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductDispenser getM_pdDispenser() {
		return m_pdDispenser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetM_pdDispenser(ProductDispenser newM_pdDispenser, NotificationChain msgs) {
		ProductDispenser oldM_pdDispenser = m_pdDispenser;
		m_pdDispenser = newM_pdDispenser;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, virtualVendingMachinePackage.VIRTUAL_VENDING_MACHINE__MPD_DISPENSER, oldM_pdDispenser, newM_pdDispenser);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setM_pdDispenser(ProductDispenser newM_pdDispenser) {
		if (newM_pdDispenser != m_pdDispenser) {
			NotificationChain msgs = null;
			if (m_pdDispenser != null)
				msgs = ((InternalEObject)m_pdDispenser).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - virtualVendingMachinePackage.VIRTUAL_VENDING_MACHINE__MPD_DISPENSER, null, msgs);
			if (newM_pdDispenser != null)
				msgs = ((InternalEObject)newM_pdDispenser).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - virtualVendingMachinePackage.VIRTUAL_VENDING_MACHINE__MPD_DISPENSER, null, msgs);
			msgs = basicSetM_pdDispenser(newM_pdDispenser, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, virtualVendingMachinePackage.VIRTUAL_VENDING_MACHINE__MPD_DISPENSER, newM_pdDispenser, newM_pdDispenser));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case virtualVendingMachinePackage.VIRTUAL_VENDING_MACHINE__MPS_PRODUCT_SELECTOR:
				if (m_psProductSelector != null)
					msgs = ((InternalEObject)m_psProductSelector).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - virtualVendingMachinePackage.VIRTUAL_VENDING_MACHINE__MPS_PRODUCT_SELECTOR, null, msgs);
				return basicSetM_psProductSelector((ProductSelector)otherEnd, msgs);
			case virtualVendingMachinePackage.VIRTUAL_VENDING_MACHINE__MPM_PAY_MACHINE:
				if (m_pmPayMachine != null)
					msgs = ((InternalEObject)m_pmPayMachine).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - virtualVendingMachinePackage.VIRTUAL_VENDING_MACHINE__MPM_PAY_MACHINE, null, msgs);
				return basicSetM_pmPayMachine((PayMachine)otherEnd, msgs);
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
			case virtualVendingMachinePackage.VIRTUAL_VENDING_MACHINE__MPD_PRODUCTS:
				return basicSetM_pdProducts(null, msgs);
			case virtualVendingMachinePackage.VIRTUAL_VENDING_MACHINE__MPS_PRODUCT_SELECTOR:
				return basicSetM_psProductSelector(null, msgs);
			case virtualVendingMachinePackage.VIRTUAL_VENDING_MACHINE__MOD_OUTPUT_DISPLAY:
				return basicSetM_odOutputDisplay(null, msgs);
			case virtualVendingMachinePackage.VIRTUAL_VENDING_MACHINE__MPM_PAY_MACHINE:
				return basicSetM_pmPayMachine(null, msgs);
			case virtualVendingMachinePackage.VIRTUAL_VENDING_MACHINE__MPD_DISPENSER:
				return basicSetM_pdDispenser(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case virtualVendingMachinePackage.VIRTUAL_VENDING_MACHINE__MBOUT_OF_ORDER:
				return isM_bOutOfOrder();
			case virtualVendingMachinePackage.VIRTUAL_VENDING_MACHINE__MPD_PRODUCTS:
				return getM_pdProducts();
			case virtualVendingMachinePackage.VIRTUAL_VENDING_MACHINE__MPS_PRODUCT_SELECTOR:
				return getM_psProductSelector();
			case virtualVendingMachinePackage.VIRTUAL_VENDING_MACHINE__MOD_OUTPUT_DISPLAY:
				return getM_odOutputDisplay();
			case virtualVendingMachinePackage.VIRTUAL_VENDING_MACHINE__MPM_PAY_MACHINE:
				return getM_pmPayMachine();
			case virtualVendingMachinePackage.VIRTUAL_VENDING_MACHINE__MPD_DISPENSER:
				return getM_pdDispenser();
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
			case virtualVendingMachinePackage.VIRTUAL_VENDING_MACHINE__MBOUT_OF_ORDER:
				setM_bOutOfOrder((Boolean)newValue);
				return;
			case virtualVendingMachinePackage.VIRTUAL_VENDING_MACHINE__MPD_PRODUCTS:
				setM_pdProducts((ProductDatabase)newValue);
				return;
			case virtualVendingMachinePackage.VIRTUAL_VENDING_MACHINE__MPS_PRODUCT_SELECTOR:
				setM_psProductSelector((ProductSelector)newValue);
				return;
			case virtualVendingMachinePackage.VIRTUAL_VENDING_MACHINE__MOD_OUTPUT_DISPLAY:
				setM_odOutputDisplay((OutputDisplay)newValue);
				return;
			case virtualVendingMachinePackage.VIRTUAL_VENDING_MACHINE__MPM_PAY_MACHINE:
				setM_pmPayMachine((PayMachine)newValue);
				return;
			case virtualVendingMachinePackage.VIRTUAL_VENDING_MACHINE__MPD_DISPENSER:
				setM_pdDispenser((ProductDispenser)newValue);
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
			case virtualVendingMachinePackage.VIRTUAL_VENDING_MACHINE__MBOUT_OF_ORDER:
				setM_bOutOfOrder(MBOUT_OF_ORDER_EDEFAULT);
				return;
			case virtualVendingMachinePackage.VIRTUAL_VENDING_MACHINE__MPD_PRODUCTS:
				setM_pdProducts((ProductDatabase)null);
				return;
			case virtualVendingMachinePackage.VIRTUAL_VENDING_MACHINE__MPS_PRODUCT_SELECTOR:
				setM_psProductSelector((ProductSelector)null);
				return;
			case virtualVendingMachinePackage.VIRTUAL_VENDING_MACHINE__MOD_OUTPUT_DISPLAY:
				setM_odOutputDisplay((OutputDisplay)null);
				return;
			case virtualVendingMachinePackage.VIRTUAL_VENDING_MACHINE__MPM_PAY_MACHINE:
				setM_pmPayMachine((PayMachine)null);
				return;
			case virtualVendingMachinePackage.VIRTUAL_VENDING_MACHINE__MPD_DISPENSER:
				setM_pdDispenser((ProductDispenser)null);
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
			case virtualVendingMachinePackage.VIRTUAL_VENDING_MACHINE__MBOUT_OF_ORDER:
				return m_bOutOfOrder != MBOUT_OF_ORDER_EDEFAULT;
			case virtualVendingMachinePackage.VIRTUAL_VENDING_MACHINE__MPD_PRODUCTS:
				return m_pdProducts != null;
			case virtualVendingMachinePackage.VIRTUAL_VENDING_MACHINE__MPS_PRODUCT_SELECTOR:
				return m_psProductSelector != null;
			case virtualVendingMachinePackage.VIRTUAL_VENDING_MACHINE__MOD_OUTPUT_DISPLAY:
				return m_odOutputDisplay != null;
			case virtualVendingMachinePackage.VIRTUAL_VENDING_MACHINE__MPM_PAY_MACHINE:
				return m_pmPayMachine != null;
			case virtualVendingMachinePackage.VIRTUAL_VENDING_MACHINE__MPD_DISPENSER:
				return m_pdDispenser != null;
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
		result.append(" (m_bOutOfOrder: ");
		result.append(m_bOutOfOrder);
		result.append(')');
		return result.toString();
	}

} //VirtualVendingMachineImpl
