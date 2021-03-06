package scs.demos.mapreduce;


/**
* scs/demos/mapreduce/FileSplitPOATie.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ../../idl/mapReduce.idl
* Saturday, October 18, 2008 4:06:50 PM BRST
*/


// Representa uma particao do arquivo de entrada
public class FileSplitPOATie extends FileSplitPOA
{

  // Constructors

  public FileSplitPOATie ( scs.demos.mapreduce.FileSplitOperations delegate ) {
      this._impl = delegate;
  }
  public FileSplitPOATie ( scs.demos.mapreduce.FileSplitOperations delegate , org.omg.PortableServer.POA poa ) {
      this._impl = delegate;
      this._poa      = poa;
  }
  public scs.demos.mapreduce.FileSplitOperations _delegate() {
      return this._impl;
  }
  public void _delegate (scs.demos.mapreduce.FileSplitOperations delegate ) {
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
  public String getPath ()
  {
    return _impl.getPath();
  } // getPath

  public long getLength ()
  {
    return _impl.getLength();
  } // getLength

  private scs.demos.mapreduce.FileSplitOperations _impl;
  private org.omg.PortableServer.POA _poa;

} // class FileSplitPOATie
