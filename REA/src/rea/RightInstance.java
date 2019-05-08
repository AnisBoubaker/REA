/**
 */
package rea;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Right Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link rea.RightInstance#getRight <em>Right</em>}</li>
 *   <li>{@link rea.RightInstance#getCurrentOwner <em>Current Owner</em>}</li>
 *   <li>{@link rea.RightInstance#getFirstOwner <em>First Owner</em>}</li>
 * </ul>
 * </p>
 *
 * @see rea.reaPackage#getRightInstance()
 * @model
 * @generated
 */
public interface RightInstance extends EObject {
	/**
	 * Returns the value of the '<em><b>Right</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right</em>' reference.
	 * @see #setRight(Right)
	 * @see rea.reaPackage#getRightInstance_Right()
	 * @model required="true"
	 * @generated
	 */
	Right getRight();

	/**
	 * Sets the value of the '{@link rea.RightInstance#getRight <em>Right</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right</em>' reference.
	 * @see #getRight()
	 * @generated
	 */
	void setRight(Right value);

	/**
	 * Returns the value of the '<em><b>Current Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current Owner</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Owner</em>' reference.
	 * @see rea.reaPackage#getRightInstance_CurrentOwner()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	Agent getCurrentOwner();

	/**
	 * Returns the value of the '<em><b>First Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First Owner</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Owner</em>' reference.
	 * @see rea.reaPackage#getRightInstance_FirstOwner()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	Agent getFirstOwner();

} // RightInstance
