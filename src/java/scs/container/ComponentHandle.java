package scs.container;


/**
* scs/container/ComponentHandle.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ../../idl/deployment.idl
* Saturday, October 18, 2008 4:06:48 PM BRST
*/

public final class ComponentHandle implements org.omg.CORBA.portable.IDLEntity
{
  public scs.core.IComponent cmp = null;
  public scs.core.ComponentId id = null;
  public int instance_id = (int)0;

  public ComponentHandle ()
  {
  } // ctor

  public ComponentHandle (scs.core.IComponent _cmp, scs.core.ComponentId _id, int _instance_id)
  {
    cmp = _cmp;
    id = _id;
    instance_id = _instance_id;
  } // ctor

} // class ComponentHandle
