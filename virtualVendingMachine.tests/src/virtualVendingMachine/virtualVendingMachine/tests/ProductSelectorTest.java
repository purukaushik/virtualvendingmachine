/**
 */
package virtualVendingMachine.virtualVendingMachine.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import virtualVendingMachine.virtualVendingMachine.ProductSelector;
import virtualVendingMachine.virtualVendingMachine.virtualVendingMachineFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Product Selector</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProductSelectorTest extends TestCase {

	/**
	 * The fixture for this Product Selector test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductSelector fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ProductSelectorTest.class);
	}

	/**
	 * Constructs a new Product Selector test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductSelectorTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Product Selector test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ProductSelector fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Product Selector test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductSelector getFixture() {
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
		setFixture(virtualVendingMachineFactory.eINSTANCE.createProductSelector());
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

} //ProductSelectorTest
