/**
 */
package rea;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Valuable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link rea.Valuable#getRights <em>Rights</em>}</li>
 *   <li>{@link rea.Valuable#getEvents <em>Events</em>}</li>
 *   <li>{@link rea.Valuable#getName <em>Name</em>}</li>
 *   <li>{@link rea.Valuable#isCompensationRelated <em>Compensation Related</em>}</li>
 * </ul>
 * </p>
 *
 * @see rea.reaPackage#getValuable()
 * @model abstract="true"
 * @generated
 */
public interface Valuable extends REAConcept {
	/**
	 * Returns the value of the '<em><b>Rights</b></em>' containment reference list.
	 * The list contents are of type {@link rea.Right}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rights</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rights</em>' containment reference list.
	 * @see rea.reaPackage#getValuable_Rights()
	 * @model containment="true"
	 * @generated
	 */
	EList<Right> getRights();

	/**
	 * Returns the value of the '<em><b>Events</b></em>' reference list.
	 * The list contents are of type {@link rea.Event}.
	 * It is bidirectional and its opposite is '{@link rea.Event#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Events</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Events</em>' reference list.
	 * @see rea.reaPackage#getValuable_Events()
	 * @see rea.Event#getResource
	 * @model opposite="resource"
	 * @generated
	 */
	EList<Event> getEvents();

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
	 * @see rea.reaPackage#getValuable_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link rea.Valuable#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Compensation Related</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compensation Related</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compensation Related</em>' attribute.
	 * @see #setCompensationRelated(boolean)
	 * @see rea.reaPackage#getValuable_CompensationRelated()
	 * @model
	 * @generated
	 */
	boolean isCompensationRelated();

	/**
	 * Sets the value of the '{@link rea.Valuable#isCompensationRelated <em>Compensation Related</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compensation Related</em>' attribute.
	 * @see #isCompensationRelated()
	 * @generated
	 */
	void setCompensationRelated(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<RightTransfer> getRightTransfersHistory();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EList<RightTransfer> getRightTransfersHistory(Right right);

} // Valuable
