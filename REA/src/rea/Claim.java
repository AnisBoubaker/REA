/**
 */
package rea;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Claim</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link rea.Claim#getClaimForProperty <em>Claim For Property</em>}</li>
 *   <li>{@link rea.Claim#getClaimForResource <em>Claim For Resource</em>}</li>
 * </ul>
 * </p>
 *
 * @see rea.reaPackage#getClaim()
 * @model
 * @generated
 */
public interface Claim extends Valuable {
	/**
	 * Returns the value of the '<em><b>Claim For Property</b></em>' reference list.
	 * The list contents are of type {@link rea.Property}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Claim For Property</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Claim For Property</em>' reference list.
	 * @see rea.reaPackage#getClaim_ClaimForProperty()
	 * @model
	 * @generated
	 */
	EList<Property> getClaimForProperty();

	/**
	 * Returns the value of the '<em><b>Claim For Resource</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link rea.Resource#getClaims <em>Claims</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Claim For Resource</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Claim For Resource</em>' reference.
	 * @see #setClaimForResource(Resource)
	 * @see rea.reaPackage#getClaim_ClaimForResource()
	 * @see rea.Resource#getClaims
	 * @model opposite="claims" required="true"
	 * @generated
	 */
	Resource getClaimForResource();

	/**
	 * Sets the value of the '{@link rea.Claim#getClaimForResource <em>Claim For Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Claim For Resource</em>' reference.
	 * @see #getClaimForResource()
	 * @generated
	 */
	void setClaimForResource(Resource value);

} // Claim
