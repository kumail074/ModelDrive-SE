/**
 */
package embeddedSystem;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Component Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see embeddedSystem.EmbeddedSystemPackage#getComponentType()
 * @model
 * @generated
 */
public enum ComponentType implements Enumerator {
	/**
	 * The '<em><b>DIGITAL SENSOR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DIGITAL_SENSOR_VALUE
	 * @generated
	 * @ordered
	 */
	DIGITAL_SENSOR(0, "DIGITAL_SENSOR", "DIGITAL_SENSOR"),

	/**
	 * The '<em><b>ANALOG SENSOR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANALOG_SENSOR_VALUE
	 * @generated
	 * @ordered
	 */
	ANALOG_SENSOR(1, "ANALOG_SENSOR", "ANALOG_SENSOR"),

	/**
	 * The '<em><b>DIGITAL ACTOR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DIGITAL_ACTOR_VALUE
	 * @generated
	 * @ordered
	 */
	DIGITAL_ACTOR(2, "DIGITAL_ACTOR", "DIGITAL_ACTOR"),

	/**
	 * The '<em><b>ANALOG ACTOR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANALOG_ACTOR_VALUE
	 * @generated
	 * @ordered
	 */
	ANALOG_ACTOR(3, "ANALOG_ACTOR", "ANALOG_ACTOR");

	/**
	 * The '<em><b>DIGITAL SENSOR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DIGITAL_SENSOR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DIGITAL_SENSOR_VALUE = 0;

	/**
	 * The '<em><b>ANALOG SENSOR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANALOG_SENSOR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ANALOG_SENSOR_VALUE = 1;

	/**
	 * The '<em><b>DIGITAL ACTOR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DIGITAL_ACTOR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DIGITAL_ACTOR_VALUE = 2;

	/**
	 * The '<em><b>ANALOG ACTOR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANALOG_ACTOR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ANALOG_ACTOR_VALUE = 3;

	/**
	 * An array of all the '<em><b>Component Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ComponentType[] VALUES_ARRAY = new ComponentType[] { DIGITAL_SENSOR, ANALOG_SENSOR,
			DIGITAL_ACTOR, ANALOG_ACTOR, };

	/**
	 * A public read-only list of all the '<em><b>Component Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ComponentType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Component Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ComponentType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ComponentType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Component Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ComponentType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ComponentType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Component Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ComponentType get(int value) {
		switch (value) {
		case DIGITAL_SENSOR_VALUE:
			return DIGITAL_SENSOR;
		case ANALOG_SENSOR_VALUE:
			return ANALOG_SENSOR;
		case DIGITAL_ACTOR_VALUE:
			return DIGITAL_ACTOR;
		case ANALOG_ACTOR_VALUE:
			return ANALOG_ACTOR;
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
	private ComponentType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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

} //ComponentType
