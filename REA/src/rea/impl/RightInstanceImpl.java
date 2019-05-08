/**
 */
package rea.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import rea.Agent;
import rea.Right;
import rea.RightInstance;
import rea.reaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Right Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link rea.impl.RightInstanceImpl#getRight <em>Right</em>}</li>
 *   <li>{@link rea.impl.RightInstanceImpl#getCurrentOwner <em>Current Owner</em>}</li>
 *   <li>{@link rea.impl.RightInstanceImpl#getFirstOwner <em>First Owner</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RightInstanceImpl extends EObjectImpl implements RightInstance {
	/**
	 * The cached value of the '{@link #getRight() <em>Right</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRight()
	 * @generated
	 * @ordered
	 */
	protected Right right;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RightInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return reaPackage.Literals.RIGHT_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Right getRight() {
		if (right != null && right.eIsProxy()) {
			InternalEObject oldRight = (InternalEObject)right;
			right = (Right)eResolveProxy(oldRight);
			if (right != oldRight) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, reaPackage.RIGHT_INSTANCE__RIGHT, oldRight, right));
			}
		}
		return right;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Right basicGetRight() {
		return right;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRight(Right newRight) {
		Right oldRight = right;
		right = newRight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, reaPackage.RIGHT_INSTANCE__RIGHT, oldRight, right));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Agent getCurrentOwner() {
		Agent currentOwner = basicGetCurrentOwner();
		return currentOwner != null && currentOwner.eIsProxy() ? (Agent)eResolveProxy((InternalEObject)currentOwner) : currentOwner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Agent basicGetCurrentOwner() {
		// TODO: implement this method to return the 'Current Owner' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Agent getFirstOwner() {
		Agent firstOwner = basicGetFirstOwner();
		return firstOwner != null && firstOwner.eIsProxy() ? (Agent)eResolveProxy((InternalEObject)firstOwner) : firstOwner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Agent basicGetFirstOwner() {
		// TODO: implement this method to return the 'First Owner' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case reaPackage.RIGHT_INSTANCE__RIGHT:
				if (resolve) return getRight();
				return basicGetRight();
			case reaPackage.RIGHT_INSTANCE__CURRENT_OWNER:
				if (resolve) return getCurrentOwner();
				return basicGetCurrentOwner();
			case reaPackage.RIGHT_INSTANCE__FIRST_OWNER:
				if (resolve) return getFirstOwner();
				return basicGetFirstOwner();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case reaPackage.RIGHT_INSTANCE__RIGHT:
				setRight((Right)newValue);
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
			case reaPackage.RIGHT_INSTANCE__RIGHT:
				setRight((Right)null);
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
			case reaPackage.RIGHT_INSTANCE__RIGHT:
				return right != null;
			case reaPackage.RIGHT_INSTANCE__CURRENT_OWNER:
				return basicGetCurrentOwner() != null;
			case reaPackage.RIGHT_INSTANCE__FIRST_OWNER:
				return basicGetFirstOwner() != null;
		}
		return super.eIsSet(featureID);
	}

} //RightInstanceImpl
