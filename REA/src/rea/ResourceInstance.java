/**
 */
package rea;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link rea.ResourceInstance#getID <em>ID</em>}</li>
 *   <li>{@link rea.ResourceInstance#getResource <em>Resource</em>}</li>
 *   <li>{@link rea.ResourceInstance#getProperties <em>Properties</em>}</li>
 *   <li>{@link rea.ResourceInstance#getRights <em>Rights</em>}</li>
 *   <li>{@link rea.ResourceInstance#getEvents <em>Events</em>}</li>
 * </ul>
 * </p>
 *
 * @see rea.reaPackage#getResourceInstance()
 * @model
 * @generated
 */
public interface ResourceInstance extends EObject {
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
	 * @see rea.reaPackage#getResourceInstance_ID()
	 * @model required="true"
	 * @generated
	 */
	String getID();

	/**
	 * Sets the value of the '{@link rea.ResourceInstance#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(String value);

	/**
	 * Returns the value of the '<em><b>Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource</em>' reference.
	 * @see #setResource(Valuable)
	 * @see rea.reaPackage#getResourceInstance_Resource()
	 * @model required="true"
	 * @generated
	 */
	Valuable getResource();

	/**
	 * Sets the value of the '{@link rea.ResourceInstance#getResource <em>Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource</em>' reference.
	 * @see #getResource()
	 * @generated
	 */
	void setResource(Valuable value);

	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
	 * The list contents are of type {@link rea.PropertyInstance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Properties</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference list.
	 * @see rea.reaPackage#getResourceInstance_Properties()
	 * @model containment="true" changeable="false"
	 * @generated
	 */
	EList<PropertyInstance> getProperties();

	/**
	 * Returns the value of the '<em><b>Rights</b></em>' containment reference list.
	 * The list contents are of type {@link rea.RightInstance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rights</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rights</em>' containment reference list.
	 * @see rea.reaPackage#getResourceInstance_Rights()
	 * @model containment="true" changeable="false"
	 * @generated
	 */
	EList<RightInstance> getRights();

	/**
	 * Returns the value of the '<em><b>Events</b></em>' reference list.
	 * The list contents are of type {@link rea.EventInstance}.
	 * It is bidirectional and its opposite is '{@link rea.EventInstance#getResourceInstance <em>Resource Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Events</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Events</em>' reference list.
	 * @see rea.reaPackage#getResourceInstance_Events()
	 * @see rea.EventInstance#getResourceInstance
	 * @model opposite="resourceInstance"
	 * @generated
	 */
	EList<EventInstance> getEvents();

} // ResourceInstance
