/**
 */
package rea;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link rea.Resource#getProperties <em>Properties</em>}</li>
 *   <li>{@link rea.Resource#getClaims <em>Claims</em>}</li>
 * </ul>
 * </p>
 *
 * @see rea.reaPackage#getResource()
 * @model
 * @generated
 */
public interface Resource extends Valuable {
	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
	 * The list contents are of type {@link rea.Property}.
	 * It is bidirectional and its opposite is '{@link rea.Property#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Properties</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference list.
	 * @see rea.reaPackage#getResource_Properties()
	 * @see rea.Property#getResource
	 * @model opposite="resource" containment="true"
	 * @generated
	 */
	EList<Property> getProperties();

	/**
	 * Returns the value of the '<em><b>Claims</b></em>' reference list.
	 * The list contents are of type {@link rea.Claim}.
	 * It is bidirectional and its opposite is '{@link rea.Claim#getClaimForResource <em>Claim For Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Claims</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Claims</em>' reference list.
	 * @see rea.reaPackage#getResource_Claims()
	 * @see rea.Claim#getClaimForResource
	 * @model opposite="claimForResource"
	 * @generated
	 */
	EList<Claim> getClaims();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<PropertyAlteration> getAlterationsHistory();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EList<PropertyAlteration> getAlterationsHistory(Property p);

} // Resource
