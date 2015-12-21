package cleon.sdp.spec.requirementmanagement.driver.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Target extends DynamicResource implements ITarget {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITarget> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITarget>() {
    
    @Override
    public ITarget create() {
      return new Target();
    }
    
    @Override
    public ITarget create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Target(resourceRepository, resource);
    }
  
  };

  public Target() {
    super(ITarget.TYPE_ID);
  }
  
  public Target(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ITarget.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Target setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,f35cbc8a-a281-11e5-9332-1b5893de4362,zkKVe6sQQjf1mLEnwLgCK0sLL2o=] */
