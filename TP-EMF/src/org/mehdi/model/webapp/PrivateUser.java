/**
 */
package org.mehdi.model.webapp;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Private User</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mehdi.model.webapp.PrivateUser#getPassword <em>Password</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mehdi.model.webapp.webappPackage#getPrivateUser()
 * @model
 * @generated
 */
public interface PrivateUser extends User {
	/**
	 * Returns the value of the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Password</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Password</em>' attribute.
	 * @see #setPassword(int)
	 * @see org.mehdi.model.webapp.webappPackage#getPrivateUser_Password()
	 * @model
	 * @generated
	 */
	int getPassword();

	/**
	 * Sets the value of the '{@link org.mehdi.model.webapp.PrivateUser#getPassword <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Password</em>' attribute.
	 * @see #getPassword()
	 * @generated
	 */
	void setPassword(int value);

} // PrivateUser
