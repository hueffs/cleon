package cleon.sda.spec.projectmanagement.scope.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Scope extends DynamicResource implements IScope {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IScope> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IScope>() {
    
    @Override
    public IScope create() {
      return new Scope();
    }
    
    @Override
    public IScope create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Scope(resourceRepository, resource);
    }
  
  };

  public Scope() {
    super(IScope.TYPE_ID);
  }
  
  public Scope(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IScope.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.Boolean selectWithToC() {
    return _getSingleAttribute(java.lang.Boolean.class, cleon.doc.spec.document.DocumentPackage.Document_withToC);
  }
    
  public void setWithToC(java.lang.Boolean withToC) {
     _setSingleAttribute(cleon.doc.spec.document.DocumentPackage.Document_withToC, withToC);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.doc.spec.autor.javamodel.IAutor> selectAutors() {
    return _getList(cleon.doc.spec.autor.javamodel.IAutor.class, cleon.doc.spec.autor.AutorPackage.Autors_autors);
  }

  public Scope setAutors(java.util.List<? extends cleon.doc.spec.autor.javamodel.IAutor> autors) {
    _setList(cleon.doc.spec.autor.AutorPackage.Autors_autors, autors);
    return this;
  }
    
  @Override
  public cleon.sda.spec.projectmanagement.scope.javamodel.IBacklogs selectBacklogs() {
    return _getSingle(cleon.sda.spec.projectmanagement.scope.javamodel.IBacklogs.class, cleon.sda.spec.projectmanagement.scope.ScopePackage.Scope_backlogs);
  }

  public Scope setBacklogs(cleon.sda.spec.projectmanagement.scope.javamodel.IBacklogs backlogs) {
    _setSingle(cleon.sda.spec.projectmanagement.scope.ScopePackage.Scope_backlogs, backlogs);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.chapter.javamodel.IChapterOwnDocumentElementComposite> selectChapters() {
    return _getList(cleon.doc.spec.chapter.javamodel.IChapterOwnDocumentElementComposite.class, cleon.doc.spec.chapter.ChapterPackage.ChapterOwnDocumentElementComposite_chapters);
  }

  public Scope setChapters(java.util.List<? extends cleon.doc.spec.chapter.javamodel.IChapterOwnDocumentElementComposite> chapters) {
    _setList(cleon.doc.spec.chapter.ChapterPackage.ChapterOwnDocumentElementComposite_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.document.javamodel.ISubDocument> selectDocuments() {
    return _getList(cleon.doc.spec.document.javamodel.ISubDocument.class, cleon.doc.spec.document.DocumentPackage.AbstractDocument_documents);
  }

  public Scope setDocuments(java.util.List<? extends cleon.doc.spec.document.javamodel.ISubDocument> documents) {
    _setList(cleon.doc.spec.document.DocumentPackage.AbstractDocument_documents, documents);
    return this;
  }
    
  @Override
  public cleon.doc.spec.chapter.javamodel.IChapter selectNoChapters() {
    return _getSingle(cleon.doc.spec.chapter.javamodel.IChapter.class, cleon.doc.spec.chapter.ChapterPackage.NoChapters_noChapters);
  }

  public Scope setNoChapters(cleon.doc.spec.chapter.javamodel.IChapter noChapters) {
    _setSingle(cleon.doc.spec.chapter.ChapterPackage.NoChapters_noChapters, noChapters);
    return this;
  }
    
  @Override
  public cleon.sda.spec.projectmanagement.scope.outcome.javamodel.IOutcomes selectOutcome() {
    return _getSingle(cleon.sda.spec.projectmanagement.scope.outcome.javamodel.IOutcomes.class, cleon.sda.spec.projectmanagement.scope.ScopePackage.Scope_outcome);
  }

  public Scope setOutcome(cleon.sda.spec.projectmanagement.scope.outcome.javamodel.IOutcomes outcome) {
    _setSingle(cleon.sda.spec.projectmanagement.scope.ScopePackage.Scope_outcome, outcome);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> selectOwnDocumentElements() {
    return _getList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.OwnDocumentElementComposite_ownDocumentElements);
  }

  public Scope setOwnDocumentElements(java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> ownDocumentElements) {
    _setList(cleon.doc.spec.SpecPackage.OwnDocumentElementComposite_ownDocumentElements, ownDocumentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.paragraph.javamodel.IParagraph> selectParagraphes() {
    return _getList(cleon.doc.spec.paragraph.javamodel.IParagraph.class, cleon.doc.spec.paragraph.ParagraphPackage.ParagraphOwnDocumentElementComposite_paragraphes);
  }

  public Scope setParagraphes(java.util.List<? extends cleon.doc.spec.paragraph.javamodel.IParagraph> paragraphes) {
    _setList(cleon.doc.spec.paragraph.ParagraphPackage.ParagraphOwnDocumentElementComposite_paragraphes, paragraphes);
    return this;
  }
    
  @Override
  public cleon.doc.spec.document.style.javamodel.IStyle selectStyle() {
    return _getSingle(cleon.doc.spec.document.style.javamodel.IStyle.class, cleon.doc.spec.document.DocumentPackage.Document_style);
  }

  public Scope setStyle(cleon.doc.spec.document.style.javamodel.IStyle style) {
    _setSingle(cleon.doc.spec.document.DocumentPackage.Document_style, style);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Scope setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> selectUseDocumentElements() {
    return _getList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.UseDocumentElementComposite_useDocumentElements);
  }

  public Scope setUseDocumentElements(java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> useDocumentElements) {
    _setList(cleon.doc.spec.SpecPackage.UseDocumentElementComposite_useDocumentElements, useDocumentElements);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.doc.spec.document.DocumentPackage.Document_withToC, visitor);
    // relations
    _acceptList(cleon.doc.spec.autor.javamodel.IAutor.class, cleon.doc.spec.autor.AutorPackage.Autors_autors, visitor);
    _acceptSingle(cleon.sda.spec.projectmanagement.scope.javamodel.IBacklogs.class, cleon.sda.spec.projectmanagement.scope.ScopePackage.Scope_backlogs, visitor);
    _acceptList(cleon.doc.spec.chapter.javamodel.IChapterOwnDocumentElementComposite.class, cleon.doc.spec.chapter.ChapterPackage.ChapterOwnDocumentElementComposite_chapters, visitor);
    _acceptList(cleon.doc.spec.document.javamodel.ISubDocument.class, cleon.doc.spec.document.DocumentPackage.AbstractDocument_documents, visitor);
    _acceptSingle(cleon.doc.spec.chapter.javamodel.IChapter.class, cleon.doc.spec.chapter.ChapterPackage.NoChapters_noChapters, visitor);
    _acceptSingle(cleon.sda.spec.projectmanagement.scope.outcome.javamodel.IOutcomes.class, cleon.sda.spec.projectmanagement.scope.ScopePackage.Scope_outcome, visitor);
    _acceptList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.OwnDocumentElementComposite_ownDocumentElements, visitor);
    _acceptList(cleon.doc.spec.paragraph.javamodel.IParagraph.class, cleon.doc.spec.paragraph.ParagraphPackage.ParagraphOwnDocumentElementComposite_paragraphes, visitor);
    _acceptSingle(cleon.doc.spec.document.style.javamodel.IStyle.class, cleon.doc.spec.document.DocumentPackage.Document_style, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
    _acceptList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.UseDocumentElementComposite_useDocumentElements, visitor);
  }

  // toMeRelations
  
  public static cleon.sda.spec.projectmanagement.scope.javamodel.IScope selectToMeOutcome(cleon.sda.spec.projectmanagement.scope.outcome.javamodel.IOutcomes object) {
    return _getToMeSingle(object.getRepository(), cleon.sda.spec.projectmanagement.scope.javamodel.IScope.class, cleon.sda.spec.projectmanagement.scope.ScopePackage.Scope_outcome, object.getResource());
  }
  
  public static cleon.sda.spec.projectmanagement.scope.javamodel.IScope selectToMeBacklogs(cleon.sda.spec.projectmanagement.scope.javamodel.IBacklogs object) {
    return _getToMeSingle(object.getRepository(), cleon.sda.spec.projectmanagement.scope.javamodel.IScope.class, cleon.sda.spec.projectmanagement.scope.ScopePackage.Scope_backlogs, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,fef60a9b-a7d8-11e5-82dd-3b995d9c840c,2IyRTbFljGsWDMxf8mNPDlkch0Q=] */
