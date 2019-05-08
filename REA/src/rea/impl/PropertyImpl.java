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
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import rea.Property;
import rea.PropertyAlteration;
import rea.PropertyRecoverability;
import rea.Resource;
import rea.reaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link rea.impl.PropertyImpl#getName <em>Name</em>}</li>
 *   <li>{@link rea.impl.PropertyImpl#getInitialState <em>Initial State</em>}</li>
 *   <li>{@link rea.impl.PropertyImpl#getAlterations <em>Alterations</em>}</li>
 *   <li>{@link rea.impl.PropertyImpl#getDependsOn <em>Depends On</em>}</li>
 *   <li>{@link rea.impl.PropertyImpl#getDependees <em>Dependees</em>}</li>
 *   <li>{@link rea.impl.PropertyImpl#getRecoverable <em>Recoverable</em>}</li>
 *   <li>{@link rea.impl.PropertyImpl#isPrimaryProperty <em>Primary Property</em>}</li>
 *   <li>{@link rea.impl.PropertyImpl#getResource <em>Resource</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PropertyImpl extends REAConceptImpl implements Property {
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
	 * The default value of the '{@link #getInitialState() <em>Initial State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialState()
	 * @generated
	 * @ordered
	 */
	protected static final String INITIAL_STATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInitialState() <em>Initial State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialState()
	 * @generated
	 * @ordered
	 */
	protected String initialState = INITIAL_STATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAlterations() <em>Alterations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlterations()
	 * @generated
	 * @ordered
	 */
	protected EList<PropertyAlteration> alterations;

	/**
	 * The cached value of the '{@link #getDependsOn() <em>Depends On</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependsOn()
	 * @generated
	 * @ordered
	 */
	protected Property dependsOn;

	/**
	 * The cached value of the '{@link #getDependees() <em>Dependees</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependees()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> dependees;

	/**
	 * The default value of the '{@link #getRecoverable() <em>Recoverable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecoverable()
	 * @generated
	 * @ordered
	 */
	protected static final PropertyRecoverability RECOVERABLE_EDEFAULT = PropertyRecoverability.SEMI_RECOVERABLE;

	/**
	 * The cached value of the '{@link #getRecoverable() <em>Recoverable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecoverable()
	 * @generated
	 * @ordered
	 */
	protected PropertyRecoverability recoverable = RECOVERABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #isPrimaryProperty() <em>Primary Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPrimaryProperty()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PRIMARY_PROPERTY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPrimaryProperty() <em>Primary Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPrimaryProperty()
	 * @generated
	 * @ordered
	 */
	protected boolean primaryProperty = PRIMARY_PROPERTY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return reaPackage.Literals.PROPERTY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, reaPackage.PROPERTY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInitialState() {
		return initialState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialState(String newInitialState) {
		String oldInitialState = initialState;
		initialState = newInitialState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, reaPackage.PROPERTY__INITIAL_STATE, oldInitialState, initialState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PropertyAlteration> getAlterations() {
		if (alterations == null) {
			alterations = new EObjectWithInverseResolvingEList<PropertyAlteration>(PropertyAlteration.class, this, reaPackage.PROPERTY__ALTERATIONS, reaPackage.PROPERTY_ALTERATION__PROPERTY);
		}
		return alterations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property getDependsOn() {
		if (dependsOn != null && dependsOn.eIsProxy()) {
			InternalEObject oldDependsOn = (InternalEObject)dependsOn;
			dependsOn = (Property)eResolveProxy(oldDependsOn);
			if (dependsOn != oldDependsOn) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, reaPackage.PROPERTY__DEPENDS_ON, oldDependsOn, dependsOn));
			}
		}
		return dependsOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property basicGetDependsOn() {
		return dependsOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDependsOn(Property newDependsOn, NotificationChain msgs) {
		Property oldDependsOn = dependsOn;
		dependsOn = newDependsOn;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, reaPackage.PROPERTY__DEPENDS_ON, oldDependsOn, newDependsOn);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDependsOn(Property newDependsOn) {
		if (newDependsOn != dependsOn) {
			NotificationChain msgs = null;
			if (dependsOn != null)
				msgs = ((InternalEObject)dependsOn).eInverseRemove(this, reaPackage.PROPERTY__DEPENDEES, Property.class, msgs);
			if (newDependsOn != null)
				msgs = ((InternalEObject)newDependsOn).eInverseAdd(this, reaPackage.PROPERTY__DEPENDEES, Property.class, msgs);
			msgs = basicSetDependsOn(newDependsOn, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, reaPackage.PROPERTY__DEPENDS_ON, newDependsOn, newDependsOn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getDependees() {
		if (dependees == null) {
			dependees = new EObjectWithInverseResolvingEList<Property>(Property.class, this, reaPackage.PROPERTY__DEPENDEES, reaPackage.PROPERTY__DEPENDS_ON);
		}
		return dependees;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyRecoverability getRecoverable() {
		return recoverable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRecoverable(PropertyRecoverability newRecoverable) {
		PropertyRecoverability oldRecoverable = recoverable;
		recoverable = newRecoverable == null ? RECOVERABLE_EDEFAULT : newRecoverable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, reaPackage.PROPERTY__RECOVERABLE, oldRecoverable, recoverable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPrimaryProperty() {
		return primaryProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrimaryProperty(boolean newPrimaryProperty) {
		boolean oldPrimaryProperty = primaryProperty;
		primaryProperty = newPrimaryProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, reaPackage.PROPERTY__PRIMARY_PROPERTY, oldPrimaryProperty, primaryProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource getResource() {
		if (eContainerFeatureID() != reaPackage.PROPERTY__RESOURCE) return null;
		return (Resource)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResource(Resource newResource, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newResource, reaPackage.PROPERTY__RESOURCE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResource(Resource newResource) {
		if (newResource != eInternalContainer() || (eContainerFeatureID() != reaPackage.PROPERTY__RESOURCE && newResource != null)) {
			if (EcoreUtil.isAncestor(this, newResource))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newResource != null)
				msgs = ((InternalEObject)newResource).eInverseAdd(this, reaPackage.RESOURCE__PROPERTIES, Resource.class, msgs);
			msgs = basicSetResource(newResource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, reaPackage.PROPERTY__RESOURCE, newResource, newResource));
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
			case reaPackage.PROPERTY__ALTERATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAlterations()).basicAdd(otherEnd, msgs);
			case reaPackage.PROPERTY__DEPENDS_ON:
				if (dependsOn != null)
					msgs = ((InternalEObject)dependsOn).eInverseRemove(this, reaPackage.PROPERTY__DEPENDEES, Property.class, msgs);
				return basicSetDependsOn((Property)otherEnd, msgs);
			case reaPackage.PROPERTY__DEPENDEES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDependees()).basicAdd(otherEnd, msgs);
			case reaPackage.PROPERTY__RESOURCE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetResource((Resource)otherEnd, msgs);
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
			case reaPackage.PROPERTY__ALTERATIONS:
				return ((InternalEList<?>)getAlterations()).basicRemove(otherEnd, msgs);
			case reaPackage.PROPERTY__DEPENDS_ON:
				return basicSetDependsOn(null, msgs);
			case reaPackage.PROPERTY__DEPENDEES:
				return ((InternalEList<?>)getDependees()).basicRemove(otherEnd, msgs);
			case reaPackage.PROPERTY__RESOURCE:
				return basicSetResource(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case reaPackage.PROPERTY__RESOURCE:
				return eInternalContainer().eInverseRemove(this, reaPackage.RESOURCE__PROPERTIES, Resource.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case reaPackage.PROPERTY__NAME:
				return getName();
			case reaPackage.PROPERTY__INITIAL_STATE:
				return getInitialState();
			case reaPackage.PROPERTY__ALTERATIONS:
				return getAlterations();
			case reaPackage.PROPERTY__DEPENDS_ON:
				if (resolve) return getDependsOn();
				return basicGetDependsOn();
			case reaPackage.PROPERTY__DEPENDEES:
				return getDependees();
			case reaPackage.PROPERTY__RECOVERABLE:
				return getRecoverable();
			case reaPackage.PROPERTY__PRIMARY_PROPERTY:
				return isPrimaryProperty();
			case reaPackage.PROPERTY__RESOURCE:
				return getResource();
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
			case reaPackage.PROPERTY__NAME:
				setName((String)newValue);
				return;
			case reaPackage.PROPERTY__INITIAL_STATE:
				setInitialState((String)newValue);
				return;
			case reaPackage.PROPERTY__ALTERATIONS:
				getAlterations().clear();
				getAlterations().addAll((Collection<? extends PropertyAlteration>)newValue);
				return;
			case reaPackage.PROPERTY__DEPENDS_ON:
				setDependsOn((Property)newValue);
				return;
			case reaPackage.PROPERTY__RECOVERABLE:
				setRecoverable((PropertyRecoverability)newValue);
				return;
			case reaPackage.PROPERTY__PRIMARY_PROPERTY:
				setPrimaryProperty((Boolean)newValue);
				return;
			case reaPackage.PROPERTY__RESOURCE:
				setResource((Resource)newValue);
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
			case reaPackage.PROPERTY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case reaPackage.PROPERTY__INITIAL_STATE:
				setInitialState(INITIAL_STATE_EDEFAULT);
				return;
			case reaPackage.PROPERTY__ALTERATIONS:
				getAlterations().clear();
				return;
			case reaPackage.PROPERTY__DEPENDS_ON:
				setDependsOn((Property)null);
				return;
			case reaPackage.PROPERTY__RECOVERABLE:
				setRecoverable(RECOVERABLE_EDEFAULT);
				return;
			case reaPackage.PROPERTY__PRIMARY_PROPERTY:
				setPrimaryProperty(PRIMARY_PROPERTY_EDEFAULT);
				return;
			case reaPackage.PROPERTY__RESOURCE:
				setResource((Resource)null);
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
			case reaPackage.PROPERTY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case reaPackage.PROPERTY__INITIAL_STATE:
				return INITIAL_STATE_EDEFAULT == null ? initialState != null : !INITIAL_STATE_EDEFAULT.equals(initialState);
			case reaPackage.PROPERTY__ALTERATIONS:
				return alterations != null && !alterations.isEmpty();
			case reaPackage.PROPERTY__DEPENDS_ON:
				return dependsOn != null;
			case reaPackage.PROPERTY__DEPENDEES:
				return dependees != null && !dependees.isEmpty();
			case reaPackage.PROPERTY__RECOVERABLE:
				return recoverable != RECOVERABLE_EDEFAULT;
			case reaPackage.PROPERTY__PRIMARY_PROPERTY:
				return primaryProperty != PRIMARY_PROPERTY_EDEFAULT;
			case reaPackage.PROPERTY__RESOURCE:
				return getResource() != null;
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
		result.append(", initialState: ");
		result.append(initialState);
		result.append(", recoverable: ");
		result.append(recoverable);
		result.append(", primaryProperty: ");
		result.append(primaryProperty);
		result.append(')');
		return result.toString();
	}

} //PropertyImpl
