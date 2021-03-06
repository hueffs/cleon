package cleon.sda.spec.projectmanagement.resourcemanagement.persons.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IPerson extends cleon.doc.spec.chapter.javamodel.IChapter, cleon.doc.spec.chapter.javamodel.INoChapters, cleon.sda.spec.projectmanagement.resourcemanagement.javamodel.IResource, cleon.doc.spec.autor.javamodel.IAutor {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("9bfc0d2c-ff9e-11e4-ac0a-959b440f987f");
  
  // attributes
  
  public java.lang.String selectFirstname();
  
  public java.lang.String selectSurname();
  
  public java.lang.String selectShortname();
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.sda.spec.projectmanagement.resourcemanagement.persons.javamodel.IExperience> selectExperience();
  
  public cleon.sda.spec.projectmanagement.resourcemanagement.persons.absence.javamodel.IAbsences selectAbsences();
  
  public cleon.sda.spec.projectmanagement.resourcemanagement.organisations.javamodel.IOrganisation selectOrganisation();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,9bfc0d2c-ff9e-11e4-ac0a-959b440f987f,YlRg+8oJwycLol44zKtoTA9wwGk=] */
