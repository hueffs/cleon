package cleon.sda.spec.analysis.solution.evaluation.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Result extends DynamicResource implements IResult {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IResult> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IResult>() {
    
    @Override
    public IResult create() {
      return new Result();
    }
    
    @Override
    public IResult create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Result(resourceRepository, resource);
    }
  
  };

  public Result() {
    super(IResult.TYPE_ID);
  }
  
  public Result(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IResult.TYPE_ID);
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
  public cleon.sda.spec.analysis.solution.evaluation.javamodel.IBest selectBest() {
    return _getSingle(cleon.sda.spec.analysis.solution.evaluation.javamodel.IBest.class, cleon.sda.spec.analysis.solution.evaluation.EvaluationPackage.Result_best);
  }

  public Result setBest(cleon.sda.spec.analysis.solution.evaluation.javamodel.IBest best) {
    _setSingle(cleon.sda.spec.analysis.solution.evaluation.EvaluationPackage.Result_best, best);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.chapter.javamodel.IChapterOwnDocumentElementComposite> selectChapters() {
    return _getList(cleon.doc.spec.chapter.javamodel.IChapterOwnDocumentElementComposite.class, cleon.doc.spec.chapter.ChapterPackage.ChapterOwnDocumentElementComposite_chapters);
  }

  public Result setChapters(java.util.List<? extends cleon.doc.spec.chapter.javamodel.IChapterOwnDocumentElementComposite> chapters) {
    _setList(cleon.doc.spec.chapter.ChapterPackage.ChapterOwnDocumentElementComposite_chapters, chapters);
    return this;
  }
    
  @Override
  public cleon.doc.spec.chapter.javamodel.IChapter selectNoChapters() {
    return _getSingle(cleon.doc.spec.chapter.javamodel.IChapter.class, cleon.doc.spec.chapter.ChapterPackage.NoChapters_noChapters);
  }

  public Result setNoChapters(cleon.doc.spec.chapter.javamodel.IChapter noChapters) {
    _setSingle(cleon.doc.spec.chapter.ChapterPackage.NoChapters_noChapters, noChapters);
    return this;
  }
    
  @Override
  public cleon.doc.spec.paragraph.javamodel.IParagraph selectNoParagraph() {
    return _getSingle(cleon.doc.spec.paragraph.javamodel.IParagraph.class, cleon.doc.spec.paragraph.ParagraphPackage.NoParagraph_noParagraph);
  }

  public Result setNoParagraph(cleon.doc.spec.paragraph.javamodel.IParagraph noParagraph) {
    _setSingle(cleon.doc.spec.paragraph.ParagraphPackage.NoParagraph_noParagraph, noParagraph);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> selectOwnDocumentElements() {
    return _getList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.OwnDocumentElementComposite_ownDocumentElements);
  }

  public Result setOwnDocumentElements(java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> ownDocumentElements) {
    _setList(cleon.doc.spec.SpecPackage.OwnDocumentElementComposite_ownDocumentElements, ownDocumentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.paragraph.javamodel.IParagraph> selectParagraphes() {
    return _getList(cleon.doc.spec.paragraph.javamodel.IParagraph.class, cleon.doc.spec.paragraph.ParagraphPackage.ParagraphOwnDocumentElementComposite_paragraphes);
  }

  public Result setParagraphes(java.util.List<? extends cleon.doc.spec.paragraph.javamodel.IParagraph> paragraphes) {
    _setList(cleon.doc.spec.paragraph.ParagraphPackage.ParagraphOwnDocumentElementComposite_paragraphes, paragraphes);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Result setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
    _acceptSingle(cleon.sda.spec.analysis.solution.evaluation.javamodel.IBest.class, cleon.sda.spec.analysis.solution.evaluation.EvaluationPackage.Result_best, visitor);
    _acceptList(cleon.doc.spec.chapter.javamodel.IChapterOwnDocumentElementComposite.class, cleon.doc.spec.chapter.ChapterPackage.ChapterOwnDocumentElementComposite_chapters, visitor);
    _acceptSingle(cleon.doc.spec.chapter.javamodel.IChapter.class, cleon.doc.spec.chapter.ChapterPackage.NoChapters_noChapters, visitor);
    _acceptSingle(cleon.doc.spec.paragraph.javamodel.IParagraph.class, cleon.doc.spec.paragraph.ParagraphPackage.NoParagraph_noParagraph, visitor);
    _acceptList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.OwnDocumentElementComposite_ownDocumentElements, visitor);
    _acceptList(cleon.doc.spec.paragraph.javamodel.IParagraph.class, cleon.doc.spec.paragraph.ParagraphPackage.ParagraphOwnDocumentElementComposite_paragraphes, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.sda.spec.analysis.solution.evaluation.javamodel.IResult selectToMeBest(cleon.sda.spec.analysis.solution.evaluation.javamodel.IBest object) {
    return _getToMeSingle(object.getRepository(), cleon.sda.spec.analysis.solution.evaluation.javamodel.IResult.class, cleon.sda.spec.analysis.solution.evaluation.EvaluationPackage.Result_best, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,11cf7692-3c2a-11e5-9962-cf3035adb922,+ahitTIutP5ljEMXhsdqGMmkY7Q=] */
