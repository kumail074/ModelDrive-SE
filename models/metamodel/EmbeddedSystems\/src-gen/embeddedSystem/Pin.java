/**
 */
package embeddedSystem;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pin</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link embeddedSystem.Pin#getPinNr <em>Pin Nr</em>}</li>
 *   <li>{@link embeddedSystem.Pin#getName <em>Name</em>}</li>
 *   <li>{@link embeddedSystem.Pin#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see embeddedSystem.EmbeddedSystemPackage#getPin()
 * @model
 * @generated
 */
public interface Pin extends EObject {
	/**
	 * Returns the value of the '<em><b>Pin Nr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pin Nr</em>' attribute.
	 * @see #setPinNr(int)
	 * @see embeddedSystem.EmbeddedSystemPackage#getPin_PinNr()
	 * @model
	 * @generated
	 */
	int getPinNr();

	/**
	 * Sets the value of the '{@link embeddedSystem.Pin#getPinNr <em>Pin Nr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pin Nr</em>' attribute.
	 * @see #getPinNr()
	 * @generated
	 */
	void setPinNr(int value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see embeddedSystem.EmbeddedSystemPackage#getPin_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link embeddedSystem.Pin#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link embeddedSystem.PinType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see embeddedSystem.PinType
	 * @see #setType(PinType)
	 * @see embeddedSystem.EmbeddedSystemPackage#getPin_Type()
	 * @model
	 * @generated
	 */
	PinType getType();

	/**
	 * Sets the value of the '{@link embeddedSystem.Pin#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see embeddedSystem.PinType
	 * @see #getType()
	 * @generated
	 */
	void setType(PinType value);

} // Pin
