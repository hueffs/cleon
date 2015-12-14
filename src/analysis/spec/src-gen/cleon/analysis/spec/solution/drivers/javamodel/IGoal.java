package cleon.analysis.spec.solution.drivers.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IGoal extends cleon.doc.spec.chapter.javamodel.IChapterWithDescription, cleon.doc.spec.paragraph.typedtable.javamodel.ITypedTable, cleon.doc.spec.chapter.javamodel.INoChapters {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("0797167b-3c15-11e5-9962-cf3035adb922");
  
  // relations
  
  public cleon.doc.spec.paragraph.javamodel.ITextParagraph selectGoalname();
  
  public cleon.doc.spec.paragraph.javamodel.ITextParagraph selectGoaldescription();
  
  public cleon.analysis.spec.solution.drivers.javamodel.IGoalImportance selectImportance();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,0797167b-3c15-11e5-9962-cf3035adb922,kiT5xK1YyZbQkhMQ6oi+qYBK59Q=] */