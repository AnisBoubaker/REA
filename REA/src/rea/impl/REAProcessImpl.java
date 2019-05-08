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
import rea.REAProcess;
import rea.Valuable;
import rea.reaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>REA Process</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link rea.impl.REAProcessImpl#getIncrementEvt <em>Increment Evt</em>}</li>
 *   <li>{@link rea.impl.REAProcessImpl#getDecrementEvt <em>Decrement Evt</em>}</li>
 *   <li>{@link rea.impl.REAProcessImpl#getInflowRes <em>Inflow Res</em>}</li>
 *   <li>{@link rea.impl.REAProcessImpl#getOutflowRes <em>Outflow Res</em>}</li>
 *   <li>{@link rea.impl.REAProcessImpl#getPredecessors <em>Predecessors</em>}</li>
 *   <li>{@link rea.impl.REAProcessImpl#getID <em>ID</em>}</li>
 *   <li>{@link rea.impl.REAProcessImpl#getSuccessors <em>Successors</em>}</li>
 *   <li>{@link rea.impl.REAProcessImpl#getCompensatedBy <em>Compensated By</em>}</li>
 *   <li>{@link rea.impl.REAProcessImpl#getCompensationFor <em>Compensation For</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class REAProcessImpl extends REAConceptImpl implements REAProcess {
	/**
	 * The cached value of the '{@link #getIncrementEvt() <em>Increment Evt</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncrementEvt()
	 * @generated
	 * @ordered
	 */
	protected EList<Event> incrementEvt;

	/**
	 * The cached value of the '{@link #getDecrementEvt() <em>Decrement Evt</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecrementEvt()
	 * @generated
	 * @ordered
	 */
	protected EList<Event> decrementEvt;

	/**
	 * The cached value of the '{@link #getPredecessors() <em>Predecessors</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPredecessors()
	 * @generated
	 * @ordered
	 */
	protected EList<REAProcess> predecessors;

	/**
	 * The default value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected String iD = ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSuccessors() <em>Successors</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuccessors()
	 * @generated
	 * @ordered
	 */
	protected EList<REAProcess> successors;

	/**
	 * The cached value of the '{@link #getCompensatedBy() <em>Compensated By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompensatedBy()
	 * @generated
	 * @ordered
	 */
	protected REAProcess compensatedBy;

	/**
	 * The cached value of the '{@link #getCompensationFor() <em>Compensation For</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompensationFor()
	 * @generated
	 * @ordered
	 */
	protected REAProcess compensationFor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected REAProcessImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return reaPackage.Literals.REA_PROCESS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Event> getIncrementEvt() {
		if (incrementEvt == null) {
			incrementEvt = new EObjectContainmentEList<Event>(Event.class, this, reaPackage.REA_PROCESS__INCREMENT_EVT);
		}
		return incrementEvt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Event> getDecrementEvt() {
		if (decrementEvt == null) {
			decrementEvt = new EObjectContainmentEList<Event>(Event.class, this, reaPackage.REA_PROCESS__DECREMENT_EVT);
		}
		return decrementEvt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Valuable> getInflowRes() {
		// TODO: implement this method to return the 'Inflow Res' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Valuable> getOutflowRes() {
		// TODO: implement this method to return the 'Outflow Res' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<REAProcess> getPredecessors() {
		if (predecessors == null) {
			predecessors = new EObjectWithInverseResolvingEList.ManyInverse<REAProcess>(REAProcess.class, this, reaPackage.REA_PROCESS__PREDECESSORS, reaPackage.REA_PROCESS__SUCCESSORS);
		}
		return predecessors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getID() {
		return iD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setID(String newID) {
		String oldID = iD;
		iD = newID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, reaPackage.REA_PROCESS__ID, oldID, iD));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<REAProcess> getSuccessors() {
		if (successors == null) {
			successors = new EObjectWithInverseResolvingEList.ManyInverse<REAProcess>(REAProcess.class, this, reaPackage.REA_PROCESS__SUCCESSORS, reaPackage.REA_PROCESS__PREDECESSORS);
		}
		return successors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public REAProcess getCompensatedBy() {
		if (compensatedBy != null && compensatedBy.eIsProxy()) {
			InternalEObject oldCompensatedBy = (InternalEObject)compensatedBy;
			compensatedBy = (REAProcess)eResolveProxy(oldCompensatedBy);
			if (compensatedBy != oldCompensatedBy) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, reaPackage.REA_PROCESS__COMPENSATED_BY, oldCompensatedBy, compensatedBy));
			}
		}
		return compensatedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public REAProcess basicGetCompensatedBy() {
		return compensatedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCompensatedBy(REAProcess newCompensatedBy, NotificationChain msgs) {
		REAProcess oldCompensatedBy = compensatedBy;
		compensatedBy = newCompensatedBy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, reaPackage.REA_PROCESS__COMPENSATED_BY, oldCompensatedBy, newCompensatedBy);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompensatedBy(REAProcess newCompensatedBy) {
		if (newCompensatedBy != compensatedBy) {
			NotificationChain msgs = null;
			if (compensatedBy != null)
				msgs = ((InternalEObject)compensatedBy).eInverseRemove(this, reaPackage.REA_PROCESS__COMPENSATION_FOR, REAProcess.class, msgs);
			if (newCompensatedBy != null)
				msgs = ((InternalEObject)newCompensatedBy).eInverseAdd(this, reaPackage.REA_PROCESS__COMPENSATION_FOR, REAProcess.class, msgs);
			msgs = basicSetCompensatedBy(newCompensatedBy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, reaPackage.REA_PROCESS__COMPENSATED_BY, newCompensatedBy, newCompensatedBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public REAProcess getCompensationFor() {
		if (compensationFor != null && compensationFor.eIsProxy()) {
			InternalEObject oldCompensationFor = (InternalEObject)compensationFor;
			compensationFor = (REAProcess)eResolveProxy(oldCompensationFor);
			if (compensationFor != oldCompensationFor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, reaPackage.REA_PROCESS__COMPENSATION_FOR, oldCompensationFor, compensationFor));
			}
		}
		return compensationFor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public REAProcess basicGetCompensationFor() {
		return compensationFor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCompensationFor(REAProcess newCompensationFor, NotificationChain msgs) {
		REAProcess oldCompensationFor = compensationFor;
		compensationFor = newCompensationFor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, reaPackage.REA_PROCESS__COMPENSATION_FOR, oldCompensationFor, newCompensationFor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompensationFor(REAProcess newCompensationFor) {
		if (newCompensationFor != compensationFor) {
			NotificationChain msgs = null;
			if (compensationFor != null)
				msgs = ((InternalEObject)compensationFor).eInverseRemove(this, reaPackage.REA_PROCESS__COMPENSATED_BY, REAProcess.class, msgs);
			if (newCompensationFor != null)
				msgs = ((InternalEObject)newCompensationFor).eInverseAdd(this, reaPackage.REA_PROCESS__COMPENSATED_BY, REAProcess.class, msgs);
			msgs = basicSetCompensationFor(newCompensationFor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, reaPackage.REA_PROCESS__COMPENSATION_FOR, newCompensationFor, newCompensationFor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Event> getAllEvents() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<REAProcess> getSuccessorsBranchForResource(Valuable resource) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public REAProcess getSuccessorForResource(Valuable resource) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<REAProcess> getPredecessorsBranch() {
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
			case reaPackage.REA_PROCESS__PREDECESSORS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPredecessors()).basicAdd(otherEnd, msgs);
			case reaPackage.REA_PROCESS__SUCCESSORS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSuccessors()).basicAdd(otherEnd, msgs);
			case reaPackage.REA_PROCESS__COMPENSATED_BY:
				if (compensatedBy != null)
					msgs = ((InternalEObject)compensatedBy).eInverseRemove(this, reaPackage.REA_PROCESS__COMPENSATION_FOR, REAProcess.class, msgs);
				return basicSetCompensatedBy((REAProcess)otherEnd, msgs);
			case reaPackage.REA_PROCESS__COMPENSATION_FOR:
				if (compensationFor != null)
					msgs = ((InternalEObject)compensationFor).eInverseRemove(this, reaPackage.REA_PROCESS__COMPENSATED_BY, REAProcess.class, msgs);
				return basicSetCompensationFor((REAProcess)otherEnd, msgs);
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
			case reaPackage.REA_PROCESS__INCREMENT_EVT:
				return ((InternalEList<?>)getIncrementEvt()).basicRemove(otherEnd, msgs);
			case reaPackage.REA_PROCESS__DECREMENT_EVT:
				return ((InternalEList<?>)getDecrementEvt()).basicRemove(otherEnd, msgs);
			case reaPackage.REA_PROCESS__PREDECESSORS:
				return ((InternalEList<?>)getPredecessors()).basicRemove(otherEnd, msgs);
			case reaPackage.REA_PROCESS__SUCCESSORS:
				return ((InternalEList<?>)getSuccessors()).basicRemove(otherEnd, msgs);
			case reaPackage.REA_PROCESS__COMPENSATED_BY:
				return basicSetCompensatedBy(null, msgs);
			case reaPackage.REA_PROCESS__COMPENSATION_FOR:
				return basicSetCompensationFor(null, msgs);
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
			case reaPackage.REA_PROCESS__INCREMENT_EVT:
				return getIncrementEvt();
			case reaPackage.REA_PROCESS__DECREMENT_EVT:
				return getDecrementEvt();
			case reaPackage.REA_PROCESS__INFLOW_RES:
				return getInflowRes();
			case reaPackage.REA_PROCESS__OUTFLOW_RES:
				return getOutflowRes();
			case reaPackage.REA_PROCESS__PREDECESSORS:
				return getPredecessors();
			case reaPackage.REA_PROCESS__ID:
				return getID();
			case reaPackage.REA_PROCESS__SUCCESSORS:
				return getSuccessors();
			case reaPackage.REA_PROCESS__COMPENSATED_BY:
				if (resolve) return getCompensatedBy();
				return basicGetCompensatedBy();
			case reaPackage.REA_PROCESS__COMPENSATION_FOR:
				if (resolve) return getCompensationFor();
				return basicGetCompensationFor();
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
			case reaPackage.REA_PROCESS__INCREMENT_EVT:
				getIncrementEvt().clear();
				getIncrementEvt().addAll((Collection<? extends Event>)newValue);
				return;
			case reaPackage.REA_PROCESS__DECREMENT_EVT:
				getDecrementEvt().clear();
				getDecrementEvt().addAll((Collection<? extends Event>)newValue);
				return;
			case reaPackage.REA_PROCESS__PREDECESSORS:
				getPredecessors().clear();
				getPredecessors().addAll((Collection<? extends REAProcess>)newValue);
				return;
			case reaPackage.REA_PROCESS__ID:
				setID((String)newValue);
				return;
			case reaPackage.REA_PROCESS__SUCCESSORS:
				getSuccessors().clear();
				getSuccessors().addAll((Collection<? extends REAProcess>)newValue);
				return;
			case reaPackage.REA_PROCESS__COMPENSATED_BY:
				setCompensatedBy((REAProcess)newValue);
				return;
			case reaPackage.REA_PROCESS__COMPENSATION_FOR:
				setCompensationFor((REAProcess)newValue);
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
			case reaPackage.REA_PROCESS__INCREMENT_EVT:
				getIncrementEvt().clear();
				return;
			case reaPackage.REA_PROCESS__DECREMENT_EVT:
				getDecrementEvt().clear();
				return;
			case reaPackage.REA_PROCESS__PREDECESSORS:
				getPredecessors().clear();
				return;
			case reaPackage.REA_PROCESS__ID:
				setID(ID_EDEFAULT);
				return;
			case reaPackage.REA_PROCESS__SUCCESSORS:
				getSuccessors().clear();
				return;
			case reaPackage.REA_PROCESS__COMPENSATED_BY:
				setCompensatedBy((REAProcess)null);
				return;
			case reaPackage.REA_PROCESS__COMPENSATION_FOR:
				setCompensationFor((REAProcess)null);
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
			case reaPackage.REA_PROCESS__INCREMENT_EVT:
				return incrementEvt != null && !incrementEvt.isEmpty();
			case reaPackage.REA_PROCESS__DECREMENT_EVT:
				return decrementEvt != null && !decrementEvt.isEmpty();
			case reaPackage.REA_PROCESS__INFLOW_RES:
				return !getInflowRes().isEmpty();
			case reaPackage.REA_PROCESS__OUTFLOW_RES:
				return !getOutflowRes().isEmpty();
			case reaPackage.REA_PROCESS__PREDECESSORS:
				return predecessors != null && !predecessors.isEmpty();
			case reaPackage.REA_PROCESS__ID:
				return ID_EDEFAULT == null ? iD != null : !ID_EDEFAULT.equals(iD);
			case reaPackage.REA_PROCESS__SUCCESSORS:
				return successors != null && !successors.isEmpty();
			case reaPackage.REA_PROCESS__COMPENSATED_BY:
				return compensatedBy != null;
			case reaPackage.REA_PROCESS__COMPENSATION_FOR:
				return compensationFor != null;
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
		result.append(" (iD: ");
		result.append(iD);
		result.append(')');
		return result.toString();
	}

} //REAProcessImpl
