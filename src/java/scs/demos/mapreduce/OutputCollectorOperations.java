package scs.demos.mapreduce;


/**
* scs/demos/mapreduce/OutputCollectorOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ../../idl/mapReduce.idl
* Saturday, October 18, 2008 4:06:50 PM BRST
*/


//Usado por mappers and reducers para emitir pares <key,value> intermediarios
public interface OutputCollectorOperations 
{
  void collect (org.omg.CORBA.Any key, org.omg.CORBA.Any value) throws scs.demos.mapreduce.IOMapReduceException;
  void flush () throws scs.demos.mapreduce.IOMapReduceException;
  void close () throws scs.demos.mapreduce.IOMapReduceException;
} // interface OutputCollectorOperations
