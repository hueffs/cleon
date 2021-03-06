package cleon.sda.spec.projectmanagement.scope.backlog.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IBacklog extends cleon.doc.spec.document.javamodel.IDocument, cleon.doc.spec.document.javamodel.INoSubDocuments {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("28af8502-ff9c-11e4-ac0a-959b440f987f");
  
  public java.lang.Integer selectPlannedEstimate();
  
  // relations
  
  public java.util.List<? extends cleon.sda.spec.projectmanagement.scope.backlog.featuregroup.javamodel.IFeatureGroup> selectFeatureGroups();
  
  public cleon.sda.spec.projectmanagement.resourcemanagement.persons.javamodel.IPerson selectOwner();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,28af8502-ff9c-11e4-ac0a-959b440f987f,Ve9j7D4foi+1AEjzZMSib4DqkWg=] */
