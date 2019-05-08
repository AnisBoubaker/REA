/**
 */
package rea;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>REA Concept Visitor</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see rea.reaPackage#getREAConceptVisitor()
 * @model abstract="true"
 * @generated
 */
public interface REAConceptVisitor extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void visit(REAConcept concept);

} // REAConceptVisitor
