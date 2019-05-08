/**
 */
package rea.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import rea.Property;
import rea.PropertyAlteration;
import rea.reaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property Alteration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link rea.impl.PropertyAlterationImpl#getNewState <em>New State</em>}</li>
 *   <li>{@link rea.impl.PropertyAlterationImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link rea.impl.PropertyAlterationImpl#getInitialState <em>Initial State</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PropertyAlterationImpl extends EObjectImpl implements PropertyAlteration {
	/**
	 * The default value of the '{@link #getNewState() <em>New State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewState()
	 * @generated
	 * @ordered
	 */
	protected static final String NEW_STATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNewState() <em>New State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewState()
	 * @generated
	 * @ordered
	 */
	protected String newState = NEW_STATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProperty() <em>Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperty()
	 * @generated
	 * @ordered
	 */
	protected Property property;

	/**
	 * The default value of the '{@link #getInitialState() <em>Initial State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialState()
	 * @generated
	 * @ordered
	 */
	protected static final String INITIAL_STATE_EDEFAULT = "";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertyAlterationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return reaPackage.Literals.PROPERTY_ALTERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNewState() {
		return newState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNewState(String newNewState) {
		String oldNewState = newState;
		newState = newNewState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, reaPackage.PROPERTY_ALTERATION__NEW_STATE, oldNewState, newState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property getProperty() {
		if (property != null && property.eIsProxy()) {
			InternalEObject oldProperty = (InternalEObject)property;
			property = (Property)eResolveProxy(oldProperty);
			if (property != oldProperty) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, reaPackage.PROPERTY_ALTERATION__PROPERTY, oldProperty, property));
			}
		}
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property basicGetProperty() {
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProperty(Property newProperty, NotificationChain msgs) {
		Property oldProperty = property;
		property = newProperty;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, reaPackage.PROPERTY_ALTERATION__PROPERTY, oldProperty, newProperty);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProperty(Property newProperty) {
		if (newProperty != property) {
			NotificationChain msgs = null;
			if (property != null)
				msgs = ((InternalEObject)property).eInverseRemove(this, reaPackage.PROPERTY__ALTERATIONS, Property.class, msgs);
			if (newProperty != null)
				msgs = ((InternalEObject)newProperty).eInverseAdd(this, reaPackage.PROPERTY__ALTERATIONS, Property.class, msgs);
			msgs = basicSetProperty(newProperty, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, reaPackage.PROPERTY_ALTERATION__PROPERTY, newProperty, newProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInitialState() {
		// TODO: implement this method to return the 'Initial State' attribute
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
			case reaPackage.PROPERTY_ALTERATION__PROPERTY:
				if (property != null)
					msgs = ((InternalEObject)property).eInverseRemove(this, reaPackage.PROPERTY__ALTERATIONS, Property.class, msgs);
				return basicSetProperty((Property)otherEnd, msgs);
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
			case reaPackage.PROPERTY_ALTERATION__PROPERTY:
				return basicSetProperty(null, msgs);
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
			case reaPackage.PROPERTY_ALTERATION__NEW_STATE:
				return getNewState();
			case reaPackage.PROPERTY_ALTERATION__PROPERTY:
				if (resolve) return getProperty();
				return basicGetProperty();
			case reaPackage.PROPERTY_ALTERATION__INITIAL_STATE:
				return getInitialState();
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
			case reaPackage.PROPERTY_ALTERATION__NEW_STATE:
				setNewState((String)newValue);
				return;
			case reaPackage.PROPERTY_ALTERATION__PROPERTY:
				setProperty((Property)newValue);
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
			case reaPackage.PROPERTY_ALTERATION__NEW_STATE:
				setNewState(NEW_STATE_EDEFAULT);
				return;
			case reaPackage.PROPERTY_ALTERATION__PROPERTY:
				setProperty((Property)null);
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
			case reaPackage.PROPERTY_ALTERATION__NEW_STATE:
				return NEW_STATE_EDEFAULT == null ? newState != null : !NEW_STATE_EDEFAULT.equals(newState);
			case reaPackage.PROPERTY_ALTERATION__PROPERTY:
				return property != null;
			case reaPackage.PROPERTY_ALTERATION__INITIAL_STATE:
				return INITIAL_STATE_EDEFAULT == null ? getInitialState() != null : !INITIAL_STATE_EDEFAULT.equals(getInitialState());
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
		result.append(" (newState: ");
		result.append(newState);
		result.append(')');
		return result.toString();
	}

} //PropertyAlterationImpl
