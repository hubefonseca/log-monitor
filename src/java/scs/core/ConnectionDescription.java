package scs.core;


/**
* scs/core/ConnectionDescription.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ../../idl/scs.idl
* Saturday, October 18, 2008 4:06:47 PM BRST
*/

public final class ConnectionDescription implements org.omg.CORBA.portable.IDLEntity
{
  public int id = (int)0;
  public org.omg.CORBA.Object objref = null;

  public ConnectionDescription ()
  {
  } // ctor

  public ConnectionDescription (int _id, org.omg.CORBA.Object _objref)
  {
    id = _id;
    objref = _objref;
  } // ctor

} // class ConnectionDescription
