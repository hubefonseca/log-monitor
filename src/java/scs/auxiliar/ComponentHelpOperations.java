package scs.auxiliar;


/**
* scs/auxiliar/ComponentHelpOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ../../idl/deployment.idl
* Saturday, October 18, 2008 4:06:48 PM BRST
*/

public interface ComponentHelpOperations 
{
  String getHelpInfo (scs.core.ComponentId id) throws scs.container.ComponentNotFound, scs.auxiliar.HelpInfoNotAvailable;
} // interface ComponentHelpOperations
