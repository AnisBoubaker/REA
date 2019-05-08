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
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import rea.EventInstance;
import rea.PropertyInstance;
import rea.ResourceInstance;
import rea.RightInstance;
import rea.Valuable;
import rea.reaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link rea.impl.ResourceInstanceImpl#getID <em>ID</em>}</li>
 *   <li>{@link rea.impl.ResourceInstanceImpl#getResource <em>Resource</em>}</li>
 *   <li>{@link rea.impl.ResourceInstanceImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link rea.impl.ResourceInstanceImpl#getRights <em>Rights</em>}</li>
 *   <li>{@link rea.impl.ResourceInstanceImpl#getEvents <em>Events</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResourceInstanceImpl extends EObjectImpl implements ResourceInstance {
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
	 * The cached value of the '{@link #getResource() <em>Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResource()
	 * @generated
	 * @ordered
	 */
	protected Valuable resource;

	/**
	 * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<PropertyInstance> properties;

	/**
	 * The cached value of the '{@link #getRights() <em>Rights</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRights()
	 * @generated
	 * @ordered
	 */
	protected EList<RightInstance> rights;

	/**
	 * The cached value of the '{@link #getEvents() <em>Events</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvents()
	 * @generated
	 * @ordered
	 */
	protected EList<EventInstance> events;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return reaPackage.Literals.RESOURCE_INSTANCE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, reaPackage.RESOURCE_INSTANCE__ID, oldID, iD));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Valuable getResource() {
		if (resource != null && resource.eIsProxy()) {
			InternalEObject oldResource = (InternalEObject)resource;
			resource = (Valuable)eResolveProxy(oldResource);
			if (resource != oldResource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, reaPackage.RESOURCE_INSTANCE__RESOURCE, oldResource, resource));
			}
		}
		return resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Valuable basicGetResource() {
		return resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResource(Valuable newResource) {
		Valuable oldResource = resource;
		resource = newResource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, reaPackage.RESOURCE_INSTANCE__RESOURCE, oldResource, resource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PropertyInstance> getProperties() {
		if (properties == null) {
			properties = new EObjectContainmentEList<PropertyInstance>(PropertyInstance.class, this, reaPackage.RESOURCE_INSTANCE__PROPERTIES);
		}
		return properties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RightInstance> getRights() {
		if (rights == null) {
			rights = new EObjectContainmentEList<RightInstance>(RightInstance.class, this, reaPackage.RESOURCE_INSTANCE__RIGHTS);
		}
		return rights;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EventInstance> getEvents() {
		if (events == null) {
			events = new EObjectWithInverseResolvingEList<EventInstance>(EventInstance.class, this, reaPackage.RESOURCE_INSTANCE__EVENTS, reaPackage.EVENT_INSTANCE__RESOURCE_INSTANCE);
		}
		return events;
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
			case reaPackage.RESOURCE_INSTANCE__EVENTS:
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
			case reaPackage.RESOURCE_INSTANCE__PROPERTIES:
				return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
			case reaPackage.RESOURCE_INSTANCE__RIGHTS:
				return ((InternalEList<?>)getRights()).basicRemove(otherEnd, msgs);
			case reaPackage.RESOURCE_INSTANCE__EVENTS:
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
			case reaPackage.RESOURCE_INSTANCE__ID:
				return getID();
			case reaPackage.RESOURCE_INSTANCE__RESOURCE:
				if (resolve) return getResource();
				return basicGetResource();
			case reaPackage.RESOURCE_INSTANCE__PROPERTIES:
				return getProperties();
			case reaPackage.RESOURCE_INSTANCE__RIGHTS:
				return getRights();
			case reaPackage.RESOURCE_INSTANCE__EVENTS:
				return getEvents();
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
			case reaPackage.RESOURCE_INSTANCE__ID:
				setID((String)newValue);
				return;
			case reaPackage.RESOURCE_INSTANCE__RESOURCE:
				setResource((Valuable)newValue);
				return;
			case reaPackage.RESOURCE_INSTANCE__EVENTS:
				getEvents().clear();
				getEvents().addAll((Collection<? extends EventInstance>)newValue);
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
			case reaPackage.RESOURCE_INSTANCE__ID:
				setID(ID_EDEFAULT);
				return;
			case reaPackage.RESOURCE_INSTANCE__RESOURCE:
				setResource((Valuable)null);
				return;
			case reaPackage.RESOURCE_INSTANCE__EVENTS:
				getEvents().clear();
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
			case reaPackage.RESOURCE_INSTANCE__ID:
				return ID_EDEFAULT == null ? iD != null : !ID_EDEFAULT.equals(iD);
			case reaPackage.RESOURCE_INSTANCE__RESOURCE:
				return resource != null;
			case reaPackage.RESOURCE_INSTANCE__PROPERTIES:
				return properties != null && !properties.isEmpty();
			case reaPackage.RESOURCE_INSTANCE__RIGHTS:
				return rights != null && !rights.isEmpty();
			case reaPackage.RESOURCE_INSTANCE__EVENTS:
				return events != null && !events.isEmpty();
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

} //ResourceInstanceImpl
