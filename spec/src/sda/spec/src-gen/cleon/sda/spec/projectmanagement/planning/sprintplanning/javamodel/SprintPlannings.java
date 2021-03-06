package cleon.sda.spec.projectmanagement.planning.sprintplanning.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class SprintPlannings extends DynamicResource implements ISprintPlannings {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISprintPlannings> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISprintPlannings>() {
    
    @Override
    public ISprintPlannings create() {
      return new SprintPlannings();
    }
    
    @Override
    public ISprintPlannings create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new SprintPlannings(resourceRepository, resource);
    }
  
  };

  public SprintPlannings() {
    super(ISprintPlannings.TYPE_ID);
  }
  
  public SprintPlannings(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ISprintPlannings.TYPE_ID);
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
  public java.util.List<java.lang.String> selectDescriptions() {
    return _getListAttribute(java.lang.String.class, cleon.doc.spec.SpecPackage.SimpleDescription_descriptions);
  }
    
  public void setDescriptions(java.util.List<java.lang.String> descriptions) {
     _setListAttribute(cleon.doc.spec.SpecPackage.SimpleDescription_descriptions, descriptions);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.doc.spec.chapter.javamodel.IChapterOwnDocumentElementComposite> selectChapters() {
    return _getList(cleon.doc.spec.chapter.javamodel.IChapterOwnDocumentElementComposite.class, cleon.doc.spec.chapter.ChapterPackage.ChapterOwnDocumentElementComposite_chapters);
  }

  public SprintPlannings setChapters(java.util.List<? extends cleon.doc.spec.chapter.javamodel.IChapterOwnDocumentElementComposite> chapters) {
    _setList(cleon.doc.spec.chapter.ChapterPackage.ChapterOwnDocumentElementComposite_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> selectOwnDocumentElements() {
    return _getList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.OwnDocumentElementComposite_ownDocumentElements);
  }

  public SprintPlannings setOwnDocumentElements(java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> ownDocumentElements) {
    _setList(cleon.doc.spec.SpecPackage.OwnDocumentElementComposite_ownDocumentElements, ownDocumentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.paragraph.javamodel.IParagraph> selectParagraphes() {
    return _getList(cleon.doc.spec.paragraph.javamodel.IParagraph.class, cleon.doc.spec.paragraph.ParagraphPackage.ParagraphOwnDocumentElementComposite_paragraphes);
  }

  public SprintPlannings setParagraphes(java.util.List<? extends cleon.doc.spec.paragraph.javamodel.IParagraph> paragraphes) {
    _setList(cleon.doc.spec.paragraph.ParagraphPackage.ParagraphOwnDocumentElementComposite_paragraphes, paragraphes);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.sda.spec.projectmanagement.planning.sprintplanning.javamodel.ISprintPlanning> selectSprintplannings() {
    return _getMap(cleon.sda.spec.projectmanagement.planning.sprintplanning.javamodel.ISprintPlanning.class, cleon.sda.spec.projectmanagement.planning.sprintplanning.SprintplanningPackage.SprintPlannings_sprintplannings);
  }

  public SprintPlannings setSprintplannings(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.sda.spec.projectmanagement.planning.sprintplanning.javamodel.ISprintPlanning> sprintplannings) {
    _setMap(cleon.sda.spec.projectmanagement.planning.sprintplanning.SprintplanningPackage.SprintPlannings_sprintplannings, sprintplannings);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public SprintPlannings setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.doc.spec.SpecPackage.SimpleDescription_descriptions, visitor);
    // relations
    _acceptList(cleon.doc.spec.chapter.javamodel.IChapterOwnDocumentElementComposite.class, cleon.doc.spec.chapter.ChapterPackage.ChapterOwnDocumentElementComposite_chapters, visitor);
    _acceptList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.OwnDocumentElementComposite_ownDocumentElements, visitor);
    _acceptList(cleon.doc.spec.paragraph.javamodel.IParagraph.class, cleon.doc.spec.paragraph.ParagraphPackage.ParagraphOwnDocumentElementComposite_paragraphes, visitor);
    _acceptMap(cleon.sda.spec.projectmanagement.planning.sprintplanning.javamodel.ISprintPlanning.class, cleon.sda.spec.projectmanagement.planning.sprintplanning.SprintplanningPackage.SprintPlannings_sprintplannings, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.sda.spec.projectmanagement.planning.sprintplanning.javamodel.ISprintPlannings selectToMeSprintplannings(cleon.sda.spec.projectmanagement.planning.sprintplanning.javamodel.ISprintPlanning object) {
    return _getToMeSingle(object.getRepository(), cleon.sda.spec.projectmanagement.planning.sprintplanning.javamodel.ISprintPlannings.class, cleon.sda.spec.projectmanagement.planning.sprintplanning.SprintplanningPackage.SprintPlannings_sprintplannings, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,b643c029-c009-11e5-a165-d34765931e10,/wDmRzT5mrqFutuT/KRr1SNrfqE=] */
