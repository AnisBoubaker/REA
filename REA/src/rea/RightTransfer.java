/**
 */
package rea;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Right Transfer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link rea.RightTransfer#getRight <em>Right</em>}</li>
 *   <li>{@link rea.RightTransfer#getNewOwner <em>New Owner</em>}</li>
 *   <li>{@link rea.RightTransfer#getInitialOwner <em>Initial Owner</em>}</li>
 * </ul>
 * </p>
 *
 * @see rea.reaPackage#getRightTransfer()
 * @model
 * @generated
 */
public interface RightTransfer extends EObject {
	/**
	 * Returns the value of the '<em><b>Right</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link rea.Right#getTransfers <em>Transfers</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right</em>' reference.
	 * @see #setRight(Right)
	 * @see rea.reaPackage#getRightTransfer_Right()
	 * @see rea.Right#getTransfers
	 * @model opposite="transfers" required="true"
	 * @generated
	 */
	Right getRight();

	/**
	 * Sets the value of the '{@link rea.RightTransfer#getRight <em>Right</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right</em>' reference.
	 * @see #getRight()
	 * @generated
	 */
	void setRight(Right value);

	/**
	 * Returns the value of the '<em><b>New Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>New Owner</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Owner</em>' reference.
	 * @see #setNewOwner(Agent)
	 * @see rea.reaPackage#getRightTransfer_NewOwner()
	 * @model required="true"
	 * @generated
	 */
	Agent getNewOwner();

	/**
	 * Sets the value of the '{@link rea.RightTransfer#getNewOwner <em>New Owner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Owner</em>' reference.
	 * @see #getNewOwner()
	 * @generated
	 */
	void setNewOwner(Agent value);

	/**
	 * Returns the value of the '<em><b>Initial Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial Owner</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Owner</em>' reference.
	 * @see rea.reaPackage#getRightTransfer_InitialOwner()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	Agent getInitialOwner();

} // RightTransfer
