/**
 */
package rea;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Business Process Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link rea.BusinessProcessInstance#getEvents <em>Events</em>}</li>
 *   <li>{@link rea.BusinessProcessInstance#getResources <em>Resources</em>}</li>
 *   <li>{@link rea.BusinessProcessInstance#getStartedOn <em>Started On</em>}</li>
 *   <li>{@link rea.BusinessProcessInstance#getEndedOn <em>Ended On</em>}</li>
 *   <li>{@link rea.BusinessProcessInstance#getID <em>ID</em>}</li>
 *   <li>{@link rea.BusinessProcessInstance#isRunning <em>Running</em>}</li>
 * </ul>
 * </p>
 *
 * @see rea.reaPackage#getBusinessProcessInstance()
 * @model
 * @generated
 */
public interface BusinessProcessInstance extends EObject {
	/**
	 * Returns the value of the '<em><b>Events</b></em>' containment reference list.
	 * The list contents are of type {@link rea.EventInstance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Events</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Events</em>' containment reference list.
	 * @see rea.reaPackage#getBusinessProcessInstance_Events()
	 * @model containment="true"
	 * @generated
	 */
	EList<EventInstance> getEvents();

	/**
	 * Returns the value of the '<em><b>Resources</b></em>' containment reference list.
	 * The list contents are of type {@link rea.ResourceInstance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resources</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resources</em>' containment reference list.
	 * @see rea.reaPackage#getBusinessProcessInstance_Resources()
	 * @model containment="true"
	 * @generated
	 */
	EList<ResourceInstance> getResources();

	/**
	 * Returns the value of the '<em><b>Started On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Started On</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Started On</em>' attribute.
	 * @see #setStartedOn(Date)
	 * @see rea.reaPackage#getBusinessProcessInstance_StartedOn()
	 * @model required="true"
	 * @generated
	 */
	Date getStartedOn();

	/**
	 * Sets the value of the '{@link rea.BusinessProcessInstance#getStartedOn <em>Started On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Started On</em>' attribute.
	 * @see #getStartedOn()
	 * @generated
	 */
	void setStartedOn(Date value);

	/**
	 * Returns the value of the '<em><b>Ended On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ended On</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ended On</em>' attribute.
	 * @see #isSetEndedOn()
	 * @see #unsetEndedOn()
	 * @see #setEndedOn(Date)
	 * @see rea.reaPackage#getBusinessProcessInstance_EndedOn()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	Date getEndedOn();

	/**
	 * Sets the value of the '{@link rea.BusinessProcessInstance#getEndedOn <em>Ended On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ended On</em>' attribute.
	 * @see #isSetEndedOn()
	 * @see #unsetEndedOn()
	 * @see #getEndedOn()
	 * @generated
	 */
	void setEndedOn(Date value);

	/**
	 * Unsets the value of the '{@link rea.BusinessProcessInstance#getEndedOn <em>Ended On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEndedOn()
	 * @see #getEndedOn()
	 * @see #setEndedOn(Date)
	 * @generated
	 */
	void unsetEndedOn();

	/**
	 * Returns whether the value of the '{@link rea.BusinessProcessInstance#getEndedOn <em>Ended On</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ended On</em>' attribute is set.
	 * @see #unsetEndedOn()
	 * @see #getEndedOn()
	 * @see #setEndedOn(Date)
	 * @generated
	 */
	boolean isSetEndedOn();

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
	 * @see rea.reaPackage#getBusinessProcessInstance_ID()
	 * @model required="true"
	 * @generated
	 */
	String getID();

	/**
	 * Sets the value of the '{@link rea.BusinessProcessInstance#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(String value);

	/**
	 * Returns the value of the '<em><b>Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Running</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Running</em>' attribute.
	 * @see rea.reaPackage#getBusinessProcessInstance_Running()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	boolean isRunning();

} // BusinessProcessInstance
