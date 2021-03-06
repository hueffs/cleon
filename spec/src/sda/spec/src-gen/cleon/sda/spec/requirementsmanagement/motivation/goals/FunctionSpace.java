package cleon.sda.spec.requirementsmanagement.motivation.goals;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[4877cebc-c58d-11e5-aeea-1db9268c0ee9,imports]] */

/* End Protected Region   [[4877cebc-c58d-11e5-aeea-1db9268c0ee9,imports]] */

public class FunctionSpace {

  /* Begin Protected Region [[4877cebc-c58d-11e5-aeea-1db9268c0ee9]] */
  
  /* End Protected Region   [[4877cebc-c58d-11e5-aeea-1db9268c0ee9]] */


  public static interface IGoalFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("4877cebe-c58d-11e5-aeea-1db9268c0ee9")
    public java.lang.String GetId();

    @IDynamicResourceExtension.MethodId("432b6c6b-c994-11e5-b35b-8fb753dd0798")
    public List<cleon.sda.spec.requirementsmanagement.motivation.goals.javamodel.IGoal> GetAllGoals();

  }
  
  public static interface IGoalFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("4877cebe-c58d-11e5-aeea-1db9268c0ee9")
    public java.lang.String GetId(final cleon.sda.spec.requirementsmanagement.motivation.goals.javamodel.IGoal goal);

  }
  
  public static class GoalFunctionsImpl implements IGoalFunctionsImpl {

    public static final IGoalFunctionsImpl INSTANCE = new GoalFunctionsImpl();

    private GoalFunctionsImpl() {}

    @Override
    public java.lang.String GetId(final cleon.sda.spec.requirementsmanagement.motivation.goals.javamodel.IGoal goal) {
      /* Begin Protected Region [[4877cebe-c58d-11e5-aeea-1db9268c0ee9]] */
    	return String.format("GO-%03d", goal.selectIdentifier());    
      /* End Protected Region   [[4877cebe-c58d-11e5-aeea-1db9268c0ee9]] */
    }

  }
  
  public static class GoalFunctions {

    private GoalFunctions() {}

    public static java.lang.String GetId(final cleon.sda.spec.requirementsmanagement.motivation.goals.javamodel.IGoal goal) {
      return DynamicResourceUtil.invoke(IGoalFunctionsImpl.class, GoalFunctionsImpl.INSTANCE, goal).GetId(goal);
    }

  }

  public static interface IGoalsFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("39b4c91e-c994-11e5-b35b-8fb753dd0798")
    public List<cleon.sda.spec.requirementsmanagement.motivation.goals.javamodel.IGoal> GetAllGoals();

  }
  
  public static interface IGoalsFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class GoalsFunctionsImpl implements IGoalsFunctionsImpl {

    public static final IGoalsFunctionsImpl INSTANCE = new GoalsFunctionsImpl();

    private GoalsFunctionsImpl() {}

  }
  
  public static class GoalsFunctions {

    private GoalsFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,4877cebc-c58d-11e5-aeea-1db9268c0ee9,ExAyNTP7nxuuxRxPsZU+fxpjiqc=] */
