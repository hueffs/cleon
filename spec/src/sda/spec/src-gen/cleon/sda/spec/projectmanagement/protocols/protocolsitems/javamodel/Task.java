package cleon.sda.spec.projectmanagement.protocols.protocolsitems.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Task extends DynamicResource implements ITask {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITask> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITask>() {
    
    @Override
    public ITask create() {
      return new Task();
    }
    
    @Override
    public ITask create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Task(resourceRepository, resource);
    }
  
  };

  public Task() {
    super(ITask.TYPE_ID);
  }
  
  public Task(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ITask.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, cleon.sda.spec.projectmanagement.protocols.ProtocolsPackage.ProtocolItem_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(cleon.sda.spec.projectmanagement.protocols.ProtocolsPackage.ProtocolItem_name, name);
  }

  // relations
  
  @Override
  public cleon.sda.spec.projectmanagement.planning.calendar.javamodel.IDay selectDeadline() {
    return _getSingle(cleon.sda.spec.projectmanagement.planning.calendar.javamodel.IDay.class, cleon.sda.spec.projectmanagement.protocols.protocolsitems.ProtocolsitemsPackage.Task_deadline);
  }

  public Task setDeadline(cleon.sda.spec.projectmanagement.planning.calendar.javamodel.IDay deadline) {
    _setSingle(cleon.sda.spec.projectmanagement.protocols.protocolsitems.ProtocolsitemsPackage.Task_deadline, deadline);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.sda.spec.projectmanagement.resourcemanagement.persons.javamodel.IPerson> selectResponsibles() {
    return _getList(cleon.sda.spec.projectmanagement.resourcemanagement.persons.javamodel.IPerson.class, cleon.sda.spec.projectmanagement.protocols.ProtocolsPackage.ProtocolItem_responsibles);
  }

  public Task setResponsibles(java.util.List<? extends cleon.sda.spec.projectmanagement.resourcemanagement.persons.javamodel.IPerson> responsibles) {
    _setList(cleon.sda.spec.projectmanagement.protocols.ProtocolsPackage.ProtocolItem_responsibles, responsibles);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Task setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, cleon.sda.spec.projectmanagement.protocols.ProtocolsPackage.ProtocolItem_name, visitor);
    // relations
    _acceptSingle(cleon.sda.spec.projectmanagement.planning.calendar.javamodel.IDay.class, cleon.sda.spec.projectmanagement.protocols.protocolsitems.ProtocolsitemsPackage.Task_deadline, visitor);
    _acceptList(cleon.sda.spec.projectmanagement.resourcemanagement.persons.javamodel.IPerson.class, cleon.sda.spec.projectmanagement.protocols.ProtocolsPackage.ProtocolItem_responsibles, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.sda.spec.projectmanagement.protocols.protocolsitems.javamodel.ITask> selectToMeDeadline(cleon.sda.spec.projectmanagement.planning.calendar.javamodel.IDay object) {
    return _getToMeList(object.getRepository(), cleon.sda.spec.projectmanagement.protocols.protocolsitems.javamodel.ITask.class, cleon.sda.spec.projectmanagement.protocols.protocolsitems.ProtocolsitemsPackage.Task_deadline, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,55988936-b463-11e5-a3f4-497fd75158dc,sYJ32tmeLn/VAyNatWf7GBxnGSg=] */
