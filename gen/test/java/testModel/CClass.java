/**
 */
package testModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CClass</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link testModel.CClass#isCClassAttr1 <em>CClass Attr1</em>}</li>
 *   <li>{@link testModel.CClass#getCClassAttr2 <em>CClass Attr2</em>}</li>
 *   <li>{@link testModel.CClass#getCClassRef1 <em>CClass Ref1</em>}</li>
 * </ul>
 *
 * @see testModel.TestModelPackage#getCClass()
 * @model
 * @generated
 */
public interface CClass extends BClass {
	/**
	 * Returns the value of the '<em><b>CClass Attr1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CClass Attr1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CClass Attr1</em>' attribute.
	 * @see #setCClassAttr1(boolean)
	 * @see testModel.TestModelPackage#getCClass_CClassAttr1()
	 * @model
	 * @generated
	 */
	boolean isCClassAttr1();

	/**
	 * Sets the value of the '{@link testModel.CClass#isCClassAttr1 <em>CClass Attr1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CClass Attr1</em>' attribute.
	 * @see #isCClassAttr1()
	 * @generated
	 */
	void setCClassAttr1(boolean value);

	/**
	 * Returns the value of the '<em><b>CClass Attr2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CClass Attr2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CClass Attr2</em>' attribute.
	 * @see #setCClassAttr2(String)
	 * @see testModel.TestModelPackage#getCClass_CClassAttr2()
	 * @model
	 * @generated
	 */
	String getCClassAttr2();

	/**
	 * Sets the value of the '{@link testModel.CClass#getCClassAttr2 <em>CClass Attr2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CClass Attr2</em>' attribute.
	 * @see #getCClassAttr2()
	 * @generated
	 */
	void setCClassAttr2(String value);

	/**
	 * Returns the value of the '<em><b>CClass Ref1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CClass Ref1</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CClass Ref1</em>' reference.
	 * @see #setCClassRef1(EObject)
	 * @see testModel.TestModelPackage#getCClass_CClassRef1()
	 * @model
	 * @generated
	 */
	EObject getCClassRef1();

	/**
	 * Sets the value of the '{@link testModel.CClass#getCClassRef1 <em>CClass Ref1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CClass Ref1</em>' reference.
	 * @see #getCClassRef1()
	 * @generated
	 */
	void setCClassRef1(EObject value);

} // CClass
