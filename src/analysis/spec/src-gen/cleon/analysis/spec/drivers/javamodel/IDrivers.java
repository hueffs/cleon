package cleon.analysis.spec.drivers.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IDrivers extends cleon.doc.spec.document.javamodel.IDocument, cleon.doc.spec.document.javamodel.INoSubDocuments {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("877f094b-3c14-11e5-9962-cf3035adb922");
  
  // relations
  
  public cleon.analysis.spec.drivers.javamodel.IContext selectContext();
  
  public java.util.List<? extends cleon.analysis.spec.drivers.javamodel.IGoals> selectGoal();
  
  public java.util.List<? extends cleon.analysis.spec.drivers.javamodel.ISource> selectSources();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,877f094b-3c14-11e5-9962-cf3035adb922,dSumXlNzjZ3h/wM1oTB6rFdQ11A=] */
