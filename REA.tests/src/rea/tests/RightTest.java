/**
 */
package rea.tests;

import junit.textui.TestRunner;

import rea.Right;
import rea.reaFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Right</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link rea.Right#getCurrentOwner() <em>Current Owner</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class RightTest extends REAConceptTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RightTest.class);
	}

	/**
	 * Constructs a new Right test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RightTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Right test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Right getFixture() {
		return (Right)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(reaFactory.eINSTANCE.createRight());
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
	 * Tests the '{@link rea.Right#getCurrentOwner() <em>Current Owner</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rea.Right#getCurrentOwner()
	 * @generated
	 */
	public void testGetCurrentOwner() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} //RightTest
