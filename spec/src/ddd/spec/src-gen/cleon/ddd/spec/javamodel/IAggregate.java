package cleon.ddd.spec.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IAggregate extends cleon.uml.spec.structural.packages.javamodel.INamedPackage {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("83c13817-10c0-11e3-b60e-ab478a3e1eca");
  
  // relations
  
  public java.util.List<? extends cleon.ddd.spec.entities.javamodel.IEntityDekomposition> selectEntities();
  
  public java.util.List<? extends cleon.ddd.spec.exceptions.javamodel.IExceptionDekomposition> selectExceptions();
  
  public java.util.List<? extends cleon.ddd.spec.valueobjects.javamodel.IValueObjectDekomposition> selectValueObjects();
  
  public java.util.List<? extends cleon.ddd.spec.repository.javamodel.IRepositoryDekomposition> selectRepository();
  
  public cleon.ddd.spec.services.javamodel.IServiceDekomposition selectDomainServices();
  
  public java.util.List<? extends cleon.uml.spec.structural.classes.enums.javamodel.IEnumDekomposition> selectEnums();
  
  public java.util.List<? extends cleon.eda.spec.eventaggregator.javamodel.IEventAggregator> selectEventAggregator();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,83c13817-10c0-11e3-b60e-ab478a3e1eca,ehj3Jvbtqq0kiNpTuTtXjbQNPTk=] */
