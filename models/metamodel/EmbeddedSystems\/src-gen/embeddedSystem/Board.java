/**
 */
package embeddedSystem;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Board</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link embeddedSystem.Board#getPingroup <em>Pingroup</em>}</li>
 * </ul>
 *
 * @see embeddedSystem.EmbeddedSystemPackage#getBoard()
 * @model
 * @generated
 */
public interface Board extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Pingroup</b></em>' containment reference list.
	 * The list contents are of type {@link embeddedSystem.PinGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pingroup</em>' containment reference list.
	 * @see embeddedSystem.EmbeddedSystemPackage#getBoard_Pingroup()
	 * @model containment="true"
	 * @generated
	 */
	EList<PinGroup> getPingroup();

} // Board
