package cleon.uml.spec.structural.classes.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class FieldClass extends DynamicResource implements IFieldClass {

  // abstract implementation, only used for static method calls
  private FieldClass() {
    super(IFieldClass.TYPE_ID);
  }
  
  // toMeRelations
  
  public static cleon.uml.spec.structural.classes.javamodel.IFieldClass selectToMeFields(cleon.uml.spec.structural.classes.fields.javamodel.IField object) {
    return _getToMeSingle(object.getRepository(), cleon.uml.spec.structural.classes.javamodel.IFieldClass.class, cleon.uml.spec.structural.classes.ClassesPackage.FieldClass_fields, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,866ff33c-13c7-11e3-bec7-f1e135382475,R7IYpX81NECqxss1lgIRziQez1M=] */
