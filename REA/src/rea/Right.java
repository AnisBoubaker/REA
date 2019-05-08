/**
 */
package rea;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Right</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link rea.Right#getName <em>Name</em>}</li>
 *   <li>{@link rea.Right#getFirstOwner <em>First Owner</em>}</li>
 *   <li>{@link rea.Right#getCurrentOwner <em>Current Owner</em>}</li>
 *   <li>{@link rea.Right#getTransfers <em>Transfers</em>}</li>
 * </ul>
 * </p>
 *
 * @see rea.reaPackage#getRight()
 * @model
 * @generated
 */
public interface Right extends REAConcept {
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
	 * @see rea.reaPackage#getRight_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link rea.Right#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>First Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First Owner</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Owner</em>' reference.
	 * @see #setFirstOwner(Agent)
	 * @see rea.reaPackage#getRight_FirstOwner()
	 * @model required="true"
	 * @generated
	 */
	Agent getFirstOwner();

	/**
	 * Sets the value of the '{@link rea.Right#getFirstOwner <em>First Owner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Owner</em>' reference.
	 * @see #getFirstOwner()
	 * @generated
	 */
	void setFirstOwner(Agent value);

	/**
	 * Returns the value of the '<em><b>Current Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current Owner</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Owner</em>' reference.
	 * @see rea.reaPackage#getRight_CurrentOwner()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	Agent getCurrentOwner();

	/**
	 * Returns the value of the '<em><b>Transfers</b></em>' reference list.
	 * The list contents are of type {@link rea.RightTransfer}.
	 * It is bidirectional and its opposite is '{@link rea.RightTransfer#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transfers</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transfers</em>' reference list.
	 * @see rea.reaPackage#getRight_Transfers()
	 * @see rea.RightTransfer#getRight
	 * @model opposite="right"
	 * @generated
	 */
	EList<RightTransfer> getTransfers();

} // Right
