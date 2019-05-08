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
import org.eclipse.emf.ecore.util.InternalEList;

import rea.Agent;
import rea.AgentAlias;
import rea.BusinessProcessDefinition;
import rea.BusinessProcessInstance;
import rea.Valuable;
import rea.ValueModel;
import rea.reaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Value Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link rea.impl.ValueModelImpl#getResources <em>Resources</em>}</li>
 *   <li>{@link rea.impl.ValueModelImpl#getAgents <em>Agents</em>}</li>
 *   <li>{@link rea.impl.ValueModelImpl#getProcessDefinition <em>Process Definition</em>}</li>
 *   <li>{@link rea.impl.ValueModelImpl#getInstances <em>Instances</em>}</li>
 *   <li>{@link rea.impl.ValueModelImpl#getCompensationProcess <em>Compensation Process</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ValueModelImpl extends EObjectImpl implements ValueModel {
	/**
	 * The cached value of the '{@link #getResources() <em>Resources</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResources()
	 * @generated
	 * @ordered
	 */
	protected EList<Valuable> resources;

	/**
	 * The cached value of the '{@link #getAgents() <em>Agents</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgents()
	 * @generated
	 * @ordered
	 */
	protected EList<Agent> agents;

	/**
	 * The cached value of the '{@link #getProcessDefinition() <em>Process Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessDefinition()
	 * @generated
	 * @ordered
	 */
	protected BusinessProcessDefinition processDefinition;

	/**
	 * The cached value of the '{@link #getInstances() <em>Instances</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstances()
	 * @generated
	 * @ordered
	 */
	protected EList<BusinessProcessInstance> instances;

	/**
	 * The cached value of the '{@link #getCompensationProcess() <em>Compensation Process</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompensationProcess()
	 * @generated
	 * @ordered
	 */
	protected BusinessProcessDefinition compensationProcess;

	/**
	 * This is true if the Compensation Process containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean compensationProcessESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValueModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return reaPackage.Literals.VALUE_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Valuable> getResources() {
		if (resources == null) {
			resources = new EObjectContainmentEList<Valuable>(Valuable.class, this, reaPackage.VALUE_MODEL__RESOURCES);
		}
		return resources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Agent> getAgents() {
		if (agents == null) {
			agents = new EObjectContainmentEList<Agent>(Agent.class, this, reaPackage.VALUE_MODEL__AGENTS);
		}
		return agents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessProcessDefinition getProcessDefinition() {
		return processDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProcessDefinition(BusinessProcessDefinition newProcessDefinition, NotificationChain msgs) {
		BusinessProcessDefinition oldProcessDefinition = processDefinition;
		processDefinition = newProcessDefinition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, reaPackage.VALUE_MODEL__PROCESS_DEFINITION, oldProcessDefinition, newProcessDefinition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcessDefinition(BusinessProcessDefinition newProcessDefinition) {
		if (newProcessDefinition != processDefinition) {
			NotificationChain msgs = null;
			if (processDefinition != null)
				msgs = ((InternalEObject)processDefinition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - reaPackage.VALUE_MODEL__PROCESS_DEFINITION, null, msgs);
			if (newProcessDefinition != null)
				msgs = ((InternalEObject)newProcessDefinition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - reaPackage.VALUE_MODEL__PROCESS_DEFINITION, null, msgs);
			msgs = basicSetProcessDefinition(newProcessDefinition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, reaPackage.VALUE_MODEL__PROCESS_DEFINITION, newProcessDefinition, newProcessDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BusinessProcessInstance> getInstances() {
		if (instances == null) {
			instances = new EObjectContainmentEList<BusinessProcessInstance>(BusinessProcessInstance.class, this, reaPackage.VALUE_MODEL__INSTANCES);
		}
		return instances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessProcessDefinition getCompensationProcess() {
		return compensationProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCompensationProcess(BusinessProcessDefinition newCompensationProcess, NotificationChain msgs) {
		BusinessProcessDefinition oldCompensationProcess = compensationProcess;
		compensationProcess = newCompensationProcess;
		boolean oldCompensationProcessESet = compensationProcessESet;
		compensationProcessESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, reaPackage.VALUE_MODEL__COMPENSATION_PROCESS, oldCompensationProcess, newCompensationProcess, !oldCompensationProcessESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompensationProcess(BusinessProcessDefinition newCompensationProcess) {
		if (newCompensationProcess != compensationProcess) {
			NotificationChain msgs = null;
			if (compensationProcess != null)
				msgs = ((InternalEObject)compensationProcess).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - reaPackage.VALUE_MODEL__COMPENSATION_PROCESS, null, msgs);
			if (newCompensationProcess != null)
				msgs = ((InternalEObject)newCompensationProcess).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - reaPackage.VALUE_MODEL__COMPENSATION_PROCESS, null, msgs);
			msgs = basicSetCompensationProcess(newCompensationProcess, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldCompensationProcessESet = compensationProcessESet;
			compensationProcessESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, reaPackage.VALUE_MODEL__COMPENSATION_PROCESS, newCompensationProcess, newCompensationProcess, !oldCompensationProcessESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetCompensationProcess(NotificationChain msgs) {
		BusinessProcessDefinition oldCompensationProcess = compensationProcess;
		compensationProcess = null;
		boolean oldCompensationProcessESet = compensationProcessESet;
		compensationProcessESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, reaPackage.VALUE_MODEL__COMPENSATION_PROCESS, oldCompensationProcess, null, oldCompensationProcessESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCompensationProcess() {
		if (compensationProcess != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)compensationProcess).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - reaPackage.VALUE_MODEL__COMPENSATION_PROCESS, null, msgs);
			msgs = basicUnsetCompensationProcess(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldCompensationProcessESet = compensationProcessESet;
			compensationProcessESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, reaPackage.VALUE_MODEL__COMPENSATION_PROCESS, null, null, oldCompensationProcessESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCompensationProcess() {
		return compensationProcessESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AgentAlias getAccountableAgent() {
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case reaPackage.VALUE_MODEL__RESOURCES:
				return ((InternalEList<?>)getResources()).basicRemove(otherEnd, msgs);
			case reaPackage.VALUE_MODEL__AGENTS:
				return ((InternalEList<?>)getAgents()).basicRemove(otherEnd, msgs);
			case reaPackage.VALUE_MODEL__PROCESS_DEFINITION:
				return basicSetProcessDefinition(null, msgs);
			case reaPackage.VALUE_MODEL__INSTANCES:
				return ((InternalEList<?>)getInstances()).basicRemove(otherEnd, msgs);
			case reaPackage.VALUE_MODEL__COMPENSATION_PROCESS:
				return basicUnsetCompensationProcess(msgs);
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
			case reaPackage.VALUE_MODEL__RESOURCES:
				return getResources();
			case reaPackage.VALUE_MODEL__AGENTS:
				return getAgents();
			case reaPackage.VALUE_MODEL__PROCESS_DEFINITION:
				return getProcessDefinition();
			case reaPackage.VALUE_MODEL__INSTANCES:
				return getInstances();
			case reaPackage.VALUE_MODEL__COMPENSATION_PROCESS:
				return getCompensationProcess();
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
			case reaPackage.VALUE_MODEL__RESOURCES:
				getResources().clear();
				getResources().addAll((Collection<? extends Valuable>)newValue);
				return;
			case reaPackage.VALUE_MODEL__AGENTS:
				getAgents().clear();
				getAgents().addAll((Collection<? extends Agent>)newValue);
				return;
			case reaPackage.VALUE_MODEL__PROCESS_DEFINITION:
				setProcessDefinition((BusinessProcessDefinition)newValue);
				return;
			case reaPackage.VALUE_MODEL__INSTANCES:
				getInstances().clear();
				getInstances().addAll((Collection<? extends BusinessProcessInstance>)newValue);
				return;
			case reaPackage.VALUE_MODEL__COMPENSATION_PROCESS:
				setCompensationProcess((BusinessProcessDefinition)newValue);
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
			case reaPackage.VALUE_MODEL__RESOURCES:
				getResources().clear();
				return;
			case reaPackage.VALUE_MODEL__AGENTS:
				getAgents().clear();
				return;
			case reaPackage.VALUE_MODEL__PROCESS_DEFINITION:
				setProcessDefinition((BusinessProcessDefinition)null);
				return;
			case reaPackage.VALUE_MODEL__INSTANCES:
				getInstances().clear();
				return;
			case reaPackage.VALUE_MODEL__COMPENSATION_PROCESS:
				unsetCompensationProcess();
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
			case reaPackage.VALUE_MODEL__RESOURCES:
				return resources != null && !resources.isEmpty();
			case reaPackage.VALUE_MODEL__AGENTS:
				return agents != null && !agents.isEmpty();
			case reaPackage.VALUE_MODEL__PROCESS_DEFINITION:
				return processDefinition != null;
			case reaPackage.VALUE_MODEL__INSTANCES:
				return instances != null && !instances.isEmpty();
			case reaPackage.VALUE_MODEL__COMPENSATION_PROCESS:
				return isSetCompensationProcess();
		}
		return super.eIsSet(featureID);
	}

} //ValueModelImpl
