package scs.demos.mapreduce;

/**
* scs/demos/mapreduce/WorkerInstantiationExceptionHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ../../idl/mapReduce.idl
* Saturday, October 18, 2008 4:06:50 PM BRST
*/

public final class WorkerInstantiationExceptionHolder implements org.omg.CORBA.portable.Streamable
{
  public scs.demos.mapreduce.WorkerInstantiationException value = null;

  public WorkerInstantiationExceptionHolder ()
  {
  }

  public WorkerInstantiationExceptionHolder (scs.demos.mapreduce.WorkerInstantiationException initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = scs.demos.mapreduce.WorkerInstantiationExceptionHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    scs.demos.mapreduce.WorkerInstantiationExceptionHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return scs.demos.mapreduce.WorkerInstantiationExceptionHelper.type ();
  }

}
