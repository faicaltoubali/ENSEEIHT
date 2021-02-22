/**
 * generated by Xtext 2.17.1
 */
package fr.n7.jEU;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Allocateur Connaissance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.n7.jEU.AllocateurConnaissance#getConnaissanceAlloue <em>Connaissance Alloue</em>}</li>
 *   <li>{@link fr.n7.jEU.AllocateurConnaissance#isEstConditionne <em>Est Conditionne</em>}</li>
 *   <li>{@link fr.n7.jEU.AllocateurConnaissance#getConditionAllocution <em>Condition Allocution</em>}</li>
 * </ul>
 *
 * @see fr.n7.jEU.JEUPackage#getAllocateurConnaissance()
 * @model
 * @generated
 */
public interface AllocateurConnaissance extends EObject
{
  /**
   * Returns the value of the '<em><b>Connaissance Alloue</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Connaissance Alloue</em>' reference.
   * @see #setConnaissanceAlloue(Connaissance)
   * @see fr.n7.jEU.JEUPackage#getAllocateurConnaissance_ConnaissanceAlloue()
   * @model
   * @generated
   */
  Connaissance getConnaissanceAlloue();

  /**
   * Sets the value of the '{@link fr.n7.jEU.AllocateurConnaissance#getConnaissanceAlloue <em>Connaissance Alloue</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Connaissance Alloue</em>' reference.
   * @see #getConnaissanceAlloue()
   * @generated
   */
  void setConnaissanceAlloue(Connaissance value);

  /**
   * Returns the value of the '<em><b>Est Conditionne</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Est Conditionne</em>' attribute.
   * @see #setEstConditionne(boolean)
   * @see fr.n7.jEU.JEUPackage#getAllocateurConnaissance_EstConditionne()
   * @model
   * @generated
   */
  boolean isEstConditionne();

  /**
   * Sets the value of the '{@link fr.n7.jEU.AllocateurConnaissance#isEstConditionne <em>Est Conditionne</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Est Conditionne</em>' attribute.
   * @see #isEstConditionne()
   * @generated
   */
  void setEstConditionne(boolean value);

  /**
   * Returns the value of the '<em><b>Condition Allocution</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Condition Allocution</em>' containment reference.
   * @see #setConditionAllocution(condition)
   * @see fr.n7.jEU.JEUPackage#getAllocateurConnaissance_ConditionAllocution()
   * @model containment="true"
   * @generated
   */
  condition getConditionAllocution();

  /**
   * Sets the value of the '{@link fr.n7.jEU.AllocateurConnaissance#getConditionAllocution <em>Condition Allocution</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Condition Allocution</em>' containment reference.
   * @see #getConditionAllocution()
   * @generated
   */
  void setConditionAllocution(condition value);

} // AllocateurConnaissance