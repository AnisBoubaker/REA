/**
 */
package rea;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see rea.reaFactory
 * @model kind="package"
 * @generated
 */
public interface reaPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "rea";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "ca.uqam.latece.rea";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "rea";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	reaPackage eINSTANCE = rea.impl.reaPackageImpl.init();

	/**
	 * The meta object id for the '{@link rea.impl.REAConceptImpl <em>REA Concept</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rea.impl.REAConceptImpl
	 * @see rea.impl.reaPackageImpl#getREAConcept()
	 * @generated
	 */
	int REA_CONCEPT = 18;

	/**
	 * The number of structural features of the '<em>REA Concept</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REA_CONCEPT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link rea.impl.EventImpl <em>Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rea.impl.EventImpl
	 * @see rea.impl.reaPackageImpl#getEvent()
	 * @generated
	 */
	int EVENT = 0;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__RESOURCE = REA_CONCEPT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Provider</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__PROVIDER = REA_CONCEPT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Receiver</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__RECEIVER = REA_CONCEPT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>REA Process</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__REA_PROCESS = REA_CONCEPT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Right Transfers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__RIGHT_TRANSFERS = REA_CONCEPT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Alterations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__ALTERATIONS = REA_CONCEPT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Alteration Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__ALTERATION_TYPE = REA_CONCEPT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__NAME = REA_CONCEPT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FEATURE_COUNT = REA_CONCEPT_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link rea.impl.ValuableImpl <em>Valuable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rea.impl.ValuableImpl
	 * @see rea.impl.reaPackageImpl#getValuable()
	 * @generated
	 */
	int VALUABLE = 20;

	/**
	 * The feature id for the '<em><b>Rights</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUABLE__RIGHTS = REA_CONCEPT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUABLE__EVENTS = REA_CONCEPT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUABLE__NAME = REA_CONCEPT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Compensation Related</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUABLE__COMPENSATION_RELATED = REA_CONCEPT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Valuable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUABLE_FEATURE_COUNT = REA_CONCEPT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link rea.impl.ResourceImpl <em>Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rea.impl.ResourceImpl
	 * @see rea.impl.reaPackageImpl#getResource()
	 * @generated
	 */
	int RESOURCE = 1;

	/**
	 * The feature id for the '<em><b>Rights</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__RIGHTS = VALUABLE__RIGHTS;

	/**
	 * The feature id for the '<em><b>Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__EVENTS = VALUABLE__EVENTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__NAME = VALUABLE__NAME;

	/**
	 * The feature id for the '<em><b>Compensation Related</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__COMPENSATION_RELATED = VALUABLE__COMPENSATION_RELATED;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__PROPERTIES = VALUABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Claims</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__CLAIMS = VALUABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_FEATURE_COUNT = VALUABLE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link rea.impl.AgentImpl <em>Agent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rea.impl.AgentImpl
	 * @see rea.impl.reaPackageImpl#getAgent()
	 * @generated
	 */
	int AGENT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__NAME = REA_CONCEPT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Agent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_FEATURE_COUNT = REA_CONCEPT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link rea.impl.REAProcessImpl <em>REA Process</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rea.impl.REAProcessImpl
	 * @see rea.impl.reaPackageImpl#getREAProcess()
	 * @generated
	 */
	int REA_PROCESS = 3;

	/**
	 * The feature id for the '<em><b>Increment Evt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REA_PROCESS__INCREMENT_EVT = REA_CONCEPT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Decrement Evt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REA_PROCESS__DECREMENT_EVT = REA_CONCEPT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Inflow Res</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REA_PROCESS__INFLOW_RES = REA_CONCEPT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Outflow Res</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REA_PROCESS__OUTFLOW_RES = REA_CONCEPT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Predecessors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REA_PROCESS__PREDECESSORS = REA_CONCEPT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REA_PROCESS__ID = REA_CONCEPT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Successors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REA_PROCESS__SUCCESSORS = REA_CONCEPT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Compensated By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REA_PROCESS__COMPENSATED_BY = REA_CONCEPT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Compensation For</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REA_PROCESS__COMPENSATION_FOR = REA_CONCEPT_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>REA Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REA_PROCESS_FEATURE_COUNT = REA_CONCEPT_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link rea.impl.ExchangeImpl <em>Exchange</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rea.impl.ExchangeImpl
	 * @see rea.impl.reaPackageImpl#getExchange()
	 * @generated
	 */
	int EXCHANGE = 4;

	/**
	 * The feature id for the '<em><b>Increment Evt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCHANGE__INCREMENT_EVT = REA_PROCESS__INCREMENT_EVT;

	/**
	 * The feature id for the '<em><b>Decrement Evt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCHANGE__DECREMENT_EVT = REA_PROCESS__DECREMENT_EVT;

	/**
	 * The feature id for the '<em><b>Inflow Res</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCHANGE__INFLOW_RES = REA_PROCESS__INFLOW_RES;

	/**
	 * The feature id for the '<em><b>Outflow Res</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCHANGE__OUTFLOW_RES = REA_PROCESS__OUTFLOW_RES;

	/**
	 * The feature id for the '<em><b>Predecessors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCHANGE__PREDECESSORS = REA_PROCESS__PREDECESSORS;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCHANGE__ID = REA_PROCESS__ID;

	/**
	 * The feature id for the '<em><b>Successors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCHANGE__SUCCESSORS = REA_PROCESS__SUCCESSORS;

	/**
	 * The feature id for the '<em><b>Compensated By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCHANGE__COMPENSATED_BY = REA_PROCESS__COMPENSATED_BY;

	/**
	 * The feature id for the '<em><b>Compensation For</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCHANGE__COMPENSATION_FOR = REA_PROCESS__COMPENSATION_FOR;

	/**
	 * The number of structural features of the '<em>Exchange</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCHANGE_FEATURE_COUNT = REA_PROCESS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link rea.impl.ConversionImpl <em>Conversion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rea.impl.ConversionImpl
	 * @see rea.impl.reaPackageImpl#getConversion()
	 * @generated
	 */
	int CONVERSION = 5;

	/**
	 * The feature id for the '<em><b>Increment Evt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSION__INCREMENT_EVT = REA_PROCESS__INCREMENT_EVT;

	/**
	 * The feature id for the '<em><b>Decrement Evt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSION__DECREMENT_EVT = REA_PROCESS__DECREMENT_EVT;

	/**
	 * The feature id for the '<em><b>Inflow Res</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSION__INFLOW_RES = REA_PROCESS__INFLOW_RES;

	/**
	 * The feature id for the '<em><b>Outflow Res</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSION__OUTFLOW_RES = REA_PROCESS__OUTFLOW_RES;

	/**
	 * The feature id for the '<em><b>Predecessors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSION__PREDECESSORS = REA_PROCESS__PREDECESSORS;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSION__ID = REA_PROCESS__ID;

	/**
	 * The feature id for the '<em><b>Successors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSION__SUCCESSORS = REA_PROCESS__SUCCESSORS;

	/**
	 * The feature id for the '<em><b>Compensated By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSION__COMPENSATED_BY = REA_PROCESS__COMPENSATED_BY;

	/**
	 * The feature id for the '<em><b>Compensation For</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSION__COMPENSATION_FOR = REA_PROCESS__COMPENSATION_FOR;

	/**
	 * The number of structural features of the '<em>Conversion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSION_FEATURE_COUNT = REA_PROCESS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link rea.impl.PropertyImpl <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rea.impl.PropertyImpl
	 * @see rea.impl.reaPackageImpl#getProperty()
	 * @generated
	 */
	int PROPERTY = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__NAME = REA_CONCEPT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Initial State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__INITIAL_STATE = REA_CONCEPT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Alterations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__ALTERATIONS = REA_CONCEPT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Depends On</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__DEPENDS_ON = REA_CONCEPT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Dependees</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__DEPENDEES = REA_CONCEPT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Recoverable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__RECOVERABLE = REA_CONCEPT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Primary Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__PRIMARY_PROPERTY = REA_CONCEPT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__RESOURCE = REA_CONCEPT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FEATURE_COUNT = REA_CONCEPT_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link rea.impl.BusinessProcessDefinitionImpl <em>Business Process Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rea.impl.BusinessProcessDefinitionImpl
	 * @see rea.impl.reaPackageImpl#getBusinessProcessDefinition()
	 * @generated
	 */
	int BUSINESS_PROCESS_DEFINITION = 7;

	/**
	 * The feature id for the '<em><b>REA Processes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_PROCESS_DEFINITION__REA_PROCESSES = REA_CONCEPT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_PROCESS_DEFINITION__NAME = REA_CONCEPT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Business Process Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_PROCESS_DEFINITION_FEATURE_COUNT = REA_CONCEPT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link rea.impl.RightImpl <em>Right</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rea.impl.RightImpl
	 * @see rea.impl.reaPackageImpl#getRight()
	 * @generated
	 */
	int RIGHT = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT__NAME = REA_CONCEPT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>First Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT__FIRST_OWNER = REA_CONCEPT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Current Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT__CURRENT_OWNER = REA_CONCEPT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Transfers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT__TRANSFERS = REA_CONCEPT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Right</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_FEATURE_COUNT = REA_CONCEPT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link rea.impl.RightTransferImpl <em>Right Transfer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rea.impl.RightTransferImpl
	 * @see rea.impl.reaPackageImpl#getRightTransfer()
	 * @generated
	 */
	int RIGHT_TRANSFER = 9;

	/**
	 * The feature id for the '<em><b>Right</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_TRANSFER__RIGHT = 0;

	/**
	 * The feature id for the '<em><b>New Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_TRANSFER__NEW_OWNER = 1;

	/**
	 * The feature id for the '<em><b>Initial Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_TRANSFER__INITIAL_OWNER = 2;

	/**
	 * The number of structural features of the '<em>Right Transfer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_TRANSFER_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link rea.impl.PropertyAlterationImpl <em>Property Alteration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rea.impl.PropertyAlterationImpl
	 * @see rea.impl.reaPackageImpl#getPropertyAlteration()
	 * @generated
	 */
	int PROPERTY_ALTERATION = 10;

	/**
	 * The feature id for the '<em><b>New State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_ALTERATION__NEW_STATE = 0;

	/**
	 * The feature id for the '<em><b>Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_ALTERATION__PROPERTY = 1;

	/**
	 * The feature id for the '<em><b>Initial State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_ALTERATION__INITIAL_STATE = 2;

	/**
	 * The number of structural features of the '<em>Property Alteration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_ALTERATION_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link rea.impl.ValueModelImpl <em>Value Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rea.impl.ValueModelImpl
	 * @see rea.impl.reaPackageImpl#getValueModel()
	 * @generated
	 */
	int VALUE_MODEL = 11;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_MODEL__RESOURCES = 0;

	/**
	 * The feature id for the '<em><b>Agents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_MODEL__AGENTS = 1;

	/**
	 * The feature id for the '<em><b>Process Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_MODEL__PROCESS_DEFINITION = 2;

	/**
	 * The feature id for the '<em><b>Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_MODEL__INSTANCES = 3;

	/**
	 * The feature id for the '<em><b>Compensation Process</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_MODEL__COMPENSATION_PROCESS = 4;

	/**
	 * The number of structural features of the '<em>Value Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_MODEL_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link rea.impl.BusinessProcessInstanceImpl <em>Business Process Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rea.impl.BusinessProcessInstanceImpl
	 * @see rea.impl.reaPackageImpl#getBusinessProcessInstance()
	 * @generated
	 */
	int BUSINESS_PROCESS_INSTANCE = 12;

	/**
	 * The feature id for the '<em><b>Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_PROCESS_INSTANCE__EVENTS = 0;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_PROCESS_INSTANCE__RESOURCES = 1;

	/**
	 * The feature id for the '<em><b>Started On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_PROCESS_INSTANCE__STARTED_ON = 2;

	/**
	 * The feature id for the '<em><b>Ended On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_PROCESS_INSTANCE__ENDED_ON = 3;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_PROCESS_INSTANCE__ID = 4;

	/**
	 * The feature id for the '<em><b>Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_PROCESS_INSTANCE__RUNNING = 5;

	/**
	 * The number of structural features of the '<em>Business Process Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_PROCESS_INSTANCE_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link rea.impl.EventInstanceImpl <em>Event Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rea.impl.EventInstanceImpl
	 * @see rea.impl.reaPackageImpl#getEventInstance()
	 * @generated
	 */
	int EVENT_INSTANCE = 13;

	/**
	 * The feature id for the '<em><b>Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_INSTANCE__EVENT = 0;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_INSTANCE__ID = 1;

	/**
	 * The feature id for the '<em><b>Resource Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_INSTANCE__RESOURCE_INSTANCE = 2;

	/**
	 * The number of structural features of the '<em>Event Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_INSTANCE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link rea.impl.ResourceInstanceImpl <em>Resource Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rea.impl.ResourceInstanceImpl
	 * @see rea.impl.reaPackageImpl#getResourceInstance()
	 * @generated
	 */
	int RESOURCE_INSTANCE = 14;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INSTANCE__ID = 0;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INSTANCE__RESOURCE = 1;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INSTANCE__PROPERTIES = 2;

	/**
	 * The feature id for the '<em><b>Rights</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INSTANCE__RIGHTS = 3;

	/**
	 * The feature id for the '<em><b>Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INSTANCE__EVENTS = 4;

	/**
	 * The number of structural features of the '<em>Resource Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INSTANCE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link rea.impl.PropertyInstanceImpl <em>Property Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rea.impl.PropertyInstanceImpl
	 * @see rea.impl.reaPackageImpl#getPropertyInstance()
	 * @generated
	 */
	int PROPERTY_INSTANCE = 15;

	/**
	 * The feature id for the '<em><b>Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_INSTANCE__PROPERTY = 0;

	/**
	 * The feature id for the '<em><b>Current State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_INSTANCE__CURRENT_STATE = 1;

	/**
	 * The feature id for the '<em><b>Initial State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_INSTANCE__INITIAL_STATE = 2;

	/**
	 * The number of structural features of the '<em>Property Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_INSTANCE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link rea.impl.RightInstanceImpl <em>Right Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rea.impl.RightInstanceImpl
	 * @see rea.impl.reaPackageImpl#getRightInstance()
	 * @generated
	 */
	int RIGHT_INSTANCE = 16;

	/**
	 * The feature id for the '<em><b>Right</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_INSTANCE__RIGHT = 0;

	/**
	 * The feature id for the '<em><b>Current Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_INSTANCE__CURRENT_OWNER = 1;

	/**
	 * The feature id for the '<em><b>First Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_INSTANCE__FIRST_OWNER = 2;

	/**
	 * The number of structural features of the '<em>Right Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_INSTANCE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link rea.impl.REAConceptVisitorImpl <em>REA Concept Visitor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rea.impl.REAConceptVisitorImpl
	 * @see rea.impl.reaPackageImpl#getREAConceptVisitor()
	 * @generated
	 */
	int REA_CONCEPT_VISITOR = 17;

	/**
	 * The number of structural features of the '<em>REA Concept Visitor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REA_CONCEPT_VISITOR_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link rea.impl.ClaimImpl <em>Claim</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rea.impl.ClaimImpl
	 * @see rea.impl.reaPackageImpl#getClaim()
	 * @generated
	 */
	int CLAIM = 19;

	/**
	 * The feature id for the '<em><b>Rights</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIM__RIGHTS = VALUABLE__RIGHTS;

	/**
	 * The feature id for the '<em><b>Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIM__EVENTS = VALUABLE__EVENTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIM__NAME = VALUABLE__NAME;

	/**
	 * The feature id for the '<em><b>Compensation Related</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIM__COMPENSATION_RELATED = VALUABLE__COMPENSATION_RELATED;

	/**
	 * The feature id for the '<em><b>Claim For Property</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIM__CLAIM_FOR_PROPERTY = VALUABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Claim For Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIM__CLAIM_FOR_RESOURCE = VALUABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Claim</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIM_FEATURE_COUNT = VALUABLE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link rea.impl.AgentAliasImpl <em>Agent Alias</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rea.impl.AgentAliasImpl
	 * @see rea.impl.reaPackageImpl#getAgentAlias()
	 * @generated
	 */
	int AGENT_ALIAS = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_ALIAS__NAME = AGENT__NAME;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_ALIAS__ALIAS_NAME = AGENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Accountable Agent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_ALIAS__ACCOUNTABLE_AGENT = AGENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Agent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_ALIAS__AGENT = AGENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Agent Alias</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_ALIAS_FEATURE_COUNT = AGENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link rea.ResourceAlterationType <em>Resource Alteration Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rea.ResourceAlterationType
	 * @see rea.impl.reaPackageImpl#getResourceAlterationType()
	 * @generated
	 */
	int RESOURCE_ALTERATION_TYPE = 22;

	/**
	 * The meta object id for the '{@link rea.ResourceTreatmentType <em>Resource Treatment Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rea.ResourceTreatmentType
	 * @see rea.impl.reaPackageImpl#getResourceTreatmentType()
	 * @generated
	 */
	int RESOURCE_TREATMENT_TYPE = 23;

	/**
	 * The meta object id for the '{@link rea.PropertyRecoverability <em>Property Recoverability</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rea.PropertyRecoverability
	 * @see rea.impl.reaPackageImpl#getPropertyRecoverability()
	 * @generated
	 */
	int PROPERTY_RECOVERABILITY = 24;


	/**
	 * Returns the meta object for class '{@link rea.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event</em>'.
	 * @see rea.Event
	 * @generated
	 */
	EClass getEvent();

	/**
	 * Returns the meta object for the reference '{@link rea.Event#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Resource</em>'.
	 * @see rea.Event#getResource()
	 * @see #getEvent()
	 * @generated
	 */
	EReference getEvent_Resource();

	/**
	 * Returns the meta object for the reference '{@link rea.Event#getProvider <em>Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Provider</em>'.
	 * @see rea.Event#getProvider()
	 * @see #getEvent()
	 * @generated
	 */
	EReference getEvent_Provider();

	/**
	 * Returns the meta object for the reference '{@link rea.Event#getReceiver <em>Receiver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Receiver</em>'.
	 * @see rea.Event#getReceiver()
	 * @see #getEvent()
	 * @generated
	 */
	EReference getEvent_Receiver();

	/**
	 * Returns the meta object for the reference '{@link rea.Event#getREAProcess <em>REA Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>REA Process</em>'.
	 * @see rea.Event#getREAProcess()
	 * @see #getEvent()
	 * @generated
	 */
	EReference getEvent_REAProcess();

	/**
	 * Returns the meta object for the containment reference list '{@link rea.Event#getRightTransfers <em>Right Transfers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Right Transfers</em>'.
	 * @see rea.Event#getRightTransfers()
	 * @see #getEvent()
	 * @generated
	 */
	EReference getEvent_RightTransfers();

	/**
	 * Returns the meta object for the containment reference list '{@link rea.Event#getAlterations <em>Alterations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Alterations</em>'.
	 * @see rea.Event#getAlterations()
	 * @see #getEvent()
	 * @generated
	 */
	EReference getEvent_Alterations();

	/**
	 * Returns the meta object for the attribute '{@link rea.Event#getAlterationType <em>Alteration Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alteration Type</em>'.
	 * @see rea.Event#getAlterationType()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_AlterationType();

	/**
	 * Returns the meta object for the attribute '{@link rea.Event#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see rea.Event#getName()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_Name();

	/**
	 * Returns the meta object for class '{@link rea.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource</em>'.
	 * @see rea.Resource
	 * @generated
	 */
	EClass getResource();

	/**
	 * Returns the meta object for the containment reference list '{@link rea.Resource#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see rea.Resource#getProperties()
	 * @see #getResource()
	 * @generated
	 */
	EReference getResource_Properties();

	/**
	 * Returns the meta object for the reference list '{@link rea.Resource#getClaims <em>Claims</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Claims</em>'.
	 * @see rea.Resource#getClaims()
	 * @see #getResource()
	 * @generated
	 */
	EReference getResource_Claims();

	/**
	 * Returns the meta object for class '{@link rea.Agent <em>Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Agent</em>'.
	 * @see rea.Agent
	 * @generated
	 */
	EClass getAgent();

	/**
	 * Returns the meta object for the attribute '{@link rea.Agent#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see rea.Agent#getName()
	 * @see #getAgent()
	 * @generated
	 */
	EAttribute getAgent_Name();

	/**
	 * Returns the meta object for class '{@link rea.REAProcess <em>REA Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>REA Process</em>'.
	 * @see rea.REAProcess
	 * @generated
	 */
	EClass getREAProcess();

	/**
	 * Returns the meta object for the containment reference list '{@link rea.REAProcess#getIncrementEvt <em>Increment Evt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Increment Evt</em>'.
	 * @see rea.REAProcess#getIncrementEvt()
	 * @see #getREAProcess()
	 * @generated
	 */
	EReference getREAProcess_IncrementEvt();

	/**
	 * Returns the meta object for the containment reference list '{@link rea.REAProcess#getDecrementEvt <em>Decrement Evt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Decrement Evt</em>'.
	 * @see rea.REAProcess#getDecrementEvt()
	 * @see #getREAProcess()
	 * @generated
	 */
	EReference getREAProcess_DecrementEvt();

	/**
	 * Returns the meta object for the reference list '{@link rea.REAProcess#getInflowRes <em>Inflow Res</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Inflow Res</em>'.
	 * @see rea.REAProcess#getInflowRes()
	 * @see #getREAProcess()
	 * @generated
	 */
	EReference getREAProcess_InflowRes();

	/**
	 * Returns the meta object for the reference list '{@link rea.REAProcess#getOutflowRes <em>Outflow Res</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outflow Res</em>'.
	 * @see rea.REAProcess#getOutflowRes()
	 * @see #getREAProcess()
	 * @generated
	 */
	EReference getREAProcess_OutflowRes();

	/**
	 * Returns the meta object for the reference list '{@link rea.REAProcess#getPredecessors <em>Predecessors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Predecessors</em>'.
	 * @see rea.REAProcess#getPredecessors()
	 * @see #getREAProcess()
	 * @generated
	 */
	EReference getREAProcess_Predecessors();

	/**
	 * Returns the meta object for the attribute '{@link rea.REAProcess#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see rea.REAProcess#getID()
	 * @see #getREAProcess()
	 * @generated
	 */
	EAttribute getREAProcess_ID();

	/**
	 * Returns the meta object for the reference list '{@link rea.REAProcess#getSuccessors <em>Successors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Successors</em>'.
	 * @see rea.REAProcess#getSuccessors()
	 * @see #getREAProcess()
	 * @generated
	 */
	EReference getREAProcess_Successors();

	/**
	 * Returns the meta object for the reference '{@link rea.REAProcess#getCompensatedBy <em>Compensated By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Compensated By</em>'.
	 * @see rea.REAProcess#getCompensatedBy()
	 * @see #getREAProcess()
	 * @generated
	 */
	EReference getREAProcess_CompensatedBy();

	/**
	 * Returns the meta object for the reference '{@link rea.REAProcess#getCompensationFor <em>Compensation For</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Compensation For</em>'.
	 * @see rea.REAProcess#getCompensationFor()
	 * @see #getREAProcess()
	 * @generated
	 */
	EReference getREAProcess_CompensationFor();

	/**
	 * Returns the meta object for class '{@link rea.Exchange <em>Exchange</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exchange</em>'.
	 * @see rea.Exchange
	 * @generated
	 */
	EClass getExchange();

	/**
	 * Returns the meta object for class '{@link rea.Conversion <em>Conversion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conversion</em>'.
	 * @see rea.Conversion
	 * @generated
	 */
	EClass getConversion();

	/**
	 * Returns the meta object for class '{@link rea.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property</em>'.
	 * @see rea.Property
	 * @generated
	 */
	EClass getProperty();

	/**
	 * Returns the meta object for the attribute '{@link rea.Property#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see rea.Property#getName()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Name();

	/**
	 * Returns the meta object for the attribute '{@link rea.Property#getInitialState <em>Initial State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initial State</em>'.
	 * @see rea.Property#getInitialState()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_InitialState();

	/**
	 * Returns the meta object for the reference list '{@link rea.Property#getAlterations <em>Alterations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Alterations</em>'.
	 * @see rea.Property#getAlterations()
	 * @see #getProperty()
	 * @generated
	 */
	EReference getProperty_Alterations();

	/**
	 * Returns the meta object for the reference '{@link rea.Property#getDependsOn <em>Depends On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Depends On</em>'.
	 * @see rea.Property#getDependsOn()
	 * @see #getProperty()
	 * @generated
	 */
	EReference getProperty_DependsOn();

	/**
	 * Returns the meta object for the reference list '{@link rea.Property#getDependees <em>Dependees</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Dependees</em>'.
	 * @see rea.Property#getDependees()
	 * @see #getProperty()
	 * @generated
	 */
	EReference getProperty_Dependees();

	/**
	 * Returns the meta object for the attribute '{@link rea.Property#getRecoverable <em>Recoverable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Recoverable</em>'.
	 * @see rea.Property#getRecoverable()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Recoverable();

	/**
	 * Returns the meta object for the attribute '{@link rea.Property#isPrimaryProperty <em>Primary Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Primary Property</em>'.
	 * @see rea.Property#isPrimaryProperty()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_PrimaryProperty();

	/**
	 * Returns the meta object for the container reference '{@link rea.Property#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Resource</em>'.
	 * @see rea.Property#getResource()
	 * @see #getProperty()
	 * @generated
	 */
	EReference getProperty_Resource();

	/**
	 * Returns the meta object for class '{@link rea.BusinessProcessDefinition <em>Business Process Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Business Process Definition</em>'.
	 * @see rea.BusinessProcessDefinition
	 * @generated
	 */
	EClass getBusinessProcessDefinition();

	/**
	 * Returns the meta object for the containment reference list '{@link rea.BusinessProcessDefinition#getREAProcesses <em>REA Processes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>REA Processes</em>'.
	 * @see rea.BusinessProcessDefinition#getREAProcesses()
	 * @see #getBusinessProcessDefinition()
	 * @generated
	 */
	EReference getBusinessProcessDefinition_REAProcesses();

	/**
	 * Returns the meta object for the attribute '{@link rea.BusinessProcessDefinition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see rea.BusinessProcessDefinition#getName()
	 * @see #getBusinessProcessDefinition()
	 * @generated
	 */
	EAttribute getBusinessProcessDefinition_Name();

	/**
	 * Returns the meta object for class '{@link rea.Right <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Right</em>'.
	 * @see rea.Right
	 * @generated
	 */
	EClass getRight();

	/**
	 * Returns the meta object for the attribute '{@link rea.Right#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see rea.Right#getName()
	 * @see #getRight()
	 * @generated
	 */
	EAttribute getRight_Name();

	/**
	 * Returns the meta object for the reference '{@link rea.Right#getFirstOwner <em>First Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>First Owner</em>'.
	 * @see rea.Right#getFirstOwner()
	 * @see #getRight()
	 * @generated
	 */
	EReference getRight_FirstOwner();

	/**
	 * Returns the meta object for the reference '{@link rea.Right#getCurrentOwner <em>Current Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Current Owner</em>'.
	 * @see rea.Right#getCurrentOwner()
	 * @see #getRight()
	 * @generated
	 */
	EReference getRight_CurrentOwner();

	/**
	 * Returns the meta object for the reference list '{@link rea.Right#getTransfers <em>Transfers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Transfers</em>'.
	 * @see rea.Right#getTransfers()
	 * @see #getRight()
	 * @generated
	 */
	EReference getRight_Transfers();

	/**
	 * Returns the meta object for class '{@link rea.RightTransfer <em>Right Transfer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Right Transfer</em>'.
	 * @see rea.RightTransfer
	 * @generated
	 */
	EClass getRightTransfer();

	/**
	 * Returns the meta object for the reference '{@link rea.RightTransfer#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Right</em>'.
	 * @see rea.RightTransfer#getRight()
	 * @see #getRightTransfer()
	 * @generated
	 */
	EReference getRightTransfer_Right();

	/**
	 * Returns the meta object for the reference '{@link rea.RightTransfer#getNewOwner <em>New Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>New Owner</em>'.
	 * @see rea.RightTransfer#getNewOwner()
	 * @see #getRightTransfer()
	 * @generated
	 */
	EReference getRightTransfer_NewOwner();

	/**
	 * Returns the meta object for the reference '{@link rea.RightTransfer#getInitialOwner <em>Initial Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Initial Owner</em>'.
	 * @see rea.RightTransfer#getInitialOwner()
	 * @see #getRightTransfer()
	 * @generated
	 */
	EReference getRightTransfer_InitialOwner();

	/**
	 * Returns the meta object for class '{@link rea.PropertyAlteration <em>Property Alteration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Alteration</em>'.
	 * @see rea.PropertyAlteration
	 * @generated
	 */
	EClass getPropertyAlteration();

	/**
	 * Returns the meta object for the attribute '{@link rea.PropertyAlteration#getNewState <em>New State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New State</em>'.
	 * @see rea.PropertyAlteration#getNewState()
	 * @see #getPropertyAlteration()
	 * @generated
	 */
	EAttribute getPropertyAlteration_NewState();

	/**
	 * Returns the meta object for the reference '{@link rea.PropertyAlteration#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Property</em>'.
	 * @see rea.PropertyAlteration#getProperty()
	 * @see #getPropertyAlteration()
	 * @generated
	 */
	EReference getPropertyAlteration_Property();

	/**
	 * Returns the meta object for the attribute '{@link rea.PropertyAlteration#getInitialState <em>Initial State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initial State</em>'.
	 * @see rea.PropertyAlteration#getInitialState()
	 * @see #getPropertyAlteration()
	 * @generated
	 */
	EAttribute getPropertyAlteration_InitialState();

	/**
	 * Returns the meta object for class '{@link rea.ValueModel <em>Value Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Model</em>'.
	 * @see rea.ValueModel
	 * @generated
	 */
	EClass getValueModel();

	/**
	 * Returns the meta object for the containment reference list '{@link rea.ValueModel#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resources</em>'.
	 * @see rea.ValueModel#getResources()
	 * @see #getValueModel()
	 * @generated
	 */
	EReference getValueModel_Resources();

	/**
	 * Returns the meta object for the containment reference list '{@link rea.ValueModel#getAgents <em>Agents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Agents</em>'.
	 * @see rea.ValueModel#getAgents()
	 * @see #getValueModel()
	 * @generated
	 */
	EReference getValueModel_Agents();

	/**
	 * Returns the meta object for the containment reference '{@link rea.ValueModel#getProcessDefinition <em>Process Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Process Definition</em>'.
	 * @see rea.ValueModel#getProcessDefinition()
	 * @see #getValueModel()
	 * @generated
	 */
	EReference getValueModel_ProcessDefinition();

	/**
	 * Returns the meta object for the containment reference list '{@link rea.ValueModel#getInstances <em>Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Instances</em>'.
	 * @see rea.ValueModel#getInstances()
	 * @see #getValueModel()
	 * @generated
	 */
	EReference getValueModel_Instances();

	/**
	 * Returns the meta object for the containment reference '{@link rea.ValueModel#getCompensationProcess <em>Compensation Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Compensation Process</em>'.
	 * @see rea.ValueModel#getCompensationProcess()
	 * @see #getValueModel()
	 * @generated
	 */
	EReference getValueModel_CompensationProcess();

	/**
	 * Returns the meta object for class '{@link rea.BusinessProcessInstance <em>Business Process Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Business Process Instance</em>'.
	 * @see rea.BusinessProcessInstance
	 * @generated
	 */
	EClass getBusinessProcessInstance();

	/**
	 * Returns the meta object for the containment reference list '{@link rea.BusinessProcessInstance#getEvents <em>Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Events</em>'.
	 * @see rea.BusinessProcessInstance#getEvents()
	 * @see #getBusinessProcessInstance()
	 * @generated
	 */
	EReference getBusinessProcessInstance_Events();

	/**
	 * Returns the meta object for the containment reference list '{@link rea.BusinessProcessInstance#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resources</em>'.
	 * @see rea.BusinessProcessInstance#getResources()
	 * @see #getBusinessProcessInstance()
	 * @generated
	 */
	EReference getBusinessProcessInstance_Resources();

	/**
	 * Returns the meta object for the attribute '{@link rea.BusinessProcessInstance#getStartedOn <em>Started On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Started On</em>'.
	 * @see rea.BusinessProcessInstance#getStartedOn()
	 * @see #getBusinessProcessInstance()
	 * @generated
	 */
	EAttribute getBusinessProcessInstance_StartedOn();

	/**
	 * Returns the meta object for the attribute '{@link rea.BusinessProcessInstance#getEndedOn <em>Ended On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ended On</em>'.
	 * @see rea.BusinessProcessInstance#getEndedOn()
	 * @see #getBusinessProcessInstance()
	 * @generated
	 */
	EAttribute getBusinessProcessInstance_EndedOn();

	/**
	 * Returns the meta object for the attribute '{@link rea.BusinessProcessInstance#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see rea.BusinessProcessInstance#getID()
	 * @see #getBusinessProcessInstance()
	 * @generated
	 */
	EAttribute getBusinessProcessInstance_ID();

	/**
	 * Returns the meta object for the attribute '{@link rea.BusinessProcessInstance#isRunning <em>Running</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Running</em>'.
	 * @see rea.BusinessProcessInstance#isRunning()
	 * @see #getBusinessProcessInstance()
	 * @generated
	 */
	EAttribute getBusinessProcessInstance_Running();

	/**
	 * Returns the meta object for class '{@link rea.EventInstance <em>Event Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Instance</em>'.
	 * @see rea.EventInstance
	 * @generated
	 */
	EClass getEventInstance();

	/**
	 * Returns the meta object for the reference '{@link rea.EventInstance#getEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Event</em>'.
	 * @see rea.EventInstance#getEvent()
	 * @see #getEventInstance()
	 * @generated
	 */
	EReference getEventInstance_Event();

	/**
	 * Returns the meta object for the attribute '{@link rea.EventInstance#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see rea.EventInstance#getID()
	 * @see #getEventInstance()
	 * @generated
	 */
	EAttribute getEventInstance_ID();

	/**
	 * Returns the meta object for the reference '{@link rea.EventInstance#getResourceInstance <em>Resource Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Resource Instance</em>'.
	 * @see rea.EventInstance#getResourceInstance()
	 * @see #getEventInstance()
	 * @generated
	 */
	EReference getEventInstance_ResourceInstance();

	/**
	 * Returns the meta object for class '{@link rea.ResourceInstance <em>Resource Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Instance</em>'.
	 * @see rea.ResourceInstance
	 * @generated
	 */
	EClass getResourceInstance();

	/**
	 * Returns the meta object for the attribute '{@link rea.ResourceInstance#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see rea.ResourceInstance#getID()
	 * @see #getResourceInstance()
	 * @generated
	 */
	EAttribute getResourceInstance_ID();

	/**
	 * Returns the meta object for the reference '{@link rea.ResourceInstance#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Resource</em>'.
	 * @see rea.ResourceInstance#getResource()
	 * @see #getResourceInstance()
	 * @generated
	 */
	EReference getResourceInstance_Resource();

	/**
	 * Returns the meta object for the containment reference list '{@link rea.ResourceInstance#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see rea.ResourceInstance#getProperties()
	 * @see #getResourceInstance()
	 * @generated
	 */
	EReference getResourceInstance_Properties();

	/**
	 * Returns the meta object for the containment reference list '{@link rea.ResourceInstance#getRights <em>Rights</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rights</em>'.
	 * @see rea.ResourceInstance#getRights()
	 * @see #getResourceInstance()
	 * @generated
	 */
	EReference getResourceInstance_Rights();

	/**
	 * Returns the meta object for the reference list '{@link rea.ResourceInstance#getEvents <em>Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Events</em>'.
	 * @see rea.ResourceInstance#getEvents()
	 * @see #getResourceInstance()
	 * @generated
	 */
	EReference getResourceInstance_Events();

	/**
	 * Returns the meta object for class '{@link rea.PropertyInstance <em>Property Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Instance</em>'.
	 * @see rea.PropertyInstance
	 * @generated
	 */
	EClass getPropertyInstance();

	/**
	 * Returns the meta object for the reference '{@link rea.PropertyInstance#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Property</em>'.
	 * @see rea.PropertyInstance#getProperty()
	 * @see #getPropertyInstance()
	 * @generated
	 */
	EReference getPropertyInstance_Property();

	/**
	 * Returns the meta object for the attribute '{@link rea.PropertyInstance#getCurrentState <em>Current State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Current State</em>'.
	 * @see rea.PropertyInstance#getCurrentState()
	 * @see #getPropertyInstance()
	 * @generated
	 */
	EAttribute getPropertyInstance_CurrentState();

	/**
	 * Returns the meta object for the attribute '{@link rea.PropertyInstance#getInitialState <em>Initial State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initial State</em>'.
	 * @see rea.PropertyInstance#getInitialState()
	 * @see #getPropertyInstance()
	 * @generated
	 */
	EAttribute getPropertyInstance_InitialState();

	/**
	 * Returns the meta object for class '{@link rea.RightInstance <em>Right Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Right Instance</em>'.
	 * @see rea.RightInstance
	 * @generated
	 */
	EClass getRightInstance();

	/**
	 * Returns the meta object for the reference '{@link rea.RightInstance#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Right</em>'.
	 * @see rea.RightInstance#getRight()
	 * @see #getRightInstance()
	 * @generated
	 */
	EReference getRightInstance_Right();

	/**
	 * Returns the meta object for the reference '{@link rea.RightInstance#getCurrentOwner <em>Current Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Current Owner</em>'.
	 * @see rea.RightInstance#getCurrentOwner()
	 * @see #getRightInstance()
	 * @generated
	 */
	EReference getRightInstance_CurrentOwner();

	/**
	 * Returns the meta object for the reference '{@link rea.RightInstance#getFirstOwner <em>First Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>First Owner</em>'.
	 * @see rea.RightInstance#getFirstOwner()
	 * @see #getRightInstance()
	 * @generated
	 */
	EReference getRightInstance_FirstOwner();

	/**
	 * Returns the meta object for class '{@link rea.REAConceptVisitor <em>REA Concept Visitor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>REA Concept Visitor</em>'.
	 * @see rea.REAConceptVisitor
	 * @generated
	 */
	EClass getREAConceptVisitor();

	/**
	 * Returns the meta object for class '{@link rea.REAConcept <em>REA Concept</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>REA Concept</em>'.
	 * @see rea.REAConcept
	 * @generated
	 */
	EClass getREAConcept();

	/**
	 * Returns the meta object for class '{@link rea.Claim <em>Claim</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Claim</em>'.
	 * @see rea.Claim
	 * @generated
	 */
	EClass getClaim();

	/**
	 * Returns the meta object for the reference list '{@link rea.Claim#getClaimForProperty <em>Claim For Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Claim For Property</em>'.
	 * @see rea.Claim#getClaimForProperty()
	 * @see #getClaim()
	 * @generated
	 */
	EReference getClaim_ClaimForProperty();

	/**
	 * Returns the meta object for the reference '{@link rea.Claim#getClaimForResource <em>Claim For Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Claim For Resource</em>'.
	 * @see rea.Claim#getClaimForResource()
	 * @see #getClaim()
	 * @generated
	 */
	EReference getClaim_ClaimForResource();

	/**
	 * Returns the meta object for class '{@link rea.Valuable <em>Valuable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Valuable</em>'.
	 * @see rea.Valuable
	 * @generated
	 */
	EClass getValuable();

	/**
	 * Returns the meta object for the containment reference list '{@link rea.Valuable#getRights <em>Rights</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rights</em>'.
	 * @see rea.Valuable#getRights()
	 * @see #getValuable()
	 * @generated
	 */
	EReference getValuable_Rights();

	/**
	 * Returns the meta object for the reference list '{@link rea.Valuable#getEvents <em>Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Events</em>'.
	 * @see rea.Valuable#getEvents()
	 * @see #getValuable()
	 * @generated
	 */
	EReference getValuable_Events();

	/**
	 * Returns the meta object for the attribute '{@link rea.Valuable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see rea.Valuable#getName()
	 * @see #getValuable()
	 * @generated
	 */
	EAttribute getValuable_Name();

	/**
	 * Returns the meta object for the attribute '{@link rea.Valuable#isCompensationRelated <em>Compensation Related</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Compensation Related</em>'.
	 * @see rea.Valuable#isCompensationRelated()
	 * @see #getValuable()
	 * @generated
	 */
	EAttribute getValuable_CompensationRelated();

	/**
	 * Returns the meta object for class '{@link rea.AgentAlias <em>Agent Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Agent Alias</em>'.
	 * @see rea.AgentAlias
	 * @generated
	 */
	EClass getAgentAlias();

	/**
	 * Returns the meta object for the attribute '{@link rea.AgentAlias#getAliasName <em>Alias Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alias Name</em>'.
	 * @see rea.AgentAlias#getAliasName()
	 * @see #getAgentAlias()
	 * @generated
	 */
	EAttribute getAgentAlias_AliasName();

	/**
	 * Returns the meta object for the attribute '{@link rea.AgentAlias#isAccountableAgent <em>Accountable Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Accountable Agent</em>'.
	 * @see rea.AgentAlias#isAccountableAgent()
	 * @see #getAgentAlias()
	 * @generated
	 */
	EAttribute getAgentAlias_AccountableAgent();

	/**
	 * Returns the meta object for the reference '{@link rea.AgentAlias#getAgent <em>Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Agent</em>'.
	 * @see rea.AgentAlias#getAgent()
	 * @see #getAgentAlias()
	 * @generated
	 */
	EReference getAgentAlias_Agent();

	/**
	 * Returns the meta object for enum '{@link rea.ResourceAlterationType <em>Resource Alteration Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Resource Alteration Type</em>'.
	 * @see rea.ResourceAlterationType
	 * @generated
	 */
	EEnum getResourceAlterationType();

	/**
	 * Returns the meta object for enum '{@link rea.ResourceTreatmentType <em>Resource Treatment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Resource Treatment Type</em>'.
	 * @see rea.ResourceTreatmentType
	 * @generated
	 */
	EEnum getResourceTreatmentType();

	/**
	 * Returns the meta object for enum '{@link rea.PropertyRecoverability <em>Property Recoverability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Property Recoverability</em>'.
	 * @see rea.PropertyRecoverability
	 * @generated
	 */
	EEnum getPropertyRecoverability();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	reaFactory getreaFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link rea.impl.EventImpl <em>Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rea.impl.EventImpl
		 * @see rea.impl.reaPackageImpl#getEvent()
		 * @generated
		 */
		EClass EVENT = eINSTANCE.getEvent();

		/**
		 * The meta object literal for the '<em><b>Resource</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT__RESOURCE = eINSTANCE.getEvent_Resource();

		/**
		 * The meta object literal for the '<em><b>Provider</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT__PROVIDER = eINSTANCE.getEvent_Provider();

		/**
		 * The meta object literal for the '<em><b>Receiver</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT__RECEIVER = eINSTANCE.getEvent_Receiver();

		/**
		 * The meta object literal for the '<em><b>REA Process</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT__REA_PROCESS = eINSTANCE.getEvent_REAProcess();

		/**
		 * The meta object literal for the '<em><b>Right Transfers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT__RIGHT_TRANSFERS = eINSTANCE.getEvent_RightTransfers();

		/**
		 * The meta object literal for the '<em><b>Alterations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT__ALTERATIONS = eINSTANCE.getEvent_Alterations();

		/**
		 * The meta object literal for the '<em><b>Alteration Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT__ALTERATION_TYPE = eINSTANCE.getEvent_AlterationType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT__NAME = eINSTANCE.getEvent_Name();

		/**
		 * The meta object literal for the '{@link rea.impl.ResourceImpl <em>Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rea.impl.ResourceImpl
		 * @see rea.impl.reaPackageImpl#getResource()
		 * @generated
		 */
		EClass RESOURCE = eINSTANCE.getResource();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE__PROPERTIES = eINSTANCE.getResource_Properties();

		/**
		 * The meta object literal for the '<em><b>Claims</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE__CLAIMS = eINSTANCE.getResource_Claims();

		/**
		 * The meta object literal for the '{@link rea.impl.AgentImpl <em>Agent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rea.impl.AgentImpl
		 * @see rea.impl.reaPackageImpl#getAgent()
		 * @generated
		 */
		EClass AGENT = eINSTANCE.getAgent();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGENT__NAME = eINSTANCE.getAgent_Name();

		/**
		 * The meta object literal for the '{@link rea.impl.REAProcessImpl <em>REA Process</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rea.impl.REAProcessImpl
		 * @see rea.impl.reaPackageImpl#getREAProcess()
		 * @generated
		 */
		EClass REA_PROCESS = eINSTANCE.getREAProcess();

		/**
		 * The meta object literal for the '<em><b>Increment Evt</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REA_PROCESS__INCREMENT_EVT = eINSTANCE.getREAProcess_IncrementEvt();

		/**
		 * The meta object literal for the '<em><b>Decrement Evt</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REA_PROCESS__DECREMENT_EVT = eINSTANCE.getREAProcess_DecrementEvt();

		/**
		 * The meta object literal for the '<em><b>Inflow Res</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REA_PROCESS__INFLOW_RES = eINSTANCE.getREAProcess_InflowRes();

		/**
		 * The meta object literal for the '<em><b>Outflow Res</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REA_PROCESS__OUTFLOW_RES = eINSTANCE.getREAProcess_OutflowRes();

		/**
		 * The meta object literal for the '<em><b>Predecessors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REA_PROCESS__PREDECESSORS = eINSTANCE.getREAProcess_Predecessors();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REA_PROCESS__ID = eINSTANCE.getREAProcess_ID();

		/**
		 * The meta object literal for the '<em><b>Successors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REA_PROCESS__SUCCESSORS = eINSTANCE.getREAProcess_Successors();

		/**
		 * The meta object literal for the '<em><b>Compensated By</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REA_PROCESS__COMPENSATED_BY = eINSTANCE.getREAProcess_CompensatedBy();

		/**
		 * The meta object literal for the '<em><b>Compensation For</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REA_PROCESS__COMPENSATION_FOR = eINSTANCE.getREAProcess_CompensationFor();

		/**
		 * The meta object literal for the '{@link rea.impl.ExchangeImpl <em>Exchange</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rea.impl.ExchangeImpl
		 * @see rea.impl.reaPackageImpl#getExchange()
		 * @generated
		 */
		EClass EXCHANGE = eINSTANCE.getExchange();

		/**
		 * The meta object literal for the '{@link rea.impl.ConversionImpl <em>Conversion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rea.impl.ConversionImpl
		 * @see rea.impl.reaPackageImpl#getConversion()
		 * @generated
		 */
		EClass CONVERSION = eINSTANCE.getConversion();

		/**
		 * The meta object literal for the '{@link rea.impl.PropertyImpl <em>Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rea.impl.PropertyImpl
		 * @see rea.impl.reaPackageImpl#getProperty()
		 * @generated
		 */
		EClass PROPERTY = eINSTANCE.getProperty();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__NAME = eINSTANCE.getProperty_Name();

		/**
		 * The meta object literal for the '<em><b>Initial State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__INITIAL_STATE = eINSTANCE.getProperty_InitialState();

		/**
		 * The meta object literal for the '<em><b>Alterations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY__ALTERATIONS = eINSTANCE.getProperty_Alterations();

		/**
		 * The meta object literal for the '<em><b>Depends On</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY__DEPENDS_ON = eINSTANCE.getProperty_DependsOn();

		/**
		 * The meta object literal for the '<em><b>Dependees</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY__DEPENDEES = eINSTANCE.getProperty_Dependees();

		/**
		 * The meta object literal for the '<em><b>Recoverable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__RECOVERABLE = eINSTANCE.getProperty_Recoverable();

		/**
		 * The meta object literal for the '<em><b>Primary Property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__PRIMARY_PROPERTY = eINSTANCE.getProperty_PrimaryProperty();

		/**
		 * The meta object literal for the '<em><b>Resource</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY__RESOURCE = eINSTANCE.getProperty_Resource();

		/**
		 * The meta object literal for the '{@link rea.impl.BusinessProcessDefinitionImpl <em>Business Process Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rea.impl.BusinessProcessDefinitionImpl
		 * @see rea.impl.reaPackageImpl#getBusinessProcessDefinition()
		 * @generated
		 */
		EClass BUSINESS_PROCESS_DEFINITION = eINSTANCE.getBusinessProcessDefinition();

		/**
		 * The meta object literal for the '<em><b>REA Processes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS_PROCESS_DEFINITION__REA_PROCESSES = eINSTANCE.getBusinessProcessDefinition_REAProcesses();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUSINESS_PROCESS_DEFINITION__NAME = eINSTANCE.getBusinessProcessDefinition_Name();

		/**
		 * The meta object literal for the '{@link rea.impl.RightImpl <em>Right</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rea.impl.RightImpl
		 * @see rea.impl.reaPackageImpl#getRight()
		 * @generated
		 */
		EClass RIGHT = eINSTANCE.getRight();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RIGHT__NAME = eINSTANCE.getRight_Name();

		/**
		 * The meta object literal for the '<em><b>First Owner</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RIGHT__FIRST_OWNER = eINSTANCE.getRight_FirstOwner();

		/**
		 * The meta object literal for the '<em><b>Current Owner</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RIGHT__CURRENT_OWNER = eINSTANCE.getRight_CurrentOwner();

		/**
		 * The meta object literal for the '<em><b>Transfers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RIGHT__TRANSFERS = eINSTANCE.getRight_Transfers();

		/**
		 * The meta object literal for the '{@link rea.impl.RightTransferImpl <em>Right Transfer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rea.impl.RightTransferImpl
		 * @see rea.impl.reaPackageImpl#getRightTransfer()
		 * @generated
		 */
		EClass RIGHT_TRANSFER = eINSTANCE.getRightTransfer();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RIGHT_TRANSFER__RIGHT = eINSTANCE.getRightTransfer_Right();

		/**
		 * The meta object literal for the '<em><b>New Owner</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RIGHT_TRANSFER__NEW_OWNER = eINSTANCE.getRightTransfer_NewOwner();

		/**
		 * The meta object literal for the '<em><b>Initial Owner</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RIGHT_TRANSFER__INITIAL_OWNER = eINSTANCE.getRightTransfer_InitialOwner();

		/**
		 * The meta object literal for the '{@link rea.impl.PropertyAlterationImpl <em>Property Alteration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rea.impl.PropertyAlterationImpl
		 * @see rea.impl.reaPackageImpl#getPropertyAlteration()
		 * @generated
		 */
		EClass PROPERTY_ALTERATION = eINSTANCE.getPropertyAlteration();

		/**
		 * The meta object literal for the '<em><b>New State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_ALTERATION__NEW_STATE = eINSTANCE.getPropertyAlteration_NewState();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_ALTERATION__PROPERTY = eINSTANCE.getPropertyAlteration_Property();

		/**
		 * The meta object literal for the '<em><b>Initial State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_ALTERATION__INITIAL_STATE = eINSTANCE.getPropertyAlteration_InitialState();

		/**
		 * The meta object literal for the '{@link rea.impl.ValueModelImpl <em>Value Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rea.impl.ValueModelImpl
		 * @see rea.impl.reaPackageImpl#getValueModel()
		 * @generated
		 */
		EClass VALUE_MODEL = eINSTANCE.getValueModel();

		/**
		 * The meta object literal for the '<em><b>Resources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE_MODEL__RESOURCES = eINSTANCE.getValueModel_Resources();

		/**
		 * The meta object literal for the '<em><b>Agents</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE_MODEL__AGENTS = eINSTANCE.getValueModel_Agents();

		/**
		 * The meta object literal for the '<em><b>Process Definition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE_MODEL__PROCESS_DEFINITION = eINSTANCE.getValueModel_ProcessDefinition();

		/**
		 * The meta object literal for the '<em><b>Instances</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE_MODEL__INSTANCES = eINSTANCE.getValueModel_Instances();

		/**
		 * The meta object literal for the '<em><b>Compensation Process</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE_MODEL__COMPENSATION_PROCESS = eINSTANCE.getValueModel_CompensationProcess();

		/**
		 * The meta object literal for the '{@link rea.impl.BusinessProcessInstanceImpl <em>Business Process Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rea.impl.BusinessProcessInstanceImpl
		 * @see rea.impl.reaPackageImpl#getBusinessProcessInstance()
		 * @generated
		 */
		EClass BUSINESS_PROCESS_INSTANCE = eINSTANCE.getBusinessProcessInstance();

		/**
		 * The meta object literal for the '<em><b>Events</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS_PROCESS_INSTANCE__EVENTS = eINSTANCE.getBusinessProcessInstance_Events();

		/**
		 * The meta object literal for the '<em><b>Resources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS_PROCESS_INSTANCE__RESOURCES = eINSTANCE.getBusinessProcessInstance_Resources();

		/**
		 * The meta object literal for the '<em><b>Started On</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUSINESS_PROCESS_INSTANCE__STARTED_ON = eINSTANCE.getBusinessProcessInstance_StartedOn();

		/**
		 * The meta object literal for the '<em><b>Ended On</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUSINESS_PROCESS_INSTANCE__ENDED_ON = eINSTANCE.getBusinessProcessInstance_EndedOn();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUSINESS_PROCESS_INSTANCE__ID = eINSTANCE.getBusinessProcessInstance_ID();

		/**
		 * The meta object literal for the '<em><b>Running</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUSINESS_PROCESS_INSTANCE__RUNNING = eINSTANCE.getBusinessProcessInstance_Running();

		/**
		 * The meta object literal for the '{@link rea.impl.EventInstanceImpl <em>Event Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rea.impl.EventInstanceImpl
		 * @see rea.impl.reaPackageImpl#getEventInstance()
		 * @generated
		 */
		EClass EVENT_INSTANCE = eINSTANCE.getEventInstance();

		/**
		 * The meta object literal for the '<em><b>Event</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_INSTANCE__EVENT = eINSTANCE.getEventInstance_Event();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT_INSTANCE__ID = eINSTANCE.getEventInstance_ID();

		/**
		 * The meta object literal for the '<em><b>Resource Instance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_INSTANCE__RESOURCE_INSTANCE = eINSTANCE.getEventInstance_ResourceInstance();

		/**
		 * The meta object literal for the '{@link rea.impl.ResourceInstanceImpl <em>Resource Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rea.impl.ResourceInstanceImpl
		 * @see rea.impl.reaPackageImpl#getResourceInstance()
		 * @generated
		 */
		EClass RESOURCE_INSTANCE = eINSTANCE.getResourceInstance();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_INSTANCE__ID = eINSTANCE.getResourceInstance_ID();

		/**
		 * The meta object literal for the '<em><b>Resource</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_INSTANCE__RESOURCE = eINSTANCE.getResourceInstance_Resource();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_INSTANCE__PROPERTIES = eINSTANCE.getResourceInstance_Properties();

		/**
		 * The meta object literal for the '<em><b>Rights</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_INSTANCE__RIGHTS = eINSTANCE.getResourceInstance_Rights();

		/**
		 * The meta object literal for the '<em><b>Events</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_INSTANCE__EVENTS = eINSTANCE.getResourceInstance_Events();

		/**
		 * The meta object literal for the '{@link rea.impl.PropertyInstanceImpl <em>Property Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rea.impl.PropertyInstanceImpl
		 * @see rea.impl.reaPackageImpl#getPropertyInstance()
		 * @generated
		 */
		EClass PROPERTY_INSTANCE = eINSTANCE.getPropertyInstance();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_INSTANCE__PROPERTY = eINSTANCE.getPropertyInstance_Property();

		/**
		 * The meta object literal for the '<em><b>Current State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_INSTANCE__CURRENT_STATE = eINSTANCE.getPropertyInstance_CurrentState();

		/**
		 * The meta object literal for the '<em><b>Initial State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_INSTANCE__INITIAL_STATE = eINSTANCE.getPropertyInstance_InitialState();

		/**
		 * The meta object literal for the '{@link rea.impl.RightInstanceImpl <em>Right Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rea.impl.RightInstanceImpl
		 * @see rea.impl.reaPackageImpl#getRightInstance()
		 * @generated
		 */
		EClass RIGHT_INSTANCE = eINSTANCE.getRightInstance();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RIGHT_INSTANCE__RIGHT = eINSTANCE.getRightInstance_Right();

		/**
		 * The meta object literal for the '<em><b>Current Owner</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RIGHT_INSTANCE__CURRENT_OWNER = eINSTANCE.getRightInstance_CurrentOwner();

		/**
		 * The meta object literal for the '<em><b>First Owner</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RIGHT_INSTANCE__FIRST_OWNER = eINSTANCE.getRightInstance_FirstOwner();

		/**
		 * The meta object literal for the '{@link rea.impl.REAConceptVisitorImpl <em>REA Concept Visitor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rea.impl.REAConceptVisitorImpl
		 * @see rea.impl.reaPackageImpl#getREAConceptVisitor()
		 * @generated
		 */
		EClass REA_CONCEPT_VISITOR = eINSTANCE.getREAConceptVisitor();

		/**
		 * The meta object literal for the '{@link rea.impl.REAConceptImpl <em>REA Concept</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rea.impl.REAConceptImpl
		 * @see rea.impl.reaPackageImpl#getREAConcept()
		 * @generated
		 */
		EClass REA_CONCEPT = eINSTANCE.getREAConcept();

		/**
		 * The meta object literal for the '{@link rea.impl.ClaimImpl <em>Claim</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rea.impl.ClaimImpl
		 * @see rea.impl.reaPackageImpl#getClaim()
		 * @generated
		 */
		EClass CLAIM = eINSTANCE.getClaim();

		/**
		 * The meta object literal for the '<em><b>Claim For Property</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLAIM__CLAIM_FOR_PROPERTY = eINSTANCE.getClaim_ClaimForProperty();

		/**
		 * The meta object literal for the '<em><b>Claim For Resource</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLAIM__CLAIM_FOR_RESOURCE = eINSTANCE.getClaim_ClaimForResource();

		/**
		 * The meta object literal for the '{@link rea.impl.ValuableImpl <em>Valuable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rea.impl.ValuableImpl
		 * @see rea.impl.reaPackageImpl#getValuable()
		 * @generated
		 */
		EClass VALUABLE = eINSTANCE.getValuable();

		/**
		 * The meta object literal for the '<em><b>Rights</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUABLE__RIGHTS = eINSTANCE.getValuable_Rights();

		/**
		 * The meta object literal for the '<em><b>Events</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUABLE__EVENTS = eINSTANCE.getValuable_Events();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUABLE__NAME = eINSTANCE.getValuable_Name();

		/**
		 * The meta object literal for the '<em><b>Compensation Related</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUABLE__COMPENSATION_RELATED = eINSTANCE.getValuable_CompensationRelated();

		/**
		 * The meta object literal for the '{@link rea.impl.AgentAliasImpl <em>Agent Alias</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rea.impl.AgentAliasImpl
		 * @see rea.impl.reaPackageImpl#getAgentAlias()
		 * @generated
		 */
		EClass AGENT_ALIAS = eINSTANCE.getAgentAlias();

		/**
		 * The meta object literal for the '<em><b>Alias Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGENT_ALIAS__ALIAS_NAME = eINSTANCE.getAgentAlias_AliasName();

		/**
		 * The meta object literal for the '<em><b>Accountable Agent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGENT_ALIAS__ACCOUNTABLE_AGENT = eINSTANCE.getAgentAlias_AccountableAgent();

		/**
		 * The meta object literal for the '<em><b>Agent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGENT_ALIAS__AGENT = eINSTANCE.getAgentAlias_Agent();

		/**
		 * The meta object literal for the '{@link rea.ResourceAlterationType <em>Resource Alteration Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rea.ResourceAlterationType
		 * @see rea.impl.reaPackageImpl#getResourceAlterationType()
		 * @generated
		 */
		EEnum RESOURCE_ALTERATION_TYPE = eINSTANCE.getResourceAlterationType();

		/**
		 * The meta object literal for the '{@link rea.ResourceTreatmentType <em>Resource Treatment Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rea.ResourceTreatmentType
		 * @see rea.impl.reaPackageImpl#getResourceTreatmentType()
		 * @generated
		 */
		EEnum RESOURCE_TREATMENT_TYPE = eINSTANCE.getResourceTreatmentType();

		/**
		 * The meta object literal for the '{@link rea.PropertyRecoverability <em>Property Recoverability</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rea.PropertyRecoverability
		 * @see rea.impl.reaPackageImpl#getPropertyRecoverability()
		 * @generated
		 */
		EEnum PROPERTY_RECOVERABILITY = eINSTANCE.getPropertyRecoverability();

	}

} //reaPackage
