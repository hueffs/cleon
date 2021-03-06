package cleon.sda.spec.projectmanagement.planning.releaseplanning.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IReleasePlanning extends cleon.doc.spec.chapter.javamodel.IChapter {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("3161251a-a7d9-11e5-82dd-3b995d9c840c");
  
  // relations
  
  public java.util.List<? extends cleon.sda.spec.projectmanagement.planning.releaseplanning.javamodel.IRelease> selectReleases();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,3161251a-a7d9-11e5-82dd-3b995d9c840c,8TKgtG0GvmVisOn5x6O1eWZqNRk=] */
