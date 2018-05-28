/**
 */
package testModel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see testModel.TestModelPackage
 * @generated
 */
public interface TestModelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TestModelFactory eINSTANCE = testModel.impl.TestModelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>AClass</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>AClass</em>'.
	 * @generated
	 */
	AClass createAClass();

	/**
	 * Returns a new object of class '<em>BClass</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BClass</em>'.
	 * @generated
	 */
	BClass createBClass();

	/**
	 * Returns a new object of class '<em>CClass</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CClass</em>'.
	 * @generated
	 */
	CClass createCClass();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TestModelPackage getTestModelPackage();

} //TestModelFactory
