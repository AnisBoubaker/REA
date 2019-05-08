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
import org.eclipse.emf.ecore.util.InternalEList;

import rea.Agent;
import rea.Event;
import rea.Property;
import rea.PropertyAlteration;
import rea.REAProcess;
import rea.Resource;
import rea.ResourceAlterationType;
import rea.ResourceTreatmentType;
import rea.Right;
import rea.RightTransfer;
import rea.Valuable;
import rea.reaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link rea.impl.EventImpl#getResource <em>Resource</em>}</li>
 *   <li>{@link rea.impl.EventImpl#getProvider <em>Provider</em>}</li>
 *   <li>{@link rea.impl.EventImpl#getReceiver <em>Receiver</em>}</li>
 *   <li>{@link rea.impl.EventImpl#getREAProcess <em>REA Process</em>}</li>
 *   <li>{@link rea.impl.EventImpl#getRightTransfers <em>Right Transfers</em>}</li>
 *   <li>{@link rea.impl.EventImpl#getAlterations <em>Alterations</em>}</li>
 *   <li>{@link rea.impl.EventImpl#getAlterationType <em>Alteration Type</em>}</li>
 *   <li>{@link rea.impl.EventImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EventImpl extends REAConceptImpl implements Event {
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
	 * The cached value of the '{@link #getProvider() <em>Provider</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvider()
	 * @generated
	 * @ordered
	 */
	protected Agent provider;

	/**
	 * The cached value of the '{@link #getReceiver() <em>Receiver</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceiver()
	 * @generated
	 * @ordered
	 */
	protected Agent receiver;

	/**
	 * The cached value of the '{@link #getRightTransfers() <em>Right Transfers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRightTransfers()
	 * @generated
	 * @ordered
	 */
	protected EList<RightTransfer> rightTransfers;

	/**
	 * The cached value of the '{@link #getAlterations() <em>Alterations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlterations()
	 * @generated
	 * @ordered
	 */
	protected EList<PropertyAlteration> alterations;

	/**
	 * The default value of the '{@link #getAlterationType() <em>Alteration Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlterationType()
	 * @generated
	 * @ordered
	 */
	protected static final ResourceAlterationType ALTERATION_TYPE_EDEFAULT = ResourceAlterationType.USAGE;

	/**
	 * The cached value of the '{@link #getAlterationType() <em>Alteration Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlterationType()
	 * @generated
	 * @ordered
	 */
	protected ResourceAlterationType alterationType = ALTERATION_TYPE_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return reaPackage.Literals.EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Valuable getResource() {
		return resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResource(Valuable newResource, NotificationChain msgs) {
		Valuable oldResource = resource;
		resource = newResource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, reaPackage.EVENT__RESOURCE, oldResource, newResource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResource(Valuable newResource) {
		if (newResource != resource) {
			NotificationChain msgs = null;
			if (resource != null)
				msgs = ((InternalEObject)resource).eInverseRemove(this, reaPackage.VALUABLE__EVENTS, Valuable.class, msgs);
			if (newResource != null)
				msgs = ((InternalEObject)newResource).eInverseAdd(this, reaPackage.VALUABLE__EVENTS, Valuable.class, msgs);
			msgs = basicSetResource(newResource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, reaPackage.EVENT__RESOURCE, newResource, newResource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Agent getProvider() {
		if (provider != null && provider.eIsProxy()) {
			InternalEObject oldProvider = (InternalEObject)provider;
			provider = (Agent)eResolveProxy(oldProvider);
			if (provider != oldProvider) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, reaPackage.EVENT__PROVIDER, oldProvider, provider));
			}
		}
		return provider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Agent basicGetProvider() {
		return provider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProvider(Agent newProvider) {
		Agent oldProvider = provider;
		provider = newProvider;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, reaPackage.EVENT__PROVIDER, oldProvider, provider));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Agent getReceiver() {
		if (receiver != null && receiver.eIsProxy()) {
			InternalEObject oldReceiver = (InternalEObject)receiver;
			receiver = (Agent)eResolveProxy(oldReceiver);
			if (receiver != oldReceiver) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, reaPackage.EVENT__RECEIVER, oldReceiver, receiver));
			}
		}
		return receiver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Agent basicGetReceiver() {
		return receiver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReceiver(Agent newReceiver) {
		Agent oldReceiver = receiver;
		receiver = newReceiver;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, reaPackage.EVENT__RECEIVER, oldReceiver, receiver));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public REAProcess getREAProcess() {
		REAProcess rEAProcess = basicGetREAProcess();
		return rEAProcess != null && rEAProcess.eIsProxy() ? (REAProcess)eResolveProxy((InternalEObject)rEAProcess) : rEAProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public REAProcess basicGetREAProcess() {
		// TODO: implement this method to return the 'REA Process' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RightTransfer> getRightTransfers() {
		if (rightTransfers == null) {
			rightTransfers = new EObjectContainmentEList<RightTransfer>(RightTransfer.class, this, reaPackage.EVENT__RIGHT_TRANSFERS);
		}
		return rightTransfers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PropertyAlteration> getAlterations() {
		if (alterations == null) {
			alterations = new EObjectContainmentEList<PropertyAlteration>(PropertyAlteration.class, this, reaPackage.EVENT__ALTERATIONS);
		}
		return alterations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceAlterationType getAlterationType() {
		return alterationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlterationType(ResourceAlterationType newAlterationType) {
		ResourceAlterationType oldAlterationType = alterationType;
		alterationType = newAlterationType == null ? ALTERATION_TYPE_EDEFAULT : newAlterationType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, reaPackage.EVENT__ALTERATION_TYPE, oldAlterationType, alterationType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, reaPackage.EVENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PropertyAlteration> getAlterations(Resource r) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RightTransfer> getRightTransfers(Valuable r) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceTreatmentType getResourceTreatmentType() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RightTransfer getRightTransfers(Valuable r, Right right) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyAlteration getPropertyAlteration(Resource r, Property p) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIncrementEvt() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDecrementEvt() {
		// TODO: implement this method
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
			case reaPackage.EVENT__RESOURCE:
				if (resource != null)
					msgs = ((InternalEObject)resource).eInverseRemove(this, reaPackage.VALUABLE__EVENTS, Valuable.class, msgs);
				return basicSetResource((Valuable)otherEnd, msgs);
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
			case reaPackage.EVENT__RESOURCE:
				return basicSetResource(null, msgs);
			case reaPackage.EVENT__RIGHT_TRANSFERS:
				return ((InternalEList<?>)getRightTransfers()).basicRemove(otherEnd, msgs);
			case reaPackage.EVENT__ALTERATIONS:
				return ((InternalEList<?>)getAlterations()).basicRemove(otherEnd, msgs);
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
			case reaPackage.EVENT__RESOURCE:
				return getResource();
			case reaPackage.EVENT__PROVIDER:
				if (resolve) return getProvider();
				return basicGetProvider();
			case reaPackage.EVENT__RECEIVER:
				if (resolve) return getReceiver();
				return basicGetReceiver();
			case reaPackage.EVENT__REA_PROCESS:
				if (resolve) return getREAProcess();
				return basicGetREAProcess();
			case reaPackage.EVENT__RIGHT_TRANSFERS:
				return getRightTransfers();
			case reaPackage.EVENT__ALTERATIONS:
				return getAlterations();
			case reaPackage.EVENT__ALTERATION_TYPE:
				return getAlterationType();
			case reaPackage.EVENT__NAME:
				return getName();
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
			case reaPackage.EVENT__RESOURCE:
				setResource((Valuable)newValue);
				return;
			case reaPackage.EVENT__PROVIDER:
				setProvider((Agent)newValue);
				return;
			case reaPackage.EVENT__RECEIVER:
				setReceiver((Agent)newValue);
				return;
			case reaPackage.EVENT__RIGHT_TRANSFERS:
				getRightTransfers().clear();
				getRightTransfers().addAll((Collection<? extends RightTransfer>)newValue);
				return;
			case reaPackage.EVENT__ALTERATIONS:
				getAlterations().clear();
				getAlterations().addAll((Collection<? extends PropertyAlteration>)newValue);
				return;
			case reaPackage.EVENT__ALTERATION_TYPE:
				setAlterationType((ResourceAlterationType)newValue);
				return;
			case reaPackage.EVENT__NAME:
				setName((String)newValue);
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
			case reaPackage.EVENT__RESOURCE:
				setResource((Valuable)null);
				return;
			case reaPackage.EVENT__PROVIDER:
				setProvider((Agent)null);
				return;
			case reaPackage.EVENT__RECEIVER:
				setReceiver((Agent)null);
				return;
			case reaPackage.EVENT__RIGHT_TRANSFERS:
				getRightTransfers().clear();
				return;
			case reaPackage.EVENT__ALTERATIONS:
				getAlterations().clear();
				return;
			case reaPackage.EVENT__ALTERATION_TYPE:
				setAlterationType(ALTERATION_TYPE_EDEFAULT);
				return;
			case reaPackage.EVENT__NAME:
				setName(NAME_EDEFAULT);
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
			case reaPackage.EVENT__RESOURCE:
				return resource != null;
			case reaPackage.EVENT__PROVIDER:
				return provider != null;
			case reaPackage.EVENT__RECEIVER:
				return receiver != null;
			case reaPackage.EVENT__REA_PROCESS:
				return basicGetREAProcess() != null;
			case reaPackage.EVENT__RIGHT_TRANSFERS:
				return rightTransfers != null && !rightTransfers.isEmpty();
			case reaPackage.EVENT__ALTERATIONS:
				return alterations != null && !alterations.isEmpty();
			case reaPackage.EVENT__ALTERATION_TYPE:
				return alterationType != ALTERATION_TYPE_EDEFAULT;
			case reaPackage.EVENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (alterationType: ");
		result.append(alterationType);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //EventImpl
