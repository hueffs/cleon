package cleon.analysis.spec.solution.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ISolutionAnalysis extends cleon.doc.spec.chapter.javamodel.IChapterWithDescription, cleon.doc.spec.document.javamodel.INamedDocument, cleon.doc.spec.chapter.javamodel.INoChapters {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("c647eff4-3c0e-11e5-9962-cf3035adb922");
  
  // relations
  
  public cleon.analysis.spec.solution.drivers.javamodel.IDrivers selectDrivers();
  
  public cleon.analysis.spec.solution.solutions.javamodel.ISolutions selectSolution();
  
  public cleon.analysis.spec.solution.evaluation.javamodel.IEvaluations selectEvaluation();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,c647eff4-3c0e-11e5-9962-cf3035adb922,AfGs+bO66Y835gM6CsJL/X8lu2w=] */
