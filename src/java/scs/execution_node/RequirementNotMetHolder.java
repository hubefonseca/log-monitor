package scs.execution_node;

/**
* scs/execution_node/RequirementNotMetHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ../../idl/deployment.idl
* Saturday, October 18, 2008 4:06:48 PM BRST
*/

public final class RequirementNotMetHolder implements org.omg.CORBA.portable.Streamable
{
  public scs.execution_node.RequirementNotMet value = null;

  public RequirementNotMetHolder ()
  {
  }

  public RequirementNotMetHolder (scs.execution_node.RequirementNotMet initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = scs.execution_node.RequirementNotMetHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    scs.execution_node.RequirementNotMetHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return scs.execution_node.RequirementNotMetHelper.type ();
  }

}
