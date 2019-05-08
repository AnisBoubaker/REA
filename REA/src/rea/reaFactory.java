/**
 */
package rea;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see rea.reaPackage
 * @generated
 */
public interface reaFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	reaFactory eINSTANCE = rea.impl.reaFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event</em>'.
	 * @generated
	 */
	Event createEvent();

	/**
	 * Returns a new object of class '<em>Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource</em>'.
	 * @generated
	 */
	Resource createResource();

	/**
	 * Returns a new object of class '<em>Agent</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Agent</em>'.
	 * @generated
	 */
	Agent createAgent();

	/**
	 * Returns a new object of class '<em>Exchange</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Exchange</em>'.
	 * @generated
	 */
	Exchange createExchange();

	/**
	 * Returns a new object of class '<em>Conversion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Conversion</em>'.
	 * @generated
	 */
	Conversion createConversion();

	/**
	 * Returns a new object of class '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Property</em>'.
	 * @generated
	 */
	Property createProperty();

	/**
	 * Returns a new object of class '<em>Business Process Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Business Process Definition</em>'.
	 * @generated
	 */
	BusinessProcessDefinition createBusinessProcessDefinition();

	/**
	 * Returns a new object of class '<em>Right</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Right</em>'.
	 * @generated
	 */
	Right createRight();

	/**
	 * Returns a new object of class '<em>Right Transfer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Right Transfer</em>'.
	 * @generated
	 */
	RightTransfer createRightTransfer();

	/**
	 * Returns a new object of class '<em>Property Alteration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Property Alteration</em>'.
	 * @generated
	 */
	PropertyAlteration createPropertyAlteration();

	/**
	 * Returns a new object of class '<em>Value Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Value Model</em>'.
	 * @generated
	 */
	ValueModel createValueModel();

	/**
	 * Returns a new object of class '<em>Business Process Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Business Process Instance</em>'.
	 * @generated
	 */
	BusinessProcessInstance createBusinessProcessInstance();

	/**
	 * Returns a new object of class '<em>Event Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event Instance</em>'.
	 * @generated
	 */
	EventInstance createEventInstance();

	/**
	 * Returns a new object of class '<em>Resource Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource Instance</em>'.
	 * @generated
	 */
	ResourceInstance createResourceInstance();

	/**
	 * Returns a new object of class '<em>Property Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Property Instance</em>'.
	 * @generated
	 */
	PropertyInstance createPropertyInstance();

	/**
	 * Returns a new object of class '<em>Right Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Right Instance</em>'.
	 * @generated
	 */
	RightInstance createRightInstance();

	/**
	 * Returns a new object of class '<em>Claim</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Claim</em>'.
	 * @generated
	 */
	Claim createClaim();

	/**
	 * Returns a new object of class '<em>Agent Alias</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Agent Alias</em>'.
	 * @generated
	 */
	AgentAlias createAgentAlias();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	reaPackage getreaPackage();

} //reaFactory
