/**
 */
package virtualVendingMachine.virtualVendingMachine;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product Database</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link virtualVendingMachine.virtualVendingMachine.ProductDatabase#getProducts <em>Products</em>}</li>
 * </ul>
 * </p>
 *
 * @see virtualVendingMachine.virtualVendingMachine.virtualVendingMachinePackage#getProductDatabase()
 * @model
 * @generated
 */
public interface ProductDatabase extends EObject {
	/**
	 * Returns the value of the '<em><b>Products</b></em>' containment reference list.
	 * The list contents are of type {@link virtualVendingMachine.virtualVendingMachine.Product}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Products</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Products</em>' containment reference list.
	 * @see virtualVendingMachine.virtualVendingMachine.virtualVendingMachinePackage#getProductDatabase_Products()
	 * @model containment="true"
	 * @generated
	 */
	EList<Product> getProducts();

} // ProductDatabase
