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

import virtualVendingMachine.virtualVendingMachine.ProductSelector;
import virtualVendingMachine.virtualVendingMachine.VirtualVendingMachine;
import virtualVendingMachine.virtualVendingMachine.virtualVendingMachinePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product Selector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link virtualVendingMachine.virtualVendingMachine.impl.ProductSelectorImpl#getM_vvmMachine <em>Mvvm Machine</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProductSelectorImpl extends MinimalEObjectImpl.Container implements ProductSelector {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductSelectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return virtualVendingMachinePackage.Literals.PRODUCT_SELECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VirtualVendingMachine getM_vvmMachine() {
		if (eContainerFeatureID() != virtualVendingMachinePackage.PRODUCT_SELECTOR__MVVM_MACHINE) return null;
		return (VirtualVendingMachine)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetM_vvmMachine(VirtualVendingMachine newM_vvmMachine, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newM_vvmMachine, virtualVendingMachinePackage.PRODUCT_SELECTOR__MVVM_MACHINE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setM_vvmMachine(VirtualVendingMachine newM_vvmMachine) {
		if (newM_vvmMachine != eInternalContainer() || (eContainerFeatureID() != virtualVendingMachinePackage.PRODUCT_SELECTOR__MVVM_MACHINE && newM_vvmMachine != null)) {
			if (EcoreUtil.isAncestor(this, newM_vvmMachine))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newM_vvmMachine != null)
				msgs = ((InternalEObject)newM_vvmMachine).eInverseAdd(this, virtualVendingMachinePackage.VIRTUAL_VENDING_MACHINE__MPS_PRODUCT_SELECTOR, VirtualVendingMachine.class, msgs);
			msgs = basicSetM_vvmMachine(newM_vvmMachine, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, virtualVendingMachinePackage.PRODUCT_SELECTOR__MVVM_MACHINE, newM_vvmMachine, newM_vvmMachine));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case virtualVendingMachinePackage.PRODUCT_SELECTOR__MVVM_MACHINE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetM_vvmMachine((VirtualVendingMachine)otherEnd, msgs);
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
			case virtualVendingMachinePackage.PRODUCT_SELECTOR__MVVM_MACHINE:
				return basicSetM_vvmMachine(null, msgs);
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
			case virtualVendingMachinePackage.PRODUCT_SELECTOR__MVVM_MACHINE:
				return eInternalContainer().eInverseRemove(this, virtualVendingMachinePackage.VIRTUAL_VENDING_MACHINE__MPS_PRODUCT_SELECTOR, VirtualVendingMachine.class, msgs);
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
			case virtualVendingMachinePackage.PRODUCT_SELECTOR__MVVM_MACHINE:
				return getM_vvmMachine();
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
			case virtualVendingMachinePackage.PRODUCT_SELECTOR__MVVM_MACHINE:
				setM_vvmMachine((VirtualVendingMachine)newValue);
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
			case virtualVendingMachinePackage.PRODUCT_SELECTOR__MVVM_MACHINE:
				setM_vvmMachine((VirtualVendingMachine)null);
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
			case virtualVendingMachinePackage.PRODUCT_SELECTOR__MVVM_MACHINE:
				return getM_vvmMachine() != null;
		}
		return super.eIsSet(featureID);
	}

} //ProductSelectorImpl
