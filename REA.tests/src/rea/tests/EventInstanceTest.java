/**
 */
package rea.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import rea.EventInstance;
import rea.reaFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Event Instance</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class EventInstanceTest extends TestCase {

	/**
	 * The fixture for this Event Instance test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventInstance fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(EventInstanceTest.class);
	}

	/**
	 * Constructs a new Event Instance test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventInstanceTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Event Instance test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(EventInstance fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Event Instance test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventInstance getFixture() {
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
		setFixture(reaFactory.eINSTANCE.createEventInstance());
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

} //EventInstanceTest
