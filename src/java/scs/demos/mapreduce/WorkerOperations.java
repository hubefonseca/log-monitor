package scs.demos.mapreduce;


/**
* scs/demos/mapreduce/WorkerOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ../../idl/mapReduce.idl
* Saturday, October 18, 2008 4:06:50 PM BRST
*/

public interface WorkerOperations 
{
  boolean ping ();
  void execute (scs.core.IComponent channel, scs.demos.mapreduce.Task task);
  String getNode ();
  void setNode (String name);
} // interface WorkerOperations
