package scs.instrumentation;


/**
* scs/instrumentation/NetworkStatsNotAvailable.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ../../idl/scs.instrumentation.idl
* Saturday, October 18, 2008 4:06:48 PM BRST
*/

public final class NetworkStatsNotAvailable extends org.omg.CORBA.UserException
{

  public NetworkStatsNotAvailable ()
  {
    super(NetworkStatsNotAvailableHelper.id());
  } // ctor


  public NetworkStatsNotAvailable (String $reason)
  {
    super(NetworkStatsNotAvailableHelper.id() + "  " + $reason);
  } // ctor

} // class NetworkStatsNotAvailable
