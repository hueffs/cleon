package cleon.sda.spec.requirementsmanagement.motivation.sources.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ISourcePerson extends cleon.sda.spec.requirementsmanagement.motivation.sources.javamodel.ISource {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("1d03bc5b-bb80-11e5-b2f7-f515c847fa35");
  
  // relations
  
  public java.util.List<? extends cleon.sda.spec.requirementsmanagement.motivation.sources.javamodel.ISource> selectComposites();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,1d03bc5b-bb80-11e5-b2f7-f515c847fa35,mzY4n6OPSAAdaSqlYFUcvi45B3g=] */
