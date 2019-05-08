/**
 */
package rea.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import rea.Event;
import rea.EventInstance;
import rea.ResourceInstance;
import rea.reaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link rea.impl.EventInstanceImpl#getEvent <em>Event</em>}</li>
 *   <li>{@link rea.impl.EventInstanceImpl#getID <em>ID</em>}</li>
 *   <li>{@link rea.impl.EventInstanceImpl#getResourceInstance <em>Resource Instance</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EventInstanceImpl extends EObjectImpl implements EventInstance {
	/**
	 * The cached value of the '{@link #getEvent() <em>Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvent()
	 * @generated
	 * @ordered
	 */
	protected Event event;

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
	 * The cached value of the '{@link #getResourceInstance() <em>Resource Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceInstance()
	 * @generated
	 * @ordered
	 */
	protected ResourceInstance resourceInstance;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return reaPackage.Literals.EVENT_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Event getEvent() {
		if (event != null && event.eIsProxy()) {
			InternalEObject oldEvent = (InternalEObject)event;
			event = (Event)eResolveProxy(oldEvent);
			if (event != oldEvent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, reaPackage.EVENT_INSTANCE__EVENT, oldEvent, event));
			}
		}
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Event basicGetEvent() {
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEvent(Event newEvent) {
		Event oldEvent = event;
		event = newEvent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, reaPackage.EVENT_INSTANCE__EVENT, oldEvent, event));
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
			eNotify(new ENotificationImpl(this, Notification.SET, reaPackage.EVENT_INSTANCE__ID, oldID, iD));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceInstance getResourceInstance() {
		if (resourceInstance != null && resourceInstance.eIsProxy()) {
			InternalEObject oldResourceInstance = (InternalEObject)resourceInstance;
			resourceInstance = (ResourceInstance)eResolveProxy(oldResourceInstance);
			if (resourceInstance != oldResourceInstance) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, reaPackage.EVENT_INSTANCE__RESOURCE_INSTANCE, oldResourceInstance, resourceInstance));
			}
		}
		return resourceInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceInstance basicGetResourceInstance() {
		return resourceInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResourceInstance(ResourceInstance newResourceInstance, NotificationChain msgs) {
		ResourceInstance oldResourceInstance = resourceInstance;
		resourceInstance = newResourceInstance;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, reaPackage.EVENT_INSTANCE__RESOURCE_INSTANCE, oldResourceInstance, newResourceInstance);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResourceInstance(ResourceInstance newResourceInstance) {
		if (newResourceInstance != resourceInstance) {
			NotificationChain msgs = null;
			if (resourceInstance != null)
				msgs = ((InternalEObject)resourceInstance).eInverseRemove(this, reaPackage.RESOURCE_INSTANCE__EVENTS, ResourceInstance.class, msgs);
			if (newResourceInstance != null)
				msgs = ((InternalEObject)newResourceInstance).eInverseAdd(this, reaPackage.RESOURCE_INSTANCE__EVENTS, ResourceInstance.class, msgs);
			msgs = basicSetResourceInstance(newResourceInstance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, reaPackage.EVENT_INSTANCE__RESOURCE_INSTANCE, newResourceInstance, newResourceInstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case reaPackage.EVENT_INSTANCE__RESOURCE_INSTANCE:
				if (resourceInstance != null)
					msgs = ((InternalEObject)resourceInstance).eInverseRemove(this, reaPackage.RESOURCE_INSTANCE__EVENTS, ResourceInstance.class, msgs);
				return basicSetResourceInstance((ResourceInstance)otherEnd, msgs);
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
			case reaPackage.EVENT_INSTANCE__RESOURCE_INSTANCE:
				return basicSetResourceInstance(null, msgs);
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
			case reaPackage.EVENT_INSTANCE__EVENT:
				if (resolve) return getEvent();
				return basicGetEvent();
			case reaPackage.EVENT_INSTANCE__ID:
				return getID();
			case reaPackage.EVENT_INSTANCE__RESOURCE_INSTANCE:
				if (resolve) return getResourceInstance();
				return basicGetResourceInstance();
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
			case reaPackage.EVENT_INSTANCE__EVENT:
				setEvent((Event)newValue);
				return;
			case reaPackage.EVENT_INSTANCE__ID:
				setID((String)newValue);
				return;
			case reaPackage.EVENT_INSTANCE__RESOURCE_INSTANCE:
				setResourceInstance((ResourceInstance)newValue);
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
			case reaPackage.EVENT_INSTANCE__EVENT:
				setEvent((Event)null);
				return;
			case reaPackage.EVENT_INSTANCE__ID:
				setID(ID_EDEFAULT);
				return;
			case reaPackage.EVENT_INSTANCE__RESOURCE_INSTANCE:
				setResourceInstance((ResourceInstance)null);
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
			case reaPackage.EVENT_INSTANCE__EVENT:
				return event != null;
			case reaPackage.EVENT_INSTANCE__ID:
				return ID_EDEFAULT == null ? iD != null : !ID_EDEFAULT.equals(iD);
			case reaPackage.EVENT_INSTANCE__RESOURCE_INSTANCE:
				return resourceInstance != null;
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

} //EventInstanceImpl
