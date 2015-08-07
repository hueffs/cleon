package cleon.arc42.spec._05_buildingblockview.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class __V_5_aE_BuildingBlockView extends DynamicResource implements I__V_5_aE_BuildingBlockView {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<I__V_5_aE_BuildingBlockView> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<I__V_5_aE_BuildingBlockView>() {
    
    @Override
    public I__V_5_aE_BuildingBlockView create() {
      return new __V_5_aE_BuildingBlockView();
    }
    
    @Override
    public I__V_5_aE_BuildingBlockView create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new __V_5_aE_BuildingBlockView(resourceRepository, resource);
    }
  
  };

  public __V_5_aE_BuildingBlockView() {
    super(I__V_5_aE_BuildingBlockView.TYPE_ID);
  }
  
  public __V_5_aE_BuildingBlockView(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, I__V_5_aE_BuildingBlockView.TYPE_ID);
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
  public java.util.List<java.lang.String> selectDescription() {
    return _getListAttribute(java.lang.String.class, cleon.doc.spec.chapter.ChapterPackage.Description_description);
  }
    
  public void setDescription(java.util.List<java.lang.String> description) {
     _setListAttribute(cleon.doc.spec.chapter.ChapterPackage.Description_description, description);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.arc42.spec._05_buildingblockview.javamodel.IBuildingBlock> selectBuildingBlocks() {
    return _getList(cleon.arc42.spec._05_buildingblockview.javamodel.IBuildingBlock.class, cleon.arc42.spec._05_buildingblockview._05_buildingblockviewPackage.__V_5_aE_BuildingBlockView_buildingBlocks);
  }

  public __V_5_aE_BuildingBlockView setBuildingBlocks(java.util.List<? extends cleon.arc42.spec._05_buildingblockview.javamodel.IBuildingBlock> buildingBlocks) {
    _setList(cleon.arc42.spec._05_buildingblockview._05_buildingblockviewPackage.__V_5_aE_BuildingBlockView_buildingBlocks, buildingBlocks);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.chapter.javamodel.IChapter> selectChapters() {
    return _getList(cleon.doc.spec.chapter.javamodel.IChapter.class, cleon.doc.spec.chapter.ChapterPackage.Chapter_chapters);
  }

  public __V_5_aE_BuildingBlockView setChapters(java.util.List<? extends cleon.doc.spec.chapter.javamodel.IChapter> chapters) {
    _setList(cleon.doc.spec.chapter.ChapterPackage.Chapter_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.document.javamodel.IDocument> selectDocuments() {
    return _getList(cleon.doc.spec.document.javamodel.IDocument.class, cleon.doc.spec.document.DocumentPackage.Document_documents);
  }

  public __V_5_aE_BuildingBlockView setDocuments(java.util.List<? extends cleon.doc.spec.document.javamodel.IDocument> documents) {
    _setList(cleon.doc.spec.document.DocumentPackage.Document_documents, documents);
    return this;
  }
    
  @Override
  public cleon.doc.spec.document.javamodel.IDocument selectNoDocuments() {
    return _getSingle(cleon.doc.spec.document.javamodel.IDocument.class, cleon.doc.spec.document.DocumentPackage.NoSubDocuments_noDocuments);
  }

  public __V_5_aE_BuildingBlockView setNoDocuments(cleon.doc.spec.document.javamodel.IDocument noDocuments) {
    _setSingle(cleon.doc.spec.document.DocumentPackage.NoSubDocuments_noDocuments, noDocuments);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> selectOwnDocumentElements() {
    return _getList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.OwnDocumentElementComposite_ownDocumentElements);
  }

  public __V_5_aE_BuildingBlockView setOwnDocumentElements(java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> ownDocumentElements) {
    _setList(cleon.doc.spec.SpecPackage.OwnDocumentElementComposite_ownDocumentElements, ownDocumentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.chapter.paragraph.javamodel.IParagraph> selectParagraphes() {
    return _getList(cleon.doc.spec.chapter.paragraph.javamodel.IParagraph.class, cleon.doc.spec.chapter.ChapterPackage.Chapter_paragraphes);
  }

  public __V_5_aE_BuildingBlockView setParagraphes(java.util.List<? extends cleon.doc.spec.chapter.paragraph.javamodel.IParagraph> paragraphes) {
    _setList(cleon.doc.spec.chapter.ChapterPackage.Chapter_paragraphes, paragraphes);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.arc42.spec.javamodel.IArc42_Section> selectSections() {
    return _getList(cleon.arc42.spec.javamodel.IArc42_Section.class, cleon.arc42.spec.SpecPackage.arc42_aE_SubDocument_sections);
  }

  public __V_5_aE_BuildingBlockView setSections(java.util.List<? extends cleon.arc42.spec.javamodel.IArc42_Section> sections) {
    _setList(cleon.arc42.spec.SpecPackage.arc42_aE_SubDocument_sections, sections);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public __V_5_aE_BuildingBlockView setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> selectUseDocumentElements() {
    return _getList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.UseDocumentElementComposite_useDocumentElements);
  }

  public __V_5_aE_BuildingBlockView setUseDocumentElements(java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> useDocumentElements) {
    _setList(cleon.doc.spec.SpecPackage.UseDocumentElementComposite_useDocumentElements, useDocumentElements);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.doc.spec.chapter.ChapterPackage.Description_description, visitor);
    // relations
    _acceptList(cleon.arc42.spec._05_buildingblockview.javamodel.IBuildingBlock.class, cleon.arc42.spec._05_buildingblockview._05_buildingblockviewPackage.__V_5_aE_BuildingBlockView_buildingBlocks, visitor);
    _acceptList(cleon.doc.spec.chapter.javamodel.IChapter.class, cleon.doc.spec.chapter.ChapterPackage.Chapter_chapters, visitor);
    _acceptList(cleon.doc.spec.document.javamodel.IDocument.class, cleon.doc.spec.document.DocumentPackage.Document_documents, visitor);
    _acceptSingle(cleon.doc.spec.document.javamodel.IDocument.class, cleon.doc.spec.document.DocumentPackage.NoSubDocuments_noDocuments, visitor);
    _acceptList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.OwnDocumentElementComposite_ownDocumentElements, visitor);
    _acceptList(cleon.doc.spec.chapter.paragraph.javamodel.IParagraph.class, cleon.doc.spec.chapter.ChapterPackage.Chapter_paragraphes, visitor);
    _acceptList(cleon.arc42.spec.javamodel.IArc42_Section.class, cleon.arc42.spec.SpecPackage.arc42_aE_SubDocument_sections, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
    _acceptList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.UseDocumentElementComposite_useDocumentElements, visitor);
  }

  // toMeRelations
  
  public static cleon.arc42.spec._05_buildingblockview.javamodel.I__V_5_aE_BuildingBlockView selectToMeBuildingBlocks(cleon.arc42.spec._05_buildingblockview.javamodel.IBuildingBlock object) {
    return _getToMeSingle(object.getRepository(), cleon.arc42.spec._05_buildingblockview.javamodel.I__V_5_aE_BuildingBlockView.class, cleon.arc42.spec._05_buildingblockview._05_buildingblockviewPackage.__V_5_aE_BuildingBlockView_buildingBlocks, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,37b55799-ffcc-11e4-ac0a-959b440f987f,i9YLPbNH3WSlVLMkPtx0bi24+CA=] */
