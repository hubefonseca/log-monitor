package scs.reasoning;


/**
* scs/reasoning/MonitorPOATie.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ../../idl/reasoning.idl
* Saturday, October 18, 2008 4:06:48 PM BRST
*/

public class MonitorPOATie extends MonitorPOA
{

  // Constructors

  public MonitorPOATie ( scs.reasoning.MonitorOperations delegate ) {
      this._impl = delegate;
  }
  public MonitorPOATie ( scs.reasoning.MonitorOperations delegate , org.omg.PortableServer.POA poa ) {
      this._impl = delegate;
      this._poa      = poa;
  }
  public scs.reasoning.MonitorOperations _delegate() {
      return this._impl;
  }
  public void _delegate (scs.reasoning.MonitorOperations delegate ) {
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
  public boolean prepareToDataCollection (scs.reasoning.DataCollectionProperty props)
  {
    return _impl.prepareToDataCollection(props);
  } // prepareToDataCollection

  public void startDataCollection ()
  {
    _impl.startDataCollection();
  } // startDataCollection

  public void finishDataCollection ()
  {
    _impl.finishDataCollection();
  } // finishDataCollection

  public String getSystemState ()
  {
    return _impl.getSystemState();
  } // getSystemState

  public boolean ping ()
  {
    return _impl.ping();
  } // ping

  public String getNode ()
  {
    return _impl.getNode();
  } // getNode

  public void setNode (String name)
  {
    _impl.setNode(name);
  } // setNode

  private scs.reasoning.MonitorOperations _impl;
  private org.omg.PortableServer.POA _poa;

} // class MonitorPOATie
