package org.asl.collins.magpie.server;

import org.asl.collins.magpie.client.MagpieService;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;

/**
 * The server-side implementation of the RPC service.
 */
@SuppressWarnings("serial")
public class MagpieServiceImpl extends RemoteServiceServlet implements MagpieService {

	public String getResponse(String input) throws IllegalArgumentException {
		return Magpie.getResponse(input);
	}
}
