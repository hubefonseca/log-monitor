package scs.demos.mapreduce;

/**
* scs/demos/mapreduce/ChannelExceptionHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ../../idl/mapReduce.idl
* Saturday, October 18, 2008 4:06:50 PM BRST
*/

public final class ChannelExceptionHolder implements org.omg.CORBA.portable.Streamable
{
  public scs.demos.mapreduce.ChannelException value = null;

  public ChannelExceptionHolder ()
  {
  }

  public ChannelExceptionHolder (scs.demos.mapreduce.ChannelException initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = scs.demos.mapreduce.ChannelExceptionHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    scs.demos.mapreduce.ChannelExceptionHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return scs.demos.mapreduce.ChannelExceptionHelper.type ();
  }

}
