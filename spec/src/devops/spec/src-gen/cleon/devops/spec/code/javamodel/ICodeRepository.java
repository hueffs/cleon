package cleon.devops.spec.code.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ICodeRepository extends ch.actifsource.core.javamodel.IResource {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("2f377098-4072-11e5-b5f0-5b1ce9c3de3e");
  
  public java.lang.String selectPath();
  
  // relations
  
  public cleon.devops.spec.code.javamodel.IClassification selectClassification();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,2f377098-4072-11e5-b5f0-5b1ce9c3de3e,1xb4xU5xiNu0OjPLUEWgHcBHn3s=] */
