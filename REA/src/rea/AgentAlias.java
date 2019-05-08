/**
 */
package rea;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Agent Alias</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link rea.AgentAlias#getAliasName <em>Alias Name</em>}</li>
 *   <li>{@link rea.AgentAlias#isAccountableAgent <em>Accountable Agent</em>}</li>
 *   <li>{@link rea.AgentAlias#getAgent <em>Agent</em>}</li>
 * </ul>
 * </p>
 *
 * @see rea.reaPackage#getAgentAlias()
 * @model
 * @generated
 */
public interface AgentAlias extends Agent {
	/**
	 * Returns the value of the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alias Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alias Name</em>' attribute.
	 * @see #setAliasName(String)
	 * @see rea.reaPackage#getAgentAlias_AliasName()
	 * @model
	 * @generated
	 */
	String getAliasName();

	/**
	 * Sets the value of the '{@link rea.AgentAlias#getAliasName <em>Alias Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alias Name</em>' attribute.
	 * @see #getAliasName()
	 * @generated
	 */
	void setAliasName(String value);

	/**
	 * Returns the value of the '<em><b>Accountable Agent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Accountable Agent</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accountable Agent</em>' attribute.
	 * @see #setAccountableAgent(boolean)
	 * @see rea.reaPackage#getAgentAlias_AccountableAgent()
	 * @model
	 * @generated
	 */
	boolean isAccountableAgent();

	/**
	 * Sets the value of the '{@link rea.AgentAlias#isAccountableAgent <em>Accountable Agent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accountable Agent</em>' attribute.
	 * @see #isAccountableAgent()
	 * @generated
	 */
	void setAccountableAgent(boolean value);

	/**
	 * Returns the value of the '<em><b>Agent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Agent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Agent</em>' reference.
	 * @see #setAgent(Agent)
	 * @see rea.reaPackage#getAgentAlias_Agent()
	 * @model
	 * @generated
	 */
	Agent getAgent();

	/**
	 * Sets the value of the '{@link rea.AgentAlias#getAgent <em>Agent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Agent</em>' reference.
	 * @see #getAgent()
	 * @generated
	 */
	void setAgent(Agent value);

} // AgentAlias
