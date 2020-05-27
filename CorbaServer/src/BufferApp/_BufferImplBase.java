package BufferApp;


/**
* BufferApp/_BufferImplBase.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Buffer.idl
* martes 29 de noviembre de 2016 11H21' CET
*/

public abstract class _BufferImplBase extends org.omg.CORBA.portable.ObjectImpl
                implements BufferApp.Buffer, org.omg.CORBA.portable.InvokeHandler
{

  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

// Constructors
  public _BufferImplBase ()
  {
  }

  private static java.util.Hashtable<String,Integer> _methods = new java.util.Hashtable<String,Integer> ();
  static
  {
    _methods.put ("num_elementos", new java.lang.Integer (0));
    _methods.put ("put", new java.lang.Integer (1));
    _methods.put ("get", new java.lang.Integer (2));
    _methods.put ("read", new java.lang.Integer (3));
    _methods.put ("shutdown", new java.lang.Integer (4));
  }

  public org.omg.CORBA.portable.OutputStream _invoke (String $method,
                                org.omg.CORBA.portable.InputStream in,
                                org.omg.CORBA.portable.ResponseHandler $rh)
  {
    org.omg.CORBA.portable.OutputStream out = null;
    java.lang.Integer __method = (java.lang.Integer)_methods.get ($method);
    if (__method == null)
      throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);

    switch (__method.intValue ())
    {
       case 0:  // BufferApp/Buffer/num_elementos
       {
         int $result = (int)0;
         $result = this.num_elementos ();
         out = $rh.createReply();
         out.write_long ($result);
         break;
       }

       case 1:  // BufferApp/Buffer/put
       {
         String elemento = in.read_string ();
         boolean $result = false;
         $result = this.put (elemento);
         out = $rh.createReply();
         out.write_boolean ($result);
         break;
       }

       case 2:  // BufferApp/Buffer/get
       {
         org.omg.CORBA.StringHolder elemento = new org.omg.CORBA.StringHolder ();
         boolean $result = false;
         $result = this.get (elemento);
         out = $rh.createReply();
         out.write_boolean ($result);
         out.write_string (elemento.value);
         break;
       }

       case 3:  // BufferApp/Buffer/read
       {
         org.omg.CORBA.StringHolder elemento = new org.omg.CORBA.StringHolder ();
         boolean $result = false;
         $result = this.read (elemento);
         out = $rh.createReply();
         out.write_boolean ($result);
         out.write_string (elemento.value);
         break;
       }

       case 4:  // BufferApp/Buffer/shutdown
       {
         this.shutdown ();
         out = $rh.createReply();
         break;
       }

       default:
         throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    }

    return out;
  } // _invoke

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:BufferApp/Buffer:1.0"};

  public String[] _ids ()
  {
    return (String[])__ids.clone ();
  }


} // class _BufferImplBase
