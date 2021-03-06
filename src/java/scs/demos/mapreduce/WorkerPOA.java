package scs.demos.mapreduce;


/**
* scs/demos/mapreduce/WorkerPOA.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ../../idl/mapReduce.idl
* Saturday, October 18, 2008 4:06:50 PM BRST
*/

public abstract class WorkerPOA extends org.omg.PortableServer.Servant
 implements scs.demos.mapreduce.WorkerOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("ping", new java.lang.Integer (0));
    _methods.put ("execute", new java.lang.Integer (1));
    _methods.put ("getNode", new java.lang.Integer (2));
    _methods.put ("setNode", new java.lang.Integer (3));
  }

  public org.omg.CORBA.portable.OutputStream _invoke (String $method,
                                org.omg.CORBA.portable.InputStream in,
                                org.omg.CORBA.portable.ResponseHandler $rh)
  {
    org.omg.CORBA.portable.OutputStream out = null;
    java.lang.Integer __method = (java.lang.Integer)_methods.get ($method);
    if (__method == null)
      throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);

    switch (__method.intValue ())
    {
       case 0:  // scs/demos/mapreduce/Worker/ping
       {
         boolean $result = false;
         $result = this.ping ();
         out = $rh.createReply();
         out.write_boolean ($result);
         break;
       }

       case 1:  // scs/demos/mapreduce/Worker/execute
       {
         scs.core.IComponent channel = scs.core.IComponentHelper.read (in);
         scs.demos.mapreduce.Task task = scs.demos.mapreduce.TaskHelper.read (in);
         this.execute (channel, task);
         out = $rh.createReply();
         break;
       }

       case 2:  // scs/demos/mapreduce/Worker/getNode
       {
         String $result = null;
         $result = this.getNode ();
         out = $rh.createReply();
         out.write_string ($result);
         break;
       }

       case 3:  // scs/demos/mapreduce/Worker/setNode
       {
         String name = in.read_string ();
         this.setNode (name);
         out = $rh.createReply();
         break;
       }

       default:
         throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    }

    return out;
  } // _invoke

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:scs/demos/mapreduce/Worker:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public Worker _this() 
  {
    return WorkerHelper.narrow(
    super._this_object());
  }

  public Worker _this(org.omg.CORBA.ORB orb) 
  {
    return WorkerHelper.narrow(
    super._this_object(orb));
  }


} // class WorkerPOA
