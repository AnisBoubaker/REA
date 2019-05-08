/**
 */
package rea.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import rea.ResourceInstance;
import rea.reaFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Resource Instance</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ResourceInstanceTest extends TestCase {

	/**
	 * The fixture for this Resource Instance test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceInstance fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ResourceInstanceTest.class);
	}

	/**
	 * Constructs a new Resource Instance test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceInstanceTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Resource Instance test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ResourceInstance fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Resource Instance test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceInstance getFixture() {
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
		setFixture(reaFactory.eINSTANCE.createResourceInstance());
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

} //ResourceInstanceTest
