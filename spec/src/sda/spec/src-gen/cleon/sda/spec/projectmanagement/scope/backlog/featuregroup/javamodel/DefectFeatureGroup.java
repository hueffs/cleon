package cleon.sda.spec.projectmanagement.scope.backlog.featuregroup.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class DefectFeatureGroup extends DynamicResource implements IDefectFeatureGroup {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IDefectFeatureGroup> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IDefectFeatureGroup>() {
    
    @Override
    public IDefectFeatureGroup create() {
      return new DefectFeatureGroup();
    }
    
    @Override
    public IDefectFeatureGroup create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new DefectFeatureGroup(resourceRepository, resource);
    }
  
  };

  public DefectFeatureGroup() {
    super(IDefectFeatureGroup.TYPE_ID);
  }
  
  public DefectFeatureGroup(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IDefectFeatureGroup.TYPE_ID);
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

  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  @Override
  public java.lang.Integer selectPlannedEstimate() {
    return _getSingleAttribute(java.lang.Integer.class, cleon.sda.spec.projectmanagement.scope.backlog.featuregroup.FeaturegroupPackage.FeatureGroup_plannedEstimate);
  }
    
  public void setPlannedEstimate(java.lang.Integer plannedEstimate) {
     _setSingleAttribute(cleon.sda.spec.projectmanagement.scope.backlog.featuregroup.FeaturegroupPackage.FeatureGroup_plannedEstimate, plannedEstimate);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.doc.spec.chapter.javamodel.IChapterOwnDocumentElementComposite> selectChapters() {
    return _getList(cleon.doc.spec.chapter.javamodel.IChapterOwnDocumentElementComposite.class, cleon.doc.spec.chapter.ChapterPackage.ChapterOwnDocumentElementComposite_chapters);
  }

  public DefectFeatureGroup setChapters(java.util.List<? extends cleon.doc.spec.chapter.javamodel.IChapterOwnDocumentElementComposite> chapters) {
    _setList(cleon.doc.spec.chapter.ChapterPackage.ChapterOwnDocumentElementComposite_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.sda.spec.projectmanagement.scope.backlog.defect.javamodel.IDefect> selectDefects() {
    return _getList(cleon.sda.spec.projectmanagement.scope.backlog.defect.javamodel.IDefect.class, cleon.sda.spec.projectmanagement.scope.backlog.featuregroup.FeaturegroupPackage.DefectFeatureGroup_defects);
  }

  public DefectFeatureGroup setDefects(java.util.List<? extends cleon.sda.spec.projectmanagement.scope.backlog.defect.javamodel.IDefect> defects) {
    _setList(cleon.sda.spec.projectmanagement.scope.backlog.featuregroup.FeaturegroupPackage.DefectFeatureGroup_defects, defects);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> selectOwnDocumentElements() {
    return _getList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.OwnDocumentElementComposite_ownDocumentElements);
  }

  public DefectFeatureGroup setOwnDocumentElements(java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> ownDocumentElements) {
    _setList(cleon.doc.spec.SpecPackage.OwnDocumentElementComposite_ownDocumentElements, ownDocumentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.paragraph.javamodel.IParagraph> selectParagraphes() {
    return _getList(cleon.doc.spec.paragraph.javamodel.IParagraph.class, cleon.doc.spec.paragraph.ParagraphPackage.ParagraphOwnDocumentElementComposite_paragraphes);
  }

  public DefectFeatureGroup setParagraphes(java.util.List<? extends cleon.doc.spec.paragraph.javamodel.IParagraph> paragraphes) {
    _setList(cleon.doc.spec.paragraph.ParagraphPackage.ParagraphOwnDocumentElementComposite_paragraphes, paragraphes);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.sda.spec.projectmanagement.scope.backlog.featuregroup.javamodel.IFeatureGroup> selectPreconditions() {
    return _getList(cleon.sda.spec.projectmanagement.scope.backlog.featuregroup.javamodel.IFeatureGroup.class, cleon.sda.spec.projectmanagement.scope.backlog.featuregroup.FeaturegroupPackage.FeatureGroup_preconditions);
  }

  public DefectFeatureGroup setPreconditions(java.util.List<? extends cleon.sda.spec.projectmanagement.scope.backlog.featuregroup.javamodel.IFeatureGroup> preconditions) {
    _setList(cleon.sda.spec.projectmanagement.scope.backlog.featuregroup.FeaturegroupPackage.FeatureGroup_preconditions, preconditions);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.sda.spec.projectmanagement.scope.backlog.featuregroup.javamodel.IFeatureGroup> selectSubfeatureGroup() {
    return _getList(cleon.sda.spec.projectmanagement.scope.backlog.featuregroup.javamodel.IFeatureGroup.class, cleon.sda.spec.projectmanagement.scope.backlog.featuregroup.FeaturegroupPackage.FeatureGroup_subfeatureGroup);
  }

  public DefectFeatureGroup setSubfeatureGroup(java.util.List<? extends cleon.sda.spec.projectmanagement.scope.backlog.featuregroup.javamodel.IFeatureGroup> subfeatureGroup) {
    _setList(cleon.sda.spec.projectmanagement.scope.backlog.featuregroup.FeaturegroupPackage.FeatureGroup_subfeatureGroup, subfeatureGroup);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public DefectFeatureGroup setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.sda.spec.projectmanagement.scope.backlog.javamodel.IWorkItem> selectWorkItems() {
    return _getList(cleon.sda.spec.projectmanagement.scope.backlog.javamodel.IWorkItem.class, cleon.sda.spec.projectmanagement.scope.backlog.featuregroup.FeaturegroupPackage.FeatureGroup_workItems);
  }

  public DefectFeatureGroup setWorkItems(java.util.List<? extends cleon.sda.spec.projectmanagement.scope.backlog.javamodel.IWorkItem> workItems) {
    _setList(cleon.sda.spec.projectmanagement.scope.backlog.featuregroup.FeaturegroupPackage.FeatureGroup_workItems, workItems);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.doc.spec.SpecPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    _acceptSingleAttribute(java.lang.Integer.class, cleon.sda.spec.projectmanagement.scope.backlog.featuregroup.FeaturegroupPackage.FeatureGroup_plannedEstimate, visitor);
    // relations
    _acceptList(cleon.doc.spec.chapter.javamodel.IChapterOwnDocumentElementComposite.class, cleon.doc.spec.chapter.ChapterPackage.ChapterOwnDocumentElementComposite_chapters, visitor);
    _acceptList(cleon.sda.spec.projectmanagement.scope.backlog.defect.javamodel.IDefect.class, cleon.sda.spec.projectmanagement.scope.backlog.featuregroup.FeaturegroupPackage.DefectFeatureGroup_defects, visitor);
    _acceptList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.OwnDocumentElementComposite_ownDocumentElements, visitor);
    _acceptList(cleon.doc.spec.paragraph.javamodel.IParagraph.class, cleon.doc.spec.paragraph.ParagraphPackage.ParagraphOwnDocumentElementComposite_paragraphes, visitor);
    _acceptList(cleon.sda.spec.projectmanagement.scope.backlog.featuregroup.javamodel.IFeatureGroup.class, cleon.sda.spec.projectmanagement.scope.backlog.featuregroup.FeaturegroupPackage.FeatureGroup_preconditions, visitor);
    _acceptList(cleon.sda.spec.projectmanagement.scope.backlog.featuregroup.javamodel.IFeatureGroup.class, cleon.sda.spec.projectmanagement.scope.backlog.featuregroup.FeaturegroupPackage.FeatureGroup_subfeatureGroup, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
    _acceptList(cleon.sda.spec.projectmanagement.scope.backlog.javamodel.IWorkItem.class, cleon.sda.spec.projectmanagement.scope.backlog.featuregroup.FeaturegroupPackage.FeatureGroup_workItems, visitor);
  }

  // toMeRelations
  
  public static cleon.sda.spec.projectmanagement.scope.backlog.featuregroup.javamodel.IDefectFeatureGroup selectToMeDefects(cleon.sda.spec.projectmanagement.scope.backlog.defect.javamodel.IDefect object) {
    return _getToMeSingle(object.getRepository(), cleon.sda.spec.projectmanagement.scope.backlog.featuregroup.javamodel.IDefectFeatureGroup.class, cleon.sda.spec.projectmanagement.scope.backlog.featuregroup.FeaturegroupPackage.DefectFeatureGroup_defects, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,d243a7a6-369e-11e5-95d9-2b04d7ab02d9,WMHj3xWSnahVkNb7Gh9PyNyDlMc=] */
