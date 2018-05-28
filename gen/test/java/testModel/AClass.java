/**
 */
package testModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>AClass</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link testModel.AClass#isAClassAttr1 <em>AClass Attr1</em>}</li>
 *   <li>{@link testModel.AClass#getAClassAttr2 <em>AClass Attr2</em>}</li>
 *   <li>{@link testModel.AClass#getAClassRef1 <em>AClass Ref1</em>}</li>
 * </ul>
 *
 * @see testModel.TestModelPackage#getAClass()
 * @model
 * @generated
 */
public interface AClass extends EObject {
	/**
	 * Returns the value of the '<em><b>AClass Attr1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AClass Attr1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AClass Attr1</em>' attribute.
	 * @see #setAClassAttr1(boolean)
	 * @see testModel.TestModelPackage#getAClass_AClassAttr1()
	 * @model
	 * @generated
	 */
	boolean isAClassAttr1();

	/**
	 * Sets the value of the '{@link testModel.AClass#isAClassAttr1 <em>AClass Attr1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AClass Attr1</em>' attribute.
	 * @see #isAClassAttr1()
	 * @generated
	 */
	void setAClassAttr1(boolean value);

	/**
	 * Returns the value of the '<em><b>AClass Attr2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AClass Attr2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AClass Attr2</em>' attribute.
	 * @see #setAClassAttr2(String)
	 * @see testModel.TestModelPackage#getAClass_AClassAttr2()
	 * @model
	 * @generated
	 */
	String getAClassAttr2();

	/**
	 * Sets the value of the '{@link testModel.AClass#getAClassAttr2 <em>AClass Attr2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AClass Attr2</em>' attribute.
	 * @see #getAClassAttr2()
	 * @generated
	 */
	void setAClassAttr2(String value);

	/**
	 * Returns the value of the '<em><b>AClass Ref1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AClass Ref1</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AClass Ref1</em>' containment reference.
	 * @see #setAClassRef1(BClass)
	 * @see testModel.TestModelPackage#getAClass_AClassRef1()
	 * @model containment="true"
	 * @generated
	 */
	BClass getAClassRef1();

	/**
	 * Sets the value of the '{@link testModel.AClass#getAClassRef1 <em>AClass Ref1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AClass Ref1</em>' containment reference.
	 * @see #getAClassRef1()
	 * @generated
	 */
	void setAClassRef1(BClass value);

} // AClass
