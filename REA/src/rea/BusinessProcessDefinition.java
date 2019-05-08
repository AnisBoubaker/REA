/**
 */
package rea;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Business Process Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link rea.BusinessProcessDefinition#getREAProcesses <em>REA Processes</em>}</li>
 *   <li>{@link rea.BusinessProcessDefinition#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see rea.reaPackage#getBusinessProcessDefinition()
 * @model
 * @generated
 */
public interface BusinessProcessDefinition extends REAConcept {
	/**
	 * Returns the value of the '<em><b>REA Processes</b></em>' containment reference list.
	 * The list contents are of type {@link rea.REAProcess}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>REA Processes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>REA Processes</em>' containment reference list.
	 * @see rea.reaPackage#getBusinessProcessDefinition_REAProcesses()
	 * @model containment="true"
	 * @generated
	 */
	EList<REAProcess> getREAProcesses();

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
	 * @see rea.reaPackage#getBusinessProcessDefinition_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link rea.BusinessProcessDefinition#getName <em>Name</em>}' attribute.
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
	void sortREAProcesses();

} // BusinessProcessDefinition
