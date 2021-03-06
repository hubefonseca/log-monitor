package scs.demos.mapreduce;


/**
* scs/demos/mapreduce/WorkerPOATie.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ../../idl/mapReduce.idl
* Saturday, October 18, 2008 4:06:50 PM BRST
*/

public class WorkerPOATie extends WorkerPOA
{

  // Constructors

  public WorkerPOATie ( scs.demos.mapreduce.WorkerOperations delegate ) {
      this._impl = delegate;
  }
  public WorkerPOATie ( scs.demos.mapreduce.WorkerOperations delegate , org.omg.PortableServer.POA poa ) {
      this._impl = delegate;
      this._poa      = poa;
  }
  public scs.demos.mapreduce.WorkerOperations _delegate() {
      return this._impl;
  }
  public void _delegate (scs.demos.mapreduce.WorkerOperations delegate ) {
      this._impl = delegate;
  }
  public org.omg.PortableServer.POA _default_POA() {
      if(_poa != null) {
          return _poa;
      }
      else {
          return super._default_POA();
      }
  }
  public boolean ping ()
  {
    return _impl.ping();
  } // ping

  public void execute (scs.core.IComponent channel, scs.demos.mapreduce.Task task)
  {
    _impl.execute(channel, task);
  } // execute

  public String getNode ()
  {
    return _impl.getNode();
  } // getNode

  public void setNode (String name)
  {
    _impl.setNode(name);
  } // setNode

  private scs.demos.mapreduce.WorkerOperations _impl;
  private org.omg.PortableServer.POA _poa;

} // class WorkerPOATie
