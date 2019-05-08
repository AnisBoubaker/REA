/**
 */
package rea;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link rea.EventInstance#getEvent <em>Event</em>}</li>
 *   <li>{@link rea.EventInstance#getID <em>ID</em>}</li>
 *   <li>{@link rea.EventInstance#getResourceInstance <em>Resource Instance</em>}</li>
 * </ul>
 * </p>
 *
 * @see rea.reaPackage#getEventInstance()
 * @model
 * @generated
 */
public interface EventInstance extends EObject {
	/**
	 * Returns the value of the '<em><b>Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event</em>' reference.
	 * @see #setEvent(Event)
	 * @see rea.reaPackage#getEventInstance_Event()
	 * @model required="true"
	 * @generated
	 */
	Event getEvent();

	/**
	 * Sets the value of the '{@link rea.EventInstance#getEvent <em>Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event</em>' reference.
	 * @see #getEvent()
	 * @generated
	 */
	void setEvent(Event value);

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
	 * @see rea.reaPackage#getEventInstance_ID()
	 * @model required="true"
	 * @generated
	 */
	String getID();

	/**
	 * Sets the value of the '{@link rea.EventInstance#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(String value);

	/**
	 * Returns the value of the '<em><b>Resource Instance</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link rea.ResourceInstance#getEvents <em>Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource Instance</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Instance</em>' reference.
	 * @see #setResourceInstance(ResourceInstance)
	 * @see rea.reaPackage#getEventInstance_ResourceInstance()
	 * @see rea.ResourceInstance#getEvents
	 * @model opposite="events" required="true"
	 * @generated
	 */
	ResourceInstance getResourceInstance();

	/**
	 * Sets the value of the '{@link rea.EventInstance#getResourceInstance <em>Resource Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Instance</em>' reference.
	 * @see #getResourceInstance()
	 * @generated
	 */
	void setResourceInstance(ResourceInstance value);

} // EventInstance
