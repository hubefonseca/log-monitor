package scs.core;

/**
* scs/core/IMetaInterfaceHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ../../idl/scs.idl
* Saturday, October 18, 2008 4:06:47 PM BRST
*/

public final class IMetaInterfaceHolder implements org.omg.CORBA.portable.Streamable
{
  public scs.core.IMetaInterface value = null;

  public IMetaInterfaceHolder ()
  {
  }

  public IMetaInterfaceHolder (scs.core.IMetaInterface initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = scs.core.IMetaInterfaceHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    scs.core.IMetaInterfaceHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return scs.core.IMetaInterfaceHelper.type ();
  }

}
