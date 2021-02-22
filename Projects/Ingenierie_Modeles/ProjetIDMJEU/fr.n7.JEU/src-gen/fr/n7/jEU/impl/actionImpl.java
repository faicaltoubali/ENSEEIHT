/**
 * generated by Xtext 2.17.1
 */
package fr.n7.jEU.impl;

import fr.n7.jEU.AllocateurConnaissance;
import fr.n7.jEU.AllocateurObjet;
import fr.n7.jEU.JEUPackage;
import fr.n7.jEU.action;
import fr.n7.jEU.choix;
import fr.n7.jEU.condition;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.n7.jEU.impl.actionImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.n7.jEU.impl.actionImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link fr.n7.jEU.impl.actionImpl#getAllocateursConnaissance <em>Allocateurs Connaissance</em>}</li>
 *   <li>{@link fr.n7.jEU.impl.actionImpl#getAllocateursObjetLieu <em>Allocateurs Objet Lieu</em>}</li>
 *   <li>{@link fr.n7.jEU.impl.actionImpl#getConditionAction <em>Condition Action</em>}</li>
 *   <li>{@link fr.n7.jEU.impl.actionImpl#getChoixSuivants <em>Choix Suivants</em>}</li>
 *   <li>{@link fr.n7.jEU.impl.actionImpl#isEstFinale <em>Est Finale</em>}</li>
 * </ul>
 *
 * @generated
 */
public class actionImpl extends MinimalEObjectImpl.Container implements action
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected static final String DESCRIPTION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected String description = DESCRIPTION_EDEFAULT;

  /**
   * The cached value of the '{@link #getAllocateursConnaissance() <em>Allocateurs Connaissance</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAllocateursConnaissance()
   * @generated
   * @ordered
   */
  protected EList<AllocateurConnaissance> allocateursConnaissance;

  /**
   * The cached value of the '{@link #getAllocateursObjetLieu() <em>Allocateurs Objet Lieu</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAllocateursObjetLieu()
   * @generated
   * @ordered
   */
  protected EList<AllocateurObjet> allocateursObjetLieu;

  /**
   * The cached value of the '{@link #getConditionAction() <em>Condition Action</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConditionAction()
   * @generated
   * @ordered
   */
  protected condition conditionAction;

  /**
   * The cached value of the '{@link #getChoixSuivants() <em>Choix Suivants</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getChoixSuivants()
   * @generated
   * @ordered
   */
  protected EList<choix> choixSuivants;

  /**
   * The default value of the '{@link #isEstFinale() <em>Est Finale</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isEstFinale()
   * @generated
   * @ordered
   */
  protected static final boolean EST_FINALE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isEstFinale() <em>Est Finale</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isEstFinale()
   * @generated
   * @ordered
   */
  protected boolean estFinale = EST_FINALE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected actionImpl()
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
    return JEUPackage.Literals.ACTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JEUPackage.ACTION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getDescription()
  {
    return description;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setDescription(String newDescription)
  {
    String oldDescription = description;
    description = newDescription;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JEUPackage.ACTION__DESCRIPTION, oldDescription, description));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<AllocateurConnaissance> getAllocateursConnaissance()
  {
    if (allocateursConnaissance == null)
    {
      allocateursConnaissance = new EObjectContainmentEList<AllocateurConnaissance>(AllocateurConnaissance.class, this, JEUPackage.ACTION__ALLOCATEURS_CONNAISSANCE);
    }
    return allocateursConnaissance;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<AllocateurObjet> getAllocateursObjetLieu()
  {
    if (allocateursObjetLieu == null)
    {
      allocateursObjetLieu = new EObjectContainmentEList<AllocateurObjet>(AllocateurObjet.class, this, JEUPackage.ACTION__ALLOCATEURS_OBJET_LIEU);
    }
    return allocateursObjetLieu;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public condition getConditionAction()
  {
    return conditionAction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetConditionAction(condition newConditionAction, NotificationChain msgs)
  {
    condition oldConditionAction = conditionAction;
    conditionAction = newConditionAction;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JEUPackage.ACTION__CONDITION_ACTION, oldConditionAction, newConditionAction);
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
  public void setConditionAction(condition newConditionAction)
  {
    if (newConditionAction != conditionAction)
    {
      NotificationChain msgs = null;
      if (conditionAction != null)
        msgs = ((InternalEObject)conditionAction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JEUPackage.ACTION__CONDITION_ACTION, null, msgs);
      if (newConditionAction != null)
        msgs = ((InternalEObject)newConditionAction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JEUPackage.ACTION__CONDITION_ACTION, null, msgs);
      msgs = basicSetConditionAction(newConditionAction, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JEUPackage.ACTION__CONDITION_ACTION, newConditionAction, newConditionAction));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<choix> getChoixSuivants()
  {
    if (choixSuivants == null)
    {
      choixSuivants = new EObjectContainmentEList<choix>(choix.class, this, JEUPackage.ACTION__CHOIX_SUIVANTS);
    }
    return choixSuivants;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isEstFinale()
  {
    return estFinale;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setEstFinale(boolean newEstFinale)
  {
    boolean oldEstFinale = estFinale;
    estFinale = newEstFinale;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JEUPackage.ACTION__EST_FINALE, oldEstFinale, estFinale));
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
      case JEUPackage.ACTION__ALLOCATEURS_CONNAISSANCE:
        return ((InternalEList<?>)getAllocateursConnaissance()).basicRemove(otherEnd, msgs);
      case JEUPackage.ACTION__ALLOCATEURS_OBJET_LIEU:
        return ((InternalEList<?>)getAllocateursObjetLieu()).basicRemove(otherEnd, msgs);
      case JEUPackage.ACTION__CONDITION_ACTION:
        return basicSetConditionAction(null, msgs);
      case JEUPackage.ACTION__CHOIX_SUIVANTS:
        return ((InternalEList<?>)getChoixSuivants()).basicRemove(otherEnd, msgs);
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
      case JEUPackage.ACTION__NAME:
        return getName();
      case JEUPackage.ACTION__DESCRIPTION:
        return getDescription();
      case JEUPackage.ACTION__ALLOCATEURS_CONNAISSANCE:
        return getAllocateursConnaissance();
      case JEUPackage.ACTION__ALLOCATEURS_OBJET_LIEU:
        return getAllocateursObjetLieu();
      case JEUPackage.ACTION__CONDITION_ACTION:
        return getConditionAction();
      case JEUPackage.ACTION__CHOIX_SUIVANTS:
        return getChoixSuivants();
      case JEUPackage.ACTION__EST_FINALE:
        return isEstFinale();
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
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case JEUPackage.ACTION__NAME:
        setName((String)newValue);
        return;
      case JEUPackage.ACTION__DESCRIPTION:
        setDescription((String)newValue);
        return;
      case JEUPackage.ACTION__ALLOCATEURS_CONNAISSANCE:
        getAllocateursConnaissance().clear();
        getAllocateursConnaissance().addAll((Collection<? extends AllocateurConnaissance>)newValue);
        return;
      case JEUPackage.ACTION__ALLOCATEURS_OBJET_LIEU:
        getAllocateursObjetLieu().clear();
        getAllocateursObjetLieu().addAll((Collection<? extends AllocateurObjet>)newValue);
        return;
      case JEUPackage.ACTION__CONDITION_ACTION:
        setConditionAction((condition)newValue);
        return;
      case JEUPackage.ACTION__CHOIX_SUIVANTS:
        getChoixSuivants().clear();
        getChoixSuivants().addAll((Collection<? extends choix>)newValue);
        return;
      case JEUPackage.ACTION__EST_FINALE:
        setEstFinale((Boolean)newValue);
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
      case JEUPackage.ACTION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case JEUPackage.ACTION__DESCRIPTION:
        setDescription(DESCRIPTION_EDEFAULT);
        return;
      case JEUPackage.ACTION__ALLOCATEURS_CONNAISSANCE:
        getAllocateursConnaissance().clear();
        return;
      case JEUPackage.ACTION__ALLOCATEURS_OBJET_LIEU:
        getAllocateursObjetLieu().clear();
        return;
      case JEUPackage.ACTION__CONDITION_ACTION:
        setConditionAction((condition)null);
        return;
      case JEUPackage.ACTION__CHOIX_SUIVANTS:
        getChoixSuivants().clear();
        return;
      case JEUPackage.ACTION__EST_FINALE:
        setEstFinale(EST_FINALE_EDEFAULT);
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
      case JEUPackage.ACTION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case JEUPackage.ACTION__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
      case JEUPackage.ACTION__ALLOCATEURS_CONNAISSANCE:
        return allocateursConnaissance != null && !allocateursConnaissance.isEmpty();
      case JEUPackage.ACTION__ALLOCATEURS_OBJET_LIEU:
        return allocateursObjetLieu != null && !allocateursObjetLieu.isEmpty();
      case JEUPackage.ACTION__CONDITION_ACTION:
        return conditionAction != null;
      case JEUPackage.ACTION__CHOIX_SUIVANTS:
        return choixSuivants != null && !choixSuivants.isEmpty();
      case JEUPackage.ACTION__EST_FINALE:
        return estFinale != EST_FINALE_EDEFAULT;
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
    result.append(" (name: ");
    result.append(name);
    result.append(", description: ");
    result.append(description);
    result.append(", estFinale: ");
    result.append(estFinale);
    result.append(')');
    return result.toString();
  }

} //actionImpl
