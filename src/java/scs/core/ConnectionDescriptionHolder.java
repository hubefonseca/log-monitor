package scs.core;

/**
* scs/core/ConnectionDescriptionHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ../../idl/scs.idl
* Saturday, October 18, 2008 4:06:47 PM BRST
*/

public final class ConnectionDescriptionHolder implements org.omg.CORBA.portable.Streamable
{
  public scs.core.ConnectionDescription value = null;

  public ConnectionDescriptionHolder ()
  {
  }

  public ConnectionDescriptionHolder (scs.core.ConnectionDescription initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = scs.core.ConnectionDescriptionHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    scs.core.ConnectionDescriptionHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return scs.core.ConnectionDescriptionHelper.type ();
  }

}
