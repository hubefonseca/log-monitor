package scs.reasoning;


/**
* scs/reasoning/MetricDescriptionSeqHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ../../idl/reasoning.idl
* Saturday, October 18, 2008 4:06:48 PM BRST
*/

abstract public class MetricDescriptionSeqHelper
{
  private static String  _id = "IDL:scs/reasoning/MetricDescriptionSeq:1.0";

  public static void insert (org.omg.CORBA.Any a, scs.reasoning.MetricDescription[] that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static scs.reasoning.MetricDescription[] extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = scs.reasoning.MetricDescriptionHelper.type ();
      __typeCode = org.omg.CORBA.ORB.init ().create_sequence_tc (0, __typeCode);
      __typeCode = org.omg.CORBA.ORB.init ().create_alias_tc (scs.reasoning.MetricDescriptionSeqHelper.id (), "MetricDescriptionSeq", __typeCode);
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static scs.reasoning.MetricDescription[] read (org.omg.CORBA.portable.InputStream istream)
  {
    scs.reasoning.MetricDescription value[] = null;
    int _len0 = istream.read_long ();
    value = new scs.reasoning.MetricDescription[_len0];
    for (int _o1 = 0;_o1 < value.length; ++_o1)
      value[_o1] = scs.reasoning.MetricDescriptionHelper.read (istream);
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, scs.reasoning.MetricDescription[] value)
  {
    ostream.write_long (value.length);
    for (int _i0 = 0;_i0 < value.length; ++_i0)
      scs.reasoning.MetricDescriptionHelper.write (ostream, value[_i0]);
  }

}
