package scs.instrumentation;

/**
* scs/instrumentation/ContainerStatsHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ../../idl/scs.instrumentation.idl
* Saturday, October 18, 2008 4:06:48 PM BRST
*/

public final class ContainerStatsHolder implements org.omg.CORBA.portable.Streamable
{
  public scs.instrumentation.ContainerStats value = null;

  public ContainerStatsHolder ()
  {
  }

  public ContainerStatsHolder (scs.instrumentation.ContainerStats initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = scs.instrumentation.ContainerStatsHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    scs.instrumentation.ContainerStatsHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return scs.instrumentation.ContainerStatsHelper.type ();
  }

}