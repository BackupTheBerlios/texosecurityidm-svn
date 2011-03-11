/**
* This file is part of WSSecurityPolicyEditor.
* Copyright (c) 2011 Fraunhofer FOKUS. All Rights Reserved
* Authors: Tom Sattler
* 
* WSSecurityPolicyEditor is free software: you can redistribute it and/or modify
* it under the terms of the GNU Affero General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* any later version.
*
* WSSecurityPolicyEditor is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
* GNU Affero General Public License for more details.
* 
* You should have received a copy of the GNU Affero General Public License
* along with WSSecurityPolicyEditor.  If not, see <http://www.gnu.org/licenses/>.
* 
* For more information, please contact Fraunhofer FOKUS at this
* address: elankontakt [at] fokus [dot] fraunhofer [dot] de
* http://www.fokus.fraunhofer.de
*/
package org.w3._2000._09.xmldsig.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.w3._2000._09.xmldsig.DSAKeyValueType1;
import org.w3._2000._09.xmldsig.XmldsigPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DSA Key Value Type1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.w3._2000._09.xmldsig.impl.DSAKeyValueType1Impl#getP <em>P</em>}</li>
 *   <li>{@link org.w3._2000._09.xmldsig.impl.DSAKeyValueType1Impl#getQ <em>Q</em>}</li>
 *   <li>{@link org.w3._2000._09.xmldsig.impl.DSAKeyValueType1Impl#getG <em>G</em>}</li>
 *   <li>{@link org.w3._2000._09.xmldsig.impl.DSAKeyValueType1Impl#getY <em>Y</em>}</li>
 *   <li>{@link org.w3._2000._09.xmldsig.impl.DSAKeyValueType1Impl#getJ <em>J</em>}</li>
 *   <li>{@link org.w3._2000._09.xmldsig.impl.DSAKeyValueType1Impl#getSeed <em>Seed</em>}</li>
 *   <li>{@link org.w3._2000._09.xmldsig.impl.DSAKeyValueType1Impl#getPgenCounter <em>Pgen Counter</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DSAKeyValueType1Impl extends EObjectImpl implements DSAKeyValueType1 {
	/**
	 * The default value of the '{@link #getP() <em>P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getP()
	 * @generated
	 * @ordered
	 */
	protected static final byte[] P_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getP() <em>P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getP()
	 * @generated
	 * @ordered
	 */
	protected byte[] p = P_EDEFAULT;

	/**
	 * The default value of the '{@link #getQ() <em>Q</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQ()
	 * @generated
	 * @ordered
	 */
	protected static final byte[] Q_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQ() <em>Q</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQ()
	 * @generated
	 * @ordered
	 */
	protected byte[] q = Q_EDEFAULT;

	/**
	 * The default value of the '{@link #getG() <em>G</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getG()
	 * @generated
	 * @ordered
	 */
	protected static final byte[] G_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getG() <em>G</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getG()
	 * @generated
	 * @ordered
	 */
	protected byte[] g = G_EDEFAULT;

	/**
	 * The default value of the '{@link #getY() <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY()
	 * @generated
	 * @ordered
	 */
	protected static final byte[] Y_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getY() <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY()
	 * @generated
	 * @ordered
	 */
	protected byte[] y = Y_EDEFAULT;

	/**
	 * The default value of the '{@link #getJ() <em>J</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJ()
	 * @generated
	 * @ordered
	 */
	protected static final byte[] J_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJ() <em>J</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJ()
	 * @generated
	 * @ordered
	 */
	protected byte[] j = J_EDEFAULT;

	/**
	 * The default value of the '{@link #getSeed() <em>Seed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeed()
	 * @generated
	 * @ordered
	 */
	protected static final byte[] SEED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSeed() <em>Seed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeed()
	 * @generated
	 * @ordered
	 */
	protected byte[] seed = SEED_EDEFAULT;

	/**
	 * The default value of the '{@link #getPgenCounter() <em>Pgen Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPgenCounter()
	 * @generated
	 * @ordered
	 */
	protected static final byte[] PGEN_COUNTER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPgenCounter() <em>Pgen Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPgenCounter()
	 * @generated
	 * @ordered
	 */
	protected byte[] pgenCounter = PGEN_COUNTER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DSAKeyValueType1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmldsigPackage.Literals.DSA_KEY_VALUE_TYPE1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte[] getP() {
		return p;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setP(byte[] newP) {
		byte[] oldP = p;
		p = newP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmldsigPackage.DSA_KEY_VALUE_TYPE1__P, oldP, p));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte[] getQ() {
		return q;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQ(byte[] newQ) {
		byte[] oldQ = q;
		q = newQ;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmldsigPackage.DSA_KEY_VALUE_TYPE1__Q, oldQ, q));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte[] getG() {
		return g;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setG(byte[] newG) {
		byte[] oldG = g;
		g = newG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmldsigPackage.DSA_KEY_VALUE_TYPE1__G, oldG, g));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte[] getY() {
		return y;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setY(byte[] newY) {
		byte[] oldY = y;
		y = newY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmldsigPackage.DSA_KEY_VALUE_TYPE1__Y, oldY, y));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte[] getJ() {
		return j;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJ(byte[] newJ) {
		byte[] oldJ = j;
		j = newJ;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmldsigPackage.DSA_KEY_VALUE_TYPE1__J, oldJ, j));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte[] getSeed() {
		return seed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeed(byte[] newSeed) {
		byte[] oldSeed = seed;
		seed = newSeed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmldsigPackage.DSA_KEY_VALUE_TYPE1__SEED, oldSeed, seed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte[] getPgenCounter() {
		return pgenCounter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPgenCounter(byte[] newPgenCounter) {
		byte[] oldPgenCounter = pgenCounter;
		pgenCounter = newPgenCounter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmldsigPackage.DSA_KEY_VALUE_TYPE1__PGEN_COUNTER, oldPgenCounter, pgenCounter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case XmldsigPackage.DSA_KEY_VALUE_TYPE1__P:
				return getP();
			case XmldsigPackage.DSA_KEY_VALUE_TYPE1__Q:
				return getQ();
			case XmldsigPackage.DSA_KEY_VALUE_TYPE1__G:
				return getG();
			case XmldsigPackage.DSA_KEY_VALUE_TYPE1__Y:
				return getY();
			case XmldsigPackage.DSA_KEY_VALUE_TYPE1__J:
				return getJ();
			case XmldsigPackage.DSA_KEY_VALUE_TYPE1__SEED:
				return getSeed();
			case XmldsigPackage.DSA_KEY_VALUE_TYPE1__PGEN_COUNTER:
				return getPgenCounter();
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
			case XmldsigPackage.DSA_KEY_VALUE_TYPE1__P:
				setP((byte[])newValue);
				return;
			case XmldsigPackage.DSA_KEY_VALUE_TYPE1__Q:
				setQ((byte[])newValue);
				return;
			case XmldsigPackage.DSA_KEY_VALUE_TYPE1__G:
				setG((byte[])newValue);
				return;
			case XmldsigPackage.DSA_KEY_VALUE_TYPE1__Y:
				setY((byte[])newValue);
				return;
			case XmldsigPackage.DSA_KEY_VALUE_TYPE1__J:
				setJ((byte[])newValue);
				return;
			case XmldsigPackage.DSA_KEY_VALUE_TYPE1__SEED:
				setSeed((byte[])newValue);
				return;
			case XmldsigPackage.DSA_KEY_VALUE_TYPE1__PGEN_COUNTER:
				setPgenCounter((byte[])newValue);
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
			case XmldsigPackage.DSA_KEY_VALUE_TYPE1__P:
				setP(P_EDEFAULT);
				return;
			case XmldsigPackage.DSA_KEY_VALUE_TYPE1__Q:
				setQ(Q_EDEFAULT);
				return;
			case XmldsigPackage.DSA_KEY_VALUE_TYPE1__G:
				setG(G_EDEFAULT);
				return;
			case XmldsigPackage.DSA_KEY_VALUE_TYPE1__Y:
				setY(Y_EDEFAULT);
				return;
			case XmldsigPackage.DSA_KEY_VALUE_TYPE1__J:
				setJ(J_EDEFAULT);
				return;
			case XmldsigPackage.DSA_KEY_VALUE_TYPE1__SEED:
				setSeed(SEED_EDEFAULT);
				return;
			case XmldsigPackage.DSA_KEY_VALUE_TYPE1__PGEN_COUNTER:
				setPgenCounter(PGEN_COUNTER_EDEFAULT);
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
			case XmldsigPackage.DSA_KEY_VALUE_TYPE1__P:
				return P_EDEFAULT == null ? p != null : !P_EDEFAULT.equals(p);
			case XmldsigPackage.DSA_KEY_VALUE_TYPE1__Q:
				return Q_EDEFAULT == null ? q != null : !Q_EDEFAULT.equals(q);
			case XmldsigPackage.DSA_KEY_VALUE_TYPE1__G:
				return G_EDEFAULT == null ? g != null : !G_EDEFAULT.equals(g);
			case XmldsigPackage.DSA_KEY_VALUE_TYPE1__Y:
				return Y_EDEFAULT == null ? y != null : !Y_EDEFAULT.equals(y);
			case XmldsigPackage.DSA_KEY_VALUE_TYPE1__J:
				return J_EDEFAULT == null ? j != null : !J_EDEFAULT.equals(j);
			case XmldsigPackage.DSA_KEY_VALUE_TYPE1__SEED:
				return SEED_EDEFAULT == null ? seed != null : !SEED_EDEFAULT.equals(seed);
			case XmldsigPackage.DSA_KEY_VALUE_TYPE1__PGEN_COUNTER:
				return PGEN_COUNTER_EDEFAULT == null ? pgenCounter != null : !PGEN_COUNTER_EDEFAULT.equals(pgenCounter);
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
		result.append(" (p: ");
		result.append(p);
		result.append(", q: ");
		result.append(q);
		result.append(", g: ");
		result.append(g);
		result.append(", y: ");
		result.append(y);
		result.append(", j: ");
		result.append(j);
		result.append(", seed: ");
		result.append(seed);
		result.append(", pgenCounter: ");
		result.append(pgenCounter);
		result.append(')');
		return result.toString();
	}

} //DSAKeyValueType1Impl
