package org.asl.collins.magpie.client;

import com.google.gwt.user.client.rpc.AsyncCallback;

/**
 * The async counterpart of <code>GreetingService</code>.
 */
public interface MagpieServiceAsync {
	void getResponse(String input, AsyncCallback<String> callback) throws IllegalArgumentException;
}
