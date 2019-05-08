/**
 */
package rea.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import rea.Agent;
import rea.AgentAlias;
import rea.BusinessProcessDefinition;
import rea.BusinessProcessInstance;
import rea.Claim;
import rea.Conversion;
import rea.Event;
import rea.EventInstance;
import rea.Exchange;
import rea.Property;
import rea.PropertyAlteration;
import rea.PropertyInstance;
import rea.PropertyRecoverability;
import rea.REAConcept;
import rea.REAConceptVisitor;
import rea.REAProcess;
import rea.Resource;
import rea.ResourceAlterationType;
import rea.ResourceInstance;
import rea.ResourceTreatmentType;
import rea.Right;
import rea.RightInstance;
import rea.RightTransfer;
import rea.Valuable;
import rea.ValueModel;
import rea.reaFactory;
import rea.reaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class reaPackageImpl extends EPackageImpl implements reaPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass agentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reaProcessEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exchangeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conversionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass businessProcessDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rightEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rightTransferEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyAlterationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass businessProcessInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rightInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reaConceptVisitorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reaConceptEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass claimEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valuableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass agentAliasEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum resourceAlterationTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum resourceTreatmentTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum propertyRecoverabilityEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see rea.reaPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private reaPackageImpl() {
		super(eNS_URI, reaFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link reaPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static reaPackage init() {
		if (isInited) return (reaPackage)EPackage.Registry.INSTANCE.getEPackage(reaPackage.eNS_URI);

		// Obtain or create and register package
		reaPackageImpl thereaPackage = (reaPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof reaPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new reaPackageImpl());

		isInited = true;

		// Create package meta-data objects
		thereaPackage.createPackageContents();

		// Initialize created meta-data
		thereaPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thereaPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(reaPackage.eNS_URI, thereaPackage);
		return thereaPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvent() {
		return eventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEvent_Resource() {
		return (EReference)eventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEvent_Provider() {
		return (EReference)eventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEvent_Receiver() {
		return (EReference)eventEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEvent_REAProcess() {
		return (EReference)eventEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEvent_RightTransfers() {
		return (EReference)eventEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEvent_Alterations() {
		return (EReference)eventEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEvent_AlterationType() {
		return (EAttribute)eventEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEvent_Name() {
		return (EAttribute)eventEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResource() {
		return resourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResource_Properties() {
		return (EReference)resourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResource_Claims() {
		return (EReference)resourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAgent() {
		return agentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAgent_Name() {
		return (EAttribute)agentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getREAProcess() {
		return reaProcessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getREAProcess_IncrementEvt() {
		return (EReference)reaProcessEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getREAProcess_DecrementEvt() {
		return (EReference)reaProcessEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getREAProcess_InflowRes() {
		return (EReference)reaProcessEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getREAProcess_OutflowRes() {
		return (EReference)reaProcessEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getREAProcess_Predecessors() {
		return (EReference)reaProcessEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getREAProcess_ID() {
		return (EAttribute)reaProcessEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getREAProcess_Successors() {
		return (EReference)reaProcessEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getREAProcess_CompensatedBy() {
		return (EReference)reaProcessEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getREAProcess_CompensationFor() {
		return (EReference)reaProcessEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExchange() {
		return exchangeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConversion() {
		return conversionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProperty() {
		return propertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_Name() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_InitialState() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProperty_Alterations() {
		return (EReference)propertyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProperty_DependsOn() {
		return (EReference)propertyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProperty_Dependees() {
		return (EReference)propertyEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_Recoverable() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_PrimaryProperty() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProperty_Resource() {
		return (EReference)propertyEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBusinessProcessDefinition() {
		return businessProcessDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusinessProcessDefinition_REAProcesses() {
		return (EReference)businessProcessDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBusinessProcessDefinition_Name() {
		return (EAttribute)businessProcessDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRight() {
		return rightEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRight_Name() {
		return (EAttribute)rightEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRight_FirstOwner() {
		return (EReference)rightEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRight_CurrentOwner() {
		return (EReference)rightEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRight_Transfers() {
		return (EReference)rightEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRightTransfer() {
		return rightTransferEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRightTransfer_Right() {
		return (EReference)rightTransferEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRightTransfer_NewOwner() {
		return (EReference)rightTransferEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRightTransfer_InitialOwner() {
		return (EReference)rightTransferEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropertyAlteration() {
		return propertyAlterationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyAlteration_NewState() {
		return (EAttribute)propertyAlterationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropertyAlteration_Property() {
		return (EReference)propertyAlterationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyAlteration_InitialState() {
		return (EAttribute)propertyAlterationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueModel() {
		return valueModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueModel_Resources() {
		return (EReference)valueModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueModel_Agents() {
		return (EReference)valueModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueModel_ProcessDefinition() {
		return (EReference)valueModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueModel_Instances() {
		return (EReference)valueModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueModel_CompensationProcess() {
		return (EReference)valueModelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBusinessProcessInstance() {
		return businessProcessInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusinessProcessInstance_Events() {
		return (EReference)businessProcessInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusinessProcessInstance_Resources() {
		return (EReference)businessProcessInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBusinessProcessInstance_StartedOn() {
		return (EAttribute)businessProcessInstanceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBusinessProcessInstance_EndedOn() {
		return (EAttribute)businessProcessInstanceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBusinessProcessInstance_ID() {
		return (EAttribute)businessProcessInstanceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBusinessProcessInstance_Running() {
		return (EAttribute)businessProcessInstanceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEventInstance() {
		return eventInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEventInstance_Event() {
		return (EReference)eventInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEventInstance_ID() {
		return (EAttribute)eventInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEventInstance_ResourceInstance() {
		return (EReference)eventInstanceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResourceInstance() {
		return resourceInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceInstance_ID() {
		return (EAttribute)resourceInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceInstance_Resource() {
		return (EReference)resourceInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceInstance_Properties() {
		return (EReference)resourceInstanceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceInstance_Rights() {
		return (EReference)resourceInstanceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceInstance_Events() {
		return (EReference)resourceInstanceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropertyInstance() {
		return propertyInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropertyInstance_Property() {
		return (EReference)propertyInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyInstance_CurrentState() {
		return (EAttribute)propertyInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyInstance_InitialState() {
		return (EAttribute)propertyInstanceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRightInstance() {
		return rightInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRightInstance_Right() {
		return (EReference)rightInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRightInstance_CurrentOwner() {
		return (EReference)rightInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRightInstance_FirstOwner() {
		return (EReference)rightInstanceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getREAConceptVisitor() {
		return reaConceptVisitorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getREAConcept() {
		return reaConceptEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClaim() {
		return claimEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaim_ClaimForProperty() {
		return (EReference)claimEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaim_ClaimForResource() {
		return (EReference)claimEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValuable() {
		return valuableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValuable_Rights() {
		return (EReference)valuableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValuable_Events() {
		return (EReference)valuableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValuable_Name() {
		return (EAttribute)valuableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValuable_CompensationRelated() {
		return (EAttribute)valuableEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAgentAlias() {
		return agentAliasEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAgentAlias_AliasName() {
		return (EAttribute)agentAliasEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAgentAlias_AccountableAgent() {
		return (EAttribute)agentAliasEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAgentAlias_Agent() {
		return (EReference)agentAliasEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getResourceAlterationType() {
		return resourceAlterationTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getResourceTreatmentType() {
		return resourceTreatmentTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPropertyRecoverability() {
		return propertyRecoverabilityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public reaFactory getreaFactory() {
		return (reaFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		eventEClass = createEClass(EVENT);
		createEReference(eventEClass, EVENT__RESOURCE);
		createEReference(eventEClass, EVENT__PROVIDER);
		createEReference(eventEClass, EVENT__RECEIVER);
		createEReference(eventEClass, EVENT__REA_PROCESS);
		createEReference(eventEClass, EVENT__RIGHT_TRANSFERS);
		createEReference(eventEClass, EVENT__ALTERATIONS);
		createEAttribute(eventEClass, EVENT__ALTERATION_TYPE);
		createEAttribute(eventEClass, EVENT__NAME);

		resourceEClass = createEClass(RESOURCE);
		createEReference(resourceEClass, RESOURCE__PROPERTIES);
		createEReference(resourceEClass, RESOURCE__CLAIMS);

		agentEClass = createEClass(AGENT);
		createEAttribute(agentEClass, AGENT__NAME);

		reaProcessEClass = createEClass(REA_PROCESS);
		createEReference(reaProcessEClass, REA_PROCESS__INCREMENT_EVT);
		createEReference(reaProcessEClass, REA_PROCESS__DECREMENT_EVT);
		createEReference(reaProcessEClass, REA_PROCESS__INFLOW_RES);
		createEReference(reaProcessEClass, REA_PROCESS__OUTFLOW_RES);
		createEReference(reaProcessEClass, REA_PROCESS__PREDECESSORS);
		createEAttribute(reaProcessEClass, REA_PROCESS__ID);
		createEReference(reaProcessEClass, REA_PROCESS__SUCCESSORS);
		createEReference(reaProcessEClass, REA_PROCESS__COMPENSATED_BY);
		createEReference(reaProcessEClass, REA_PROCESS__COMPENSATION_FOR);

		exchangeEClass = createEClass(EXCHANGE);

		conversionEClass = createEClass(CONVERSION);

		propertyEClass = createEClass(PROPERTY);
		createEAttribute(propertyEClass, PROPERTY__NAME);
		createEAttribute(propertyEClass, PROPERTY__INITIAL_STATE);
		createEReference(propertyEClass, PROPERTY__ALTERATIONS);
		createEReference(propertyEClass, PROPERTY__DEPENDS_ON);
		createEReference(propertyEClass, PROPERTY__DEPENDEES);
		createEAttribute(propertyEClass, PROPERTY__RECOVERABLE);
		createEAttribute(propertyEClass, PROPERTY__PRIMARY_PROPERTY);
		createEReference(propertyEClass, PROPERTY__RESOURCE);

		businessProcessDefinitionEClass = createEClass(BUSINESS_PROCESS_DEFINITION);
		createEReference(businessProcessDefinitionEClass, BUSINESS_PROCESS_DEFINITION__REA_PROCESSES);
		createEAttribute(businessProcessDefinitionEClass, BUSINESS_PROCESS_DEFINITION__NAME);

		rightEClass = createEClass(RIGHT);
		createEAttribute(rightEClass, RIGHT__NAME);
		createEReference(rightEClass, RIGHT__FIRST_OWNER);
		createEReference(rightEClass, RIGHT__CURRENT_OWNER);
		createEReference(rightEClass, RIGHT__TRANSFERS);

		rightTransferEClass = createEClass(RIGHT_TRANSFER);
		createEReference(rightTransferEClass, RIGHT_TRANSFER__RIGHT);
		createEReference(rightTransferEClass, RIGHT_TRANSFER__NEW_OWNER);
		createEReference(rightTransferEClass, RIGHT_TRANSFER__INITIAL_OWNER);

		propertyAlterationEClass = createEClass(PROPERTY_ALTERATION);
		createEAttribute(propertyAlterationEClass, PROPERTY_ALTERATION__NEW_STATE);
		createEReference(propertyAlterationEClass, PROPERTY_ALTERATION__PROPERTY);
		createEAttribute(propertyAlterationEClass, PROPERTY_ALTERATION__INITIAL_STATE);

		valueModelEClass = createEClass(VALUE_MODEL);
		createEReference(valueModelEClass, VALUE_MODEL__RESOURCES);
		createEReference(valueModelEClass, VALUE_MODEL__AGENTS);
		createEReference(valueModelEClass, VALUE_MODEL__PROCESS_DEFINITION);
		createEReference(valueModelEClass, VALUE_MODEL__INSTANCES);
		createEReference(valueModelEClass, VALUE_MODEL__COMPENSATION_PROCESS);

		businessProcessInstanceEClass = createEClass(BUSINESS_PROCESS_INSTANCE);
		createEReference(businessProcessInstanceEClass, BUSINESS_PROCESS_INSTANCE__EVENTS);
		createEReference(businessProcessInstanceEClass, BUSINESS_PROCESS_INSTANCE__RESOURCES);
		createEAttribute(businessProcessInstanceEClass, BUSINESS_PROCESS_INSTANCE__STARTED_ON);
		createEAttribute(businessProcessInstanceEClass, BUSINESS_PROCESS_INSTANCE__ENDED_ON);
		createEAttribute(businessProcessInstanceEClass, BUSINESS_PROCESS_INSTANCE__ID);
		createEAttribute(businessProcessInstanceEClass, BUSINESS_PROCESS_INSTANCE__RUNNING);

		eventInstanceEClass = createEClass(EVENT_INSTANCE);
		createEReference(eventInstanceEClass, EVENT_INSTANCE__EVENT);
		createEAttribute(eventInstanceEClass, EVENT_INSTANCE__ID);
		createEReference(eventInstanceEClass, EVENT_INSTANCE__RESOURCE_INSTANCE);

		resourceInstanceEClass = createEClass(RESOURCE_INSTANCE);
		createEAttribute(resourceInstanceEClass, RESOURCE_INSTANCE__ID);
		createEReference(resourceInstanceEClass, RESOURCE_INSTANCE__RESOURCE);
		createEReference(resourceInstanceEClass, RESOURCE_INSTANCE__PROPERTIES);
		createEReference(resourceInstanceEClass, RESOURCE_INSTANCE__RIGHTS);
		createEReference(resourceInstanceEClass, RESOURCE_INSTANCE__EVENTS);

		propertyInstanceEClass = createEClass(PROPERTY_INSTANCE);
		createEReference(propertyInstanceEClass, PROPERTY_INSTANCE__PROPERTY);
		createEAttribute(propertyInstanceEClass, PROPERTY_INSTANCE__CURRENT_STATE);
		createEAttribute(propertyInstanceEClass, PROPERTY_INSTANCE__INITIAL_STATE);

		rightInstanceEClass = createEClass(RIGHT_INSTANCE);
		createEReference(rightInstanceEClass, RIGHT_INSTANCE__RIGHT);
		createEReference(rightInstanceEClass, RIGHT_INSTANCE__CURRENT_OWNER);
		createEReference(rightInstanceEClass, RIGHT_INSTANCE__FIRST_OWNER);

		reaConceptVisitorEClass = createEClass(REA_CONCEPT_VISITOR);

		reaConceptEClass = createEClass(REA_CONCEPT);

		claimEClass = createEClass(CLAIM);
		createEReference(claimEClass, CLAIM__CLAIM_FOR_PROPERTY);
		createEReference(claimEClass, CLAIM__CLAIM_FOR_RESOURCE);

		valuableEClass = createEClass(VALUABLE);
		createEReference(valuableEClass, VALUABLE__RIGHTS);
		createEReference(valuableEClass, VALUABLE__EVENTS);
		createEAttribute(valuableEClass, VALUABLE__NAME);
		createEAttribute(valuableEClass, VALUABLE__COMPENSATION_RELATED);

		agentAliasEClass = createEClass(AGENT_ALIAS);
		createEAttribute(agentAliasEClass, AGENT_ALIAS__ALIAS_NAME);
		createEAttribute(agentAliasEClass, AGENT_ALIAS__ACCOUNTABLE_AGENT);
		createEReference(agentAliasEClass, AGENT_ALIAS__AGENT);

		// Create enums
		resourceAlterationTypeEEnum = createEEnum(RESOURCE_ALTERATION_TYPE);
		resourceTreatmentTypeEEnum = createEEnum(RESOURCE_TREATMENT_TYPE);
		propertyRecoverabilityEEnum = createEEnum(PROPERTY_RECOVERABILITY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		eventEClass.getESuperTypes().add(this.getREAConcept());
		resourceEClass.getESuperTypes().add(this.getValuable());
		agentEClass.getESuperTypes().add(this.getREAConcept());
		reaProcessEClass.getESuperTypes().add(this.getREAConcept());
		exchangeEClass.getESuperTypes().add(this.getREAProcess());
		conversionEClass.getESuperTypes().add(this.getREAProcess());
		propertyEClass.getESuperTypes().add(this.getREAConcept());
		businessProcessDefinitionEClass.getESuperTypes().add(this.getREAConcept());
		rightEClass.getESuperTypes().add(this.getREAConcept());
		claimEClass.getESuperTypes().add(this.getValuable());
		valuableEClass.getESuperTypes().add(this.getREAConcept());
		agentAliasEClass.getESuperTypes().add(this.getAgent());

		// Initialize classes and features; add operations and parameters
		initEClass(eventEClass, Event.class, "Event", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEvent_Resource(), this.getValuable(), this.getValuable_Events(), "resource", null, 1, 1, Event.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEvent_Provider(), this.getAgent(), null, "provider", null, 1, 1, Event.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEvent_Receiver(), this.getAgent(), null, "receiver", null, 1, 1, Event.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEvent_REAProcess(), this.getREAProcess(), null, "rEAProcess", null, 1, 1, Event.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getEvent_RightTransfers(), this.getRightTransfer(), null, "rightTransfers", null, 0, -1, Event.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEvent_Alterations(), this.getPropertyAlteration(), null, "alterations", null, 0, -1, Event.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEvent_AlterationType(), this.getResourceAlterationType(), "alterationType", null, 0, 1, Event.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEvent_Name(), ecorePackage.getEString(), "name", null, 0, 1, Event.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = addEOperation(eventEClass, this.getPropertyAlteration(), "getAlterations", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getResource(), "r", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(eventEClass, this.getRightTransfer(), "getRightTransfers", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getValuable(), "r", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(eventEClass, this.getResourceTreatmentType(), "getResourceTreatmentType", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(eventEClass, this.getRightTransfer(), "getRightTransfers", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getValuable(), "r", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getRight(), "right", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(eventEClass, this.getPropertyAlteration(), "getPropertyAlteration", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getResource(), "r", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getProperty(), "p", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(eventEClass, ecorePackage.getEBoolean(), "isIncrementEvt", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(eventEClass, ecorePackage.getEBoolean(), "isDecrementEvt", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(resourceEClass, Resource.class, "Resource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResource_Properties(), this.getProperty(), this.getProperty_Resource(), "properties", null, 0, -1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResource_Claims(), this.getClaim(), this.getClaim_ClaimForResource(), "claims", null, 0, -1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(resourceEClass, this.getPropertyAlteration(), "getAlterationsHistory", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(resourceEClass, this.getPropertyAlteration(), "getAlterationsHistory", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getProperty(), "p", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(agentEClass, Agent.class, "Agent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAgent_Name(), ecorePackage.getEString(), "name", null, 0, 1, Agent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(reaProcessEClass, REAProcess.class, "REAProcess", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getREAProcess_IncrementEvt(), this.getEvent(), null, "incrementEvt", null, 1, -1, REAProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getREAProcess_DecrementEvt(), this.getEvent(), null, "decrementEvt", null, 1, -1, REAProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getREAProcess_InflowRes(), this.getValuable(), null, "inflowRes", null, 0, -1, REAProcess.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getREAProcess_OutflowRes(), this.getValuable(), null, "outflowRes", null, 0, -1, REAProcess.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getREAProcess_Predecessors(), this.getREAProcess(), this.getREAProcess_Successors(), "predecessors", null, 0, -1, REAProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getREAProcess_ID(), ecorePackage.getEString(), "iD", null, 1, 1, REAProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getREAProcess_Successors(), this.getREAProcess(), this.getREAProcess_Predecessors(), "successors", null, 0, -1, REAProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getREAProcess_CompensatedBy(), this.getREAProcess(), this.getREAProcess_CompensationFor(), "compensatedBy", null, 0, 1, REAProcess.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getREAProcess_CompensationFor(), this.getREAProcess(), this.getREAProcess_CompensatedBy(), "compensationFor", null, 0, 1, REAProcess.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(reaProcessEClass, this.getEvent(), "getAllEvents", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(reaProcessEClass, this.getREAProcess(), "getSuccessorsBranchForResource", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getValuable(), "resource", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(reaProcessEClass, this.getREAProcess(), "getSuccessorForResource", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getValuable(), "resource", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(reaProcessEClass, this.getREAProcess(), "getPredecessorsBranch", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(exchangeEClass, Exchange.class, "Exchange", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(conversionEClass, Conversion.class, "Conversion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(propertyEClass, Property.class, "Property", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProperty_Name(), ecorePackage.getEString(), "name", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProperty_InitialState(), ecorePackage.getEString(), "initialState", null, 1, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProperty_Alterations(), this.getPropertyAlteration(), this.getPropertyAlteration_Property(), "alterations", null, 0, -1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProperty_DependsOn(), this.getProperty(), this.getProperty_Dependees(), "dependsOn", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProperty_Dependees(), this.getProperty(), this.getProperty_DependsOn(), "dependees", null, 0, -1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProperty_Recoverable(), this.getPropertyRecoverability(), "recoverable", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProperty_PrimaryProperty(), ecorePackage.getEBoolean(), "primaryProperty", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProperty_Resource(), this.getResource(), this.getResource_Properties(), "resource", null, 1, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(businessProcessDefinitionEClass, BusinessProcessDefinition.class, "BusinessProcessDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBusinessProcessDefinition_REAProcesses(), this.getREAProcess(), null, "rEAProcesses", null, 0, -1, BusinessProcessDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBusinessProcessDefinition_Name(), ecorePackage.getEString(), "name", null, 0, 1, BusinessProcessDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(businessProcessDefinitionEClass, null, "sortREAProcesses", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(rightEClass, Right.class, "Right", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRight_Name(), ecorePackage.getEString(), "name", null, 0, 1, Right.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRight_FirstOwner(), this.getAgent(), null, "firstOwner", null, 1, 1, Right.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRight_CurrentOwner(), this.getAgent(), null, "currentOwner", null, 1, 1, Right.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getRight_Transfers(), this.getRightTransfer(), this.getRightTransfer_Right(), "transfers", null, 0, -1, Right.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rightTransferEClass, RightTransfer.class, "RightTransfer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRightTransfer_Right(), this.getRight(), this.getRight_Transfers(), "right", null, 1, 1, RightTransfer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRightTransfer_NewOwner(), this.getAgent(), null, "newOwner", null, 1, 1, RightTransfer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRightTransfer_InitialOwner(), this.getAgent(), null, "initialOwner", null, 0, 1, RightTransfer.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(propertyAlterationEClass, PropertyAlteration.class, "PropertyAlteration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPropertyAlteration_NewState(), ecorePackage.getEString(), "newState", null, 0, 1, PropertyAlteration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPropertyAlteration_Property(), this.getProperty(), this.getProperty_Alterations(), "property", null, 1, 1, PropertyAlteration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyAlteration_InitialState(), ecorePackage.getEString(), "initialState", "", 1, 1, PropertyAlteration.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(valueModelEClass, ValueModel.class, "ValueModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getValueModel_Resources(), this.getValuable(), null, "resources", null, 0, -1, ValueModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getValueModel_Agents(), this.getAgent(), null, "agents", null, 0, -1, ValueModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getValueModel_ProcessDefinition(), this.getBusinessProcessDefinition(), null, "processDefinition", null, 1, 1, ValueModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getValueModel_Instances(), this.getBusinessProcessInstance(), null, "instances", null, 0, -1, ValueModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getValueModel_CompensationProcess(), this.getBusinessProcessDefinition(), null, "compensationProcess", null, 0, 1, ValueModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(valueModelEClass, this.getAgentAlias(), "getAccountableAgent", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(businessProcessInstanceEClass, BusinessProcessInstance.class, "BusinessProcessInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBusinessProcessInstance_Events(), this.getEventInstance(), null, "events", null, 0, -1, BusinessProcessInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBusinessProcessInstance_Resources(), this.getResourceInstance(), null, "resources", null, 0, -1, BusinessProcessInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBusinessProcessInstance_StartedOn(), ecorePackage.getEDate(), "startedOn", null, 1, 1, BusinessProcessInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBusinessProcessInstance_EndedOn(), ecorePackage.getEDate(), "endedOn", null, 1, 1, BusinessProcessInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBusinessProcessInstance_ID(), ecorePackage.getEString(), "iD", null, 1, 1, BusinessProcessInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBusinessProcessInstance_Running(), ecorePackage.getEBoolean(), "running", null, 1, 1, BusinessProcessInstance.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(eventInstanceEClass, EventInstance.class, "EventInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEventInstance_Event(), this.getEvent(), null, "event", null, 1, 1, EventInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEventInstance_ID(), ecorePackage.getEString(), "iD", null, 1, 1, EventInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEventInstance_ResourceInstance(), this.getResourceInstance(), this.getResourceInstance_Events(), "resourceInstance", null, 1, 1, EventInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resourceInstanceEClass, ResourceInstance.class, "ResourceInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResourceInstance_ID(), ecorePackage.getEString(), "iD", null, 1, 1, ResourceInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResourceInstance_Resource(), this.getValuable(), null, "resource", null, 1, 1, ResourceInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResourceInstance_Properties(), this.getPropertyInstance(), null, "properties", null, 0, -1, ResourceInstance.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResourceInstance_Rights(), this.getRightInstance(), null, "rights", null, 0, -1, ResourceInstance.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResourceInstance_Events(), this.getEventInstance(), this.getEventInstance_ResourceInstance(), "events", null, 0, -1, ResourceInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertyInstanceEClass, PropertyInstance.class, "PropertyInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPropertyInstance_Property(), this.getProperty(), null, "property", null, 1, 1, PropertyInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyInstance_CurrentState(), ecorePackage.getEString(), "currentState", null, 1, 1, PropertyInstance.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyInstance_InitialState(), ecorePackage.getEString(), "initialState", null, 1, 1, PropertyInstance.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(rightInstanceEClass, RightInstance.class, "RightInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRightInstance_Right(), this.getRight(), null, "right", null, 1, 1, RightInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRightInstance_CurrentOwner(), this.getAgent(), null, "currentOwner", null, 1, 1, RightInstance.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getRightInstance_FirstOwner(), this.getAgent(), null, "firstOwner", null, 1, 1, RightInstance.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(reaConceptVisitorEClass, REAConceptVisitor.class, "REAConceptVisitor", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(reaConceptVisitorEClass, null, "visit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getREAConcept(), "concept", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(reaConceptEClass, REAConcept.class, "REAConcept", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(reaConceptEClass, null, "accept", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getREAConceptVisitor(), "visitor", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(claimEClass, Claim.class, "Claim", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClaim_ClaimForProperty(), this.getProperty(), null, "claimForProperty", null, 0, -1, Claim.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClaim_ClaimForResource(), this.getResource(), this.getResource_Claims(), "claimForResource", null, 1, 1, Claim.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(valuableEClass, Valuable.class, "Valuable", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getValuable_Rights(), this.getRight(), null, "rights", null, 0, -1, Valuable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getValuable_Events(), this.getEvent(), this.getEvent_Resource(), "events", null, 0, -1, Valuable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getValuable_Name(), ecorePackage.getEString(), "name", null, 0, 1, Valuable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getValuable_CompensationRelated(), ecorePackage.getEBoolean(), "compensationRelated", null, 0, 1, Valuable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(valuableEClass, this.getRightTransfer(), "getRightTransfersHistory", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(valuableEClass, this.getRightTransfer(), "getRightTransfersHistory", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getRight(), "right", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(agentAliasEClass, AgentAlias.class, "AgentAlias", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAgentAlias_AliasName(), ecorePackage.getEString(), "aliasName", null, 0, 1, AgentAlias.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAgentAlias_AccountableAgent(), ecorePackage.getEBoolean(), "accountableAgent", null, 0, 1, AgentAlias.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAgentAlias_Agent(), this.getAgent(), null, "agent", null, 0, 1, AgentAlias.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(resourceAlterationTypeEEnum, ResourceAlterationType.class, "ResourceAlterationType");
		addEEnumLiteral(resourceAlterationTypeEEnum, ResourceAlterationType.USAGE);
		addEEnumLiteral(resourceAlterationTypeEEnum, ResourceAlterationType.CONSUMPTION);

		initEEnum(resourceTreatmentTypeEEnum, ResourceTreatmentType.class, "ResourceTreatmentType");
		addEEnumLiteral(resourceTreatmentTypeEEnum, ResourceTreatmentType.RIGHT_TRANSFER);
		addEEnumLiteral(resourceTreatmentTypeEEnum, ResourceTreatmentType.PROPERTY_ALTERATION);
		addEEnumLiteral(resourceTreatmentTypeEEnum, ResourceTreatmentType.CONSUMPTION);

		initEEnum(propertyRecoverabilityEEnum, PropertyRecoverability.class, "PropertyRecoverability");
		addEEnumLiteral(propertyRecoverabilityEEnum, PropertyRecoverability.SEMI_RECOVERABLE);
		addEEnumLiteral(propertyRecoverabilityEEnum, PropertyRecoverability.NON_RECOVERABLE);
		addEEnumLiteral(propertyRecoverabilityEEnum, PropertyRecoverability.FULLY_RECOVERABLE);

		// Create resource
		createResource(eNS_URI);
	}

} //reaPackageImpl
