package scs.core;


/**
* scs/core/ConnectionDescriptionHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ../../idl/scs.idl
* Saturday, October 18, 2008 4:06:47 PM BRST
*/

abstract public class ConnectionDescriptionHelper
{
  private static String  _id = "IDL:scs/core/ConnectionDescription:1.0";

  public static void insert (org.omg.CORBA.Any a, scs.core.ConnectionDescription that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static scs.core.ConnectionDescription extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  private static boolean __active = false;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      synchronized (org.omg.CORBA.TypeCode.class)
      {
        if (__typeCode == null)
        {
          if (__active)
          {
            return org.omg.CORBA.ORB.init().create_recursive_tc ( _id );
          }
          __active = true;
          org.omg.CORBA.StructMember[] _members0 = new org.omg.CORBA.StructMember [2];
          org.omg.CORBA.TypeCode _tcOf_members0 = null;
          _tcOf_members0 = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_ulong);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_alias_tc (scs.core.ConnectionIdHelper.id (), "ConnectionId", _tcOf_members0);
          _members0[0] = new org.omg.CORBA.StructMember (
            "id",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ObjectHelper.type ();
          _members0[1] = new org.omg.CORBA.StructMember (
            "objref",
            _tcOf_members0,
            null);
          __typeCode = org.omg.CORBA.ORB.init ().create_struct_tc (scs.core.ConnectionDescriptionHelper.id (), "ConnectionDescription", _members0);
          __active = false;
        }
      }
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static scs.core.ConnectionDescription read (org.omg.CORBA.portable.InputStream istream)
  {
    scs.core.ConnectionDescription value = new scs.core.ConnectionDescription ();
    value.id = istream.read_ulong ();
    value.objref = org.omg.CORBA.ObjectHelper.read (istream);
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, scs.core.ConnectionDescription value)
  {
    ostream.write_ulong (value.id);
    org.omg.CORBA.ObjectHelper.write (ostream, value.objref);
  }

}
