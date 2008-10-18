package scs.container;


/**
* scs/container/ComponentCollectionPOATie.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ../../idl/deployment.idl
* Saturday, October 18, 2008 4:06:48 PM BRST
*/

public class ComponentCollectionPOATie extends ComponentCollectionPOA
{

  // Constructors

  public ComponentCollectionPOATie ( scs.container.ComponentCollectionOperations delegate ) {
      this._impl = delegate;
  }
  public ComponentCollectionPOATie ( scs.container.ComponentCollectionOperations delegate , org.omg.PortableServer.POA poa ) {
      this._impl = delegate;
      this._poa      = poa;
  }
  public scs.container.ComponentCollectionOperations _delegate() {
      return this._impl;
  }
  public void _delegate (scs.container.ComponentCollectionOperations delegate ) {
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
  public scs.container.ComponentHandle[] getComponent (scs.core.ComponentId id)
  {
    return _impl.getComponent(id);
  } // getComponent

  public scs.container.ComponentHandle[] getComponents ()
  {
    return _impl.getComponents();
  } // getComponents

  private scs.container.ComponentCollectionOperations _impl;
  private org.omg.PortableServer.POA _poa;

} // class ComponentCollectionPOATie