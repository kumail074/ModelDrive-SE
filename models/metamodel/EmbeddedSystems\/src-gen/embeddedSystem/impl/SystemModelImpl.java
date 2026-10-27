/**
 */
package embeddedSystem.impl;

import embeddedSystem.EmbeddedSystemPackage;
import embeddedSystem.SystemBehavior;
import embeddedSystem.SystemModel;
import embeddedSystem.SystemStructure;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link embeddedSystem.impl.SystemModelImpl#getSystemstructure <em>Systemstructure</em>}</li>
 *   <li>{@link embeddedSystem.impl.SystemModelImpl#getSystembehavior <em>Systembehavior</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SystemModelImpl extends NamedElementImpl implements SystemModel {
	/**
	 * The cached value of the '{@link #getSystemstructure() <em>Systemstructure</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemstructure()
	 * @generated
	 * @ordered
	 */
	protected EList<SystemStructure> systemstructure;

	/**
	 * The cached value of the '{@link #getSystembehavior() <em>Systembehavior</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystembehavior()
	 * @generated
	 * @ordered
	 */
	protected EList<SystemBehavior> systembehavior;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmbeddedSystemPackage.Literals.SYSTEM_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SystemStructure> getSystemstructure() {
		if (systemstructure == null) {
			systemstructure = new EObjectContainmentEList<SystemStructure>(SystemStructure.class, this,
					EmbeddedSystemPackage.SYSTEM_MODEL__SYSTEMSTRUCTURE);
		}
		return systemstructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SystemBehavior> getSystembehavior() {
		if (systembehavior == null) {
			systembehavior = new EObjectContainmentEList<SystemBehavior>(SystemBehavior.class, this,
					EmbeddedSystemPackage.SYSTEM_MODEL__SYSTEMBEHAVIOR);
		}
		return systembehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case EmbeddedSystemPackage.SYSTEM_MODEL__SYSTEMSTRUCTURE:
			return ((InternalEList<?>) getSystemstructure()).basicRemove(otherEnd, msgs);
		case EmbeddedSystemPackage.SYSTEM_MODEL__SYSTEMBEHAVIOR:
			return ((InternalEList<?>) getSystembehavior()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case EmbeddedSystemPackage.SYSTEM_MODEL__SYSTEMSTRUCTURE:
			return getSystemstructure();
		case EmbeddedSystemPackage.SYSTEM_MODEL__SYSTEMBEHAVIOR:
			return getSystembehavior();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case EmbeddedSystemPackage.SYSTEM_MODEL__SYSTEMSTRUCTURE:
			getSystemstructure().clear();
			getSystemstructure().addAll((Collection<? extends SystemStructure>) newValue);
			return;
		case EmbeddedSystemPackage.SYSTEM_MODEL__SYSTEMBEHAVIOR:
			getSystembehavior().clear();
			getSystembehavior().addAll((Collection<? extends SystemBehavior>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case EmbeddedSystemPackage.SYSTEM_MODEL__SYSTEMSTRUCTURE:
			getSystemstructure().clear();
			return;
		case EmbeddedSystemPackage.SYSTEM_MODEL__SYSTEMBEHAVIOR:
			getSystembehavior().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case EmbeddedSystemPackage.SYSTEM_MODEL__SYSTEMSTRUCTURE:
			return systemstructure != null && !systemstructure.isEmpty();
		case EmbeddedSystemPackage.SYSTEM_MODEL__SYSTEMBEHAVIOR:
			return systembehavior != null && !systembehavior.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SystemModelImpl
