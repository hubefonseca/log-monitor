package scs.instrumentation;

/**
* scs/instrumentation/IOStatsNotAvailableHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ../../idl/scs.instrumentation.idl
* Saturday, October 18, 2008 4:06:48 PM BRST
*/

public final class IOStatsNotAvailableHolder implements org.omg.CORBA.portable.Streamable
{
  public scs.instrumentation.IOStatsNotAvailable value = null;

  public IOStatsNotAvailableHolder ()
  {
  }

  public IOStatsNotAvailableHolder (scs.instrumentation.IOStatsNotAvailable initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = scs.instrumentation.IOStatsNotAvailableHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    scs.instrumentation.IOStatsNotAvailableHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return scs.instrumentation.IOStatsNotAvailableHelper.type ();
  }

}
