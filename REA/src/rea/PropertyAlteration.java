/**
 */
package rea;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property Alteration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link rea.PropertyAlteration#getNewState <em>New State</em>}</li>
 *   <li>{@link rea.PropertyAlteration#getProperty <em>Property</em>}</li>
 *   <li>{@link rea.PropertyAlteration#getInitialState <em>Initial State</em>}</li>
 * </ul>
 * </p>
 *
 * @see rea.reaPackage#getPropertyAlteration()
 * @model
 * @generated
 */
public interface PropertyAlteration extends EObject {
	/**
	 * Returns the value of the '<em><b>New State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>New State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New State</em>' attribute.
	 * @see #setNewState(String)
	 * @see rea.reaPackage#getPropertyAlteration_NewState()
	 * @model
	 * @generated
	 */
	String getNewState();

	/**
	 * Sets the value of the '{@link rea.PropertyAlteration#getNewState <em>New State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New State</em>' attribute.
	 * @see #getNewState()
	 * @generated
	 */
	void setNewState(String value);

	/**
	 * Returns the value of the '<em><b>Property</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link rea.Property#getAlterations <em>Alterations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property</em>' reference.
	 * @see #setProperty(Property)
	 * @see rea.reaPackage#getPropertyAlteration_Property()
	 * @see rea.Property#getAlterations
	 * @model opposite="alterations" required="true"
	 * @generated
	 */
	Property getProperty();

	/**
	 * Sets the value of the '{@link rea.PropertyAlteration#getProperty <em>Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property</em>' reference.
	 * @see #getProperty()
	 * @generated
	 */
	void setProperty(Property value);

	/**
	 * Returns the value of the '<em><b>Initial State</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial State</em>' attribute.
	 * @see rea.reaPackage#getPropertyAlteration_InitialState()
	 * @model default="" unique="false" required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getInitialState();

} // PropertyAlteration
