package scs.instrumentation;


/**
* scs/instrumentation/_StatsCollectionStub.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ../../idl/scs.instrumentation.idl
* Saturday, October 18, 2008 4:06:48 PM BRST
*/

public class _StatsCollectionStub extends org.omg.CORBA.portable.ObjectImpl implements scs.instrumentation.StatsCollection
{

  public scs.instrumentation.MethodStats[] getInterfaceStats (String interfaceName) throws scs.instrumentation.InterfaceStatsNotAvailable
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("getInterfaceStats", true);
                $out.write_string (interfaceName);
                $in = _invoke ($out);
                scs.instrumentation.MethodStats $result[] = scs.instrumentation.MethodStatsSeqHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:scs/instrumentation/InterfaceStatsNotAvailable:1.0"))
                    throw scs.instrumentation.InterfaceStatsNotAvailableHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return getInterfaceStats (interfaceName        );
            } finally {
                _releaseReply ($in);
            }
  } // getInterfaceStats

  public scs.instrumentation.InterfaceStats[] getComponentsStats () throws scs.instrumentation.ComponentStatsNotAvailable
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("getComponentsStats", true);
                $in = _invoke ($out);
                scs.instrumentation.InterfaceStats $result[] = scs.instrumentation.InterfaceStatsSeqHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:scs/instrumentation/ComponentStatsNotAvailable:1.0"))
                    throw scs.instrumentation.ComponentStatsNotAvailableHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return getComponentsStats (        );
            } finally {
                _releaseReply ($in);
            }
  } // getComponentsStats

  public scs.instrumentation.ContainerStats getContainerStats ()
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("getContainerStats", true);
                $in = _invoke ($out);
                scs.instrumentation.ContainerStats $result = scs.instrumentation.ContainerStatsHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return getContainerStats (        );
            } finally {
                _releaseReply ($in);
            }
  } // getContainerStats

  public scs.instrumentation.SystemIOStats getIOStats () throws scs.instrumentation.IOStatsNotAvailable
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("getIOStats", true);
                $in = _invoke ($out);
                scs.instrumentation.SystemIOStats $result = scs.instrumentation.SystemIOStatsHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:scs/instrumentation/IOStatsNotAvailable:1.0"))
                    throw scs.instrumentation.IOStatsNotAvailableHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return getIOStats (        );
            } finally {
                _releaseReply ($in);
            }
  } // getIOStats

  public scs.instrumentation.SystemNetworkStats getNetworkStats () throws scs.instrumentation.NetworkStatsNotAvailable
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("getNetworkStats", true);
                $in = _invoke ($out);
                scs.instrumentation.SystemNetworkStats $result = scs.instrumentation.SystemNetworkStatsHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:scs/instrumentation/NetworkStatsNotAvailable:1.0"))
                    throw scs.instrumentation.NetworkStatsNotAvailableHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return getNetworkStats (        );
            } finally {
                _releaseReply ($in);
            }
  } // getNetworkStats

  public boolean subscribeMethodNotification (String clientName, String ifname, String method, scs.event_service.EventSink sink)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("subscribeMethodNotification", true);
                $out.write_string (clientName);
                $out.write_string (ifname);
                $out.write_string (method);
                scs.event_service.EventSinkHelper.write ($out, sink);
                $in = _invoke ($out);
                boolean $result = $in.read_boolean ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return subscribeMethodNotification (clientName, ifname, method, sink        );
            } finally {
                _releaseReply ($in);
            }
  } // subscribeMethodNotification

  public void cancelMethodNotification (String clientName, String ifname, String method)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("cancelMethodNotification", true);
                $out.write_string (clientName);
                $out.write_string (ifname);
                $out.write_string (method);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                cancelMethodNotification (clientName, ifname, method        );
            } finally {
                _releaseReply ($in);
            }
  } // cancelMethodNotification

  public boolean subscribeContainerNotification (String clientName, scs.event_service.EventSink sink)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("subscribeContainerNotification", true);
                $out.write_string (clientName);
                scs.event_service.EventSinkHelper.write ($out, sink);
                $in = _invoke ($out);
                boolean $result = $in.read_boolean ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return subscribeContainerNotification (clientName, sink        );
            } finally {
                _releaseReply ($in);
            }
  } // subscribeContainerNotification

  public void cancelContainerNotification (String clientName)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("cancelContainerNotification", true);
                $out.write_string (clientName);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                cancelContainerNotification (clientName        );
            } finally {
                _releaseReply ($in);
            }
  } // cancelContainerNotification

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:scs/instrumentation/StatsCollection:1.0"};

  public String[] _ids ()
  {
    return (String[])__ids.clone ();
  }

  private void readObject (java.io.ObjectInputStream s) throws java.io.IOException
  {
     String str = s.readUTF ();
     String[] args = null;
     java.util.Properties props = null;
     org.omg.CORBA.Object obj = org.omg.CORBA.ORB.init (args, props).string_to_object (str);
     org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl) obj)._get_delegate ();
     _set_delegate (delegate);
  }

  private void writeObject (java.io.ObjectOutputStream s) throws java.io.IOException
  {
     String[] args = null;
     java.util.Properties props = null;
     String str = org.omg.CORBA.ORB.init (args, props).object_to_string (this);
     s.writeUTF (str);
  }
} // class _StatsCollectionStub
