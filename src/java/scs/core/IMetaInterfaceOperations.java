package scs.core;


/**
* scs/core/IMetaInterfaceOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ../../idl/scs.idl
* Saturday, October 18, 2008 4:06:47 PM BRST
*/

public interface IMetaInterfaceOperations 
{
  scs.core.FacetDescription[] getFacets ();
  scs.core.FacetDescription[] getFacetsByName (String[] names) throws scs.core.InvalidName;
  scs.core.ReceptacleDescription[] getReceptacles ();
  scs.core.ReceptacleDescription[] getReceptaclesByName (String[] names) throws scs.core.InvalidName;
} // interface IMetaInterfaceOperations
