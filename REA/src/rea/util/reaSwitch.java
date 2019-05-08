/**
 */
package rea.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import rea.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see rea.reaPackage
 * @generated
 */
public class reaSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static reaPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public reaSwitch() {
		if (modelPackage == null) {
			modelPackage = reaPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case reaPackage.EVENT: {
				Event event = (Event)theEObject;
				T result = caseEvent(event);
				if (result == null) result = caseREAConcept(event);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case reaPackage.RESOURCE: {
				Resource resource = (Resource)theEObject;
				T result = caseResource(resource);
				if (result == null) result = caseValuable(resource);
				if (result == null) result = caseREAConcept(resource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case reaPackage.AGENT: {
				Agent agent = (Agent)theEObject;
				T result = caseAgent(agent);
				if (result == null) result = caseREAConcept(agent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case reaPackage.REA_PROCESS: {
				REAProcess reaProcess = (REAProcess)theEObject;
				T result = caseREAProcess(reaProcess);
				if (result == null) result = caseREAConcept(reaProcess);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case reaPackage.EXCHANGE: {
				Exchange exchange = (Exchange)theEObject;
				T result = caseExchange(exchange);
				if (result == null) result = caseREAProcess(exchange);
				if (result == null) result = caseREAConcept(exchange);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case reaPackage.CONVERSION: {
				Conversion conversion = (Conversion)theEObject;
				T result = caseConversion(conversion);
				if (result == null) result = caseREAProcess(conversion);
				if (result == null) result = caseREAConcept(conversion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case reaPackage.PROPERTY: {
				Property property = (Property)theEObject;
				T result = caseProperty(property);
				if (result == null) result = caseREAConcept(property);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case reaPackage.BUSINESS_PROCESS_DEFINITION: {
				BusinessProcessDefinition businessProcessDefinition = (BusinessProcessDefinition)theEObject;
				T result = caseBusinessProcessDefinition(businessProcessDefinition);
				if (result == null) result = caseREAConcept(businessProcessDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case reaPackage.RIGHT: {
				Right right = (Right)theEObject;
				T result = caseRight(right);
				if (result == null) result = caseREAConcept(right);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case reaPackage.RIGHT_TRANSFER: {
				RightTransfer rightTransfer = (RightTransfer)theEObject;
				T result = caseRightTransfer(rightTransfer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case reaPackage.PROPERTY_ALTERATION: {
				PropertyAlteration propertyAlteration = (PropertyAlteration)theEObject;
				T result = casePropertyAlteration(propertyAlteration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case reaPackage.VALUE_MODEL: {
				ValueModel valueModel = (ValueModel)theEObject;
				T result = caseValueModel(valueModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case reaPackage.BUSINESS_PROCESS_INSTANCE: {
				BusinessProcessInstance businessProcessInstance = (BusinessProcessInstance)theEObject;
				T result = caseBusinessProcessInstance(businessProcessInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case reaPackage.EVENT_INSTANCE: {
				EventInstance eventInstance = (EventInstance)theEObject;
				T result = caseEventInstance(eventInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case reaPackage.RESOURCE_INSTANCE: {
				ResourceInstance resourceInstance = (ResourceInstance)theEObject;
				T result = caseResourceInstance(resourceInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case reaPackage.PROPERTY_INSTANCE: {
				PropertyInstance propertyInstance = (PropertyInstance)theEObject;
				T result = casePropertyInstance(propertyInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case reaPackage.RIGHT_INSTANCE: {
				RightInstance rightInstance = (RightInstance)theEObject;
				T result = caseRightInstance(rightInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case reaPackage.REA_CONCEPT_VISITOR: {
				REAConceptVisitor reaConceptVisitor = (REAConceptVisitor)theEObject;
				T result = caseREAConceptVisitor(reaConceptVisitor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case reaPackage.REA_CONCEPT: {
				REAConcept reaConcept = (REAConcept)theEObject;
				T result = caseREAConcept(reaConcept);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case reaPackage.CLAIM: {
				Claim claim = (Claim)theEObject;
				T result = caseClaim(claim);
				if (result == null) result = caseValuable(claim);
				if (result == null) result = caseREAConcept(claim);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case reaPackage.VALUABLE: {
				Valuable valuable = (Valuable)theEObject;
				T result = caseValuable(valuable);
				if (result == null) result = caseREAConcept(valuable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case reaPackage.AGENT_ALIAS: {
				AgentAlias agentAlias = (AgentAlias)theEObject;
				T result = caseAgentAlias(agentAlias);
				if (result == null) result = caseAgent(agentAlias);
				if (result == null) result = caseREAConcept(agentAlias);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvent(Event object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResource(Resource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Agent</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Agent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAgent(Agent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>REA Process</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>REA Process</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseREAProcess(REAProcess object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exchange</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exchange</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExchange(Exchange object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conversion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conversion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConversion(Conversion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProperty(Property object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Business Process Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Business Process Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBusinessProcessDefinition(BusinessProcessDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Right</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Right</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRight(Right object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Right Transfer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Right Transfer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRightTransfer(RightTransfer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property Alteration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property Alteration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropertyAlteration(PropertyAlteration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueModel(ValueModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Business Process Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Business Process Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBusinessProcessInstance(BusinessProcessInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventInstance(EventInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourceInstance(ResourceInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropertyInstance(PropertyInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Right Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Right Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRightInstance(RightInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>REA Concept Visitor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>REA Concept Visitor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseREAConceptVisitor(REAConceptVisitor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>REA Concept</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>REA Concept</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseREAConcept(REAConcept object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Claim</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Claim</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClaim(Claim object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Valuable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Valuable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValuable(Valuable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Agent Alias</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Agent Alias</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAgentAlias(AgentAlias object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //reaSwitch
