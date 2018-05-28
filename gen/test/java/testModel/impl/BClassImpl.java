/**
 */
package testModel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import testModel.BClass;
import testModel.CClass;
import testModel.TestModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BClass</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link testModel.impl.BClassImpl#isBClassAttr1 <em>BClass Attr1</em>}</li>
 *   <li>{@link testModel.impl.BClassImpl#getBClassAttr2 <em>BClass Attr2</em>}</li>
 *   <li>{@link testModel.impl.BClassImpl#getBClassRef1 <em>BClass Ref1</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BClassImpl extends AClassImpl implements BClass {
	/**
	 * The default value of the '{@link #isBClassAttr1() <em>BClass Attr1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBClassAttr1()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BCLASS_ATTR1_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBClassAttr1() <em>BClass Attr1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBClassAttr1()
	 * @generated
	 * @ordered
	 */
	protected boolean bClassAttr1 = BCLASS_ATTR1_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBClassAttr2() <em>BClass Attr2</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBClassAttr2()
	 * @generated
	 * @ordered
	 */
	protected EList<String> bClassAttr2;

	/**
	 * The cached value of the '{@link #getBClassRef1() <em>BClass Ref1</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBClassRef1()
	 * @generated
	 * @ordered
	 */
	protected EList<CClass> bClassRef1;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TestModelPackage.Literals.BCLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isBClassAttr1() {
		return bClassAttr1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBClassAttr1(boolean newBClassAttr1) {
		boolean oldBClassAttr1 = bClassAttr1;
		bClassAttr1 = newBClassAttr1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestModelPackage.BCLASS__BCLASS_ATTR1, oldBClassAttr1, bClassAttr1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getBClassAttr2() {
		if (bClassAttr2 == null) {
			bClassAttr2 = new EDataTypeUniqueEList<String>(String.class, this, TestModelPackage.BCLASS__BCLASS_ATTR2);
		}
		return bClassAttr2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CClass> getBClassRef1() {
		if (bClassRef1 == null) {
			bClassRef1 = new EObjectContainmentEList<CClass>(CClass.class, this, TestModelPackage.BCLASS__BCLASS_REF1);
		}
		return bClassRef1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TestModelPackage.BCLASS__BCLASS_REF1:
				return ((InternalEList<?>)getBClassRef1()).basicRemove(otherEnd, msgs);
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
			case TestModelPackage.BCLASS__BCLASS_ATTR1:
				return isBClassAttr1();
			case TestModelPackage.BCLASS__BCLASS_ATTR2:
				return getBClassAttr2();
			case TestModelPackage.BCLASS__BCLASS_REF1:
				return getBClassRef1();
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
			case TestModelPackage.BCLASS__BCLASS_ATTR1:
				setBClassAttr1((Boolean)newValue);
				return;
			case TestModelPackage.BCLASS__BCLASS_ATTR2:
				getBClassAttr2().clear();
				getBClassAttr2().addAll((Collection<? extends String>)newValue);
				return;
			case TestModelPackage.BCLASS__BCLASS_REF1:
				getBClassRef1().clear();
				getBClassRef1().addAll((Collection<? extends CClass>)newValue);
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
			case TestModelPackage.BCLASS__BCLASS_ATTR1:
				setBClassAttr1(BCLASS_ATTR1_EDEFAULT);
				return;
			case TestModelPackage.BCLASS__BCLASS_ATTR2:
				getBClassAttr2().clear();
				return;
			case TestModelPackage.BCLASS__BCLASS_REF1:
				getBClassRef1().clear();
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
			case TestModelPackage.BCLASS__BCLASS_ATTR1:
				return bClassAttr1 != BCLASS_ATTR1_EDEFAULT;
			case TestModelPackage.BCLASS__BCLASS_ATTR2:
				return bClassAttr2 != null && !bClassAttr2.isEmpty();
			case TestModelPackage.BCLASS__BCLASS_REF1:
				return bClassRef1 != null && !bClassRef1.isEmpty();
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
		result.append(" (BClassAttr1: ");
		result.append(bClassAttr1);
		result.append(", BClassAttr2: ");
		result.append(bClassAttr2);
		result.append(')');
		return result.toString();
	}

} //BClassImpl
