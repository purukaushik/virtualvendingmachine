/**
 */
package virtualVendingMachine.virtualVendingMachine.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import virtualVendingMachine.virtualVendingMachine.OutputDisplay;
import virtualVendingMachine.virtualVendingMachine.virtualVendingMachineFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Output Display</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class OutputDisplayTest extends TestCase {

	/**
	 * The fixture for this Output Display test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OutputDisplay fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(OutputDisplayTest.class);
	}

	/**
	 * Constructs a new Output Display test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputDisplayTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Output Display test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(OutputDisplay fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Output Display test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OutputDisplay getFixture() {
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
		setFixture(virtualVendingMachineFactory.eINSTANCE.createOutputDisplay());
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

} //OutputDisplayTest
