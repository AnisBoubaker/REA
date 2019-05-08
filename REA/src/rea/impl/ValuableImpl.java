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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import rea.Event;
import rea.Right;
import rea.RightTransfer;
import rea.Valuable;
import rea.reaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Valuable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link rea.impl.ValuableImpl#getRights <em>Rights</em>}</li>
 *   <li>{@link rea.impl.ValuableImpl#getEvents <em>Events</em>}</li>
 *   <li>{@link rea.impl.ValuableImpl#getName <em>Name</em>}</li>
 *   <li>{@link rea.impl.ValuableImpl#isCompensationRelated <em>Compensation Related</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ValuableImpl extends REAConceptImpl implements Valuable {
	/**
	 * The cached value of the '{@link #getRights() <em>Rights</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRights()
	 * @generated
	 * @ordered
	 */
	protected EList<Right> rights;

	/**
	 * The cached value of the '{@link #getEvents() <em>Events</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvents()
	 * @generated
	 * @ordered
	 */
	protected EList<Event> events;

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
	 * The default value of the '{@link #isCompensationRelated() <em>Compensation Related</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCompensationRelated()
	 * @generated
	 * @ordered
	 */
	protected static final boolean COMPENSATION_RELATED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCompensationRelated() <em>Compensation Related</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCompensationRelated()
	 * @generated
	 * @ordered
	 */
	protected boolean compensationRelated = COMPENSATION_RELATED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValuableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return reaPackage.Literals.VALUABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Right> getRights() {
		if (rights == null) {
			rights = new EObjectContainmentEList<Right>(Right.class, this, reaPackage.VALUABLE__RIGHTS);
		}
		return rights;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Event> getEvents() {
		if (events == null) {
			events = new EObjectWithInverseResolvingEList<Event>(Event.class, this, reaPackage.VALUABLE__EVENTS, reaPackage.EVENT__RESOURCE);
		}
		return events;
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
			eNotify(new ENotificationImpl(this, Notification.SET, reaPackage.VALUABLE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCompensationRelated() {
		return compensationRelated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompensationRelated(boolean newCompensationRelated) {
		boolean oldCompensationRelated = compensationRelated;
		compensationRelated = newCompensationRelated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, reaPackage.VALUABLE__COMPENSATION_RELATED, oldCompensationRelated, compensationRelated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RightTransfer> getRightTransfersHistory() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RightTransfer> getRightTransfersHistory(Right right) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
			case reaPackage.VALUABLE__EVENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEvents()).basicAdd(otherEnd, msgs);
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
			case reaPackage.VALUABLE__RIGHTS:
				return ((InternalEList<?>)getRights()).basicRemove(otherEnd, msgs);
			case reaPackage.VALUABLE__EVENTS:
				return ((InternalEList<?>)getEvents()).basicRemove(otherEnd, msgs);
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
			case reaPackage.VALUABLE__RIGHTS:
				return getRights();
			case reaPackage.VALUABLE__EVENTS:
				return getEvents();
			case reaPackage.VALUABLE__NAME:
				return getName();
			case reaPackage.VALUABLE__COMPENSATION_RELATED:
				return isCompensationRelated();
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
			case reaPackage.VALUABLE__RIGHTS:
				getRights().clear();
				getRights().addAll((Collection<? extends Right>)newValue);
				return;
			case reaPackage.VALUABLE__EVENTS:
				getEvents().clear();
				getEvents().addAll((Collection<? extends Event>)newValue);
				return;
			case reaPackage.VALUABLE__NAME:
				setName((String)newValue);
				return;
			case reaPackage.VALUABLE__COMPENSATION_RELATED:
				setCompensationRelated((Boolean)newValue);
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
			case reaPackage.VALUABLE__RIGHTS:
				getRights().clear();
				return;
			case reaPackage.VALUABLE__EVENTS:
				getEvents().clear();
				return;
			case reaPackage.VALUABLE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case reaPackage.VALUABLE__COMPENSATION_RELATED:
				setCompensationRelated(COMPENSATION_RELATED_EDEFAULT);
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
			case reaPackage.VALUABLE__RIGHTS:
				return rights != null && !rights.isEmpty();
			case reaPackage.VALUABLE__EVENTS:
				return events != null && !events.isEmpty();
			case reaPackage.VALUABLE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case reaPackage.VALUABLE__COMPENSATION_RELATED:
				return compensationRelated != COMPENSATION_RELATED_EDEFAULT;
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
		result.append(", compensationRelated: ");
		result.append(compensationRelated);
		result.append(')');
		return result.toString();
	}

} //ValuableImpl
