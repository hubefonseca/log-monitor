package scs.core;

/**
* scs/core/ComponentIdHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ../../idl/scs.idl
* Saturday, October 18, 2008 4:06:47 PM BRST
*/

public final class ComponentIdHolder implements org.omg.CORBA.portable.Streamable
{
  public scs.core.ComponentId value = null;

  public ComponentIdHolder ()
  {
  }

  public ComponentIdHolder (scs.core.ComponentId initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = scs.core.ComponentIdHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    scs.core.ComponentIdHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return scs.core.ComponentIdHelper.type ();
  }

}
