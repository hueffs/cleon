package cleon.doc.spec.document.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class NamedDocument extends DynamicResource implements INamedDocument {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<INamedDocument> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<INamedDocument>() {
    
    @Override
    public INamedDocument create() {
      return new NamedDocument();
    }
    
    @Override
    public INamedDocument create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new NamedDocument(resourceRepository, resource);
    }
  
  };

  public NamedDocument() {
    super(INamedDocument.TYPE_ID);
  }
  
  public NamedDocument(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, INamedDocument.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

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

  public NamedDocument setAutors(java.util.List<? extends cleon.doc.spec.autor.javamodel.IAutor> autors) {
    _setList(cleon.doc.spec.autor.AutorPackage.Autors_autors, autors);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.chapter.javamodel.IChapterOwnDocumentElementComposite> selectChapters() {
    return _getList(cleon.doc.spec.chapter.javamodel.IChapterOwnDocumentElementComposite.class, cleon.doc.spec.chapter.ChapterPackage.ChapterOwnDocumentElementComposite_chapters);
  }

  public NamedDocument setChapters(java.util.List<? extends cleon.doc.spec.chapter.javamodel.IChapterOwnDocumentElementComposite> chapters) {
    _setList(cleon.doc.spec.chapter.ChapterPackage.ChapterOwnDocumentElementComposite_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.document.javamodel.ISubDocument> selectDocuments() {
    return _getList(cleon.doc.spec.document.javamodel.ISubDocument.class, cleon.doc.spec.document.DocumentPackage.AbstractDocument_documents);
  }

  public NamedDocument setDocuments(java.util.List<? extends cleon.doc.spec.document.javamodel.ISubDocument> documents) {
    _setList(cleon.doc.spec.document.DocumentPackage.AbstractDocument_documents, documents);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> selectOwnDocumentElements() {
    return _getList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.OwnDocumentElementComposite_ownDocumentElements);
  }

  public NamedDocument setOwnDocumentElements(java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> ownDocumentElements) {
    _setList(cleon.doc.spec.SpecPackage.OwnDocumentElementComposite_ownDocumentElements, ownDocumentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.paragraph.javamodel.IParagraph> selectParagraphes() {
    return _getList(cleon.doc.spec.paragraph.javamodel.IParagraph.class, cleon.doc.spec.paragraph.ParagraphPackage.ParagraphOwnDocumentElementComposite_paragraphes);
  }

  public NamedDocument setParagraphes(java.util.List<? extends cleon.doc.spec.paragraph.javamodel.IParagraph> paragraphes) {
    _setList(cleon.doc.spec.paragraph.ParagraphPackage.ParagraphOwnDocumentElementComposite_paragraphes, paragraphes);
    return this;
  }
    
  @Override
  public cleon.doc.spec.document.style.javamodel.IStyle selectStyle() {
    return _getSingle(cleon.doc.spec.document.style.javamodel.IStyle.class, cleon.doc.spec.document.DocumentPackage.Document_style);
  }

  public NamedDocument setStyle(cleon.doc.spec.document.style.javamodel.IStyle style) {
    _setSingle(cleon.doc.spec.document.DocumentPackage.Document_style, style);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public NamedDocument setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> selectUseDocumentElements() {
    return _getList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.UseDocumentElementComposite_useDocumentElements);
  }

  public NamedDocument setUseDocumentElements(java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> useDocumentElements) {
    _setList(cleon.doc.spec.SpecPackage.UseDocumentElementComposite_useDocumentElements, useDocumentElements);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.doc.spec.document.DocumentPackage.Document_withToC, visitor);
    // relations
    _acceptList(cleon.doc.spec.autor.javamodel.IAutor.class, cleon.doc.spec.autor.AutorPackage.Autors_autors, visitor);
    _acceptList(cleon.doc.spec.chapter.javamodel.IChapterOwnDocumentElementComposite.class, cleon.doc.spec.chapter.ChapterPackage.ChapterOwnDocumentElementComposite_chapters, visitor);
    _acceptList(cleon.doc.spec.document.javamodel.ISubDocument.class, cleon.doc.spec.document.DocumentPackage.AbstractDocument_documents, visitor);
    _acceptList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.OwnDocumentElementComposite_ownDocumentElements, visitor);
    _acceptList(cleon.doc.spec.paragraph.javamodel.IParagraph.class, cleon.doc.spec.paragraph.ParagraphPackage.ParagraphOwnDocumentElementComposite_paragraphes, visitor);
    _acceptSingle(cleon.doc.spec.document.style.javamodel.IStyle.class, cleon.doc.spec.document.DocumentPackage.Document_style, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
    _acceptList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.UseDocumentElementComposite_useDocumentElements, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,3e870b86-d86d-11e4-aa2f-c11242a92b60,TAR4g0oMtLQjDOHMqLFgNOmQXdM=] */
