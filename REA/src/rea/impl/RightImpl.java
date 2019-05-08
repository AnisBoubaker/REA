/**
 */
package rea.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import rea.Agent;
import rea.Right;
import rea.RightTransfer;
import rea.reaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Right</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link rea.impl.RightImpl#getName <em>Name</em>}</li>
 *   <li>{@link rea.impl.RightImpl#getFirstOwner <em>First Owner</em>}</li>
 *   <li>{@link rea.impl.RightImpl#getCurrentOwner <em>Current Owner</em>}</li>
 *   <li>{@link rea.impl.RightImpl#getTransfers <em>Transfers</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RightImpl extends REAConceptImpl implements Right {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFirstOwner() <em>First Owner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstOwner()
	 * @generated
	 * @ordered
	 */
	protected Agent firstOwner;

	/**
	 * The cached value of the '{@link #getTransfers() <em>Transfers</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransfers()
	 * @generated
	 * @ordered
	 */
	protected EList<RightTransfer> transfers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RightImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return reaPackage.Literals.RIGHT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, reaPackage.RIGHT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Agent getFirstOwner() {
		if (firstOwner != null && firstOwner.eIsProxy()) {
			InternalEObject oldFirstOwner = (InternalEObject)firstOwner;
			firstOwner = (Agent)eResolveProxy(oldFirstOwner);
			if (firstOwner != oldFirstOwner) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, reaPackage.RIGHT__FIRST_OWNER, oldFirstOwner, firstOwner));
			}
		}
		return firstOwner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Agent basicGetFirstOwner() {
		return firstOwner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirstOwner(Agent newFirstOwner) {
		Agent oldFirstOwner = firstOwner;
		firstOwner = newFirstOwner;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, reaPackage.RIGHT__FIRST_OWNER, oldFirstOwner, firstOwner));
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
	public EList<RightTransfer> getTransfers() {
		if (transfers == null) {
			transfers = new EObjectWithInverseResolvingEList<RightTransfer>(RightTransfer.class, this, reaPackage.RIGHT__TRANSFERS, reaPackage.RIGHT_TRANSFER__RIGHT);
		}
		return transfers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case reaPackage.RIGHT__TRANSFERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTransfers()).basicAdd(otherEnd, msgs);
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
			case reaPackage.RIGHT__TRANSFERS:
				return ((InternalEList<?>)getTransfers()).basicRemove(otherEnd, msgs);
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
			case reaPackage.RIGHT__NAME:
				return getName();
			case reaPackage.RIGHT__FIRST_OWNER:
				if (resolve) return getFirstOwner();
				return basicGetFirstOwner();
			case reaPackage.RIGHT__CURRENT_OWNER:
				if (resolve) return getCurrentOwner();
				return basicGetCurrentOwner();
			case reaPackage.RIGHT__TRANSFERS:
				return getTransfers();
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
			case reaPackage.RIGHT__NAME:
				setName((String)newValue);
				return;
			case reaPackage.RIGHT__FIRST_OWNER:
				setFirstOwner((Agent)newValue);
				return;
			case reaPackage.RIGHT__TRANSFERS:
				getTransfers().clear();
				getTransfers().addAll((Collection<? extends RightTransfer>)newValue);
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
			case reaPackage.RIGHT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case reaPackage.RIGHT__FIRST_OWNER:
				setFirstOwner((Agent)null);
				return;
			case reaPackage.RIGHT__TRANSFERS:
				getTransfers().clear();
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
			case reaPackage.RIGHT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case reaPackage.RIGHT__FIRST_OWNER:
				return firstOwner != null;
			case reaPackage.RIGHT__CURRENT_OWNER:
				return basicGetCurrentOwner() != null;
			case reaPackage.RIGHT__TRANSFERS:
				return transfers != null && !transfers.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //RightImpl
