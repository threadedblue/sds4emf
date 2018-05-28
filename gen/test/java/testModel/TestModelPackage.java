/**
 */
package testModel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see testModel.TestModelFactory
 * @model kind="package"
 * @generated
 */
public interface TestModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "testModel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "ftp://testModel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "testModel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TestModelPackage eINSTANCE = testModel.impl.TestModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link testModel.impl.AClassImpl <em>AClass</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see testModel.impl.AClassImpl
	 * @see testModel.impl.TestModelPackageImpl#getAClass()
	 * @generated
	 */
	int ACLASS = 0;

	/**
	 * The feature id for the '<em><b>AClass Attr1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACLASS__ACLASS_ATTR1 = 0;

	/**
	 * The feature id for the '<em><b>AClass Attr2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACLASS__ACLASS_ATTR2 = 1;

	/**
	 * The feature id for the '<em><b>AClass Ref1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACLASS__ACLASS_REF1 = 2;

	/**
	 * The number of structural features of the '<em>AClass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACLASS_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>AClass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACLASS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link testModel.impl.BClassImpl <em>BClass</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see testModel.impl.BClassImpl
	 * @see testModel.impl.TestModelPackageImpl#getBClass()
	 * @generated
	 */
	int BCLASS = 1;

	/**
	 * The feature id for the '<em><b>AClass Attr1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BCLASS__ACLASS_ATTR1 = ACLASS__ACLASS_ATTR1;

	/**
	 * The feature id for the '<em><b>AClass Attr2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BCLASS__ACLASS_ATTR2 = ACLASS__ACLASS_ATTR2;

	/**
	 * The feature id for the '<em><b>AClass Ref1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BCLASS__ACLASS_REF1 = ACLASS__ACLASS_REF1;

	/**
	 * The feature id for the '<em><b>BClass Attr1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BCLASS__BCLASS_ATTR1 = ACLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>BClass Attr2</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BCLASS__BCLASS_ATTR2 = ACLASS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>BClass Ref1</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BCLASS__BCLASS_REF1 = ACLASS_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>BClass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BCLASS_FEATURE_COUNT = ACLASS_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>BClass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BCLASS_OPERATION_COUNT = ACLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link testModel.impl.CClassImpl <em>CClass</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see testModel.impl.CClassImpl
	 * @see testModel.impl.TestModelPackageImpl#getCClass()
	 * @generated
	 */
	int CCLASS = 2;

	/**
	 * The feature id for the '<em><b>AClass Attr1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CCLASS__ACLASS_ATTR1 = BCLASS__ACLASS_ATTR1;

	/**
	 * The feature id for the '<em><b>AClass Attr2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CCLASS__ACLASS_ATTR2 = BCLASS__ACLASS_ATTR2;

	/**
	 * The feature id for the '<em><b>AClass Ref1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CCLASS__ACLASS_REF1 = BCLASS__ACLASS_REF1;

	/**
	 * The feature id for the '<em><b>BClass Attr1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CCLASS__BCLASS_ATTR1 = BCLASS__BCLASS_ATTR1;

	/**
	 * The feature id for the '<em><b>BClass Attr2</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CCLASS__BCLASS_ATTR2 = BCLASS__BCLASS_ATTR2;

	/**
	 * The feature id for the '<em><b>BClass Ref1</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CCLASS__BCLASS_REF1 = BCLASS__BCLASS_REF1;

	/**
	 * The feature id for the '<em><b>CClass Attr1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CCLASS__CCLASS_ATTR1 = BCLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>CClass Attr2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CCLASS__CCLASS_ATTR2 = BCLASS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>CClass Ref1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CCLASS__CCLASS_REF1 = BCLASS_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>CClass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CCLASS_FEATURE_COUNT = BCLASS_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>CClass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CCLASS_OPERATION_COUNT = BCLASS_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link testModel.AClass <em>AClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AClass</em>'.
	 * @see testModel.AClass
	 * @generated
	 */
	EClass getAClass();

	/**
	 * Returns the meta object for the attribute '{@link testModel.AClass#isAClassAttr1 <em>AClass Attr1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>AClass Attr1</em>'.
	 * @see testModel.AClass#isAClassAttr1()
	 * @see #getAClass()
	 * @generated
	 */
	EAttribute getAClass_AClassAttr1();

	/**
	 * Returns the meta object for the attribute '{@link testModel.AClass#getAClassAttr2 <em>AClass Attr2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>AClass Attr2</em>'.
	 * @see testModel.AClass#getAClassAttr2()
	 * @see #getAClass()
	 * @generated
	 */
	EAttribute getAClass_AClassAttr2();

	/**
	 * Returns the meta object for the containment reference '{@link testModel.AClass#getAClassRef1 <em>AClass Ref1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>AClass Ref1</em>'.
	 * @see testModel.AClass#getAClassRef1()
	 * @see #getAClass()
	 * @generated
	 */
	EReference getAClass_AClassRef1();

	/**
	 * Returns the meta object for class '{@link testModel.BClass <em>BClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BClass</em>'.
	 * @see testModel.BClass
	 * @generated
	 */
	EClass getBClass();

	/**
	 * Returns the meta object for the attribute '{@link testModel.BClass#isBClassAttr1 <em>BClass Attr1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>BClass Attr1</em>'.
	 * @see testModel.BClass#isBClassAttr1()
	 * @see #getBClass()
	 * @generated
	 */
	EAttribute getBClass_BClassAttr1();

	/**
	 * Returns the meta object for the attribute list '{@link testModel.BClass#getBClassAttr2 <em>BClass Attr2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>BClass Attr2</em>'.
	 * @see testModel.BClass#getBClassAttr2()
	 * @see #getBClass()
	 * @generated
	 */
	EAttribute getBClass_BClassAttr2();

	/**
	 * Returns the meta object for the containment reference list '{@link testModel.BClass#getBClassRef1 <em>BClass Ref1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>BClass Ref1</em>'.
	 * @see testModel.BClass#getBClassRef1()
	 * @see #getBClass()
	 * @generated
	 */
	EReference getBClass_BClassRef1();

	/**
	 * Returns the meta object for class '{@link testModel.CClass <em>CClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CClass</em>'.
	 * @see testModel.CClass
	 * @generated
	 */
	EClass getCClass();

	/**
	 * Returns the meta object for the attribute '{@link testModel.CClass#isCClassAttr1 <em>CClass Attr1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>CClass Attr1</em>'.
	 * @see testModel.CClass#isCClassAttr1()
	 * @see #getCClass()
	 * @generated
	 */
	EAttribute getCClass_CClassAttr1();

	/**
	 * Returns the meta object for the attribute '{@link testModel.CClass#getCClassAttr2 <em>CClass Attr2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>CClass Attr2</em>'.
	 * @see testModel.CClass#getCClassAttr2()
	 * @see #getCClass()
	 * @generated
	 */
	EAttribute getCClass_CClassAttr2();

	/**
	 * Returns the meta object for the reference '{@link testModel.CClass#getCClassRef1 <em>CClass Ref1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CClass Ref1</em>'.
	 * @see testModel.CClass#getCClassRef1()
	 * @see #getCClass()
	 * @generated
	 */
	EReference getCClass_CClassRef1();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TestModelFactory getTestModelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link testModel.impl.AClassImpl <em>AClass</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see testModel.impl.AClassImpl
		 * @see testModel.impl.TestModelPackageImpl#getAClass()
		 * @generated
		 */
		EClass ACLASS = eINSTANCE.getAClass();

		/**
		 * The meta object literal for the '<em><b>AClass Attr1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACLASS__ACLASS_ATTR1 = eINSTANCE.getAClass_AClassAttr1();

		/**
		 * The meta object literal for the '<em><b>AClass Attr2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACLASS__ACLASS_ATTR2 = eINSTANCE.getAClass_AClassAttr2();

		/**
		 * The meta object literal for the '<em><b>AClass Ref1</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACLASS__ACLASS_REF1 = eINSTANCE.getAClass_AClassRef1();

		/**
		 * The meta object literal for the '{@link testModel.impl.BClassImpl <em>BClass</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see testModel.impl.BClassImpl
		 * @see testModel.impl.TestModelPackageImpl#getBClass()
		 * @generated
		 */
		EClass BCLASS = eINSTANCE.getBClass();

		/**
		 * The meta object literal for the '<em><b>BClass Attr1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BCLASS__BCLASS_ATTR1 = eINSTANCE.getBClass_BClassAttr1();

		/**
		 * The meta object literal for the '<em><b>BClass Attr2</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BCLASS__BCLASS_ATTR2 = eINSTANCE.getBClass_BClassAttr2();

		/**
		 * The meta object literal for the '<em><b>BClass Ref1</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BCLASS__BCLASS_REF1 = eINSTANCE.getBClass_BClassRef1();

		/**
		 * The meta object literal for the '{@link testModel.impl.CClassImpl <em>CClass</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see testModel.impl.CClassImpl
		 * @see testModel.impl.TestModelPackageImpl#getCClass()
		 * @generated
		 */
		EClass CCLASS = eINSTANCE.getCClass();

		/**
		 * The meta object literal for the '<em><b>CClass Attr1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CCLASS__CCLASS_ATTR1 = eINSTANCE.getCClass_CClassAttr1();

		/**
		 * The meta object literal for the '<em><b>CClass Attr2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CCLASS__CCLASS_ATTR2 = eINSTANCE.getCClass_CClassAttr2();

		/**
		 * The meta object literal for the '<em><b>CClass Ref1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CCLASS__CCLASS_REF1 = eINSTANCE.getCClass_CClassRef1();

	}

} //TestModelPackage
