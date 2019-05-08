/**
 */
package rea.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import rea.Agent;
import rea.Right;
import rea.RightTransfer;
import rea.reaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Right Transfer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link rea.impl.RightTransferImpl#getRight <em>Right</em>}</li>
 *   <li>{@link rea.impl.RightTransferImpl#getNewOwner <em>New Owner</em>}</li>
 *   <li>{@link rea.impl.RightTransferImpl#getInitialOwner <em>Initial Owner</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RightTransferImpl extends EObjectImpl implements RightTransfer {
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
	 * The cached value of the '{@link #getNewOwner() <em>New Owner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewOwner()
	 * @generated
	 * @ordered
	 */
	protected Agent newOwner;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RightTransferImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return reaPackage.Literals.RIGHT_TRANSFER;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, reaPackage.RIGHT_TRANSFER__RIGHT, oldRight, right));
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
	public NotificationChain basicSetRight(Right newRight, NotificationChain msgs) {
		Right oldRight = right;
		right = newRight;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, reaPackage.RIGHT_TRANSFER__RIGHT, oldRight, newRight);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRight(Right newRight) {
		if (newRight != right) {
			NotificationChain msgs = null;
			if (right != null)
				msgs = ((InternalEObject)right).eInverseRemove(this, reaPackage.RIGHT__TRANSFERS, Right.class, msgs);
			if (newRight != null)
				msgs = ((InternalEObject)newRight).eInverseAdd(this, reaPackage.RIGHT__TRANSFERS, Right.class, msgs);
			msgs = basicSetRight(newRight, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, reaPackage.RIGHT_TRANSFER__RIGHT, newRight, newRight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Agent getNewOwner() {
		if (newOwner != null && newOwner.eIsProxy()) {
			InternalEObject oldNewOwner = (InternalEObject)newOwner;
			newOwner = (Agent)eResolveProxy(oldNewOwner);
			if (newOwner != oldNewOwner) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, reaPackage.RIGHT_TRANSFER__NEW_OWNER, oldNewOwner, newOwner));
			}
		}
		return newOwner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Agent basicGetNewOwner() {
		return newOwner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNewOwner(Agent newNewOwner) {
		Agent oldNewOwner = newOwner;
		newOwner = newNewOwner;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, reaPackage.RIGHT_TRANSFER__NEW_OWNER, oldNewOwner, newOwner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Agent getInitialOwner() {
		Agent initialOwner = basicGetInitialOwner();
		return initialOwner != null && initialOwner.eIsProxy() ? (Agent)eResolveProxy((InternalEObject)initialOwner) : initialOwner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Agent basicGetInitialOwner() {
		// TODO: implement this method to return the 'Initial Owner' reference
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
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case reaPackage.RIGHT_TRANSFER__RIGHT:
				if (right != null)
					msgs = ((InternalEObject)right).eInverseRemove(this, reaPackage.RIGHT__TRANSFERS, Right.class, msgs);
				return basicSetRight((Right)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case reaPackage.RIGHT_TRANSFER__RIGHT:
				return basicSetRight(null, msgs);
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
			case reaPackage.RIGHT_TRANSFER__RIGHT:
				if (resolve) return getRight();
				return basicGetRight();
			case reaPackage.RIGHT_TRANSFER__NEW_OWNER:
				if (resolve) return getNewOwner();
				return basicGetNewOwner();
			case reaPackage.RIGHT_TRANSFER__INITIAL_OWNER:
				if (resolve) return getInitialOwner();
				return basicGetInitialOwner();
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
			case reaPackage.RIGHT_TRANSFER__RIGHT:
				setRight((Right)newValue);
				return;
			case reaPackage.RIGHT_TRANSFER__NEW_OWNER:
				setNewOwner((Agent)newValue);
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
			case reaPackage.RIGHT_TRANSFER__RIGHT:
				setRight((Right)null);
				return;
			case reaPackage.RIGHT_TRANSFER__NEW_OWNER:
				setNewOwner((Agent)null);
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
			case reaPackage.RIGHT_TRANSFER__RIGHT:
				return right != null;
			case reaPackage.RIGHT_TRANSFER__NEW_OWNER:
				return newOwner != null;
			case reaPackage.RIGHT_TRANSFER__INITIAL_OWNER:
				return basicGetInitialOwner() != null;
		}
		return super.eIsSet(featureID);
	}

} //RightTransferImpl
