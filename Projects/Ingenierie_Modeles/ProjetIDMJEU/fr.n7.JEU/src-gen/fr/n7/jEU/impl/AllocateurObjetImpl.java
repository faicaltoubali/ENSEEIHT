/**
 * generated by Xtext 2.17.1
 */
package fr.n7.jEU.impl;

import fr.n7.jEU.AllocateurObjet;
import fr.n7.jEU.JEUPackage;
import fr.n7.jEU.Objet;
import fr.n7.jEU.condition;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Allocateur Objet</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.n7.jEU.impl.AllocateurObjetImpl#getObjetAlloue <em>Objet Alloue</em>}</li>
 *   <li>{@link fr.n7.jEU.impl.AllocateurObjetImpl#isConsomme <em>Consomme</em>}</li>
 *   <li>{@link fr.n7.jEU.impl.AllocateurObjetImpl#getQuantite <em>Quantite</em>}</li>
 *   <li>{@link fr.n7.jEU.impl.AllocateurObjetImpl#isEstConditionne <em>Est Conditionne</em>}</li>
 *   <li>{@link fr.n7.jEU.impl.AllocateurObjetImpl#getConditionAllocution <em>Condition Allocution</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AllocateurObjetImpl extends MinimalEObjectImpl.Container implements AllocateurObjet
{
  /**
   * The cached value of the '{@link #getObjetAlloue() <em>Objet Alloue</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getObjetAlloue()
   * @generated
   * @ordered
   */
  protected Objet objetAlloue;

  /**
   * The default value of the '{@link #isConsomme() <em>Consomme</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isConsomme()
   * @generated
   * @ordered
   */
  protected static final boolean CONSOMME_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isConsomme() <em>Consomme</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isConsomme()
   * @generated
   * @ordered
   */
  protected boolean consomme = CONSOMME_EDEFAULT;

  /**
   * The default value of the '{@link #getQuantite() <em>Quantite</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQuantite()
   * @generated
   * @ordered
   */
  protected static final int QUANTITE_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getQuantite() <em>Quantite</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQuantite()
   * @generated
   * @ordered
   */
  protected int quantite = QUANTITE_EDEFAULT;

  /**
   * The default value of the '{@link #isEstConditionne() <em>Est Conditionne</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isEstConditionne()
   * @generated
   * @ordered
   */
  protected static final boolean EST_CONDITIONNE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isEstConditionne() <em>Est Conditionne</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isEstConditionne()
   * @generated
   * @ordered
   */
  protected boolean estConditionne = EST_CONDITIONNE_EDEFAULT;

  /**
   * The cached value of the '{@link #getConditionAllocution() <em>Condition Allocution</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConditionAllocution()
   * @generated
   * @ordered
   */
  protected condition conditionAllocution;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AllocateurObjetImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return JEUPackage.Literals.ALLOCATEUR_OBJET;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Objet getObjetAlloue()
  {
    if (objetAlloue != null && objetAlloue.eIsProxy())
    {
      InternalEObject oldObjetAlloue = (InternalEObject)objetAlloue;
      objetAlloue = (Objet)eResolveProxy(oldObjetAlloue);
      if (objetAlloue != oldObjetAlloue)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, JEUPackage.ALLOCATEUR_OBJET__OBJET_ALLOUE, oldObjetAlloue, objetAlloue));
      }
    }
    return objetAlloue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Objet basicGetObjetAlloue()
  {
    return objetAlloue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setObjetAlloue(Objet newObjetAlloue)
  {
    Objet oldObjetAlloue = objetAlloue;
    objetAlloue = newObjetAlloue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JEUPackage.ALLOCATEUR_OBJET__OBJET_ALLOUE, oldObjetAlloue, objetAlloue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isConsomme()
  {
    return consomme;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setConsomme(boolean newConsomme)
  {
    boolean oldConsomme = consomme;
    consomme = newConsomme;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JEUPackage.ALLOCATEUR_OBJET__CONSOMME, oldConsomme, consomme));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getQuantite()
  {
    return quantite;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setQuantite(int newQuantite)
  {
    int oldQuantite = quantite;
    quantite = newQuantite;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JEUPackage.ALLOCATEUR_OBJET__QUANTITE, oldQuantite, quantite));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isEstConditionne()
  {
    return estConditionne;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setEstConditionne(boolean newEstConditionne)
  {
    boolean oldEstConditionne = estConditionne;
    estConditionne = newEstConditionne;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JEUPackage.ALLOCATEUR_OBJET__EST_CONDITIONNE, oldEstConditionne, estConditionne));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public condition getConditionAllocution()
  {
    return conditionAllocution;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetConditionAllocution(condition newConditionAllocution, NotificationChain msgs)
  {
    condition oldConditionAllocution = conditionAllocution;
    conditionAllocution = newConditionAllocution;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JEUPackage.ALLOCATEUR_OBJET__CONDITION_ALLOCUTION, oldConditionAllocution, newConditionAllocution);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setConditionAllocution(condition newConditionAllocution)
  {
    if (newConditionAllocution != conditionAllocution)
    {
      NotificationChain msgs = null;
      if (conditionAllocution != null)
        msgs = ((InternalEObject)conditionAllocution).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JEUPackage.ALLOCATEUR_OBJET__CONDITION_ALLOCUTION, null, msgs);
      if (newConditionAllocution != null)
        msgs = ((InternalEObject)newConditionAllocution).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JEUPackage.ALLOCATEUR_OBJET__CONDITION_ALLOCUTION, null, msgs);
      msgs = basicSetConditionAllocution(newConditionAllocution, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JEUPackage.ALLOCATEUR_OBJET__CONDITION_ALLOCUTION, newConditionAllocution, newConditionAllocution));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case JEUPackage.ALLOCATEUR_OBJET__CONDITION_ALLOCUTION:
        return basicSetConditionAllocution(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case JEUPackage.ALLOCATEUR_OBJET__OBJET_ALLOUE:
        if (resolve) return getObjetAlloue();
        return basicGetObjetAlloue();
      case JEUPackage.ALLOCATEUR_OBJET__CONSOMME:
        return isConsomme();
      case JEUPackage.ALLOCATEUR_OBJET__QUANTITE:
        return getQuantite();
      case JEUPackage.ALLOCATEUR_OBJET__EST_CONDITIONNE:
        return isEstConditionne();
      case JEUPackage.ALLOCATEUR_OBJET__CONDITION_ALLOCUTION:
        return getConditionAllocution();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case JEUPackage.ALLOCATEUR_OBJET__OBJET_ALLOUE:
        setObjetAlloue((Objet)newValue);
        return;
      case JEUPackage.ALLOCATEUR_OBJET__CONSOMME:
        setConsomme((Boolean)newValue);
        return;
      case JEUPackage.ALLOCATEUR_OBJET__QUANTITE:
        setQuantite((Integer)newValue);
        return;
      case JEUPackage.ALLOCATEUR_OBJET__EST_CONDITIONNE:
        setEstConditionne((Boolean)newValue);
        return;
      case JEUPackage.ALLOCATEUR_OBJET__CONDITION_ALLOCUTION:
        setConditionAllocution((condition)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case JEUPackage.ALLOCATEUR_OBJET__OBJET_ALLOUE:
        setObjetAlloue((Objet)null);
        return;
      case JEUPackage.ALLOCATEUR_OBJET__CONSOMME:
        setConsomme(CONSOMME_EDEFAULT);
        return;
      case JEUPackage.ALLOCATEUR_OBJET__QUANTITE:
        setQuantite(QUANTITE_EDEFAULT);
        return;
      case JEUPackage.ALLOCATEUR_OBJET__EST_CONDITIONNE:
        setEstConditionne(EST_CONDITIONNE_EDEFAULT);
        return;
      case JEUPackage.ALLOCATEUR_OBJET__CONDITION_ALLOCUTION:
        setConditionAllocution((condition)null);
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case JEUPackage.ALLOCATEUR_OBJET__OBJET_ALLOUE:
        return objetAlloue != null;
      case JEUPackage.ALLOCATEUR_OBJET__CONSOMME:
        return consomme != CONSOMME_EDEFAULT;
      case JEUPackage.ALLOCATEUR_OBJET__QUANTITE:
        return quantite != QUANTITE_EDEFAULT;
      case JEUPackage.ALLOCATEUR_OBJET__EST_CONDITIONNE:
        return estConditionne != EST_CONDITIONNE_EDEFAULT;
      case JEUPackage.ALLOCATEUR_OBJET__CONDITION_ALLOCUTION:
        return conditionAllocution != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (consomme: ");
    result.append(consomme);
    result.append(", quantite: ");
    result.append(quantite);
    result.append(", estConditionne: ");
    result.append(estConditionne);
    result.append(')');
    return result.toString();
  }

} //AllocateurObjetImpl
