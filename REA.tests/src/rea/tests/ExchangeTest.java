/**
 */
package rea.tests;

import junit.textui.TestRunner;

import rea.Exchange;
import rea.reaFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Exchange</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExchangeTest extends REAProcessTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ExchangeTest.class);
	}

	/**
	 * Constructs a new Exchange test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExchangeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Exchange test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Exchange getFixture() {
		return (Exchange)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(reaFactory.eINSTANCE.createExchange());
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

} //ExchangeTest
