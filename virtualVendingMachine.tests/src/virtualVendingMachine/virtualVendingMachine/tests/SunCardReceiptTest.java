/**
 */
package virtualVendingMachine.virtualVendingMachine.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import virtualVendingMachine.virtualVendingMachine.SunCardReceipt;
import virtualVendingMachine.virtualVendingMachine.virtualVendingMachineFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Sun Card Receipt</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SunCardReceiptTest extends TestCase {

	/**
	 * The fixture for this Sun Card Receipt test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SunCardReceipt fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SunCardReceiptTest.class);
	}

	/**
	 * Constructs a new Sun Card Receipt test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SunCardReceiptTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Sun Card Receipt test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(SunCardReceipt fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Sun Card Receipt test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SunCardReceipt getFixture() {
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
		setFixture(virtualVendingMachineFactory.eINSTANCE.createSunCardReceipt());
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

} //SunCardReceiptTest
