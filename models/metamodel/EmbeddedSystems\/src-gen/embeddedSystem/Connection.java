/**
 */
package embeddedSystem;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link embeddedSystem.Connection#getTarget <em>Target</em>}</li>
 *   <li>{@link embeddedSystem.Connection#getSrc <em>Src</em>}</li>
 * </ul>
 *
 * @see embeddedSystem.EmbeddedSystemPackage#getConnection()
 * @model
 * @generated
 */
public interface Connection extends EObject {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Pin)
	 * @see embeddedSystem.EmbeddedSystemPackage#getConnection_Target()
	 * @model
	 * @generated
	 */
	Pin getTarget();

	/**
	 * Sets the value of the '{@link embeddedSystem.Connection#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Pin value);

	/**
	 * Returns the value of the '<em><b>Src</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Src</em>' reference.
	 * @see #setSrc(Pin)
	 * @see embeddedSystem.EmbeddedSystemPackage#getConnection_Src()
	 * @model
	 * @generated
	 */
	Pin getSrc();

	/**
	 * Sets the value of the '{@link embeddedSystem.Connection#getSrc <em>Src</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Src</em>' reference.
	 * @see #getSrc()
	 * @generated
	 */
	void setSrc(Pin value);

} // Connection
