package cleon.sda.spec.projectmanagement.planning.calendar.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IDay extends cleon.sda.spec.projectmanagement.planning.calendar.javamodel.ICalendarItem {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("5b27bd7f-c37c-11e5-9455-d97b1b986284");
  
  // relations
  
  public cleon.sda.spec.projectmanagement.planning.calendar.javamodel.ICalendarItem selectNoMore();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,5b27bd7f-c37c-11e5-9455-d97b1b986284,bzpNt0QFSS+x2vDT1TTAzAhRVxs=] */
