package cleon.sda.spec.analysis.solution.evaluation.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class SolutionsEvaluation extends DynamicResource implements ISolutionsEvaluation {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISolutionsEvaluation> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISolutionsEvaluation>() {
    
    @Override
    public ISolutionsEvaluation create() {
      return new SolutionsEvaluation();
    }
    
    @Override
    public ISolutionsEvaluation create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new SolutionsEvaluation(resourceRepository, resource);
    }
  
  };

  public SolutionsEvaluation() {
    super(ISolutionsEvaluation.TYPE_ID);
  }
  
  public SolutionsEvaluation(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ISolutionsEvaluation.TYPE_ID);
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

  public SolutionsEvaluation setChapters(java.util.List<? extends cleon.doc.spec.chapter.javamodel.IChapterOwnDocumentElementComposite> chapters) {
    _setList(cleon.doc.spec.chapter.ChapterPackage.ChapterOwnDocumentElementComposite_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.sda.spec.analysis.solution.evaluation.javamodel.IEvaluation> selectEvaluation() {
    return _getMap(cleon.sda.spec.analysis.solution.evaluation.javamodel.IEvaluation.class, cleon.sda.spec.analysis.solution.evaluation.EvaluationPackage.SolutionsEvaluation_evaluation);
  }

  public SolutionsEvaluation setEvaluation(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.sda.spec.analysis.solution.evaluation.javamodel.IEvaluation> evaluation) {
    _setMap(cleon.sda.spec.analysis.solution.evaluation.EvaluationPackage.SolutionsEvaluation_evaluation, evaluation);
    return this;
  }
    
  @Override
  public cleon.doc.spec.chapter.javamodel.IChapter selectNoChapters() {
    return _getSingle(cleon.doc.spec.chapter.javamodel.IChapter.class, cleon.doc.spec.chapter.ChapterPackage.NoChapters_noChapters);
  }

  public SolutionsEvaluation setNoChapters(cleon.doc.spec.chapter.javamodel.IChapter noChapters) {
    _setSingle(cleon.doc.spec.chapter.ChapterPackage.NoChapters_noChapters, noChapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> selectOwnDocumentElements() {
    return _getList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.OwnDocumentElementComposite_ownDocumentElements);
  }

  public SolutionsEvaluation setOwnDocumentElements(java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> ownDocumentElements) {
    _setList(cleon.doc.spec.SpecPackage.OwnDocumentElementComposite_ownDocumentElements, ownDocumentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.paragraph.javamodel.IParagraph> selectParagraphes() {
    return _getList(cleon.doc.spec.paragraph.javamodel.IParagraph.class, cleon.doc.spec.paragraph.ParagraphPackage.ParagraphOwnDocumentElementComposite_paragraphes);
  }

  public SolutionsEvaluation setParagraphes(java.util.List<? extends cleon.doc.spec.paragraph.javamodel.IParagraph> paragraphes) {
    _setList(cleon.doc.spec.paragraph.ParagraphPackage.ParagraphOwnDocumentElementComposite_paragraphes, paragraphes);
    return this;
  }
    
  @Override
  public cleon.sda.spec.analysis.solution.solutions.javamodel.ISolution selectSolution() {
    return _getSingle(cleon.sda.spec.analysis.solution.solutions.javamodel.ISolution.class, cleon.sda.spec.analysis.solution.evaluation.EvaluationPackage.SolutionsEvaluation_solution);
  }

  public SolutionsEvaluation setSolution(cleon.sda.spec.analysis.solution.solutions.javamodel.ISolution solution) {
    _setSingle(cleon.sda.spec.analysis.solution.evaluation.EvaluationPackage.SolutionsEvaluation_solution, solution);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public SolutionsEvaluation setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public SolutionsEvaluation setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
    _acceptMap(cleon.sda.spec.analysis.solution.evaluation.javamodel.IEvaluation.class, cleon.sda.spec.analysis.solution.evaluation.EvaluationPackage.SolutionsEvaluation_evaluation, visitor);
    _acceptSingle(cleon.doc.spec.chapter.javamodel.IChapter.class, cleon.doc.spec.chapter.ChapterPackage.NoChapters_noChapters, visitor);
    _acceptList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.OwnDocumentElementComposite_ownDocumentElements, visitor);
    _acceptList(cleon.doc.spec.paragraph.javamodel.IParagraph.class, cleon.doc.spec.paragraph.ParagraphPackage.ParagraphOwnDocumentElementComposite_paragraphes, visitor);
    _acceptSingle(cleon.sda.spec.analysis.solution.solutions.javamodel.ISolution.class, cleon.sda.spec.analysis.solution.evaluation.EvaluationPackage.SolutionsEvaluation_solution, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.sda.spec.analysis.solution.evaluation.javamodel.ISolutionsEvaluation> selectToMeSolution(cleon.sda.spec.analysis.solution.solutions.javamodel.ISolution object) {
    return _getToMeList(object.getRepository(), cleon.sda.spec.analysis.solution.evaluation.javamodel.ISolutionsEvaluation.class, cleon.sda.spec.analysis.solution.evaluation.EvaluationPackage.SolutionsEvaluation_solution, object.getResource());
  }
  
  public static cleon.sda.spec.analysis.solution.evaluation.javamodel.ISolutionsEvaluation selectToMeEvaluation(cleon.sda.spec.analysis.solution.evaluation.javamodel.IEvaluation object) {
    return _getToMeSingle(object.getRepository(), cleon.sda.spec.analysis.solution.evaluation.javamodel.ISolutionsEvaluation.class, cleon.sda.spec.analysis.solution.evaluation.EvaluationPackage.SolutionsEvaluation_evaluation, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,38e891b4-3c1a-11e5-9962-cf3035adb922,anJzJUq2iLMTJYcgc22AQT0JTms=] */
