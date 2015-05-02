/**
 */
package virtualVendingMachine.virtualVendingMachine.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import virtualVendingMachine.virtualVendingMachine.Product;
import virtualVendingMachine.virtualVendingMachine.virtualVendingMachinePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link virtualVendingMachine.virtualVendingMachine.impl.ProductImpl#getM_iID <em>MiID</em>}</li>
 *   <li>{@link virtualVendingMachine.virtualVendingMachine.impl.ProductImpl#getM_sName <em>MsName</em>}</li>
 *   <li>{@link virtualVendingMachine.virtualVendingMachine.impl.ProductImpl#getM_sDescription <em>MsDescription</em>}</li>
 *   <li>{@link virtualVendingMachine.virtualVendingMachine.impl.ProductImpl#getM_dPrice <em>MdPrice</em>}</li>
 *   <li>{@link virtualVendingMachine.virtualVendingMachine.impl.ProductImpl#getM_iQuantity <em>MiQuantity</em>}</li>
 *   <li>{@link virtualVendingMachine.virtualVendingMachine.impl.ProductImpl#getM_iIcon <em>MiIcon</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProductImpl extends MinimalEObjectImpl.Container implements Product {
	/**
	 * The default value of the '{@link #getM_iID() <em>MiID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getM_iID()
	 * @generated
	 * @ordered
	 */
	protected static final int MIID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getM_iID() <em>MiID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getM_iID()
	 * @generated
	 * @ordered
	 */
	protected int m_iID = MIID_EDEFAULT;

	/**
	 * The default value of the '{@link #getM_sName() <em>MsName</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getM_sName()
	 * @generated
	 * @ordered
	 */
	protected static final String MSNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getM_sName() <em>MsName</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getM_sName()
	 * @generated
	 * @ordered
	 */
	protected String m_sName = MSNAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getM_sDescription() <em>MsDescription</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getM_sDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String MSDESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getM_sDescription() <em>MsDescription</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getM_sDescription()
	 * @generated
	 * @ordered
	 */
	protected String m_sDescription = MSDESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getM_dPrice() <em>MdPrice</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getM_dPrice()
	 * @generated
	 * @ordered
	 */
	protected static final double MDPRICE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getM_dPrice() <em>MdPrice</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getM_dPrice()
	 * @generated
	 * @ordered
	 */
	protected double m_dPrice = MDPRICE_EDEFAULT;

	/**
	 * The default value of the '{@link #getM_iQuantity() <em>MiQuantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getM_iQuantity()
	 * @generated
	 * @ordered
	 */
	protected static final int MIQUANTITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getM_iQuantity() <em>MiQuantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getM_iQuantity()
	 * @generated
	 * @ordered
	 */
	protected int m_iQuantity = MIQUANTITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getM_iIcon() <em>MiIcon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getM_iIcon()
	 * @generated
	 * @ordered
	 */
	protected static final String MIICON_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getM_iIcon() <em>MiIcon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getM_iIcon()
	 * @generated
	 * @ordered
	 */
	protected String m_iIcon = MIICON_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return virtualVendingMachinePackage.Literals.PRODUCT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getM_iID() {
		return m_iID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setM_iID(int newM_iID) {
		int oldM_iID = m_iID;
		m_iID = newM_iID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, virtualVendingMachinePackage.PRODUCT__MIID, oldM_iID, m_iID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getM_sName() {
		return m_sName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setM_sName(String newM_sName) {
		String oldM_sName = m_sName;
		m_sName = newM_sName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, virtualVendingMachinePackage.PRODUCT__MSNAME, oldM_sName, m_sName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getM_sDescription() {
		return m_sDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setM_sDescription(String newM_sDescription) {
		String oldM_sDescription = m_sDescription;
		m_sDescription = newM_sDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, virtualVendingMachinePackage.PRODUCT__MSDESCRIPTION, oldM_sDescription, m_sDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getM_dPrice() {
		return m_dPrice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setM_dPrice(double newM_dPrice) {
		double oldM_dPrice = m_dPrice;
		m_dPrice = newM_dPrice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, virtualVendingMachinePackage.PRODUCT__MDPRICE, oldM_dPrice, m_dPrice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getM_iQuantity() {
		return m_iQuantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setM_iQuantity(int newM_iQuantity) {
		int oldM_iQuantity = m_iQuantity;
		m_iQuantity = newM_iQuantity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, virtualVendingMachinePackage.PRODUCT__MIQUANTITY, oldM_iQuantity, m_iQuantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getM_iIcon() {
		return m_iIcon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setM_iIcon(String newM_iIcon) {
		String oldM_iIcon = m_iIcon;
		m_iIcon = newM_iIcon;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, virtualVendingMachinePackage.PRODUCT__MIICON, oldM_iIcon, m_iIcon));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case virtualVendingMachinePackage.PRODUCT__MIID:
				return getM_iID();
			case virtualVendingMachinePackage.PRODUCT__MSNAME:
				return getM_sName();
			case virtualVendingMachinePackage.PRODUCT__MSDESCRIPTION:
				return getM_sDescription();
			case virtualVendingMachinePackage.PRODUCT__MDPRICE:
				return getM_dPrice();
			case virtualVendingMachinePackage.PRODUCT__MIQUANTITY:
				return getM_iQuantity();
			case virtualVendingMachinePackage.PRODUCT__MIICON:
				return getM_iIcon();
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
			case virtualVendingMachinePackage.PRODUCT__MIID:
				setM_iID((Integer)newValue);
				return;
			case virtualVendingMachinePackage.PRODUCT__MSNAME:
				setM_sName((String)newValue);
				return;
			case virtualVendingMachinePackage.PRODUCT__MSDESCRIPTION:
				setM_sDescription((String)newValue);
				return;
			case virtualVendingMachinePackage.PRODUCT__MDPRICE:
				setM_dPrice((Double)newValue);
				return;
			case virtualVendingMachinePackage.PRODUCT__MIQUANTITY:
				setM_iQuantity((Integer)newValue);
				return;
			case virtualVendingMachinePackage.PRODUCT__MIICON:
				setM_iIcon((String)newValue);
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
			case virtualVendingMachinePackage.PRODUCT__MIID:
				setM_iID(MIID_EDEFAULT);
				return;
			case virtualVendingMachinePackage.PRODUCT__MSNAME:
				setM_sName(MSNAME_EDEFAULT);
				return;
			case virtualVendingMachinePackage.PRODUCT__MSDESCRIPTION:
				setM_sDescription(MSDESCRIPTION_EDEFAULT);
				return;
			case virtualVendingMachinePackage.PRODUCT__MDPRICE:
				setM_dPrice(MDPRICE_EDEFAULT);
				return;
			case virtualVendingMachinePackage.PRODUCT__MIQUANTITY:
				setM_iQuantity(MIQUANTITY_EDEFAULT);
				return;
			case virtualVendingMachinePackage.PRODUCT__MIICON:
				setM_iIcon(MIICON_EDEFAULT);
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
			case virtualVendingMachinePackage.PRODUCT__MIID:
				return m_iID != MIID_EDEFAULT;
			case virtualVendingMachinePackage.PRODUCT__MSNAME:
				return MSNAME_EDEFAULT == null ? m_sName != null : !MSNAME_EDEFAULT.equals(m_sName);
			case virtualVendingMachinePackage.PRODUCT__MSDESCRIPTION:
				return MSDESCRIPTION_EDEFAULT == null ? m_sDescription != null : !MSDESCRIPTION_EDEFAULT.equals(m_sDescription);
			case virtualVendingMachinePackage.PRODUCT__MDPRICE:
				return m_dPrice != MDPRICE_EDEFAULT;
			case virtualVendingMachinePackage.PRODUCT__MIQUANTITY:
				return m_iQuantity != MIQUANTITY_EDEFAULT;
			case virtualVendingMachinePackage.PRODUCT__MIICON:
				return MIICON_EDEFAULT == null ? m_iIcon != null : !MIICON_EDEFAULT.equals(m_iIcon);
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
		result.append(" (m_iID: ");
		result.append(m_iID);
		result.append(", m_sName: ");
		result.append(m_sName);
		result.append(", m_sDescription: ");
		result.append(m_sDescription);
		result.append(", m_dPrice: ");
		result.append(m_dPrice);
		result.append(", m_iQuantity: ");
		result.append(m_iQuantity);
		result.append(", m_iIcon: ");
		result.append(m_iIcon);
		result.append(')');
		return result.toString();
	}

} //ProductImpl
