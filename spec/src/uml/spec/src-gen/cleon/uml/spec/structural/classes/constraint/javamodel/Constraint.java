package cleon.uml.spec.structural.classes.constraint.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class Constraint extends DynamicResource implements IConstraint {

  // abstract implementation, only used for static method calls
  private Constraint() {
    super(IConstraint.TYPE_ID);
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,18ea788e-1197-11e3-9156-7d5514ad9e83,Xi+aP1WEGQLBOmH1QQg251b9kSw=] */
