package cleon.uml.spec.structural.classes.events.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class CustomEventArgs extends DynamicResource implements ICustomEventArgs {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ICustomEventArgs> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ICustomEventArgs>() {
    
    @Override
    public ICustomEventArgs create() {
      return new CustomEventArgs();
    }
    
    @Override
    public ICustomEventArgs create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new CustomEventArgs(resourceRepository, resource);
    }
  
  };

  public CustomEventArgs() {
    super(ICustomEventArgs.TYPE_ID);
  }
  
  public CustomEventArgs(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ICustomEventArgs.TYPE_ID);
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
  public cleon.uml.spec.structural.classes.javamodel.IClassifier selectType() {
    return _getSingle(cleon.uml.spec.structural.classes.javamodel.IClassifier.class, cleon.uml.spec.structural.classes.events.EventsPackage.CustomEventArgs_type);
  }

  public CustomEventArgs setType(cleon.uml.spec.structural.classes.javamodel.IClassifier type) {
    _setSingle(cleon.uml.spec.structural.classes.events.EventsPackage.CustomEventArgs_type, type);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public CustomEventArgs setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptSingle(cleon.uml.spec.structural.classes.javamodel.IClassifier.class, cleon.uml.spec.structural.classes.events.EventsPackage.CustomEventArgs_type, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.uml.spec.structural.classes.events.javamodel.ICustomEventArgs> selectToMeType(cleon.uml.spec.structural.classes.javamodel.IClassifier object) {
    return _getToMeList(object.getRepository(), cleon.uml.spec.structural.classes.events.javamodel.ICustomEventArgs.class, cleon.uml.spec.structural.classes.events.EventsPackage.CustomEventArgs_type, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,6e22f321-d30c-11e4-8b90-c7d981a5f2fd,Cu8LG2QvvhqJaovcHWBDu2q7qqw=] */
