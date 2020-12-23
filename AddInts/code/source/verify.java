

// -----( IS Java Code Template v1.2

import com.wm.data.*;
import com.wm.util.Values;
import com.wm.app.b2b.server.Service;
import com.wm.app.b2b.server.ServiceException;
// --- <<IS-START-IMPORTS>> ---
import com.google.gson.Gson;
// --- <<IS-END-IMPORTS>> ---

public final class verify

{
	// ---( internal utility methods )---

	final static verify _instance = new verify();

	static verify _newInstance() { return new verify(); }

	static verify _cast(Object o) { return (verify)o; }

	// ---( server methods )---




	public static final void addInts (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(addInts)>> ---
		// @sigtype java 3.5
		Gson gson = new Gson();
		// --- <<IS-END>> ---

                
	}
}

