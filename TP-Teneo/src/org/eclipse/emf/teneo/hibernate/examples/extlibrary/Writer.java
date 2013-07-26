/**
 * <copyright>
 * </copyright>
 *
 * $Id: Writer.java,v 1.4 2010/03/03 12:29:32 mtaal Exp $
 */
package org.eclipse.emf.teneo.hibernate.examples.extlibrary;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Writer</b></em>'. <!--
 * end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.emf.teneo.hibernate.examples.extlibrary.Writer#getName <em>Name</em>}</li>
 * <li>{@link org.eclipse.emf.teneo.hibernate.examples.extlibrary.Writer#getBooks <em>Books</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.emf.teneo.hibernate.examples.extlibrary.ExtlibraryPackage#getWriter()
 * @model
 * @generated
 */
public interface Writer extends Person {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.emf.teneo.hibernate.examples.extlibrary.ExtlibraryPackage#getWriter_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '
	 * {@link org.eclipse.emf.teneo.hibernate.examples.extlibrary.Writer#getName <em>Name</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Books</b></em>' reference list. The list contents are of type
	 * {@link org.eclipse.emf.teneo.hibernate.examples.extlibrary.Book}. It is bidirectional and its
	 * opposite is '{@link org.eclipse.emf.teneo.hibernate.examples.extlibrary.Book#getAuthor
	 * <em>Author</em>}'. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Books</em>' reference list isn't clear, there really should be more
	 * of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Books</em>' reference list.
	 * @see org.eclipse.emf.teneo.hibernate.examples.extlibrary.ExtlibraryPackage#getWriter_Books()
	 * @see org.eclipse.emf.teneo.hibernate.examples.extlibrary.Book#getAuthor
	 * @model opposite="author"
	 * @generated
	 */
	EList<Book> getBooks();

} // Writer
