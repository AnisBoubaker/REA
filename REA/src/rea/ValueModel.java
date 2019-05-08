/**
 */
package rea;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link rea.ValueModel#getResources <em>Resources</em>}</li>
 *   <li>{@link rea.ValueModel#getAgents <em>Agents</em>}</li>
 *   <li>{@link rea.ValueModel#getProcessDefinition <em>Process Definition</em>}</li>
 *   <li>{@link rea.ValueModel#getInstances <em>Instances</em>}</li>
 *   <li>{@link rea.ValueModel#getCompensationProcess <em>Compensation Process</em>}</li>
 * </ul>
 * </p>
 *
 * @see rea.reaPackage#getValueModel()
 * @model
 * @generated
 */
public interface ValueModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Resources</b></em>' containment reference list.
	 * The list contents are of type {@link rea.Valuable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resources</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resources</em>' containment reference list.
	 * @see rea.reaPackage#getValueModel_Resources()
	 * @model containment="true"
	 * @generated
	 */
	EList<Valuable> getResources();

	/**
	 * Returns the value of the '<em><b>Agents</b></em>' containment reference list.
	 * The list contents are of type {@link rea.Agent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Agents</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Agents</em>' containment reference list.
	 * @see rea.reaPackage#getValueModel_Agents()
	 * @model containment="true"
	 * @generated
	 */
	EList<Agent> getAgents();

	/**
	 * Returns the value of the '<em><b>Process Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Process Definition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Process Definition</em>' containment reference.
	 * @see #setProcessDefinition(BusinessProcessDefinition)
	 * @see rea.reaPackage#getValueModel_ProcessDefinition()
	 * @model containment="true" required="true"
	 * @generated
	 */
	BusinessProcessDefinition getProcessDefinition();

	/**
	 * Sets the value of the '{@link rea.ValueModel#getProcessDefinition <em>Process Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Process Definition</em>' containment reference.
	 * @see #getProcessDefinition()
	 * @generated
	 */
	void setProcessDefinition(BusinessProcessDefinition value);

	/**
	 * Returns the value of the '<em><b>Instances</b></em>' containment reference list.
	 * The list contents are of type {@link rea.BusinessProcessInstance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instances</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instances</em>' containment reference list.
	 * @see rea.reaPackage#getValueModel_Instances()
	 * @model containment="true"
	 * @generated
	 */
	EList<BusinessProcessInstance> getInstances();

	/**
	 * Returns the value of the '<em><b>Compensation Process</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compensation Process</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compensation Process</em>' containment reference.
	 * @see #isSetCompensationProcess()
	 * @see #unsetCompensationProcess()
	 * @see #setCompensationProcess(BusinessProcessDefinition)
	 * @see rea.reaPackage#getValueModel_CompensationProcess()
	 * @model containment="true" unsettable="true"
	 * @generated
	 */
	BusinessProcessDefinition getCompensationProcess();

	/**
	 * Sets the value of the '{@link rea.ValueModel#getCompensationProcess <em>Compensation Process</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compensation Process</em>' containment reference.
	 * @see #isSetCompensationProcess()
	 * @see #unsetCompensationProcess()
	 * @see #getCompensationProcess()
	 * @generated
	 */
	void setCompensationProcess(BusinessProcessDefinition value);

	/**
	 * Unsets the value of the '{@link rea.ValueModel#getCompensationProcess <em>Compensation Process</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCompensationProcess()
	 * @see #getCompensationProcess()
	 * @see #setCompensationProcess(BusinessProcessDefinition)
	 * @generated
	 */
	void unsetCompensationProcess();

	/**
	 * Returns whether the value of the '{@link rea.ValueModel#getCompensationProcess <em>Compensation Process</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Compensation Process</em>' containment reference is set.
	 * @see #unsetCompensationProcess()
	 * @see #getCompensationProcess()
	 * @see #setCompensationProcess(BusinessProcessDefinition)
	 * @generated
	 */
	boolean isSetCompensationProcess();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	AgentAlias getAccountableAgent();

} // ValueModel
