package cleon.sda.spec.requirementsmanagement.requirements.requirement.template.templatepart.functionalitytype.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Actor extends DynamicResource implements IActor {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IActor> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IActor>() {
    
    @Override
    public IActor create() {
      return new Actor();
    }
    
    @Override
    public IActor create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Actor(resourceRepository, resource);
    }
  
  };

  public Actor() {
    super(IActor.TYPE_ID);
  }
  
  public Actor(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IActor.TYPE_ID);
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

  public Actor setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,6dbc6bd8-d56b-11e5-89ea-2d8d86e9ef89,MyGZqX6/OPNmJqtZ18drCoZfVqI=] */
