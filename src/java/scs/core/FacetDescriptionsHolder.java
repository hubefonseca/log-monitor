package scs.core;


/**
* scs/core/FacetDescriptionsHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ../../idl/scs.idl
* Saturday, October 18, 2008 4:06:47 PM BRST
*/

public final class FacetDescriptionsHolder implements org.omg.CORBA.portable.Streamable
{
  public scs.core.FacetDescription value[] = null;

  public FacetDescriptionsHolder ()
  {
  }

  public FacetDescriptionsHolder (scs.core.FacetDescription[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = scs.core.FacetDescriptionsHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    scs.core.FacetDescriptionsHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return scs.core.FacetDescriptionsHelper.type ();
  }

}
