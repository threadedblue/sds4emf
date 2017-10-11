/**
 */
package testModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BClass</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link testModel.BClass#isBClassAttr1 <em>BClass Attr1</em>}</li>
 *   <li>{@link testModel.BClass#getBClassAttr2 <em>BClass Attr2</em>}</li>
 *   <li>{@link testModel.BClass#getBClassRef1 <em>BClass Ref1</em>}</li>
 * </ul>
 *
 * @see testModel.TestModelPackage#getBClass()
 * @model
 * @generated
 */
public interface BClass extends AClass {
	/**
	 * Returns the value of the '<em><b>BClass Attr1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>BClass Attr1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>BClass Attr1</em>' attribute.
	 * @see #setBClassAttr1(boolean)
	 * @see testModel.TestModelPackage#getBClass_BClassAttr1()
	 * @model
	 * @generated
	 */
	boolean isBClassAttr1();

	/**
	 * Sets the value of the '{@link testModel.BClass#isBClassAttr1 <em>BClass Attr1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>BClass Attr1</em>' attribute.
	 * @see #isBClassAttr1()
	 * @generated
	 */
	void setBClassAttr1(boolean value);

	/**
	 * Returns the value of the '<em><b>BClass Attr2</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>BClass Attr2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>BClass Attr2</em>' attribute list.
	 * @see testModel.TestModelPackage#getBClass_BClassAttr2()
	 * @model
	 * @generated
	 */
	EList<String> getBClassAttr2();

	/**
	 * Returns the value of the '<em><b>BClass Ref1</b></em>' containment reference list.
	 * The list contents are of type {@link testModel.CClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>BClass Ref1</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>BClass Ref1</em>' containment reference list.
	 * @see testModel.TestModelPackage#getBClass_BClassRef1()
	 * @model containment="true"
	 * @generated
	 */
	EList<CClass> getBClassRef1();

} // BClass
