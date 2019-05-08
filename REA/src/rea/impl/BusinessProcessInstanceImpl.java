/**
 */
package rea.impl;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import rea.BusinessProcessInstance;
import rea.EventInstance;
import rea.ResourceInstance;
import rea.reaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Business Process Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link rea.impl.BusinessProcessInstanceImpl#getEvents <em>Events</em>}</li>
 *   <li>{@link rea.impl.BusinessProcessInstanceImpl#getResources <em>Resources</em>}</li>
 *   <li>{@link rea.impl.BusinessProcessInstanceImpl#getStartedOn <em>Started On</em>}</li>
 *   <li>{@link rea.impl.BusinessProcessInstanceImpl#getEndedOn <em>Ended On</em>}</li>
 *   <li>{@link rea.impl.BusinessProcessInstanceImpl#getID <em>ID</em>}</li>
 *   <li>{@link rea.impl.BusinessProcessInstanceImpl#isRunning <em>Running</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BusinessProcessInstanceImpl extends EObjectImpl implements BusinessProcessInstance {
	/**
	 * The cached value of the '{@link #getEvents() <em>Events</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvents()
	 * @generated
	 * @ordered
	 */
	protected EList<EventInstance> events;

	/**
	 * The cached value of the '{@link #getResources() <em>Resources</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResources()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceInstance> resources;

	/**
	 * The default value of the '{@link #getStartedOn() <em>Started On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartedOn()
	 * @generated
	 * @ordered
	 */
	protected static final Date STARTED_ON_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartedOn() <em>Started On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartedOn()
	 * @generated
	 * @ordered
	 */
	protected Date startedOn = STARTED_ON_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndedOn() <em>Ended On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndedOn()
	 * @generated
	 * @ordered
	 */
	protected static final Date ENDED_ON_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndedOn() <em>Ended On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndedOn()
	 * @generated
	 * @ordered
	 */
	protected Date endedOn = ENDED_ON_EDEFAULT;

	/**
	 * This is true if the Ended On attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean endedOnESet;

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
	 * The default value of the '{@link #isRunning() <em>Running</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRunning()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RUNNING_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BusinessProcessInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return reaPackage.Literals.BUSINESS_PROCESS_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EventInstance> getEvents() {
		if (events == null) {
			events = new EObjectContainmentEList<EventInstance>(EventInstance.class, this, reaPackage.BUSINESS_PROCESS_INSTANCE__EVENTS);
		}
		return events;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourceInstance> getResources() {
		if (resources == null) {
			resources = new EObjectContainmentEList<ResourceInstance>(ResourceInstance.class, this, reaPackage.BUSINESS_PROCESS_INSTANCE__RESOURCES);
		}
		return resources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getStartedOn() {
		return startedOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartedOn(Date newStartedOn) {
		Date oldStartedOn = startedOn;
		startedOn = newStartedOn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, reaPackage.BUSINESS_PROCESS_INSTANCE__STARTED_ON, oldStartedOn, startedOn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getEndedOn() {
		return endedOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndedOn(Date newEndedOn) {
		Date oldEndedOn = endedOn;
		endedOn = newEndedOn;
		boolean oldEndedOnESet = endedOnESet;
		endedOnESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, reaPackage.BUSINESS_PROCESS_INSTANCE__ENDED_ON, oldEndedOn, endedOn, !oldEndedOnESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEndedOn() {
		Date oldEndedOn = endedOn;
		boolean oldEndedOnESet = endedOnESet;
		endedOn = ENDED_ON_EDEFAULT;
		endedOnESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, reaPackage.BUSINESS_PROCESS_INSTANCE__ENDED_ON, oldEndedOn, ENDED_ON_EDEFAULT, oldEndedOnESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEndedOn() {
		return endedOnESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, reaPackage.BUSINESS_PROCESS_INSTANCE__ID, oldID, iD));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRunning() {
		// TODO: implement this method to return the 'Running' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case reaPackage.BUSINESS_PROCESS_INSTANCE__EVENTS:
				return ((InternalEList<?>)getEvents()).basicRemove(otherEnd, msgs);
			case reaPackage.BUSINESS_PROCESS_INSTANCE__RESOURCES:
				return ((InternalEList<?>)getResources()).basicRemove(otherEnd, msgs);
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
			case reaPackage.BUSINESS_PROCESS_INSTANCE__EVENTS:
				return getEvents();
			case reaPackage.BUSINESS_PROCESS_INSTANCE__RESOURCES:
				return getResources();
			case reaPackage.BUSINESS_PROCESS_INSTANCE__STARTED_ON:
				return getStartedOn();
			case reaPackage.BUSINESS_PROCESS_INSTANCE__ENDED_ON:
				return getEndedOn();
			case reaPackage.BUSINESS_PROCESS_INSTANCE__ID:
				return getID();
			case reaPackage.BUSINESS_PROCESS_INSTANCE__RUNNING:
				return isRunning();
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
			case reaPackage.BUSINESS_PROCESS_INSTANCE__EVENTS:
				getEvents().clear();
				getEvents().addAll((Collection<? extends EventInstance>)newValue);
				return;
			case reaPackage.BUSINESS_PROCESS_INSTANCE__RESOURCES:
				getResources().clear();
				getResources().addAll((Collection<? extends ResourceInstance>)newValue);
				return;
			case reaPackage.BUSINESS_PROCESS_INSTANCE__STARTED_ON:
				setStartedOn((Date)newValue);
				return;
			case reaPackage.BUSINESS_PROCESS_INSTANCE__ENDED_ON:
				setEndedOn((Date)newValue);
				return;
			case reaPackage.BUSINESS_PROCESS_INSTANCE__ID:
				setID((String)newValue);
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
			case reaPackage.BUSINESS_PROCESS_INSTANCE__EVENTS:
				getEvents().clear();
				return;
			case reaPackage.BUSINESS_PROCESS_INSTANCE__RESOURCES:
				getResources().clear();
				return;
			case reaPackage.BUSINESS_PROCESS_INSTANCE__STARTED_ON:
				setStartedOn(STARTED_ON_EDEFAULT);
				return;
			case reaPackage.BUSINESS_PROCESS_INSTANCE__ENDED_ON:
				unsetEndedOn();
				return;
			case reaPackage.BUSINESS_PROCESS_INSTANCE__ID:
				setID(ID_EDEFAULT);
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
			case reaPackage.BUSINESS_PROCESS_INSTANCE__EVENTS:
				return events != null && !events.isEmpty();
			case reaPackage.BUSINESS_PROCESS_INSTANCE__RESOURCES:
				return resources != null && !resources.isEmpty();
			case reaPackage.BUSINESS_PROCESS_INSTANCE__STARTED_ON:
				return STARTED_ON_EDEFAULT == null ? startedOn != null : !STARTED_ON_EDEFAULT.equals(startedOn);
			case reaPackage.BUSINESS_PROCESS_INSTANCE__ENDED_ON:
				return isSetEndedOn();
			case reaPackage.BUSINESS_PROCESS_INSTANCE__ID:
				return ID_EDEFAULT == null ? iD != null : !ID_EDEFAULT.equals(iD);
			case reaPackage.BUSINESS_PROCESS_INSTANCE__RUNNING:
				return isRunning() != RUNNING_EDEFAULT;
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
		result.append(" (startedOn: ");
		result.append(startedOn);
		result.append(", endedOn: ");
		if (endedOnESet) result.append(endedOn); else result.append("<unset>");
		result.append(", iD: ");
		result.append(iD);
		result.append(')');
		return result.toString();
	}

} //BusinessProcessInstanceImpl
