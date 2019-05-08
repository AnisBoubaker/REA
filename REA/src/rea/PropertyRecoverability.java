/**
 */
package rea;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Property Recoverability</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see rea.reaPackage#getPropertyRecoverability()
 * @model
 * @generated
 */
public enum PropertyRecoverability implements Enumerator {
	/**
	 * The '<em><b>Semi Recoverable</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SEMI_RECOVERABLE_VALUE
	 * @generated
	 * @ordered
	 */
	SEMI_RECOVERABLE(2, "SemiRecoverable", "SemiRecoverable"),

	/**
	 * The '<em><b>Non Recoverable</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NON_RECOVERABLE_VALUE
	 * @generated
	 * @ordered
	 */
	NON_RECOVERABLE(0, "NonRecoverable", "NonRecoverable"),

	/**
	 * The '<em><b>Fully Recoverable</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FULLY_RECOVERABLE_VALUE
	 * @generated
	 * @ordered
	 */
	FULLY_RECOVERABLE(1, "FullyRecoverable", "FullyRecoverable");

	/**
	 * The '<em><b>Semi Recoverable</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Semi Recoverable</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SEMI_RECOVERABLE
	 * @model name="SemiRecoverable"
	 * @generated
	 * @ordered
	 */
	public static final int SEMI_RECOVERABLE_VALUE = 2;

	/**
	 * The '<em><b>Non Recoverable</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Non Recoverable</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NON_RECOVERABLE
	 * @model name="NonRecoverable"
	 * @generated
	 * @ordered
	 */
	public static final int NON_RECOVERABLE_VALUE = 0;

	/**
	 * The '<em><b>Fully Recoverable</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Fully Recoverable</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FULLY_RECOVERABLE
	 * @model name="FullyRecoverable"
	 * @generated
	 * @ordered
	 */
	public static final int FULLY_RECOVERABLE_VALUE = 1;

	/**
	 * An array of all the '<em><b>Property Recoverability</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PropertyRecoverability[] VALUES_ARRAY =
		new PropertyRecoverability[] {
			SEMI_RECOVERABLE,
			NON_RECOVERABLE,
			FULLY_RECOVERABLE,
		};

	/**
	 * A public read-only list of all the '<em><b>Property Recoverability</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<PropertyRecoverability> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Property Recoverability</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PropertyRecoverability get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PropertyRecoverability result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Property Recoverability</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PropertyRecoverability getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PropertyRecoverability result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Property Recoverability</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PropertyRecoverability get(int value) {
		switch (value) {
			case SEMI_RECOVERABLE_VALUE: return SEMI_RECOVERABLE;
			case NON_RECOVERABLE_VALUE: return NON_RECOVERABLE;
			case FULLY_RECOVERABLE_VALUE: return FULLY_RECOVERABLE;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private PropertyRecoverability(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //PropertyRecoverability
