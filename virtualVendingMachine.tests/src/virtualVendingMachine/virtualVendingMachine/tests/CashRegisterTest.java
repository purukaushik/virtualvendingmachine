/**
 */
package virtualVendingMachine.virtualVendingMachine.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import virtualVendingMachine.virtualVendingMachine.CashRegister;
import virtualVendingMachine.virtualVendingMachine.virtualVendingMachineFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Cash Register</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CashRegisterTest extends TestCase {

	/**
	 * The fixture for this Cash Register test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CashRegister fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CashRegisterTest.class);
	}

	/**
	 * Constructs a new Cash Register test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CashRegisterTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Cash Register test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(CashRegister fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Cash Register test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CashRegister getFixture() {
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
		setFixture(virtualVendingMachineFactory.eINSTANCE.createCashRegister());
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

} //CashRegisterTest
