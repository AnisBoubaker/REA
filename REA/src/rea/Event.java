/**
 */
package rea;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link rea.Event#getResource <em>Resource</em>}</li>
 *   <li>{@link rea.Event#getProvider <em>Provider</em>}</li>
 *   <li>{@link rea.Event#getReceiver <em>Receiver</em>}</li>
 *   <li>{@link rea.Event#getREAProcess <em>REA Process</em>}</li>
 *   <li>{@link rea.Event#getRightTransfers <em>Right Transfers</em>}</li>
 *   <li>{@link rea.Event#getAlterations <em>Alterations</em>}</li>
 *   <li>{@link rea.Event#getAlterationType <em>Alteration Type</em>}</li>
 *   <li>{@link rea.Event#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see rea.reaPackage#getEvent()
 * @model
 * @generated
 */
public interface Event extends REAConcept {
	/**
	 * Returns the value of the '<em><b>Resource</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link rea.Valuable#getEvents <em>Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource</em>' reference.
	 * @see #setResource(Valuable)
	 * @see rea.reaPackage#getEvent_Resource()
	 * @see rea.Valuable#getEvents
	 * @model opposite="events" resolveProxies="false" required="true"
	 * @generated
	 */
	Valuable getResource();

	/**
	 * Sets the value of the '{@link rea.Event#getResource <em>Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource</em>' reference.
	 * @see #getResource()
	 * @generated
	 */
	void setResource(Valuable value);

	/**
	 * Returns the value of the '<em><b>Provider</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provider</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provider</em>' reference.
	 * @see #setProvider(Agent)
	 * @see rea.reaPackage#getEvent_Provider()
	 * @model required="true"
	 * @generated
	 */
	Agent getProvider();

	/**
	 * Sets the value of the '{@link rea.Event#getProvider <em>Provider</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provider</em>' reference.
	 * @see #getProvider()
	 * @generated
	 */
	void setProvider(Agent value);

	/**
	 * Returns the value of the '<em><b>Receiver</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Receiver</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Receiver</em>' reference.
	 * @see #setReceiver(Agent)
	 * @see rea.reaPackage#getEvent_Receiver()
	 * @model required="true"
	 * @generated
	 */
	Agent getReceiver();

	/**
	 * Sets the value of the '{@link rea.Event#getReceiver <em>Receiver</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Receiver</em>' reference.
	 * @see #getReceiver()
	 * @generated
	 */
	void setReceiver(Agent value);

	/**
	 * Returns the value of the '<em><b>REA Process</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>REA Process</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>REA Process</em>' reference.
	 * @see rea.reaPackage#getEvent_REAProcess()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	REAProcess getREAProcess();

	/**
	 * Returns the value of the '<em><b>Right Transfers</b></em>' containment reference list.
	 * The list contents are of type {@link rea.RightTransfer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right Transfers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right Transfers</em>' containment reference list.
	 * @see rea.reaPackage#getEvent_RightTransfers()
	 * @model containment="true"
	 * @generated
	 */
	EList<RightTransfer> getRightTransfers();

	/**
	 * Returns the value of the '<em><b>Alterations</b></em>' containment reference list.
	 * The list contents are of type {@link rea.PropertyAlteration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alterations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alterations</em>' containment reference list.
	 * @see rea.reaPackage#getEvent_Alterations()
	 * @model containment="true"
	 * @generated
	 */
	EList<PropertyAlteration> getAlterations();

	/**
	 * Returns the value of the '<em><b>Alteration Type</b></em>' attribute.
	 * The literals are from the enumeration {@link rea.ResourceAlterationType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alteration Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alteration Type</em>' attribute.
	 * @see rea.ResourceAlterationType
	 * @see #setAlterationType(ResourceAlterationType)
	 * @see rea.reaPackage#getEvent_AlterationType()
	 * @model
	 * @generated
	 */
	ResourceAlterationType getAlterationType();

	/**
	 * Sets the value of the '{@link rea.Event#getAlterationType <em>Alteration Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alteration Type</em>' attribute.
	 * @see rea.ResourceAlterationType
	 * @see #getAlterationType()
	 * @generated
	 */
	void setAlterationType(ResourceAlterationType value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see rea.reaPackage#getEvent_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link rea.Event#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EList<PropertyAlteration> getAlterations(Resource r);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EList<RightTransfer> getRightTransfers(Valuable r);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	ResourceTreatmentType getResourceTreatmentType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	RightTransfer getRightTransfers(Valuable r, Right right);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	PropertyAlteration getPropertyAlteration(Resource r, Property p);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	boolean isIncrementEvt();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	boolean isDecrementEvt();

} // Event
