package scs.demos.mapreduce;

/**
* scs/demos/mapreduce/TaskStatusHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ../../idl/mapReduce.idl
* Saturday, October 18, 2008 4:06:50 PM BRST
*/

public final class TaskStatusHolder implements org.omg.CORBA.portable.Streamable
{
  public scs.demos.mapreduce.TaskStatus value = null;

  public TaskStatusHolder ()
  {
  }

  public TaskStatusHolder (scs.demos.mapreduce.TaskStatus initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = scs.demos.mapreduce.TaskStatusHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    scs.demos.mapreduce.TaskStatusHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return scs.demos.mapreduce.TaskStatusHelper.type ();
  }

}
