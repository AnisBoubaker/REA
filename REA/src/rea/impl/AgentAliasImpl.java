/**
 */
package rea.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import rea.Agent;
import rea.AgentAlias;
import rea.reaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Agent Alias</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link rea.impl.AgentAliasImpl#getAliasName <em>Alias Name</em>}</li>
 *   <li>{@link rea.impl.AgentAliasImpl#isAccountableAgent <em>Accountable Agent</em>}</li>
 *   <li>{@link rea.impl.AgentAliasImpl#getAgent <em>Agent</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AgentAliasImpl extends AgentImpl implements AgentAlias {
	/**
	 * The default value of the '{@link #getAliasName() <em>Alias Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAliasName()
	 * @generated
	 * @ordered
	 */
	protected static final String ALIAS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAliasName() <em>Alias Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAliasName()
	 * @generated
	 * @ordered
	 */
	protected String aliasName = ALIAS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isAccountableAgent() <em>Accountable Agent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAccountableAgent()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ACCOUNTABLE_AGENT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAccountableAgent() <em>Accountable Agent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAccountableAgent()
	 * @generated
	 * @ordered
	 */
	protected boolean accountableAgent = ACCOUNTABLE_AGENT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAgent() <em>Agent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgent()
	 * @generated
	 * @ordered
	 */
	protected Agent agent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AgentAliasImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return reaPackage.Literals.AGENT_ALIAS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAliasName() {
		return aliasName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAliasName(String newAliasName) {
		String oldAliasName = aliasName;
		aliasName = newAliasName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, reaPackage.AGENT_ALIAS__ALIAS_NAME, oldAliasName, aliasName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAccountableAgent() {
		return accountableAgent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccountableAgent(boolean newAccountableAgent) {
		boolean oldAccountableAgent = accountableAgent;
		accountableAgent = newAccountableAgent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, reaPackage.AGENT_ALIAS__ACCOUNTABLE_AGENT, oldAccountableAgent, accountableAgent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Agent getAgent() {
		if (agent != null && agent.eIsProxy()) {
			InternalEObject oldAgent = (InternalEObject)agent;
			agent = (Agent)eResolveProxy(oldAgent);
			if (agent != oldAgent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, reaPackage.AGENT_ALIAS__AGENT, oldAgent, agent));
			}
		}
		return agent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Agent basicGetAgent() {
		return agent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAgent(Agent newAgent) {
		Agent oldAgent = agent;
		agent = newAgent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, reaPackage.AGENT_ALIAS__AGENT, oldAgent, agent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case reaPackage.AGENT_ALIAS__ALIAS_NAME:
				return getAliasName();
			case reaPackage.AGENT_ALIAS__ACCOUNTABLE_AGENT:
				return isAccountableAgent();
			case reaPackage.AGENT_ALIAS__AGENT:
				if (resolve) return getAgent();
				return basicGetAgent();
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
			case reaPackage.AGENT_ALIAS__ALIAS_NAME:
				setAliasName((String)newValue);
				return;
			case reaPackage.AGENT_ALIAS__ACCOUNTABLE_AGENT:
				setAccountableAgent((Boolean)newValue);
				return;
			case reaPackage.AGENT_ALIAS__AGENT:
				setAgent((Agent)newValue);
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
			case reaPackage.AGENT_ALIAS__ALIAS_NAME:
				setAliasName(ALIAS_NAME_EDEFAULT);
				return;
			case reaPackage.AGENT_ALIAS__ACCOUNTABLE_AGENT:
				setAccountableAgent(ACCOUNTABLE_AGENT_EDEFAULT);
				return;
			case reaPackage.AGENT_ALIAS__AGENT:
				setAgent((Agent)null);
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
			case reaPackage.AGENT_ALIAS__ALIAS_NAME:
				return ALIAS_NAME_EDEFAULT == null ? aliasName != null : !ALIAS_NAME_EDEFAULT.equals(aliasName);
			case reaPackage.AGENT_ALIAS__ACCOUNTABLE_AGENT:
				return accountableAgent != ACCOUNTABLE_AGENT_EDEFAULT;
			case reaPackage.AGENT_ALIAS__AGENT:
				return agent != null;
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
		result.append(" (aliasName: ");
		result.append(aliasName);
		result.append(", accountableAgent: ");
		result.append(accountableAgent);
		result.append(')');
		return result.toString();
	}

} //AgentAliasImpl
