package cleon.sda.spec.analysis.solution.solutions.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ISolutions extends cleon.doc.spec.document.javamodel.ISubDocument, cleon.doc.spec.document.javamodel.INoSubDocuments, cleon.sda.spec.analysis.solution.javamodel.IAnalysisDocument {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("d6243e22-3c14-11e5-9962-cf3035adb922");
  
  // relations
  
  public java.util.List<? extends cleon.sda.spec.analysis.solution.solutions.javamodel.ISolution> selectSolutions();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,d6243e22-3c14-11e5-9962-cf3035adb922,KGwr5tmjJQiuk/aqWqUtSGzVz0A=] */
