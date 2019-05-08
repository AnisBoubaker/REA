/**
 */
package rea.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import rea.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class reaFactoryImpl extends EFactoryImpl implements reaFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static reaFactory init() {
		try {
			reaFactory thereaFactory = (reaFactory)EPackage.Registry.INSTANCE.getEFactory(reaPackage.eNS_URI);
			if (thereaFactory != null) {
				return thereaFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new reaFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public reaFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case reaPackage.EVENT: return createEvent();
			case reaPackage.RESOURCE: return createResource();
			case reaPackage.AGENT: return createAgent();
			case reaPackage.EXCHANGE: return createExchange();
			case reaPackage.CONVERSION: return createConversion();
			case reaPackage.PROPERTY: return createProperty();
			case reaPackage.BUSINESS_PROCESS_DEFINITION: return createBusinessProcessDefinition();
			case reaPackage.RIGHT: return createRight();
			case reaPackage.RIGHT_TRANSFER: return createRightTransfer();
			case reaPackage.PROPERTY_ALTERATION: return createPropertyAlteration();
			case reaPackage.VALUE_MODEL: return createValueModel();
			case reaPackage.BUSINESS_PROCESS_INSTANCE: return createBusinessProcessInstance();
			case reaPackage.EVENT_INSTANCE: return createEventInstance();
			case reaPackage.RESOURCE_INSTANCE: return createResourceInstance();
			case reaPackage.PROPERTY_INSTANCE: return createPropertyInstance();
			case reaPackage.RIGHT_INSTANCE: return createRightInstance();
			case reaPackage.CLAIM: return createClaim();
			case reaPackage.AGENT_ALIAS: return createAgentAlias();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case reaPackage.RESOURCE_ALTERATION_TYPE:
				return createResourceAlterationTypeFromString(eDataType, initialValue);
			case reaPackage.RESOURCE_TREATMENT_TYPE:
				return createResourceTreatmentTypeFromString(eDataType, initialValue);
			case reaPackage.PROPERTY_RECOVERABILITY:
				return createPropertyRecoverabilityFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case reaPackage.RESOURCE_ALTERATION_TYPE:
				return convertResourceAlterationTypeToString(eDataType, instanceValue);
			case reaPackage.RESOURCE_TREATMENT_TYPE:
				return convertResourceTreatmentTypeToString(eDataType, instanceValue);
			case reaPackage.PROPERTY_RECOVERABILITY:
				return convertPropertyRecoverabilityToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Event createEvent() {
		EventImpl event = new EventImpl();
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource createResource() {
		ResourceImpl resource = new ResourceImpl();
		return resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Agent createAgent() {
		AgentImpl agent = new AgentImpl();
		return agent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Exchange createExchange() {
		ExchangeImpl exchange = new ExchangeImpl();
		return exchange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Conversion createConversion() {
		ConversionImpl conversion = new ConversionImpl();
		return conversion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property createProperty() {
		PropertyImpl property = new PropertyImpl();
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessProcessDefinition createBusinessProcessDefinition() {
		BusinessProcessDefinitionImpl businessProcessDefinition = new BusinessProcessDefinitionImpl();
		return businessProcessDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Right createRight() {
		RightImpl right = new RightImpl();
		return right;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RightTransfer createRightTransfer() {
		RightTransferImpl rightTransfer = new RightTransferImpl();
		return rightTransfer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyAlteration createPropertyAlteration() {
		PropertyAlterationImpl propertyAlteration = new PropertyAlterationImpl();
		return propertyAlteration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueModel createValueModel() {
		ValueModelImpl valueModel = new ValueModelImpl();
		return valueModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessProcessInstance createBusinessProcessInstance() {
		BusinessProcessInstanceImpl businessProcessInstance = new BusinessProcessInstanceImpl();
		return businessProcessInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventInstance createEventInstance() {
		EventInstanceImpl eventInstance = new EventInstanceImpl();
		return eventInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceInstance createResourceInstance() {
		ResourceInstanceImpl resourceInstance = new ResourceInstanceImpl();
		return resourceInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyInstance createPropertyInstance() {
		PropertyInstanceImpl propertyInstance = new PropertyInstanceImpl();
		return propertyInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RightInstance createRightInstance() {
		RightInstanceImpl rightInstance = new RightInstanceImpl();
		return rightInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Claim createClaim() {
		ClaimImpl claim = new ClaimImpl();
		return claim;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AgentAlias createAgentAlias() {
		AgentAliasImpl agentAlias = new AgentAliasImpl();
		return agentAlias;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceAlterationType createResourceAlterationTypeFromString(EDataType eDataType, String initialValue) {
		ResourceAlterationType result = ResourceAlterationType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertResourceAlterationTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceTreatmentType createResourceTreatmentTypeFromString(EDataType eDataType, String initialValue) {
		ResourceTreatmentType result = ResourceTreatmentType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertResourceTreatmentTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyRecoverability createPropertyRecoverabilityFromString(EDataType eDataType, String initialValue) {
		PropertyRecoverability result = PropertyRecoverability.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPropertyRecoverabilityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public reaPackage getreaPackage() {
		return (reaPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static reaPackage getPackage() {
		return reaPackage.eINSTANCE;
	}

} //reaFactoryImpl
