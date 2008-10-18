package scs.demos.philosopher;


/**
* scs/demos/philosopher/PhilosopherPOATie.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ../../idl/philosopher.idl
* Saturday, October 18, 2008 4:06:49 PM BRST
*/

public class PhilosopherPOATie extends PhilosopherPOA
{

  // Constructors

  public PhilosopherPOATie ( scs.demos.philosopher.PhilosopherOperations delegate ) {
      this._impl = delegate;
  }
  public PhilosopherPOATie ( scs.demos.philosopher.PhilosopherOperations delegate , org.omg.PortableServer.POA poa ) {
      this._impl = delegate;
      this._poa      = poa;
  }
  public scs.demos.philosopher.PhilosopherOperations _delegate() {
      return this._impl;
  }
  public void _delegate (scs.demos.philosopher.PhilosopherOperations delegate ) {
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
  public void setName (String name)
  {
    _impl.setName(name);
  } // setName

  public boolean start ()
  {
    return _impl.start();
  } // start

  private scs.demos.philosopher.PhilosopherOperations _impl;
  private org.omg.PortableServer.POA _poa;

} // class PhilosopherPOATie
