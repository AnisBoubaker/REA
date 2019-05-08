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

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import rea.Claim;
import rea.Property;
import rea.Resource;
import rea.reaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Claim</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link rea.impl.ClaimImpl#getClaimForProperty <em>Claim For Property</em>}</li>
 *   <li>{@link rea.impl.ClaimImpl#getClaimForResource <em>Claim For Resource</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClaimImpl extends ValuableImpl implements Claim {
	/**
	 * The cached value of the '{@link #getClaimForProperty() <em>Claim For Property</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClaimForProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> claimForProperty;

	/**
	 * The cached value of the '{@link #getClaimForResource() <em>Claim For Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClaimForResource()
	 * @generated
	 * @ordered
	 */
	protected Resource claimForResource;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClaimImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return reaPackage.Literals.CLAIM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getClaimForProperty() {
		if (claimForProperty == null) {
			claimForProperty = new EObjectResolvingEList<Property>(Property.class, this, reaPackage.CLAIM__CLAIM_FOR_PROPERTY);
		}
		return claimForProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource getClaimForResource() {
		if (claimForResource != null && claimForResource.eIsProxy()) {
			InternalEObject oldClaimForResource = (InternalEObject)claimForResource;
			claimForResource = (Resource)eResolveProxy(oldClaimForResource);
			if (claimForResource != oldClaimForResource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, reaPackage.CLAIM__CLAIM_FOR_RESOURCE, oldClaimForResource, claimForResource));
			}
		}
		return claimForResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource basicGetClaimForResource() {
		return claimForResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClaimForResource(Resource newClaimForResource, NotificationChain msgs) {
		Resource oldClaimForResource = claimForResource;
		claimForResource = newClaimForResource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, reaPackage.CLAIM__CLAIM_FOR_RESOURCE, oldClaimForResource, newClaimForResource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClaimForResource(Resource newClaimForResource) {
		if (newClaimForResource != claimForResource) {
			NotificationChain msgs = null;
			if (claimForResource != null)
				msgs = ((InternalEObject)claimForResource).eInverseRemove(this, reaPackage.RESOURCE__CLAIMS, Resource.class, msgs);
			if (newClaimForResource != null)
				msgs = ((InternalEObject)newClaimForResource).eInverseAdd(this, reaPackage.RESOURCE__CLAIMS, Resource.class, msgs);
			msgs = basicSetClaimForResource(newClaimForResource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, reaPackage.CLAIM__CLAIM_FOR_RESOURCE, newClaimForResource, newClaimForResource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case reaPackage.CLAIM__CLAIM_FOR_RESOURCE:
				if (claimForResource != null)
					msgs = ((InternalEObject)claimForResource).eInverseRemove(this, reaPackage.RESOURCE__CLAIMS, Resource.class, msgs);
				return basicSetClaimForResource((Resource)otherEnd, msgs);
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
			case reaPackage.CLAIM__CLAIM_FOR_RESOURCE:
				return basicSetClaimForResource(null, msgs);
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
			case reaPackage.CLAIM__CLAIM_FOR_PROPERTY:
				return getClaimForProperty();
			case reaPackage.CLAIM__CLAIM_FOR_RESOURCE:
				if (resolve) return getClaimForResource();
				return basicGetClaimForResource();
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
			case reaPackage.CLAIM__CLAIM_FOR_PROPERTY:
				getClaimForProperty().clear();
				getClaimForProperty().addAll((Collection<? extends Property>)newValue);
				return;
			case reaPackage.CLAIM__CLAIM_FOR_RESOURCE:
				setClaimForResource((Resource)newValue);
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
			case reaPackage.CLAIM__CLAIM_FOR_PROPERTY:
				getClaimForProperty().clear();
				return;
			case reaPackage.CLAIM__CLAIM_FOR_RESOURCE:
				setClaimForResource((Resource)null);
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
			case reaPackage.CLAIM__CLAIM_FOR_PROPERTY:
				return claimForProperty != null && !claimForProperty.isEmpty();
			case reaPackage.CLAIM__CLAIM_FOR_RESOURCE:
				return claimForResource != null;
		}
		return super.eIsSet(featureID);
	}

} //ClaimImpl
