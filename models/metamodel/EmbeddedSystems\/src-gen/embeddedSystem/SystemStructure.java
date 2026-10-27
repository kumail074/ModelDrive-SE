/**
 */
package embeddedSystem;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System Structure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link embeddedSystem.SystemStructure#getBoard <em>Board</em>}</li>
 *   <li>{@link embeddedSystem.SystemStructure#getComponent <em>Component</em>}</li>
 *   <li>{@link embeddedSystem.SystemStructure#getConnection <em>Connection</em>}</li>
 * </ul>
 *
 * @see embeddedSystem.EmbeddedSystemPackage#getSystemStructure()
 * @model
 * @generated
 */
public interface SystemStructure extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Board</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Board</em>' containment reference.
	 * @see #setBoard(Board)
	 * @see embeddedSystem.EmbeddedSystemPackage#getSystemStructure_Board()
	 * @model containment="true"
	 * @generated
	 */
	Board getBoard();

	/**
	 * Sets the value of the '{@link embeddedSystem.SystemStructure#getBoard <em>Board</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Board</em>' containment reference.
	 * @see #getBoard()
	 * @generated
	 */
	void setBoard(Board value);

	/**
	 * Returns the value of the '<em><b>Component</b></em>' containment reference list.
	 * The list contents are of type {@link embeddedSystem.Component}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component</em>' containment reference list.
	 * @see embeddedSystem.EmbeddedSystemPackage#getSystemStructure_Component()
	 * @model containment="true"
	 * @generated
	 */
	EList<Component> getComponent();

	/**
	 * Returns the value of the '<em><b>Connection</b></em>' containment reference list.
	 * The list contents are of type {@link embeddedSystem.Connection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connection</em>' containment reference list.
	 * @see embeddedSystem.EmbeddedSystemPackage#getSystemStructure_Connection()
	 * @model containment="true"
	 * @generated
	 */
	EList<Connection> getConnection();

} // SystemStructure
