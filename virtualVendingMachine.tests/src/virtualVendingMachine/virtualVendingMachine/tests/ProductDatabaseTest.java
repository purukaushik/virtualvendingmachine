/**
 */
package virtualVendingMachine.virtualVendingMachine.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import virtualVendingMachine.virtualVendingMachine.ProductDatabase;
import virtualVendingMachine.virtualVendingMachine.virtualVendingMachineFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Product Database</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProductDatabaseTest extends TestCase {

	/**
	 * The fixture for this Product Database test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductDatabase fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ProductDatabaseTest.class);
	}

	/**
	 * Constructs a new Product Database test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductDatabaseTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Product Database test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ProductDatabase fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Product Database test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductDatabase getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(virtualVendingMachineFactory.eINSTANCE.createProductDatabase());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //ProductDatabaseTest
