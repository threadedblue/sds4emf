/**
 */
package testModel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import testModel.CClass;
import testModel.TestModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CClass</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link testModel.impl.CClassImpl#isCClassAttr1 <em>CClass Attr1</em>}</li>
 *   <li>{@link testModel.impl.CClassImpl#getCClassAttr2 <em>CClass Attr2</em>}</li>
 *   <li>{@link testModel.impl.CClassImpl#getCClassRef1 <em>CClass Ref1</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CClassImpl extends BClassImpl implements CClass {
	/**
	 * The default value of the '{@link #isCClassAttr1() <em>CClass Attr1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCClassAttr1()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CCLASS_ATTR1_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCClassAttr1() <em>CClass Attr1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCClassAttr1()
	 * @generated
	 * @ordered
	 */
	protected boolean cClassAttr1 = CCLASS_ATTR1_EDEFAULT;

	/**
	 * The default value of the '{@link #getCClassAttr2() <em>CClass Attr2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCClassAttr2()
	 * @generated
	 * @ordered
	 */
	protected static final String CCLASS_ATTR2_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCClassAttr2() <em>CClass Attr2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCClassAttr2()
	 * @generated
	 * @ordered
	 */
	protected String cClassAttr2 = CCLASS_ATTR2_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCClassRef1() <em>CClass Ref1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCClassRef1()
	 * @generated
	 * @ordered
	 */
	protected EObject cClassRef1;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TestModelPackage.Literals.CCLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCClassAttr1() {
		return cClassAttr1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCClassAttr1(boolean newCClassAttr1) {
		boolean oldCClassAttr1 = cClassAttr1;
		cClassAttr1 = newCClassAttr1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestModelPackage.CCLASS__CCLASS_ATTR1, oldCClassAttr1, cClassAttr1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCClassAttr2() {
		return cClassAttr2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCClassAttr2(String newCClassAttr2) {
		String oldCClassAttr2 = cClassAttr2;
		cClassAttr2 = newCClassAttr2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestModelPackage.CCLASS__CCLASS_ATTR2, oldCClassAttr2, cClassAttr2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getCClassRef1() {
		if (cClassRef1 != null && cClassRef1.eIsProxy()) {
			InternalEObject oldCClassRef1 = (InternalEObject)cClassRef1;
			cClassRef1 = eResolveProxy(oldCClassRef1);
			if (cClassRef1 != oldCClassRef1) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TestModelPackage.CCLASS__CCLASS_REF1, oldCClassRef1, cClassRef1));
			}
		}
		return cClassRef1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetCClassRef1() {
		return cClassRef1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCClassRef1(EObject newCClassRef1) {
		EObject oldCClassRef1 = cClassRef1;
		cClassRef1 = newCClassRef1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestModelPackage.CCLASS__CCLASS_REF1, oldCClassRef1, cClassRef1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TestModelPackage.CCLASS__CCLASS_ATTR1:
				return isCClassAttr1();
			case TestModelPackage.CCLASS__CCLASS_ATTR2:
				return getCClassAttr2();
			case TestModelPackage.CCLASS__CCLASS_REF1:
				if (resolve) return getCClassRef1();
				return basicGetCClassRef1();
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
			case TestModelPackage.CCLASS__CCLASS_ATTR1:
				setCClassAttr1((Boolean)newValue);
				return;
			case TestModelPackage.CCLASS__CCLASS_ATTR2:
				setCClassAttr2((String)newValue);
				return;
			case TestModelPackage.CCLASS__CCLASS_REF1:
				setCClassRef1((EObject)newValue);
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
			case TestModelPackage.CCLASS__CCLASS_ATTR1:
				setCClassAttr1(CCLASS_ATTR1_EDEFAULT);
				return;
			case TestModelPackage.CCLASS__CCLASS_ATTR2:
				setCClassAttr2(CCLASS_ATTR2_EDEFAULT);
				return;
			case TestModelPackage.CCLASS__CCLASS_REF1:
				setCClassRef1((EObject)null);
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
			case TestModelPackage.CCLASS__CCLASS_ATTR1:
				return cClassAttr1 != CCLASS_ATTR1_EDEFAULT;
			case TestModelPackage.CCLASS__CCLASS_ATTR2:
				return CCLASS_ATTR2_EDEFAULT == null ? cClassAttr2 != null : !CCLASS_ATTR2_EDEFAULT.equals(cClassAttr2);
			case TestModelPackage.CCLASS__CCLASS_REF1:
				return cClassRef1 != null;
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
		result.append(" (CClassAttr1: ");
		result.append(cClassAttr1);
		result.append(", CClassAttr2: ");
		result.append(cClassAttr2);
		result.append(')');
		return result.toString();
	}

} //CClassImpl
