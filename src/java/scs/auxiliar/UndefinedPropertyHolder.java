package scs.auxiliar;

/**
* scs/auxiliar/UndefinedPropertyHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ../../idl/deployment.idl
* Saturday, October 18, 2008 4:06:48 PM BRST
*/

public final class UndefinedPropertyHolder implements org.omg.CORBA.portable.Streamable
{
  public scs.auxiliar.UndefinedProperty value = null;

  public UndefinedPropertyHolder ()
  {
  }

  public UndefinedPropertyHolder (scs.auxiliar.UndefinedProperty initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = scs.auxiliar.UndefinedPropertyHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    scs.auxiliar.UndefinedPropertyHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return scs.auxiliar.UndefinedPropertyHelper.type ();
  }

}
