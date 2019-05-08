/**
 */
package rea.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>rea</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class reaTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new reaTests("rea Tests");
		suite.addTestSuite(EventTest.class);
		suite.addTestSuite(ResourceTest.class);
		suite.addTestSuite(AgentTest.class);
		suite.addTestSuite(ExchangeTest.class);
		suite.addTestSuite(ConversionTest.class);
		suite.addTestSuite(PropertyTest.class);
		suite.addTestSuite(BusinessProcessDefinitionTest.class);
		suite.addTestSuite(RightTest.class);
		suite.addTestSuite(RightTransferTest.class);
		suite.addTestSuite(PropertyAlterationTest.class);
		suite.addTestSuite(ValueModelTest.class);
		suite.addTestSuite(BusinessProcessInstanceTest.class);
		suite.addTestSuite(PropertyInstanceTest.class);
		suite.addTestSuite(RightInstanceTest.class);
		suite.addTestSuite(ClaimTest.class);
		suite.addTestSuite(AgentAliasTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public reaTests(String name) {
		super(name);
	}

} //reaTests
