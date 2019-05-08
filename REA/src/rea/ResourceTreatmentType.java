/**
 */
package rea;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Resource Treatment Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see rea.reaPackage#getResourceTreatmentType()
 * @model
 * @generated
 */
public enum ResourceTreatmentType implements Enumerator {
	/**
	 * The '<em><b>Right Transfer</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RIGHT_TRANSFER_VALUE
	 * @generated
	 * @ordered
	 */
	RIGHT_TRANSFER(0, "RightTransfer", "RightTransfer"),

	/**
	 * The '<em><b>Property Alteration</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROPERTY_ALTERATION_VALUE
	 * @generated
	 * @ordered
	 */
	PROPERTY_ALTERATION(1, "PropertyAlteration", "PropertyAlteration"),

	/**
	 * The '<em><b>Consumption</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONSUMPTION_VALUE
	 * @generated
	 * @ordered
	 */
	CONSUMPTION(2, "Consumption", "Consumption");

	/**
	 * The '<em><b>Right Transfer</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Right Transfer</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RIGHT_TRANSFER
	 * @model name="RightTransfer"
	 * @generated
	 * @ordered
	 */
	public static final int RIGHT_TRANSFER_VALUE = 0;

	/**
	 * The '<em><b>Property Alteration</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Property Alteration</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PROPERTY_ALTERATION
	 * @model name="PropertyAlteration"
	 * @generated
	 * @ordered
	 */
	public static final int PROPERTY_ALTERATION_VALUE = 1;

	/**
	 * The '<em><b>Consumption</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Consumption</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONSUMPTION
	 * @model name="Consumption"
	 * @generated
	 * @ordered
	 */
	public static final int CONSUMPTION_VALUE = 2;

	/**
	 * An array of all the '<em><b>Resource Treatment Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ResourceTreatmentType[] VALUES_ARRAY =
		new ResourceTreatmentType[] {
			RIGHT_TRANSFER,
			PROPERTY_ALTERATION,
			CONSUMPTION,
		};

	/**
	 * A public read-only list of all the '<em><b>Resource Treatment Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ResourceTreatmentType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Resource Treatment Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ResourceTreatmentType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ResourceTreatmentType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Resource Treatment Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ResourceTreatmentType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ResourceTreatmentType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Resource Treatment Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ResourceTreatmentType get(int value) {
		switch (value) {
			case RIGHT_TRANSFER_VALUE: return RIGHT_TRANSFER;
			case PROPERTY_ALTERATION_VALUE: return PROPERTY_ALTERATION;
			case CONSUMPTION_VALUE: return CONSUMPTION;
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
	private ResourceTreatmentType(int value, String name, String literal) {
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
	
} //ResourceTreatmentType
