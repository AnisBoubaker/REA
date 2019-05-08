/**
 */
package rea.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import rea.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see rea.reaPackage
 * @generated
 */
public class reaAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static reaPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public reaAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = reaPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected reaSwitch<Adapter> modelSwitch =
		new reaSwitch<Adapter>() {
			@Override
			public Adapter caseEvent(Event object) {
				return createEventAdapter();
			}
			@Override
			public Adapter caseResource(Resource object) {
				return createResourceAdapter();
			}
			@Override
			public Adapter caseAgent(Agent object) {
				return createAgentAdapter();
			}
			@Override
			public Adapter caseREAProcess(REAProcess object) {
				return createREAProcessAdapter();
			}
			@Override
			public Adapter caseExchange(Exchange object) {
				return createExchangeAdapter();
			}
			@Override
			public Adapter caseConversion(Conversion object) {
				return createConversionAdapter();
			}
			@Override
			public Adapter caseProperty(Property object) {
				return createPropertyAdapter();
			}
			@Override
			public Adapter caseBusinessProcessDefinition(BusinessProcessDefinition object) {
				return createBusinessProcessDefinitionAdapter();
			}
			@Override
			public Adapter caseRight(Right object) {
				return createRightAdapter();
			}
			@Override
			public Adapter caseRightTransfer(RightTransfer object) {
				return createRightTransferAdapter();
			}
			@Override
			public Adapter casePropertyAlteration(PropertyAlteration object) {
				return createPropertyAlterationAdapter();
			}
			@Override
			public Adapter caseValueModel(ValueModel object) {
				return createValueModelAdapter();
			}
			@Override
			public Adapter caseBusinessProcessInstance(BusinessProcessInstance object) {
				return createBusinessProcessInstanceAdapter();
			}
			@Override
			public Adapter caseEventInstance(EventInstance object) {
				return createEventInstanceAdapter();
			}
			@Override
			public Adapter caseResourceInstance(ResourceInstance object) {
				return createResourceInstanceAdapter();
			}
			@Override
			public Adapter casePropertyInstance(PropertyInstance object) {
				return createPropertyInstanceAdapter();
			}
			@Override
			public Adapter caseRightInstance(RightInstance object) {
				return createRightInstanceAdapter();
			}
			@Override
			public Adapter caseREAConceptVisitor(REAConceptVisitor object) {
				return createREAConceptVisitorAdapter();
			}
			@Override
			public Adapter caseREAConcept(REAConcept object) {
				return createREAConceptAdapter();
			}
			@Override
			public Adapter caseClaim(Claim object) {
				return createClaimAdapter();
			}
			@Override
			public Adapter caseValuable(Valuable object) {
				return createValuableAdapter();
			}
			@Override
			public Adapter caseAgentAlias(AgentAlias object) {
				return createAgentAliasAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link rea.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rea.Event
	 * @generated
	 */
	public Adapter createEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rea.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rea.Resource
	 * @generated
	 */
	public Adapter createResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rea.Agent <em>Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rea.Agent
	 * @generated
	 */
	public Adapter createAgentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rea.REAProcess <em>REA Process</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rea.REAProcess
	 * @generated
	 */
	public Adapter createREAProcessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rea.Exchange <em>Exchange</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rea.Exchange
	 * @generated
	 */
	public Adapter createExchangeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rea.Conversion <em>Conversion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rea.Conversion
	 * @generated
	 */
	public Adapter createConversionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rea.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rea.Property
	 * @generated
	 */
	public Adapter createPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rea.BusinessProcessDefinition <em>Business Process Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rea.BusinessProcessDefinition
	 * @generated
	 */
	public Adapter createBusinessProcessDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rea.Right <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rea.Right
	 * @generated
	 */
	public Adapter createRightAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rea.RightTransfer <em>Right Transfer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rea.RightTransfer
	 * @generated
	 */
	public Adapter createRightTransferAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rea.PropertyAlteration <em>Property Alteration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rea.PropertyAlteration
	 * @generated
	 */
	public Adapter createPropertyAlterationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rea.ValueModel <em>Value Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rea.ValueModel
	 * @generated
	 */
	public Adapter createValueModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rea.BusinessProcessInstance <em>Business Process Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rea.BusinessProcessInstance
	 * @generated
	 */
	public Adapter createBusinessProcessInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rea.EventInstance <em>Event Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rea.EventInstance
	 * @generated
	 */
	public Adapter createEventInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rea.ResourceInstance <em>Resource Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rea.ResourceInstance
	 * @generated
	 */
	public Adapter createResourceInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rea.PropertyInstance <em>Property Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rea.PropertyInstance
	 * @generated
	 */
	public Adapter createPropertyInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rea.RightInstance <em>Right Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rea.RightInstance
	 * @generated
	 */
	public Adapter createRightInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rea.REAConceptVisitor <em>REA Concept Visitor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rea.REAConceptVisitor
	 * @generated
	 */
	public Adapter createREAConceptVisitorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rea.REAConcept <em>REA Concept</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rea.REAConcept
	 * @generated
	 */
	public Adapter createREAConceptAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rea.Claim <em>Claim</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rea.Claim
	 * @generated
	 */
	public Adapter createClaimAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rea.Valuable <em>Valuable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rea.Valuable
	 * @generated
	 */
	public Adapter createValuableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rea.AgentAlias <em>Agent Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rea.AgentAlias
	 * @generated
	 */
	public Adapter createAgentAliasAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //reaAdapterFactory
