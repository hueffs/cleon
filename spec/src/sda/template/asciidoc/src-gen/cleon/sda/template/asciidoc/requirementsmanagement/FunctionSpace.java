package cleon.sda.template.asciidoc.requirementsmanagement;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[ca3949e8-bb83-11e5-b2f7-f515c847fa35,imports]] */

/* End Protected Region   [[ca3949e8-bb83-11e5-b2f7-f515c847fa35,imports]] */

public class FunctionSpace {

  /* Begin Protected Region [[ca3949e8-bb83-11e5-b2f7-f515c847fa35]] */
  
  /* End Protected Region   [[ca3949e8-bb83-11e5-b2f7-f515c847fa35]] */


  public static interface IRequirementDocumentFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("1e6118a2-c029-11e5-b927-b1b055d0575f")
    public java.lang.String GetDocumentPath();

  }
  
  public static interface IRequirementDocumentFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class RequirementDocumentFunctionsImpl implements IRequirementDocumentFunctionsImpl {

    public static final IRequirementDocumentFunctionsImpl INSTANCE = new RequirementDocumentFunctionsImpl();

    private RequirementDocumentFunctionsImpl() {}

  }
  
  public static class RequirementDocumentFunctions {

    private RequirementDocumentFunctions() {}

  }

  public static interface IIssuesFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("5b24f52d-c5d6-11e5-9a6b-0bd3546aceff")
    public java.lang.String RenderDocumentContent();

  }
  
  public static interface IIssuesFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class IssuesFunctionsImpl implements IIssuesFunctionsImpl {

    public static final IIssuesFunctionsImpl INSTANCE = new IssuesFunctionsImpl();

    private IssuesFunctionsImpl() {}

  }
  
  public static class IssuesFunctions {

    private IssuesFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,ca3949e8-bb83-11e5-b2f7-f515c847fa35,NTlf94RABwoBhYz7xxpzlmu1xFk=] */