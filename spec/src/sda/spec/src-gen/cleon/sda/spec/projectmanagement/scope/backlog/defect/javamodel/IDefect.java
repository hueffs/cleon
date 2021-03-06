package cleon.sda.spec.projectmanagement.scope.backlog.defect.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IDefect extends ch.actifsource.core.javamodel.INamedResource, cleon.sda.spec.projectmanagement.scope.backlog.javamodel.IWorkItem {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("484dda11-ff9c-11e4-ac0a-959b440f987f");
  
  public java.lang.String selectEnvironment();
  
  // relations
  
  public cleon.sda.spec.projectmanagement.scope.backlog.defect.javamodel.IReproducibility selectReproducibility();
  
  public cleon.sda.spec.projectmanagement.scope.backlog.javamodel.IText selectResolution();
  
  public cleon.sda.spec.projectmanagement.resourcemanagement.persons.javamodel.IPerson selectFoundBy();
  
  public cleon.sda.spec.projectmanagement.scope.backlog.defect.javamodel.IClassification selectClassification();
  
  public cleon.sda.spec.projectmanagement.scope.backlog.defect.javamodel.IObservation selectObservation();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,484dda11-ff9c-11e4-ac0a-959b440f987f,IRUClRLC+iBxMOnDxNNVxOq5VUg=] */
