package scs.auxiliar;


/**
* scs/auxiliar/ComponentPropertiesPOATie.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ../../idl/deployment.idl
* Saturday, October 18, 2008 4:06:48 PM BRST
*/

public class ComponentPropertiesPOATie extends ComponentPropertiesPOA
{

  // Constructors

  public ComponentPropertiesPOATie ( scs.auxiliar.ComponentPropertiesOperations delegate ) {
      this._impl = delegate;
  }
  public ComponentPropertiesPOATie ( scs.auxiliar.ComponentPropertiesOperations delegate , org.omg.PortableServer.POA poa ) {
      this._impl = delegate;
      this._poa      = poa;
  }
  public scs.auxiliar.ComponentPropertiesOperations _delegate() {
      return this._impl;
  }
  public void _delegate (scs.auxiliar.ComponentPropertiesOperations delegate ) {
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
  public void setProperty (scs.execution_node.Property property) throws scs.auxiliar.ReadOnlyProperty
  {
    _impl.setProperty(property);
  } // setProperty

  public scs.execution_node.Property getProperty (String name) throws scs.auxiliar.UndefinedProperty
  {
    return _impl.getProperty(name);
  } // getProperty

  public scs.execution_node.Property[] getProperties ()
  {
    return _impl.getProperties();
  } // getProperties

  private scs.auxiliar.ComponentPropertiesOperations _impl;
  private org.omg.PortableServer.POA _poa;

} // class ComponentPropertiesPOATie
