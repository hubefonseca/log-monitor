package scs.demos.mapreduce;


/**
* scs/demos/mapreduce/MasterOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ../../idl/mapReduce.idl
* Saturday, October 18, 2008 4:06:50 PM BRST
*/

public interface MasterOperations 
{
  void start (String confFileName, scs.demos.mapreduce.Reporter reporter) throws scs.demos.mapreduce.PropertiesException, scs.demos.mapreduce.ConectionToExecNodesException, scs.demos.mapreduce.ChannelException, scs.demos.mapreduce.WorkerInstantiationException, scs.demos.mapreduce.TaskInstantiationException, scs.demos.mapreduce.StartFailureException;
} // interface MasterOperations
