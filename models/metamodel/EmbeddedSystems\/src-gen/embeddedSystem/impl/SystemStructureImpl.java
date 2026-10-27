/**
 */
package embeddedSystem.impl;

import embeddedSystem.Board;
import embeddedSystem.Component;
import embeddedSystem.Connection;
import embeddedSystem.EmbeddedSystemPackage;
import embeddedSystem.SystemStructure;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System Structure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link embeddedSystem.impl.SystemStructureImpl#getBoard <em>Board</em>}</li>
 *   <li>{@link embeddedSystem.impl.SystemStructureImpl#getComponent <em>Component</em>}</li>
 *   <li>{@link embeddedSystem.impl.SystemStructureImpl#getConnection <em>Connection</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SystemStructureImpl extends NamedElementImpl implements SystemStructure {
	/**
	 * The cached value of the '{@link #getBoard() <em>Board</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoard()
	 * @generated
	 * @ordered
	 */
	protected Board board;

	/**
	 * The cached value of the '{@link #getComponent() <em>Component</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponent()
	 * @generated
	 * @ordered
	 */
	protected EList<Component> component;

	/**
	 * The cached value of the '{@link #getConnection() <em>Connection</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnection()
	 * @generated
	 * @ordered
	 */
	protected EList<Connection> connection;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemStructureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmbeddedSystemPackage.Literals.SYSTEM_STRUCTURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Board getBoard() {
		return board;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBoard(Board newBoard, NotificationChain msgs) {
		Board oldBoard = board;
		board = newBoard;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					EmbeddedSystemPackage.SYSTEM_STRUCTURE__BOARD, oldBoard, newBoard);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBoard(Board newBoard) {
		if (newBoard != board) {
			NotificationChain msgs = null;
			if (board != null)
				msgs = ((InternalEObject) board).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - EmbeddedSystemPackage.SYSTEM_STRUCTURE__BOARD, null, msgs);
			if (newBoard != null)
				msgs = ((InternalEObject) newBoard).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - EmbeddedSystemPackage.SYSTEM_STRUCTURE__BOARD, null, msgs);
			msgs = basicSetBoard(newBoard, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmbeddedSystemPackage.SYSTEM_STRUCTURE__BOARD,
					newBoard, newBoard));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Component> getComponent() {
		if (component == null) {
			component = new EObjectContainmentEList<Component>(Component.class, this,
					EmbeddedSystemPackage.SYSTEM_STRUCTURE__COMPONENT);
		}
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Connection> getConnection() {
		if (connection == null) {
			connection = new EObjectContainmentEList<Connection>(Connection.class, this,
					EmbeddedSystemPackage.SYSTEM_STRUCTURE__CONNECTION);
		}
		return connection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case EmbeddedSystemPackage.SYSTEM_STRUCTURE__BOARD:
			return basicSetBoard(null, msgs);
		case EmbeddedSystemPackage.SYSTEM_STRUCTURE__COMPONENT:
			return ((InternalEList<?>) getComponent()).basicRemove(otherEnd, msgs);
		case EmbeddedSystemPackage.SYSTEM_STRUCTURE__CONNECTION:
			return ((InternalEList<?>) getConnection()).basicRemove(otherEnd, msgs);
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
		case EmbeddedSystemPackage.SYSTEM_STRUCTURE__BOARD:
			return getBoard();
		case EmbeddedSystemPackage.SYSTEM_STRUCTURE__COMPONENT:
			return getComponent();
		case EmbeddedSystemPackage.SYSTEM_STRUCTURE__CONNECTION:
			return getConnection();
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
		case EmbeddedSystemPackage.SYSTEM_STRUCTURE__BOARD:
			setBoard((Board) newValue);
			return;
		case EmbeddedSystemPackage.SYSTEM_STRUCTURE__COMPONENT:
			getComponent().clear();
			getComponent().addAll((Collection<? extends Component>) newValue);
			return;
		case EmbeddedSystemPackage.SYSTEM_STRUCTURE__CONNECTION:
			getConnection().clear();
			getConnection().addAll((Collection<? extends Connection>) newValue);
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
		case EmbeddedSystemPackage.SYSTEM_STRUCTURE__BOARD:
			setBoard((Board) null);
			return;
		case EmbeddedSystemPackage.SYSTEM_STRUCTURE__COMPONENT:
			getComponent().clear();
			return;
		case EmbeddedSystemPackage.SYSTEM_STRUCTURE__CONNECTION:
			getConnection().clear();
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
		case EmbeddedSystemPackage.SYSTEM_STRUCTURE__BOARD:
			return board != null;
		case EmbeddedSystemPackage.SYSTEM_STRUCTURE__COMPONENT:
			return component != null && !component.isEmpty();
		case EmbeddedSystemPackage.SYSTEM_STRUCTURE__CONNECTION:
			return connection != null && !connection.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SystemStructureImpl
