package scs.core;

/**
* scs/core/StartupFailedHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ../../idl/scs.idl
* Saturday, October 18, 2008 4:06:47 PM BRST
*/

public final class StartupFailedHolder implements org.omg.CORBA.portable.Streamable
{
  public scs.core.StartupFailed value = null;

  public StartupFailedHolder ()
  {
  }

  public StartupFailedHolder (scs.core.StartupFailed initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = scs.core.StartupFailedHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    scs.core.StartupFailedHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return scs.core.StartupFailedHelper.type ();
  }

}
