package scs.instrumentation;


/**
* scs/instrumentation/InterfaceStatsSeqHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ../../idl/scs.instrumentation.idl
* Saturday, October 18, 2008 4:06:48 PM BRST
*/

public final class InterfaceStatsSeqHolder implements org.omg.CORBA.portable.Streamable
{
  public scs.instrumentation.InterfaceStats value[] = null;

  public InterfaceStatsSeqHolder ()
  {
  }

  public InterfaceStatsSeqHolder (scs.instrumentation.InterfaceStats[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = scs.instrumentation.InterfaceStatsSeqHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    scs.instrumentation.InterfaceStatsSeqHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return scs.instrumentation.InterfaceStatsSeqHelper.type ();
  }

}