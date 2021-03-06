package scs.instrumentation;


/**
* scs/instrumentation/StatsCollectionOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ../../idl/scs.instrumentation.idl
* Saturday, October 18, 2008 4:06:48 PM BRST
*/

public interface StatsCollectionOperations 
{
  scs.instrumentation.MethodStats[] getInterfaceStats (String interfaceName) throws scs.instrumentation.InterfaceStatsNotAvailable;
  scs.instrumentation.InterfaceStats[] getComponentsStats () throws scs.instrumentation.ComponentStatsNotAvailable;
  scs.instrumentation.ContainerStats getContainerStats ();
  scs.instrumentation.SystemIOStats getIOStats () throws scs.instrumentation.IOStatsNotAvailable;
  scs.instrumentation.SystemNetworkStats getNetworkStats () throws scs.instrumentation.NetworkStatsNotAvailable;
  boolean subscribeMethodNotification (String clientName, String ifname, String method, scs.event_service.EventSink sink);
  void cancelMethodNotification (String clientName, String ifname, String method);
  boolean subscribeContainerNotification (String clientName, scs.event_service.EventSink sink);
  void cancelContainerNotification (String clientName);
} // interface StatsCollectionOperations
