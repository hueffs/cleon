package cleon.sda.spec.requirementsmanagement.issues;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[b87bae38-c58a-11e5-aeea-1db9268c0ee9,imports]] */

/* End Protected Region   [[b87bae38-c58a-11e5-aeea-1db9268c0ee9,imports]] */

public class FunctionSpace {

  /* Begin Protected Region [[b87bae38-c58a-11e5-aeea-1db9268c0ee9]] */
  
  /* End Protected Region   [[b87bae38-c58a-11e5-aeea-1db9268c0ee9]] */


  public static interface IIssueFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("be35e605-c58a-11e5-aeea-1db9268c0ee9")
    public java.lang.String GetId();

  }
  
  public static interface IIssueFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("be35e605-c58a-11e5-aeea-1db9268c0ee9")
    public java.lang.String GetId(final cleon.sda.spec.requirementsmanagement.issues.javamodel.IIssue issue);

  }
  
  public static class IssueFunctionsImpl implements IIssueFunctionsImpl {

    public static final IIssueFunctionsImpl INSTANCE = new IssueFunctionsImpl();

    private IssueFunctionsImpl() {}

    @Override
    public java.lang.String GetId(final cleon.sda.spec.requirementsmanagement.issues.javamodel.IIssue issue) {
      /* Begin Protected Region [[be35e605-c58a-11e5-aeea-1db9268c0ee9]] */
    	return String.format("IS-%03d", issue.selectIdentifier()); 
      /* End Protected Region   [[be35e605-c58a-11e5-aeea-1db9268c0ee9]] */
    }

  }
  
  public static class IssueFunctions {

    private IssueFunctions() {}

    public static java.lang.String GetId(final cleon.sda.spec.requirementsmanagement.issues.javamodel.IIssue issue) {
      return DynamicResourceUtil.invoke(IIssueFunctionsImpl.class, IssueFunctionsImpl.INSTANCE, issue).GetId(issue);
    }

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,b87bae38-c58a-11e5-aeea-1db9268c0ee9,uMbpvPaRFjcmbgjCvCKJfFXbcpE=] */
