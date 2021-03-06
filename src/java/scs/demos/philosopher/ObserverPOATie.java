package scs.demos.philosopher;


/**
* scs/demos/philosopher/ObserverPOATie.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ../../idl/philosopher.idl
* Saturday, October 18, 2008 4:06:49 PM BRST
*/

public class ObserverPOATie extends ObserverPOA
{

  // Constructors

  public ObserverPOATie ( scs.demos.philosopher.ObserverOperations delegate ) {
      this._impl = delegate;
  }
  public ObserverPOATie ( scs.demos.philosopher.ObserverOperations delegate , org.omg.PortableServer.POA poa ) {
      this._impl = delegate;
      this._poa      = poa;
  }
  public scs.demos.philosopher.ObserverOperations _delegate() {
      return this._impl;
  }
  public void _delegate (scs.demos.philosopher.ObserverOperations delegate ) {
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
  public void push (scs.demos.philosopher.StatusInfo info)
  {
    _impl.push(info);
  } // push

  private scs.demos.philosopher.ObserverOperations _impl;
  private org.omg.PortableServer.POA _poa;

} // class ObserverPOATie
