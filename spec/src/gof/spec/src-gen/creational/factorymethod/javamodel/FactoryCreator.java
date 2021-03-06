package creational.factorymethod.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class FactoryCreator extends DynamicResource implements IFactoryCreator {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IFactoryCreator> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IFactoryCreator>() {
    
    @Override
    public IFactoryCreator create() {
      return new FactoryCreator();
    }
    
    @Override
    public IFactoryCreator create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new FactoryCreator(resourceRepository, resource);
    }
  
  };

  public FactoryCreator() {
    super(IFactoryCreator.TYPE_ID);
  }
  
  public FactoryCreator(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IFactoryCreator.TYPE_ID);
  }

  // relations
  
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends creational.factorymethod.javamodel.IFactoryMethod> selectFactoryMethods() {
    return _getMap(creational.factorymethod.javamodel.IFactoryMethod.class, creational.factorymethod.FactorymethodPackage.FactoryCreator_factoryMethods);
  }

  public FactoryCreator setFactoryMethods(java.util.Map<ch.actifsource.core.Resource, ? extends creational.factorymethod.javamodel.IFactoryMethod> factoryMethods) {
    _setMap(creational.factorymethod.FactorymethodPackage.FactoryCreator_factoryMethods, factoryMethods);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public FactoryCreator setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptMap(creational.factorymethod.javamodel.IFactoryMethod.class, creational.factorymethod.FactorymethodPackage.FactoryCreator_factoryMethods, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static creational.factorymethod.javamodel.IFactoryCreator selectToMeFactoryMethods(creational.factorymethod.javamodel.IFactoryMethod object) {
    return _getToMeSingle(object.getRepository(), creational.factorymethod.javamodel.IFactoryCreator.class, creational.factorymethod.FactorymethodPackage.FactoryCreator_factoryMethods, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,03b41966-ddd3-11e4-b0b5-6911fa4e24e5,hCEXyKLHyL52qQkMf8QtLXq/MRY=] */
