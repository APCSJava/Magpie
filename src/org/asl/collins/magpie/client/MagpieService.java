package org.asl.collins.magpie.client;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

/**
 * The client-side stub for the RPC service.
 */
@RemoteServiceRelativePath("respond")
public interface MagpieService extends RemoteService {
	String getResponse(String name);
}
