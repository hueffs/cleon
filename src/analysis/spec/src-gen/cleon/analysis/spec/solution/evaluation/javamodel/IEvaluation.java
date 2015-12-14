package cleon.analysis.spec.solution.evaluation.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IEvaluation extends ch.actifsource.core.javamodel.IDecorator, cleon.doc.spec.chapter.javamodel.IChapter, cleon.doc.spec.paragraph.typedtable.javamodel.ITypedTable, cleon.doc.spec.chapter.javamodel.INoChapters {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("7f4013d4-3c1a-11e5-9962-cf3035adb922");
  
  // relations
  
  public cleon.doc.spec.paragraph.javamodel.ITextParagraph selectAssessment();
  
  public cleon.analysis.spec.solution.drivers.javamodel.IGoal selectGoal();
  
  public cleon.analysis.spec.solution.evaluation.javamodel.IScore selectScore();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,7f4013d4-3c1a-11e5-9962-cf3035adb922,AJhif71jpqgf0ry6zm4gcUBpY5E=] */