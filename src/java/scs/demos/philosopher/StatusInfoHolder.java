package scs.demos.philosopher;

/**
* scs/demos/philosopher/StatusInfoHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ../../idl/philosopher.idl
* Saturday, October 18, 2008 4:06:49 PM BRST
*/

public final class StatusInfoHolder implements org.omg.CORBA.portable.Streamable
{
  public scs.demos.philosopher.StatusInfo value = null;

  public StatusInfoHolder ()
  {
  }

  public StatusInfoHolder (scs.demos.philosopher.StatusInfo initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = scs.demos.philosopher.StatusInfoHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    scs.demos.philosopher.StatusInfoHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return scs.demos.philosopher.StatusInfoHelper.type ();
  }

}
