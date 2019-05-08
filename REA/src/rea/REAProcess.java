/**
 */
package rea;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>REA Process</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link rea.REAProcess#getIncrementEvt <em>Increment Evt</em>}</li>
 *   <li>{@link rea.REAProcess#getDecrementEvt <em>Decrement Evt</em>}</li>
 *   <li>{@link rea.REAProcess#getInflowRes <em>Inflow Res</em>}</li>
 *   <li>{@link rea.REAProcess#getOutflowRes <em>Outflow Res</em>}</li>
 *   <li>{@link rea.REAProcess#getPredecessors <em>Predecessors</em>}</li>
 *   <li>{@link rea.REAProcess#getID <em>ID</em>}</li>
 *   <li>{@link rea.REAProcess#getSuccessors <em>Successors</em>}</li>
 *   <li>{@link rea.REAProcess#getCompensatedBy <em>Compensated By</em>}</li>
 *   <li>{@link rea.REAProcess#getCompensationFor <em>Compensation For</em>}</li>
 * </ul>
 * </p>
 *
 * @see rea.reaPackage#getREAProcess()
 * @model abstract="true"
 * @generated
 */
public interface REAProcess extends REAConcept {
	/**
	 * Returns the value of the '<em><b>Increment Evt</b></em>' containment reference list.
	 * The list contents are of type {@link rea.Event}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Increment Evt</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Increment Evt</em>' containment reference list.
	 * @see rea.reaPackage#getREAProcess_IncrementEvt()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Event> getIncrementEvt();

	/**
	 * Returns the value of the '<em><b>Decrement Evt</b></em>' containment reference list.
	 * The list contents are of type {@link rea.Event}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Decrement Evt</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decrement Evt</em>' containment reference list.
	 * @see rea.reaPackage#getREAProcess_DecrementEvt()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Event> getDecrementEvt();

	/**
	 * Returns the value of the '<em><b>Inflow Res</b></em>' reference list.
	 * The list contents are of type {@link rea.Valuable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inflow Res</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inflow Res</em>' reference list.
	 * @see rea.reaPackage#getREAProcess_InflowRes()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<Valuable> getInflowRes();

	/**
	 * Returns the value of the '<em><b>Outflow Res</b></em>' reference list.
	 * The list contents are of type {@link rea.Valuable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outflow Res</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outflow Res</em>' reference list.
	 * @see rea.reaPackage#getREAProcess_OutflowRes()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<Valuable> getOutflowRes();

	/**
	 * Returns the value of the '<em><b>Predecessors</b></em>' reference list.
	 * The list contents are of type {@link rea.REAProcess}.
	 * It is bidirectional and its opposite is '{@link rea.REAProcess#getSuccessors <em>Successors</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Predecessors</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predecessors</em>' reference list.
	 * @see rea.reaPackage#getREAProcess_Predecessors()
	 * @see rea.REAProcess#getSuccessors
	 * @model opposite="successors"
	 * @generated
	 */
	EList<REAProcess> getPredecessors();

	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #setID(String)
	 * @see rea.reaPackage#getREAProcess_ID()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getID();

	/**
	 * Sets the value of the '{@link rea.REAProcess#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(String value);

	/**
	 * Returns the value of the '<em><b>Successors</b></em>' reference list.
	 * The list contents are of type {@link rea.REAProcess}.
	 * It is bidirectional and its opposite is '{@link rea.REAProcess#getPredecessors <em>Predecessors</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Successors</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Successors</em>' reference list.
	 * @see rea.reaPackage#getREAProcess_Successors()
	 * @see rea.REAProcess#getPredecessors
	 * @model opposite="predecessors"
	 * @generated
	 */
	EList<REAProcess> getSuccessors();

	/**
	 * Returns the value of the '<em><b>Compensated By</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link rea.REAProcess#getCompensationFor <em>Compensation For</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compensated By</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compensated By</em>' reference.
	 * @see #setCompensatedBy(REAProcess)
	 * @see rea.reaPackage#getREAProcess_CompensatedBy()
	 * @see rea.REAProcess#getCompensationFor
	 * @model opposite="compensationFor" transient="true"
	 * @generated
	 */
	REAProcess getCompensatedBy();

	/**
	 * Sets the value of the '{@link rea.REAProcess#getCompensatedBy <em>Compensated By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compensated By</em>' reference.
	 * @see #getCompensatedBy()
	 * @generated
	 */
	void setCompensatedBy(REAProcess value);

	/**
	 * Returns the value of the '<em><b>Compensation For</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link rea.REAProcess#getCompensatedBy <em>Compensated By</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compensation For</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compensation For</em>' reference.
	 * @see #setCompensationFor(REAProcess)
	 * @see rea.reaPackage#getREAProcess_CompensationFor()
	 * @see rea.REAProcess#getCompensatedBy
	 * @model opposite="compensatedBy" transient="true"
	 * @generated
	 */
	REAProcess getCompensationFor();

	/**
	 * Sets the value of the '{@link rea.REAProcess#getCompensationFor <em>Compensation For</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compensation For</em>' reference.
	 * @see #getCompensationFor()
	 * @generated
	 */
	void setCompensationFor(REAProcess value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<Event> getAllEvents();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EList<REAProcess> getSuccessorsBranchForResource(Valuable resource);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	REAProcess getSuccessorForResource(Valuable resource);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<REAProcess> getPredecessorsBranch();

} // REAProcess
