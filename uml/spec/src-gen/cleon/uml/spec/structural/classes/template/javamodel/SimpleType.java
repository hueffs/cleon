package cleon.uml.spec.structural.classes.template.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class SimpleType extends DynamicResource implements ISimpleType {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISimpleType> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISimpleType>() {
    
    @Override
    public ISimpleType create() {
      return new SimpleType();
    }
    
    @Override
    public ISimpleType create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new SimpleType(resourceRepository, resource);
    }
  
  };

  public SimpleType() {
    super(ISimpleType.TYPE_ID);
  }
  
  public SimpleType(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ISimpleType.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectComment() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment);
  }
    
  public void setComment(java.lang.String comment) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.Commentable_comment, comment);
  }

  @Override
  public java.lang.String selectComments() {
    return _getSingleAttribute(java.lang.String.class, cleon.uml.spec.structural.classes.ClassesPackage.Description_comments);
  }
    
  public void setComments(java.lang.String comments) {
     _setSingleAttribute(cleon.uml.spec.structural.classes.ClassesPackage.Description_comments, comments);
  }

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

  public SimpleType setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.uml.spec.structural.classes.ClassesPackage.Description_comments, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,74f7edbd-52aa-11e3-9bab-1d73174e62c2,Xrhi12QqLq+/liYO6c/5bOzWeQM=] */