/**
 */
package virtualVendingMachine.virtualVendingMachine.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import virtualVendingMachine.virtualVendingMachine.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see virtualVendingMachine.virtualVendingMachine.virtualVendingMachinePackage
 * @generated
 */
public class virtualVendingMachineAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static virtualVendingMachinePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public virtualVendingMachineAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = virtualVendingMachinePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected virtualVendingMachineSwitch<Adapter> modelSwitch =
		new virtualVendingMachineSwitch<Adapter>() {
			@Override
			public Adapter caseVirtualVendingMachine(VirtualVendingMachine object) {
				return createVirtualVendingMachineAdapter();
			}
			@Override
			public Adapter casePayMachine(PayMachine object) {
				return createPayMachineAdapter();
			}
			@Override
			public Adapter caseProductSelector(ProductSelector object) {
				return createProductSelectorAdapter();
			}
			@Override
			public Adapter caseCashRegister(CashRegister object) {
				return createCashRegisterAdapter();
			}
			@Override
			public Adapter caseSunCardReceipt(SunCardReceipt object) {
				return createSunCardReceiptAdapter();
			}
			@Override
			public Adapter caseProductDispenser(ProductDispenser object) {
				return createProductDispenserAdapter();
			}
			@Override
			public Adapter caseProductDatabase(ProductDatabase object) {
				return createProductDatabaseAdapter();
			}
			@Override
			public Adapter caseProduct(Product object) {
				return createProductAdapter();
			}
			@Override
			public Adapter caseOutputDisplay(OutputDisplay object) {
				return createOutputDisplayAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link virtualVendingMachine.virtualVendingMachine.VirtualVendingMachine <em>Virtual Vending Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see virtualVendingMachine.virtualVendingMachine.VirtualVendingMachine
	 * @generated
	 */
	public Adapter createVirtualVendingMachineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link virtualVendingMachine.virtualVendingMachine.PayMachine <em>Pay Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see virtualVendingMachine.virtualVendingMachine.PayMachine
	 * @generated
	 */
	public Adapter createPayMachineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link virtualVendingMachine.virtualVendingMachine.ProductSelector <em>Product Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see virtualVendingMachine.virtualVendingMachine.ProductSelector
	 * @generated
	 */
	public Adapter createProductSelectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link virtualVendingMachine.virtualVendingMachine.CashRegister <em>Cash Register</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see virtualVendingMachine.virtualVendingMachine.CashRegister
	 * @generated
	 */
	public Adapter createCashRegisterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link virtualVendingMachine.virtualVendingMachine.SunCardReceipt <em>Sun Card Receipt</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see virtualVendingMachine.virtualVendingMachine.SunCardReceipt
	 * @generated
	 */
	public Adapter createSunCardReceiptAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link virtualVendingMachine.virtualVendingMachine.ProductDispenser <em>Product Dispenser</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see virtualVendingMachine.virtualVendingMachine.ProductDispenser
	 * @generated
	 */
	public Adapter createProductDispenserAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link virtualVendingMachine.virtualVendingMachine.ProductDatabase <em>Product Database</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see virtualVendingMachine.virtualVendingMachine.ProductDatabase
	 * @generated
	 */
	public Adapter createProductDatabaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link virtualVendingMachine.virtualVendingMachine.Product <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see virtualVendingMachine.virtualVendingMachine.Product
	 * @generated
	 */
	public Adapter createProductAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link virtualVendingMachine.virtualVendingMachine.OutputDisplay <em>Output Display</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see virtualVendingMachine.virtualVendingMachine.OutputDisplay
	 * @generated
	 */
	public Adapter createOutputDisplayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //virtualVendingMachineAdapterFactory
