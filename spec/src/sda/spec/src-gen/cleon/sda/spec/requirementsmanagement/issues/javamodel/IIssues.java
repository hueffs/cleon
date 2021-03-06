package cleon.sda.spec.requirementsmanagement.issues.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IIssues extends cleon.doc.spec.document.javamodel.ISubDocument, cleon.doc.spec.chapter.javamodel.INoChapters, cleon.sda.spec.requirementsmanagement.javamodel.IRequirementDocument {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("9fb6a044-bdee-11e5-965a-07bc81ea9ca9");
  
  // relations
  
  public java.util.List<? extends cleon.sda.spec.requirementsmanagement.issues.javamodel.IIssueGroup> selectIssueGroups();
  
  public java.util.List<? extends cleon.sda.spec.requirementsmanagement.issues.javamodel.ICategory> selectCategories();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,9fb6a044-bdee-11e5-965a-07bc81ea9ca9,EfmzukAeLvc3dh5vrZEw6L63LaE=] */
