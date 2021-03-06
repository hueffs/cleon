package cleon.doc.template.asciidoc;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[4ba84dc4-d872-11e4-aa2f-c11242a92b60,imports]] */

/* End Protected Region   [[4ba84dc4-d872-11e4-aa2f-c11242a92b60,imports]] */

public class Functions {

  /* Begin Protected Region [[4ba84dc4-d872-11e4-aa2f-c11242a92b60]] */
  
  /* End Protected Region   [[4ba84dc4-d872-11e4-aa2f-c11242a92b60]] */


  public static interface IDocumentElementFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("5dac1efa-d872-11e4-aa2f-c11242a92b60")
    public java.lang.String RenderContent();

  }
  
  public static interface IDocumentElementFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class DocumentElementFunctionsImpl implements IDocumentElementFunctionsImpl {

    public static final IDocumentElementFunctionsImpl INSTANCE = new DocumentElementFunctionsImpl();

    private DocumentElementFunctionsImpl() {}

  }
  
  public static class DocumentElementFunctions {

    private DocumentElementFunctions() {}

  }

  public static interface IChapterFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("7eb10829-d872-11e4-aa2f-c11242a92b60")
    public java.lang.String RenderContent();

    @IDynamicResourceExtension.MethodId("5e5a2fe4-a7eb-11e5-82dd-3b995d9c840c")
    public java.lang.String RenderChapterContent();

    @IDynamicResourceExtension.MethodId("62951c04-bdfe-11e5-bc2e-0b46afe7c3c9")
    public java.lang.String RenderChapter();

    @IDynamicResourceExtension.MethodId("9fad75ec-c1d8-11e5-bbf3-bdd12a9e2b3d")
    public java.lang.String RenderDescriptions();

    @IDynamicResourceExtension.MethodId("df606084-c1d8-11e5-bbf3-bdd12a9e2b3d")
    public java.lang.String RenderParagraph();

    @IDynamicResourceExtension.MethodId("e3cede53-c1d8-11e5-bbf3-bdd12a9e2b3d")
    public java.lang.String RenderDocumentComposite();

  }
  
  public static interface IChapterFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class ChapterFunctionsImpl implements IChapterFunctionsImpl {

    public static final IChapterFunctionsImpl INSTANCE = new ChapterFunctionsImpl();

    private ChapterFunctionsImpl() {}

  }
  
  public static class ChapterFunctions {

    private ChapterFunctions() {}

  }

  public static interface ISubDocumentFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("93a73e3b-d872-11e4-aa2f-c11242a92b60")
    public java.lang.String RenderContent();

    @IDynamicResourceExtension.MethodId("8a722bc2-3528-11e5-909a-4bcced25d7ee")
    public java.lang.String RenderDocument();

    @IDynamicResourceExtension.MethodId("6b95352e-3529-11e5-909a-4bcced25d7ee")
    public java.lang.String RenderStart();

    @IDynamicResourceExtension.MethodId("6f22a291-3529-11e5-909a-4bcced25d7ee")
    public java.lang.String RenderEnd();

    @IDynamicResourceExtension.MethodId("aef7c82d-c5d8-11e5-9a6b-0bd3546aceff")
    public java.lang.String RenderDocumentContent();

  }
  
  public static interface ISubDocumentFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class SubDocumentFunctionsImpl implements ISubDocumentFunctionsImpl {

    public static final ISubDocumentFunctionsImpl INSTANCE = new SubDocumentFunctionsImpl();

    private SubDocumentFunctionsImpl() {}

  }
  
  public static class SubDocumentFunctions {

    private SubDocumentFunctions() {}

  }

  public static interface ITextFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("944c09bf-d872-11e4-aa2f-c11242a92b60")
    public java.lang.String RenderContent();

  }
  
  public static interface ITextFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class TextFunctionsImpl implements ITextFunctionsImpl {

    public static final ITextFunctionsImpl INSTANCE = new TextFunctionsImpl();

    private TextFunctionsImpl() {}

  }
  
  public static class TextFunctions {

    private TextFunctions() {}

  }

  public static interface INumberedListFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("889d84ac-d882-11e4-a5d6-b92b0ce88839")
    public java.lang.String RenderContent();

  }
  
  public static interface INumberedListFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class NumberedListFunctionsImpl implements INumberedListFunctionsImpl {

    public static final INumberedListFunctionsImpl INSTANCE = new NumberedListFunctionsImpl();

    private NumberedListFunctionsImpl() {}

  }
  
  public static class NumberedListFunctions {

    private NumberedListFunctions() {}

  }

  public static interface IOwnDocumentElementCompositeFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("6f4165e8-3072-11e5-8cdc-d5b441c8c3df")
    public List<cleon.doc.spec.javamodel.IDocumentElement> SelectSubElements();

  }
  
  public static interface IOwnDocumentElementCompositeFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class OwnDocumentElementCompositeFunctionsImpl implements IOwnDocumentElementCompositeFunctionsImpl {

    public static final IOwnDocumentElementCompositeFunctionsImpl INSTANCE = new OwnDocumentElementCompositeFunctionsImpl();

    private OwnDocumentElementCompositeFunctionsImpl() {}

  }
  
  public static class OwnDocumentElementCompositeFunctions {

    private OwnDocumentElementCompositeFunctions() {}

  }

  public static interface IUseDocumentElementCompositeFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("82dcedd2-3072-11e5-8cdc-d5b441c8c3df")
    public List<cleon.doc.spec.javamodel.IDocumentElement> SelectSubElements();

  }
  
  public static interface IUseDocumentElementCompositeFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class UseDocumentElementCompositeFunctionsImpl implements IUseDocumentElementCompositeFunctionsImpl {

    public static final IUseDocumentElementCompositeFunctionsImpl INSTANCE = new UseDocumentElementCompositeFunctionsImpl();

    private UseDocumentElementCompositeFunctionsImpl() {}

  }
  
  public static class UseDocumentElementCompositeFunctions {

    private UseDocumentElementCompositeFunctions() {}

  }

  public static interface IDocumentElementCompositeFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("556d4ec9-3072-11e5-8cdc-d5b441c8c3df")
    public List<cleon.doc.spec.javamodel.IDocumentElement> SelectSubElements();

    @IDynamicResourceExtension.MethodId("4f21c7c9-307c-11e5-8cdc-d5b441c8c3df")
    public java.lang.String GetIndent();

  }
  
  public static interface IDocumentElementCompositeFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("4f21c7c9-307c-11e5-8cdc-d5b441c8c3df")
    public java.lang.String GetIndent(final cleon.doc.spec.javamodel.IDocumentElementComposite documentElementComposite);

  }
  
  public static class DocumentElementCompositeFunctionsImpl implements IDocumentElementCompositeFunctionsImpl {

    public static final IDocumentElementCompositeFunctionsImpl INSTANCE = new DocumentElementCompositeFunctionsImpl();

    private DocumentElementCompositeFunctionsImpl() {}

    @Override
    public java.lang.String GetIndent(final cleon.doc.spec.javamodel.IDocumentElementComposite documentElementComposite) {
      /* Begin Protected Region [[4f21c7c9-307c-11e5-8cdc-d5b441c8c3df]] */
    	cleon.doc.spec.javamodel.IDocumentElement parent = null;
    	
    	if( documentElementComposite instanceof cleon.doc.spec.chapter.javamodel.NoChapters)
    	{
    		return "";
    	}
    	
    	if( documentElementComposite instanceof cleon.doc.spec.javamodel.IUseDocumentElementComposite )
    	{
    		parent = cleon.doc.spec.javamodel.UseDocumentElementComposite.selectToMeUseDocumentElements((cleon.doc.spec.javamodel.IUseDocumentElementComposite)documentElementComposite);	
    	}
    	
    	if( parent == null && documentElementComposite instanceof cleon.doc.spec.javamodel.IOwnDocumentElementComposite )
    	{
    		parent = cleon.doc.spec.javamodel.OwnDocumentElementComposite.selectToMeOwnDocumentElements((cleon.doc.spec.javamodel.IOwnDocumentElementComposite)documentElementComposite);	
    	}
      	
      	if( parent == null || !(parent instanceof cleon.doc.spec.javamodel.IDocumentElementComposite))
      	{
        	return "=";	
      	}
      	
      	cleon.doc.spec.javamodel.IDocumentElementComposite parentCollection = (cleon.doc.spec.javamodel.IDocumentElementComposite)parent; 	
      	java.lang.String parentIndex = GetIndent(parentCollection);
  		return "=" + GetIndent(parentCollection);
      /* End Protected Region   [[4f21c7c9-307c-11e5-8cdc-d5b441c8c3df]] */
    }

  }
  
  public static class DocumentElementCompositeFunctions {

    private DocumentElementCompositeFunctions() {}

    public static java.lang.String GetIndent(final cleon.doc.spec.javamodel.IDocumentElementComposite documentElementComposite) {
      return DynamicResourceUtil.invoke(IDocumentElementCompositeFunctionsImpl.class, DocumentElementCompositeFunctionsImpl.INSTANCE, documentElementComposite).GetIndent(documentElementComposite);
    }

  }

  public static interface INoteFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("4f6e399e-3087-11e5-8cdc-d5b441c8c3df")
    public java.lang.String RenderContent();

  }
  
  public static interface INoteFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class NoteFunctionsImpl implements INoteFunctionsImpl {

    public static final INoteFunctionsImpl INSTANCE = new NoteFunctionsImpl();

    private NoteFunctionsImpl() {}

  }
  
  public static class NoteFunctions {

    private NoteFunctions() {}

  }

  public static interface ISidebarFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("2b45694f-3089-11e5-8cdc-d5b441c8c3df")
    public java.lang.String RenderContent();

  }
  
  public static interface ISidebarFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class SidebarFunctionsImpl implements ISidebarFunctionsImpl {

    public static final ISidebarFunctionsImpl INSTANCE = new SidebarFunctionsImpl();

    private SidebarFunctionsImpl() {}

  }
  
  public static class SidebarFunctions {

    private SidebarFunctions() {}

  }

  public static interface IAdmonitionFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("e76a200b-308a-11e5-8cdc-d5b441c8c3df")
    public java.lang.String RenderContent();

  }
  
  public static interface IAdmonitionFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class AdmonitionFunctionsImpl implements IAdmonitionFunctionsImpl {

    public static final IAdmonitionFunctionsImpl INSTANCE = new AdmonitionFunctionsImpl();

    private AdmonitionFunctionsImpl() {}

  }
  
  public static class AdmonitionFunctions {

    private AdmonitionFunctions() {}

  }

  public static interface ITableFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("33aeb6f5-3c4b-11e5-871f-6beac6a7c24b")
    public java.lang.String RenderContent();

  }
  
  public static interface ITableFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class TableFunctionsImpl implements ITableFunctionsImpl {

    public static final ITableFunctionsImpl INSTANCE = new TableFunctionsImpl();

    private TableFunctionsImpl() {}

  }
  
  public static class TableFunctions {

    private TableFunctions() {}

  }

  public static interface ISourceCodeFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("809f5cf9-466f-11e5-ba74-cb2e95044e1c")
    public java.lang.String RenderContent();

  }
  
  public static interface ISourceCodeFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class SourceCodeFunctionsImpl implements ISourceCodeFunctionsImpl {

    public static final ISourceCodeFunctionsImpl INSTANCE = new SourceCodeFunctionsImpl();

    private SourceCodeFunctionsImpl() {}

  }
  
  public static class SourceCodeFunctions {

    private SourceCodeFunctions() {}

  }

  public static interface IHighlightingSourceCodeFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("84aef1f2-466f-11e5-ba74-cb2e95044e1c")
    public java.lang.String RenderContent();

  }
  
  public static interface IHighlightingSourceCodeFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class HighlightingSourceCodeFunctionsImpl implements IHighlightingSourceCodeFunctionsImpl {

    public static final IHighlightingSourceCodeFunctionsImpl INSTANCE = new HighlightingSourceCodeFunctionsImpl();

    private HighlightingSourceCodeFunctionsImpl() {}

  }
  
  public static class HighlightingSourceCodeFunctions {

    private HighlightingSourceCodeFunctions() {}

  }

  public static interface ITipFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("8b19b54c-466f-11e5-ba74-cb2e95044e1c")
    public java.lang.String RenderContent();

  }
  
  public static interface ITipFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class TipFunctionsImpl implements ITipFunctionsImpl {

    public static final ITipFunctionsImpl INSTANCE = new TipFunctionsImpl();

    private TipFunctionsImpl() {}

  }
  
  public static class TipFunctions {

    private TipFunctions() {}

  }

  public static interface IWarningFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("902d259f-466f-11e5-ba74-cb2e95044e1c")
    public java.lang.String RenderContent();

  }
  
  public static interface IWarningFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class WarningFunctionsImpl implements IWarningFunctionsImpl {

    public static final IWarningFunctionsImpl INSTANCE = new WarningFunctionsImpl();

    private WarningFunctionsImpl() {}

  }
  
  public static class WarningFunctions {

    private WarningFunctions() {}

  }

  public static interface ICautionFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("944aeb52-466f-11e5-ba74-cb2e95044e1c")
    public java.lang.String RenderContent();

  }
  
  public static interface ICautionFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class CautionFunctionsImpl implements ICautionFunctionsImpl {

    public static final ICautionFunctionsImpl INSTANCE = new CautionFunctionsImpl();

    private CautionFunctionsImpl() {}

  }
  
  public static class CautionFunctions {

    private CautionFunctions() {}

  }

  public static interface IImportantFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("9b29a528-466f-11e5-ba74-cb2e95044e1c")
    public java.lang.String RenderContent();

  }
  
  public static interface IImportantFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class ImportantFunctionsImpl implements IImportantFunctionsImpl {

    public static final IImportantFunctionsImpl INSTANCE = new ImportantFunctionsImpl();

    private ImportantFunctionsImpl() {}

  }
  
  public static class ImportantFunctions {

    private ImportantFunctions() {}

  }

  public static interface IDocumentFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("6482a73c-47cd-11e5-9568-fbe9ec4a688c")
    public java.lang.String RenderDocument();

    @IDynamicResourceExtension.MethodId("e3b00d61-47d5-11e5-9e30-e198f8ad676a")
    public java.lang.String RenderContent();

    @IDynamicResourceExtension.MethodId("4d143120-be09-11e5-ad6f-979cbb78853e")
    public java.lang.String RenderDocumentContent();

    @IDynamicResourceExtension.MethodId("3562a5b3-d3ef-11e5-9dfc-cf0f3e030023")
    public java.lang.String CallAsciiDoctorHtml();

    @IDynamicResourceExtension.MethodId("56290020-d3ef-11e5-9dfc-cf0f3e030023")
    public java.lang.String CallAsciiDoctorPdf();

    @IDynamicResourceExtension.MethodId("17a97aa8-d3f1-11e5-9dfc-cf0f3e030023")
    public java.lang.String CallConfluenceUpdateCommand();

    @IDynamicResourceExtension.MethodId("2a8582e2-d3f1-11e5-9dfc-cf0f3e030023")
    public java.lang.String CallConfluenceCreateCommand();

  }
  
  public static interface IDocumentFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class DocumentFunctionsImpl implements IDocumentFunctionsImpl {

    public static final IDocumentFunctionsImpl INSTANCE = new DocumentFunctionsImpl();

    private DocumentFunctionsImpl() {}

  }
  
  public static class DocumentFunctions {

    private DocumentFunctions() {}

  }

  public static interface IAbstractDocumentFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("6a76a89d-307b-11e5-8cdc-d5b441c8c3df")
    public List<cleon.doc.spec.javamodel.IDocumentElement> SelectSubElements();

    @IDynamicResourceExtension.MethodId("54ce2448-47d5-11e5-9e30-e198f8ad676a")
    public java.lang.String RenderDocument();

    @IDynamicResourceExtension.MethodId("de5cc4d4-ba80-11e5-b56d-4f524d402f4b")
    public java.lang.String GetDocumentPath();

    @IDynamicResourceExtension.MethodId("4807eeed-c369-11e5-9455-d97b1b986284")
    public java.lang.String GetAdocFullFileName();

    @IDynamicResourceExtension.MethodId("3d579331-d3ec-11e5-9dfc-cf0f3e030023")
    public java.lang.String GetFullFileName();

    @IDynamicResourceExtension.MethodId("8f719cd4-d3ef-11e5-9dfc-cf0f3e030023")
    public java.lang.String GetAdocFileName();

    @IDynamicResourceExtension.MethodId("8eea2770-d3f0-11e5-9dfc-cf0f3e030023")
    public java.lang.String GetFileName();

  }
  
  public static interface IAbstractDocumentFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class AbstractDocumentFunctionsImpl implements IAbstractDocumentFunctionsImpl {

    public static final IAbstractDocumentFunctionsImpl INSTANCE = new AbstractDocumentFunctionsImpl();

    private AbstractDocumentFunctionsImpl() {}

  }
  
  public static class AbstractDocumentFunctions {

    private AbstractDocumentFunctions() {}

  }

  public static interface IBlockFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("9431ddd9-c90a-11e5-a64e-a5d84d8f1b45")
    public java.lang.String RenderContent();

  }
  
  public static interface IBlockFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class BlockFunctionsImpl implements IBlockFunctionsImpl {

    public static final IBlockFunctionsImpl INSTANCE = new BlockFunctionsImpl();

    private BlockFunctionsImpl() {}

  }
  
  public static class BlockFunctions {

    private BlockFunctions() {}

  }

  public static interface IFencedFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("9c94042a-c90a-11e5-a64e-a5d84d8f1b45")
    public java.lang.String RenderContent();

  }
  
  public static interface IFencedFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class FencedFunctionsImpl implements IFencedFunctionsImpl {

    public static final IFencedFunctionsImpl INSTANCE = new FencedFunctionsImpl();

    private FencedFunctionsImpl() {}

  }
  
  public static class FencedFunctions {

    private FencedFunctions() {}

  }

  public static interface IPassthroughFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("a1f60916-c90a-11e5-a64e-a5d84d8f1b45")
    public java.lang.String RenderContent();

  }
  
  public static interface IPassthroughFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class PassthroughFunctionsImpl implements IPassthroughFunctionsImpl {

    public static final IPassthroughFunctionsImpl INSTANCE = new PassthroughFunctionsImpl();

    private PassthroughFunctionsImpl() {}

  }
  
  public static class PassthroughFunctions {

    private PassthroughFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,4ba84dc4-d872-11e4-aa2f-c11242a92b60,616NxFDbN3lNveQ8PGudqYFCLeY=] */
