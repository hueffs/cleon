package cleon.doc.spec.chapter.paragraph.typedtable.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class TypedTable extends DynamicResource implements ITypedTable {

  // abstract implementation, only used for static method calls
  private TypedTable() {
    super(ITypedTable.TYPE_ID);
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,325e4f86-3cef-11e5-871f-6beac6a7c24b,Ph8TvOSRLIL0n/sA97SCLq/CNvo=] */