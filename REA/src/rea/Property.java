/**
 */
package rea;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link rea.Property#getName <em>Name</em>}</li>
 *   <li>{@link rea.Property#getInitialState <em>Initial State</em>}</li>
 *   <li>{@link rea.Property#getAlterations <em>Alterations</em>}</li>
 *   <li>{@link rea.Property#getDependsOn <em>Depends On</em>}</li>
 *   <li>{@link rea.Property#getDependees <em>Dependees</em>}</li>
 *   <li>{@link rea.Property#getRecoverable <em>Recoverable</em>}</li>
 *   <li>{@link rea.Property#isPrimaryProperty <em>Primary Property</em>}</li>
 *   <li>{@link rea.Property#getResource <em>Resource</em>}</li>
 * </ul>
 * </p>
 *
 * @see rea.reaPackage#getProperty()
 * @model
 * @generated
 */
public interface Property extends REAConcept {
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
	 * @see rea.reaPackage#getProperty_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link rea.Property#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Initial State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial State</em>' attribute.
	 * @see #setInitialState(String)
	 * @see rea.reaPackage#getProperty_InitialState()
	 * @model required="true"
	 * @generated
	 */
	String getInitialState();

	/**
	 * Sets the value of the '{@link rea.Property#getInitialState <em>Initial State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial State</em>' attribute.
	 * @see #getInitialState()
	 * @generated
	 */
	void setInitialState(String value);

	/**
	 * Returns the value of the '<em><b>Alterations</b></em>' reference list.
	 * The list contents are of type {@link rea.PropertyAlteration}.
	 * It is bidirectional and its opposite is '{@link rea.PropertyAlteration#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alterations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alterations</em>' reference list.
	 * @see rea.reaPackage#getProperty_Alterations()
	 * @see rea.PropertyAlteration#getProperty
	 * @model opposite="property"
	 * @generated
	 */
	EList<PropertyAlteration> getAlterations();

	/**
	 * Returns the value of the '<em><b>Depends On</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link rea.Property#getDependees <em>Dependees</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Depends On</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Depends On</em>' reference.
	 * @see #setDependsOn(Property)
	 * @see rea.reaPackage#getProperty_DependsOn()
	 * @see rea.Property#getDependees
	 * @model opposite="dependees"
	 * @generated
	 */
	Property getDependsOn();

	/**
	 * Sets the value of the '{@link rea.Property#getDependsOn <em>Depends On</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Depends On</em>' reference.
	 * @see #getDependsOn()
	 * @generated
	 */
	void setDependsOn(Property value);

	/**
	 * Returns the value of the '<em><b>Dependees</b></em>' reference list.
	 * The list contents are of type {@link rea.Property}.
	 * It is bidirectional and its opposite is '{@link rea.Property#getDependsOn <em>Depends On</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dependees</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependees</em>' reference list.
	 * @see rea.reaPackage#getProperty_Dependees()
	 * @see rea.Property#getDependsOn
	 * @model opposite="dependsOn" changeable="false"
	 * @generated
	 */
	EList<Property> getDependees();

	/**
	 * Returns the value of the '<em><b>Recoverable</b></em>' attribute.
	 * The literals are from the enumeration {@link rea.PropertyRecoverability}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Recoverable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recoverable</em>' attribute.
	 * @see rea.PropertyRecoverability
	 * @see #setRecoverable(PropertyRecoverability)
	 * @see rea.reaPackage#getProperty_Recoverable()
	 * @model
	 * @generated
	 */
	PropertyRecoverability getRecoverable();

	/**
	 * Sets the value of the '{@link rea.Property#getRecoverable <em>Recoverable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recoverable</em>' attribute.
	 * @see rea.PropertyRecoverability
	 * @see #getRecoverable()
	 * @generated
	 */
	void setRecoverable(PropertyRecoverability value);

	/**
	 * Returns the value of the '<em><b>Primary Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Primary Property</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primary Property</em>' attribute.
	 * @see #setPrimaryProperty(boolean)
	 * @see rea.reaPackage#getProperty_PrimaryProperty()
	 * @model
	 * @generated
	 */
	boolean isPrimaryProperty();

	/**
	 * Sets the value of the '{@link rea.Property#isPrimaryProperty <em>Primary Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primary Property</em>' attribute.
	 * @see #isPrimaryProperty()
	 * @generated
	 */
	void setPrimaryProperty(boolean value);

	/**
	 * Returns the value of the '<em><b>Resource</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link rea.Resource#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource</em>' container reference.
	 * @see #setResource(Resource)
	 * @see rea.reaPackage#getProperty_Resource()
	 * @see rea.Resource#getProperties
	 * @model opposite="properties" required="true" transient="false"
	 * @generated
	 */
	Resource getResource();

	/**
	 * Sets the value of the '{@link rea.Property#getResource <em>Resource</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource</em>' container reference.
	 * @see #getResource()
	 * @generated
	 */
	void setResource(Resource value);

} // Property
