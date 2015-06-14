package cleon.ddd.spec.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Entity extends DynamicResource implements IEntity {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IEntity> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IEntity>() {
    
    @Override
    public IEntity create() {
      return new Entity();
    }
    
    @Override
    public IEntity create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Entity(resourceRepository, resource);
    }
  
  };

  public Entity() {
    super(IEntity.TYPE_ID);
  }
  
  public Entity(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IEntity.TYPE_ID);
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
  public java.lang.Boolean selectIsAbstract() {
    return _getSingleAttribute(java.lang.Boolean.class, cleon.uml.spec.structural.classes.ClassesPackage.IsAbstract_isAbstract);
  }
    
  public void setIsAbstract(java.lang.Boolean isAbstract) {
     _setSingleAttribute(cleon.uml.spec.structural.classes.ClassesPackage.IsAbstract_isAbstract, isAbstract);
  }

  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  @Override
  public java.lang.String selectResponsibility() {
    return _getSingleAttribute(java.lang.String.class, cleon.arc42.spec._05_buildingblockview._05_buildingblockviewPackage.BuildingBlock_responsibility);
  }
    
  public void setResponsibility(java.lang.String responsibility) {
     _setSingleAttribute(cleon.arc42.spec._05_buildingblockview._05_buildingblockviewPackage.BuildingBlock_responsibility, responsibility);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.doc.spec.javamodel.IChapter> selectChapters() {
    return _getList(cleon.doc.spec.javamodel.IChapter.class, cleon.doc.spec.SpecPackage.Chapter_chapters);
  }

  public Entity setChapters(java.util.List<? extends cleon.doc.spec.javamodel.IChapter> chapters) {
    _setList(cleon.doc.spec.SpecPackage.Chapter_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.uml.spec.structural.classes.events.javamodel.ICustomEvent> selectCustomEvents() {
    return _getList(cleon.uml.spec.structural.classes.events.javamodel.ICustomEvent.class, cleon.uml.spec.structural.classes.ClassesPackage.Class_customEvents);
  }

  public Entity setCustomEvents(java.util.List<? extends cleon.uml.spec.structural.classes.events.javamodel.ICustomEvent> customEvents) {
    _setList(cleon.uml.spec.structural.classes.ClassesPackage.Class_customEvents, customEvents);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.DocumentElementComposite_documentElements);
  }

  public Entity setDocumentElements(java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.doc.spec.SpecPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.uml.spec.structural.classes.events.javamodel.IEvent> selectEvents() {
    return _getList(cleon.uml.spec.structural.classes.events.javamodel.IEvent.class, cleon.uml.spec.structural.classes.ClassesPackage.EventClass_events);
  }

  public Entity setEvents(java.util.List<? extends cleon.uml.spec.structural.classes.events.javamodel.IEvent> events) {
    _setList(cleon.uml.spec.structural.classes.ClassesPackage.EventClass_events, events);
    return this;
  }
    
  @Override
  public cleon.ddd.spec.javamodel.IEntity selectExtends() {
    return _getSingle(cleon.ddd.spec.javamodel.IEntity.class, cleon.ddd.spec.SpecPackage.Entity_extends);
  }

  public Entity setExtends(cleon.ddd.spec.javamodel.IEntity extends_) {
    _setSingle(cleon.ddd.spec.SpecPackage.Entity_extends, extends_);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.uml.spec.structural.classes.events.javamodel.IEventForField> selectFieldEvents() {
    return _getMap(cleon.uml.spec.structural.classes.events.javamodel.IEventForField.class, cleon.uml.spec.structural.classes.ClassesPackage.Class_fieldEvents);
  }

  public Entity setFieldEvents(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.uml.spec.structural.classes.events.javamodel.IEventForField> fieldEvents) {
    _setMap(cleon.uml.spec.structural.classes.ClassesPackage.Class_fieldEvents, fieldEvents);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.uml.spec.structural.classes.fields.javamodel.IField> selectFields() {
    return _getList(cleon.uml.spec.structural.classes.fields.javamodel.IField.class, cleon.uml.spec.structural.classes.ClassesPackage.FieldClass_fields);
  }

  public Entity setFields(java.util.List<? extends cleon.uml.spec.structural.classes.fields.javamodel.IField> fields) {
    _setList(cleon.uml.spec.structural.classes.ClassesPackage.FieldClass_fields, fields);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.uml.spec.structural.classes.method.javamodel.IMethod> selectMethods() {
    return _getList(cleon.uml.spec.structural.classes.method.javamodel.IMethod.class, cleon.uml.spec.structural.classes.method.MethodPackage.MethodClass_methods);
  }

  public Entity setMethods(java.util.List<? extends cleon.uml.spec.structural.classes.method.javamodel.IMethod> methods) {
    _setList(cleon.uml.spec.structural.classes.method.MethodPackage.MethodClass_methods, methods);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.arc42.spec._05_buildingblockview.javamodel.IBuildingBlock> selectOwnDecompositions() {
    return _getList(cleon.arc42.spec._05_buildingblockview.javamodel.IBuildingBlock.class, cleon.arc42.spec._05_buildingblockview._05_buildingblockviewPackage.OwnBuildingBlock_ownDecompositions);
  }

  public Entity setOwnDecompositions(java.util.List<? extends cleon.arc42.spec._05_buildingblockview.javamodel.IBuildingBlock> ownDecompositions) {
    _setList(cleon.arc42.spec._05_buildingblockview._05_buildingblockviewPackage.OwnBuildingBlock_ownDecompositions, ownDecompositions);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.javamodel.IParagraph> selectParagraphes() {
    return _getList(cleon.doc.spec.javamodel.IParagraph.class, cleon.doc.spec.SpecPackage.Chapter_paragraphes);
  }

  public Entity setParagraphes(java.util.List<? extends cleon.doc.spec.javamodel.IParagraph> paragraphes) {
    _setList(cleon.doc.spec.SpecPackage.Chapter_paragraphes, paragraphes);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.uml.spec.structural.classes.association.javamodel.IAssociation> selectRelations() {
    return _getList(cleon.uml.spec.structural.classes.association.javamodel.IAssociation.class, cleon.uml.spec.structural.classes.ClassesPackage.AssociationClass_relations);
  }

  public Entity setRelations(java.util.List<? extends cleon.uml.spec.structural.classes.association.javamodel.IAssociation> relations) {
    _setList(cleon.uml.spec.structural.classes.ClassesPackage.AssociationClass_relations, relations);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Entity setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.uml.spec.structural.classes.ClassesPackage.IsAbstract_isAbstract, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.arc42.spec._05_buildingblockview._05_buildingblockviewPackage.BuildingBlock_responsibility, visitor);
    // relations
    _acceptList(cleon.doc.spec.javamodel.IChapter.class, cleon.doc.spec.SpecPackage.Chapter_chapters, visitor);
    _acceptList(cleon.uml.spec.structural.classes.events.javamodel.ICustomEvent.class, cleon.uml.spec.structural.classes.ClassesPackage.Class_customEvents, visitor);
    _acceptList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.DocumentElementComposite_documentElements, visitor);
    _acceptList(cleon.uml.spec.structural.classes.events.javamodel.IEvent.class, cleon.uml.spec.structural.classes.ClassesPackage.EventClass_events, visitor);
    _acceptSingle(cleon.ddd.spec.javamodel.IEntity.class, cleon.ddd.spec.SpecPackage.Entity_extends, visitor);
    _acceptMap(cleon.uml.spec.structural.classes.events.javamodel.IEventForField.class, cleon.uml.spec.structural.classes.ClassesPackage.Class_fieldEvents, visitor);
    _acceptList(cleon.uml.spec.structural.classes.fields.javamodel.IField.class, cleon.uml.spec.structural.classes.ClassesPackage.FieldClass_fields, visitor);
    _acceptList(cleon.uml.spec.structural.classes.method.javamodel.IMethod.class, cleon.uml.spec.structural.classes.method.MethodPackage.MethodClass_methods, visitor);
    _acceptList(cleon.arc42.spec._05_buildingblockview.javamodel.IBuildingBlock.class, cleon.arc42.spec._05_buildingblockview._05_buildingblockviewPackage.OwnBuildingBlock_ownDecompositions, visitor);
    _acceptList(cleon.doc.spec.javamodel.IParagraph.class, cleon.doc.spec.SpecPackage.Chapter_paragraphes, visitor);
    _acceptList(cleon.uml.spec.structural.classes.association.javamodel.IAssociation.class, cleon.uml.spec.structural.classes.ClassesPackage.AssociationClass_relations, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.ddd.spec.javamodel.IEntity> selectToMeExtends(cleon.ddd.spec.javamodel.IEntity object) {
    return _getToMeList(object.getRepository(), cleon.ddd.spec.javamodel.IEntity.class, cleon.ddd.spec.SpecPackage.Entity_extends, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,8914497d-10c0-11e3-b60e-ab478a3e1eca,7ZKBS1PcbM4hEsk6CJhHFPc624U=] */
