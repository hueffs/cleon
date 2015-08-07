package cleon.analysis.spec.evaluation.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Evaluations extends DynamicResource implements IEvaluations {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IEvaluations> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IEvaluations>() {
    
    @Override
    public IEvaluations create() {
      return new Evaluations();
    }
    
    @Override
    public IEvaluations create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Evaluations(resourceRepository, resource);
    }
  
  };

  public Evaluations() {
    super(IEvaluations.TYPE_ID);
  }
  
  public Evaluations(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IEvaluations.TYPE_ID);
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
  public java.util.List<? extends cleon.doc.spec.chapter.javamodel.IChapter> selectChapters() {
    return _getList(cleon.doc.spec.chapter.javamodel.IChapter.class, cleon.doc.spec.chapter.ChapterPackage.Chapter_chapters);
  }

  public Evaluations setChapters(java.util.List<? extends cleon.doc.spec.chapter.javamodel.IChapter> chapters) {
    _setList(cleon.doc.spec.chapter.ChapterPackage.Chapter_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.document.javamodel.IDocument> selectDocuments() {
    return _getList(cleon.doc.spec.document.javamodel.IDocument.class, cleon.doc.spec.document.DocumentPackage.Document_documents);
  }

  public Evaluations setDocuments(java.util.List<? extends cleon.doc.spec.document.javamodel.IDocument> documents) {
    _setList(cleon.doc.spec.document.DocumentPackage.Document_documents, documents);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.analysis.spec.evaluation.javamodel.ISolutionsEvaluation> selectEvaluations() {
    return _getMap(cleon.analysis.spec.evaluation.javamodel.ISolutionsEvaluation.class, cleon.analysis.spec.evaluation.EvaluationPackage.Evaluations_evaluations);
  }

  public Evaluations setEvaluations(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.analysis.spec.evaluation.javamodel.ISolutionsEvaluation> evaluations) {
    _setMap(cleon.analysis.spec.evaluation.EvaluationPackage.Evaluations_evaluations, evaluations);
    return this;
  }
    
  @Override
  public cleon.doc.spec.document.javamodel.IDocument selectNoDocuments() {
    return _getSingle(cleon.doc.spec.document.javamodel.IDocument.class, cleon.doc.spec.document.DocumentPackage.NoSubDocuments_noDocuments);
  }

  public Evaluations setNoDocuments(cleon.doc.spec.document.javamodel.IDocument noDocuments) {
    _setSingle(cleon.doc.spec.document.DocumentPackage.NoSubDocuments_noDocuments, noDocuments);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> selectOwnDocumentElements() {
    return _getList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.OwnDocumentElementComposite_ownDocumentElements);
  }

  public Evaluations setOwnDocumentElements(java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> ownDocumentElements) {
    _setList(cleon.doc.spec.SpecPackage.OwnDocumentElementComposite_ownDocumentElements, ownDocumentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.chapter.paragraph.javamodel.IParagraph> selectParagraphes() {
    return _getList(cleon.doc.spec.chapter.paragraph.javamodel.IParagraph.class, cleon.doc.spec.chapter.ChapterPackage.Chapter_paragraphes);
  }

  public Evaluations setParagraphes(java.util.List<? extends cleon.doc.spec.chapter.paragraph.javamodel.IParagraph> paragraphes) {
    _setList(cleon.doc.spec.chapter.ChapterPackage.Chapter_paragraphes, paragraphes);
    return this;
  }
    
  @Override
  public cleon.analysis.spec.evaluation.javamodel.IResult selectResult() {
    return _getSingle(cleon.analysis.spec.evaluation.javamodel.IResult.class, cleon.analysis.spec.evaluation.EvaluationPackage.Evaluations_result);
  }

  public Evaluations setResult(cleon.analysis.spec.evaluation.javamodel.IResult result) {
    _setSingle(cleon.analysis.spec.evaluation.EvaluationPackage.Evaluations_result, result);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Evaluations setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> selectUseDocumentElements() {
    return _getList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.UseDocumentElementComposite_useDocumentElements);
  }

  public Evaluations setUseDocumentElements(java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> useDocumentElements) {
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
    _acceptList(cleon.doc.spec.chapter.javamodel.IChapter.class, cleon.doc.spec.chapter.ChapterPackage.Chapter_chapters, visitor);
    _acceptList(cleon.doc.spec.document.javamodel.IDocument.class, cleon.doc.spec.document.DocumentPackage.Document_documents, visitor);
    _acceptMap(cleon.analysis.spec.evaluation.javamodel.ISolutionsEvaluation.class, cleon.analysis.spec.evaluation.EvaluationPackage.Evaluations_evaluations, visitor);
    _acceptSingle(cleon.doc.spec.document.javamodel.IDocument.class, cleon.doc.spec.document.DocumentPackage.NoSubDocuments_noDocuments, visitor);
    _acceptList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.OwnDocumentElementComposite_ownDocumentElements, visitor);
    _acceptList(cleon.doc.spec.chapter.paragraph.javamodel.IParagraph.class, cleon.doc.spec.chapter.ChapterPackage.Chapter_paragraphes, visitor);
    _acceptSingle(cleon.analysis.spec.evaluation.javamodel.IResult.class, cleon.analysis.spec.evaluation.EvaluationPackage.Evaluations_result, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
    _acceptList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.UseDocumentElementComposite_useDocumentElements, visitor);
  }

  // toMeRelations
  
  public static cleon.analysis.spec.evaluation.javamodel.IEvaluations selectToMeEvaluations(cleon.analysis.spec.evaluation.javamodel.ISolutionsEvaluation object) {
    return _getToMeSingle(object.getRepository(), cleon.analysis.spec.evaluation.javamodel.IEvaluations.class, cleon.analysis.spec.evaluation.EvaluationPackage.Evaluations_evaluations, object.getResource());
  }
  
  public static cleon.analysis.spec.evaluation.javamodel.IEvaluations selectToMeResult(cleon.analysis.spec.evaluation.javamodel.IResult object) {
    return _getToMeSingle(object.getRepository(), cleon.analysis.spec.evaluation.javamodel.IEvaluations.class, cleon.analysis.spec.evaluation.EvaluationPackage.Evaluations_result, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,dcdfa04f-3c19-11e5-9962-cf3035adb922,AjV7UV86f5/hdWOTv/5xlrrm+UQ=] */
