package scs.reasoning;

/**
* scs/reasoning/DataCollectionPropertyHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ../../idl/reasoning.idl
* Saturday, October 18, 2008 4:06:48 PM BRST
*/

public final class DataCollectionPropertyHolder implements org.omg.CORBA.portable.Streamable
{
  public scs.reasoning.DataCollectionProperty value = null;

  public DataCollectionPropertyHolder ()
  {
  }

  public DataCollectionPropertyHolder (scs.reasoning.DataCollectionProperty initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = scs.reasoning.DataCollectionPropertyHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    scs.reasoning.DataCollectionPropertyHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return scs.reasoning.DataCollectionPropertyHelper.type ();
  }

}
