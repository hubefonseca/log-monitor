package scs.reasoning;

/**
* scs/reasoning/FileReadingExceptionHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ../../idl/reasoning.idl
* Saturday, October 18, 2008 4:06:48 PM BRST
*/

public final class FileReadingExceptionHolder implements org.omg.CORBA.portable.Streamable
{
  public scs.reasoning.FileReadingException value = null;

  public FileReadingExceptionHolder ()
  {
  }

  public FileReadingExceptionHolder (scs.reasoning.FileReadingException initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = scs.reasoning.FileReadingExceptionHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    scs.reasoning.FileReadingExceptionHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return scs.reasoning.FileReadingExceptionHelper.type ();
  }

}
