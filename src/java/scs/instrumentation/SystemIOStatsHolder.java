package scs.instrumentation;

/**
* scs/instrumentation/SystemIOStatsHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ../../idl/scs.instrumentation.idl
* Saturday, October 18, 2008 4:06:48 PM BRST
*/

public final class SystemIOStatsHolder implements org.omg.CORBA.portable.Streamable
{
  public scs.instrumentation.SystemIOStats value = null;

  public SystemIOStatsHolder ()
  {
  }

  public SystemIOStatsHolder (scs.instrumentation.SystemIOStats initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = scs.instrumentation.SystemIOStatsHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    scs.instrumentation.SystemIOStatsHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return scs.instrumentation.SystemIOStatsHelper.type ();
  }

}
