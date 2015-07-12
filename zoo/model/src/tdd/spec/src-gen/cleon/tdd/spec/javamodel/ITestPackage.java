package cleon.tdd.spec.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ITestPackage extends cleon.uml.spec.structural.packages.javamodel.IPackage {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("8faff353-9a2f-11e3-8bcf-e973a9ae2871");
  
  // relations
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.tdd.spec.javamodel.ITestPackageDecomposition> selectTestPackages();
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.tdd.spec.javamodel.ITestClassDecomposition> selectTestClasses();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,8faff353-9a2f-11e3-8bcf-e973a9ae2871,jRBcL9AEY6+2s4avygeEA2nHPe8=] */
