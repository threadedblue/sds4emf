/**
 */
package testModel.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import testModel.AClass;
import testModel.BClass;
import testModel.TestModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>AClass</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link testModel.impl.AClassImpl#isAClassAttr1 <em>AClass Attr1</em>}</li>
 *   <li>{@link testModel.impl.AClassImpl#getAClassAttr2 <em>AClass Attr2</em>}</li>
 *   <li>{@link testModel.impl.AClassImpl#getAClassRef1 <em>AClass Ref1</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AClassImpl extends MinimalEObjectImpl.Container implements AClass {
	/**
	 * The default value of the '{@link #isAClassAttr1() <em>AClass Attr1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAClassAttr1()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ACLASS_ATTR1_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAClassAttr1() <em>AClass Attr1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAClassAttr1()
	 * @generated
	 * @ordered
	 */
	protected boolean aClassAttr1 = ACLASS_ATTR1_EDEFAULT;

	/**
	 * The default value of the '{@link #getAClassAttr2() <em>AClass Attr2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAClassAttr2()
	 * @generated
	 * @ordered
	 */
	protected static final String ACLASS_ATTR2_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAClassAttr2() <em>AClass Attr2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAClassAttr2()
	 * @generated
	 * @ordered
	 */
	protected String aClassAttr2 = ACLASS_ATTR2_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAClassRef1() <em>AClass Ref1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAClassRef1()
	 * @generated
	 * @ordered
	 */
	protected BClass aClassRef1;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TestModelPackage.Literals.ACLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAClassAttr1() {
		return aClassAttr1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAClassAttr1(boolean newAClassAttr1) {
		boolean oldAClassAttr1 = aClassAttr1;
		aClassAttr1 = newAClassAttr1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestModelPackage.ACLASS__ACLASS_ATTR1, oldAClassAttr1, aClassAttr1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAClassAttr2() {
		return aClassAttr2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAClassAttr2(String newAClassAttr2) {
		String oldAClassAttr2 = aClassAttr2;
		aClassAttr2 = newAClassAttr2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestModelPackage.ACLASS__ACLASS_ATTR2, oldAClassAttr2, aClassAttr2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BClass getAClassRef1() {
		return aClassRef1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAClassRef1(BClass newAClassRef1, NotificationChain msgs) {
		BClass oldAClassRef1 = aClassRef1;
		aClassRef1 = newAClassRef1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TestModelPackage.ACLASS__ACLASS_REF1, oldAClassRef1, newAClassRef1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAClassRef1(BClass newAClassRef1) {
		if (newAClassRef1 != aClassRef1) {
			NotificationChain msgs = null;
			if (aClassRef1 != null)
				msgs = ((InternalEObject)aClassRef1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TestModelPackage.ACLASS__ACLASS_REF1, null, msgs);
			if (newAClassRef1 != null)
				msgs = ((InternalEObject)newAClassRef1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TestModelPackage.ACLASS__ACLASS_REF1, null, msgs);
			msgs = basicSetAClassRef1(newAClassRef1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestModelPackage.ACLASS__ACLASS_REF1, newAClassRef1, newAClassRef1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TestModelPackage.ACLASS__ACLASS_REF1:
				return basicSetAClassRef1(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TestModelPackage.ACLASS__ACLASS_ATTR1:
				return isAClassAttr1();
			case TestModelPackage.ACLASS__ACLASS_ATTR2:
				return getAClassAttr2();
			case TestModelPackage.ACLASS__ACLASS_REF1:
				return getAClassRef1();
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
			case TestModelPackage.ACLASS__ACLASS_ATTR1:
				setAClassAttr1((Boolean)newValue);
				return;
			case TestModelPackage.ACLASS__ACLASS_ATTR2:
				setAClassAttr2((String)newValue);
				return;
			case TestModelPackage.ACLASS__ACLASS_REF1:
				setAClassRef1((BClass)newValue);
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
			case TestModelPackage.ACLASS__ACLASS_ATTR1:
				setAClassAttr1(ACLASS_ATTR1_EDEFAULT);
				return;
			case TestModelPackage.ACLASS__ACLASS_ATTR2:
				setAClassAttr2(ACLASS_ATTR2_EDEFAULT);
				return;
			case TestModelPackage.ACLASS__ACLASS_REF1:
				setAClassRef1((BClass)null);
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
			case TestModelPackage.ACLASS__ACLASS_ATTR1:
				return aClassAttr1 != ACLASS_ATTR1_EDEFAULT;
			case TestModelPackage.ACLASS__ACLASS_ATTR2:
				return ACLASS_ATTR2_EDEFAULT == null ? aClassAttr2 != null : !ACLASS_ATTR2_EDEFAULT.equals(aClassAttr2);
			case TestModelPackage.ACLASS__ACLASS_REF1:
				return aClassRef1 != null;
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
		result.append(" (AClassAttr1: ");
		result.append(aClassAttr1);
		result.append(", AClassAttr2: ");
		result.append(aClassAttr2);
		result.append(')');
		return result.toString();
	}

} //AClassImpl
