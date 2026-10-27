/**
 */
package embeddedSystem;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link embeddedSystem.SystemModel#getSystemstructure <em>Systemstructure</em>}</li>
 *   <li>{@link embeddedSystem.SystemModel#getSystembehavior <em>Systembehavior</em>}</li>
 * </ul>
 *
 * @see embeddedSystem.EmbeddedSystemPackage#getSystemModel()
 * @model
 * @generated
 */
public interface SystemModel extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Systemstructure</b></em>' containment reference list.
	 * The list contents are of type {@link embeddedSystem.SystemStructure}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Systemstructure</em>' containment reference list.
	 * @see embeddedSystem.EmbeddedSystemPackage#getSystemModel_Systemstructure()
	 * @model containment="true"
	 * @generated
	 */
	EList<SystemStructure> getSystemstructure();

	/**
	 * Returns the value of the '<em><b>Systembehavior</b></em>' containment reference list.
	 * The list contents are of type {@link embeddedSystem.SystemBehavior}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Systembehavior</em>' containment reference list.
	 * @see embeddedSystem.EmbeddedSystemPackage#getSystemModel_Systembehavior()
	 * @model containment="true"
	 * @generated
	 */
	EList<SystemBehavior> getSystembehavior();

} // SystemModel
