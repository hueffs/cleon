package cleon.doc.spec.document.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IDocument extends cleon.doc.spec.document.javamodel.IAbstractDocument, cleon.doc.spec.autor.javamodel.IAutors {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("fd0b0ad8-28bc-11e5-bdaf-69a48f49df43");
  
  public java.lang.Boolean selectWithToC();
  
  // relations
  
  public cleon.doc.spec.document.style.javamodel.IStyle selectStyle();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,fd0b0ad8-28bc-11e5-bdaf-69a48f49df43,CHtUL3k5dbEYHpw5rsoZKKu85iA=] */
