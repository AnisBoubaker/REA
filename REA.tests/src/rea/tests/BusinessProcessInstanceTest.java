/**
 */
package rea.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import rea.BusinessProcessInstance;
import rea.reaFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Business Process Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link rea.BusinessProcessInstance#isRunning() <em>Running</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class BusinessProcessInstanceTest extends TestCase {

	/**
	 * The fixture for this Business Process Instance test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BusinessProcessInstance fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BusinessProcessInstanceTest.class);
	}

	/**
	 * Constructs a new Business Process Instance test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessProcessInstanceTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Business Process Instance test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(BusinessProcessInstance fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Business Process Instance test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BusinessProcessInstance getFixture() {
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
		setFixture(reaFactory.eINSTANCE.createBusinessProcessInstance());
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

	/**
	 * Tests the '{@link rea.BusinessProcessInstance#isRunning() <em>Running</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rea.BusinessProcessInstance#isRunning()
	 * @generated
	 */
	public void testIsRunning() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} //BusinessProcessInstanceTest
