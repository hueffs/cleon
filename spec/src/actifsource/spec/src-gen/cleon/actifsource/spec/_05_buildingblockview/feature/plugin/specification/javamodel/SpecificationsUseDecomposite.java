package cleon.actifsource.spec._05_buildingblockview.feature.plugin.specification.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class SpecificationsUseDecomposite extends DynamicResource implements ISpecificationsUseDecomposite {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISpecificationsUseDecomposite> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISpecificationsUseDecomposite>() {
    
    @Override
    public ISpecificationsUseDecomposite create() {
      return new SpecificationsUseDecomposite();
    }
    
    @Override
    public ISpecificationsUseDecomposite create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new SpecificationsUseDecomposite(resourceRepository, resource);
    }
  
  };

  public SpecificationsUseDecomposite() {
    super(ISpecificationsUseDecomposite.TYPE_ID);
  }
  
  public SpecificationsUseDecomposite(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ISpecificationsUseDecomposite.TYPE_ID);
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

  public SpecificationsUseDecomposite setChapters(java.util.List<? extends cleon.doc.spec.chapter.javamodel.IChapterOwnDocumentElementComposite> chapters) {
    _setList(cleon.doc.spec.chapter.ChapterPackage.ChapterOwnDocumentElementComposite_chapters, chapters);
    return this;
  }
    
  @Override
  public cleon.actifsource.spec._05_buildingblockview.feature.plugin.specification.javamodel.ISpecification selectInto() {
    return _getSingle(cleon.actifsource.spec._05_buildingblockview.feature.plugin.specification.javamodel.ISpecification.class, cleon.actifsource.spec._05_buildingblockview.feature.plugin.specification.SpecificationPackage.SpecificationsUseDecomposite_into);
  }

  public SpecificationsUseDecomposite setInto(cleon.actifsource.spec._05_buildingblockview.feature.plugin.specification.javamodel.ISpecification into) {
    _setSingle(cleon.actifsource.spec._05_buildingblockview.feature.plugin.specification.SpecificationPackage.SpecificationsUseDecomposite_into, into);
    return this;
  }
    
  @Override
  public cleon.doc.spec.chapter.javamodel.IChapter selectNoChapters() {
    return _getSingle(cleon.doc.spec.chapter.javamodel.IChapter.class, cleon.doc.spec.chapter.ChapterPackage.NoChapters_noChapters);
  }

  public SpecificationsUseDecomposite setNoChapters(cleon.doc.spec.chapter.javamodel.IChapter noChapters) {
    _setSingle(cleon.doc.spec.chapter.ChapterPackage.NoChapters_noChapters, noChapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> selectOwnDocumentElements() {
    return _getList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.OwnDocumentElementComposite_ownDocumentElements);
  }

  public SpecificationsUseDecomposite setOwnDocumentElements(java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> ownDocumentElements) {
    _setList(cleon.doc.spec.SpecPackage.OwnDocumentElementComposite_ownDocumentElements, ownDocumentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.paragraph.javamodel.IParagraph> selectParagraphes() {
    return _getList(cleon.doc.spec.paragraph.javamodel.IParagraph.class, cleon.doc.spec.paragraph.ParagraphPackage.ParagraphOwnDocumentElementComposite_paragraphes);
  }

  public SpecificationsUseDecomposite setParagraphes(java.util.List<? extends cleon.doc.spec.paragraph.javamodel.IParagraph> paragraphes) {
    _setList(cleon.doc.spec.paragraph.ParagraphPackage.ParagraphOwnDocumentElementComposite_paragraphes, paragraphes);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public SpecificationsUseDecomposite setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
    _acceptSingle(cleon.actifsource.spec._05_buildingblockview.feature.plugin.specification.javamodel.ISpecification.class, cleon.actifsource.spec._05_buildingblockview.feature.plugin.specification.SpecificationPackage.SpecificationsUseDecomposite_into, visitor);
    _acceptSingle(cleon.doc.spec.chapter.javamodel.IChapter.class, cleon.doc.spec.chapter.ChapterPackage.NoChapters_noChapters, visitor);
    _acceptList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.OwnDocumentElementComposite_ownDocumentElements, visitor);
    _acceptList(cleon.doc.spec.paragraph.javamodel.IParagraph.class, cleon.doc.spec.paragraph.ParagraphPackage.ParagraphOwnDocumentElementComposite_paragraphes, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.actifsource.spec._05_buildingblockview.feature.plugin.specification.javamodel.ISpecificationsUseDecomposite selectToMeInto(cleon.actifsource.spec._05_buildingblockview.feature.plugin.specification.javamodel.ISpecification object) {
    return _getToMeSingle(object.getRepository(), cleon.actifsource.spec._05_buildingblockview.feature.plugin.specification.javamodel.ISpecificationsUseDecomposite.class, cleon.actifsource.spec._05_buildingblockview.feature.plugin.specification.SpecificationPackage.SpecificationsUseDecomposite_into, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,27714b1f-3b8a-11e5-b8db-7513250f5f90,xuTI6EPl3XmncJ1/LdVq2061YUI=] */
