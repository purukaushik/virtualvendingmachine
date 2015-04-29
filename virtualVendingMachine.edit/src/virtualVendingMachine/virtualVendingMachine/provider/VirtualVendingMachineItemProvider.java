/**
 */
package virtualVendingMachine.virtualVendingMachine.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import virtualVendingMachine.virtualVendingMachine.VirtualVendingMachine;
import virtualVendingMachine.virtualVendingMachine.virtualVendingMachinePackage;

/**
 * This is the item provider adapter for a {@link virtualVendingMachine.virtualVendingMachine.VirtualVendingMachine} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class VirtualVendingMachineItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VirtualVendingMachineItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addM_bOutOfOrderPropertyDescriptor(object);
			addM_pdProductsPropertyDescriptor(object);
			addM_psProductSelectorPropertyDescriptor(object);
			addM_odOutputDisplayPropertyDescriptor(object);
			addM_pmPayMachinePropertyDescriptor(object);
			addM_pdDispenserPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the MbOut Of Order feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addM_bOutOfOrderPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_VirtualVendingMachine_m_bOutOfOrder_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_VirtualVendingMachine_m_bOutOfOrder_feature", "_UI_VirtualVendingMachine_type"),
				 virtualVendingMachinePackage.Literals.VIRTUAL_VENDING_MACHINE__MBOUT_OF_ORDER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Mpd Products feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addM_pdProductsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_VirtualVendingMachine_m_pdProducts_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_VirtualVendingMachine_m_pdProducts_feature", "_UI_VirtualVendingMachine_type"),
				 virtualVendingMachinePackage.Literals.VIRTUAL_VENDING_MACHINE__MPD_PRODUCTS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Mps Product Selector feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addM_psProductSelectorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_VirtualVendingMachine_m_psProductSelector_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_VirtualVendingMachine_m_psProductSelector_feature", "_UI_VirtualVendingMachine_type"),
				 virtualVendingMachinePackage.Literals.VIRTUAL_VENDING_MACHINE__MPS_PRODUCT_SELECTOR,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Mod Output Display feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addM_odOutputDisplayPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_VirtualVendingMachine_m_odOutputDisplay_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_VirtualVendingMachine_m_odOutputDisplay_feature", "_UI_VirtualVendingMachine_type"),
				 virtualVendingMachinePackage.Literals.VIRTUAL_VENDING_MACHINE__MOD_OUTPUT_DISPLAY,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Mpm Pay Machine feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addM_pmPayMachinePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_VirtualVendingMachine_m_pmPayMachine_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_VirtualVendingMachine_m_pmPayMachine_feature", "_UI_VirtualVendingMachine_type"),
				 virtualVendingMachinePackage.Literals.VIRTUAL_VENDING_MACHINE__MPM_PAY_MACHINE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Mpd Dispenser feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addM_pdDispenserPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_VirtualVendingMachine_m_pdDispenser_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_VirtualVendingMachine_m_pdDispenser_feature", "_UI_VirtualVendingMachine_type"),
				 virtualVendingMachinePackage.Literals.VIRTUAL_VENDING_MACHINE__MPD_DISPENSER,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns VirtualVendingMachine.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/VirtualVendingMachine"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		VirtualVendingMachine virtualVendingMachine = (VirtualVendingMachine)object;
		return getString("_UI_VirtualVendingMachine_type") + " " + virtualVendingMachine.isM_bOutOfOrder();
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(VirtualVendingMachine.class)) {
			case virtualVendingMachinePackage.VIRTUAL_VENDING_MACHINE__MBOUT_OF_ORDER:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return VmEditPlugin.INSTANCE;
	}

}
