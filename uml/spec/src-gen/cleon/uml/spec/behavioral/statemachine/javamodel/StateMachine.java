package cleon.uml.spec.behavioral.statemachine.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class StateMachine extends DynamicResource implements IStateMachine {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IStateMachine> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IStateMachine>() {
    
    @Override
    public IStateMachine create() {
      return new StateMachine();
    }
    
    @Override
    public IStateMachine create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new StateMachine(resourceRepository, resource);
    }
  
  };

  public StateMachine() {
    super(IStateMachine.TYPE_ID);
  }
  
  public StateMachine(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IStateMachine.TYPE_ID);
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
  public java.util.List<? extends cleon.uml.spec.structural.classes.javamodel.IClassifier> selectClasses() {
    return _getList(cleon.uml.spec.structural.classes.javamodel.IClassifier.class, cleon.uml.spec.structural.packages.PackagesPackage.Package_classes);
  }

  public StateMachine setClasses(java.util.List<? extends cleon.uml.spec.structural.classes.javamodel.IClassifier> classes) {
    _setList(cleon.uml.spec.structural.packages.PackagesPackage.Package_classes, classes);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.uml.spec.behavioral.statemachine.javamodel.IEvent> selectEvents() {
    return _getList(cleon.uml.spec.behavioral.statemachine.javamodel.IEvent.class, cleon.uml.spec.behavioral.statemachine.StatemachinePackage.StateMachine_events);
  }

  public StateMachine setEvents(java.util.List<? extends cleon.uml.spec.behavioral.statemachine.javamodel.IEvent> events) {
    _setList(cleon.uml.spec.behavioral.statemachine.StatemachinePackage.StateMachine_events, events);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.uml.spec.behavioral.statemachine.javamodel.IState> selectStates() {
    return _getList(cleon.uml.spec.behavioral.statemachine.javamodel.IState.class, cleon.uml.spec.behavioral.statemachine.StatemachinePackage.StateMachine_states);
  }

  public StateMachine setStates(java.util.List<? extends cleon.uml.spec.behavioral.statemachine.javamodel.IState> states) {
    _setList(cleon.uml.spec.behavioral.statemachine.StatemachinePackage.StateMachine_states, states);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.uml.spec.structural.packages.javamodel.IPackage> selectSubPackages() {
    return _getList(cleon.uml.spec.structural.packages.javamodel.IPackage.class, cleon.uml.spec.structural.packages.PackagesPackage.Package_subPackages);
  }

  public StateMachine setSubPackages(java.util.List<? extends cleon.uml.spec.structural.packages.javamodel.IPackage> subPackages) {
    _setList(cleon.uml.spec.structural.packages.PackagesPackage.Package_subPackages, subPackages);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public StateMachine setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.arc42.spec.buildingblockview.javamodel.IBuildingBlock> selectUseDecompositions() {
    return _getList(cleon.arc42.spec.buildingblockview.javamodel.IBuildingBlock.class, cleon.arc42.spec.buildingblockview.BuildingblockviewPackage.UseBuildingBlock_useDecompositions);
  }

  public StateMachine setUseDecompositions(java.util.List<? extends cleon.arc42.spec.buildingblockview.javamodel.IBuildingBlock> useDecompositions) {
    _setList(cleon.arc42.spec.buildingblockview.BuildingblockviewPackage.UseBuildingBlock_useDecompositions, useDecompositions);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptList(cleon.uml.spec.structural.classes.javamodel.IClassifier.class, cleon.uml.spec.structural.packages.PackagesPackage.Package_classes, visitor);
    _acceptList(cleon.uml.spec.behavioral.statemachine.javamodel.IEvent.class, cleon.uml.spec.behavioral.statemachine.StatemachinePackage.StateMachine_events, visitor);
    _acceptList(cleon.uml.spec.behavioral.statemachine.javamodel.IState.class, cleon.uml.spec.behavioral.statemachine.StatemachinePackage.StateMachine_states, visitor);
    _acceptList(cleon.uml.spec.structural.packages.javamodel.IPackage.class, cleon.uml.spec.structural.packages.PackagesPackage.Package_subPackages, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
    _acceptList(cleon.arc42.spec.buildingblockview.javamodel.IBuildingBlock.class, cleon.arc42.spec.buildingblockview.BuildingblockviewPackage.UseBuildingBlock_useDecompositions, visitor);
  }

  // toMeRelations
  
  public static cleon.uml.spec.behavioral.statemachine.javamodel.IStateMachine selectToMeEvents(cleon.uml.spec.behavioral.statemachine.javamodel.IEvent object) {
    return _getToMeSingle(object.getRepository(), cleon.uml.spec.behavioral.statemachine.javamodel.IStateMachine.class, cleon.uml.spec.behavioral.statemachine.StatemachinePackage.StateMachine_events, object.getResource());
  }
  
  public static cleon.uml.spec.behavioral.statemachine.javamodel.IStateMachine selectToMeStates(cleon.uml.spec.behavioral.statemachine.javamodel.IState object) {
    return _getToMeSingle(object.getRepository(), cleon.uml.spec.behavioral.statemachine.javamodel.IStateMachine.class, cleon.uml.spec.behavioral.statemachine.StatemachinePackage.StateMachine_states, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,6b3731f0-b07c-11e4-bca8-71d5b3e72cd6,y/6cxt2F7BUdG/78suGkK6KsZvA=] */