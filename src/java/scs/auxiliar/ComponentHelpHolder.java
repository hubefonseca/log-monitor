package scs.auxiliar;

/**
* scs/auxiliar/ComponentHelpHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ../../idl/deployment.idl
* Saturday, October 18, 2008 4:06:48 PM BRST
*/

public final class ComponentHelpHolder implements org.omg.CORBA.portable.Streamable
{
  public scs.auxiliar.ComponentHelp value = null;

  public ComponentHelpHolder ()
  {
  }

  public ComponentHelpHolder (scs.auxiliar.ComponentHelp initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = scs.auxiliar.ComponentHelpHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    scs.auxiliar.ComponentHelpHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return scs.auxiliar.ComponentHelpHelper.type ();
  }

}
