package org.greyhope.service;

import org.greyhope.echo.EchoRequest;
import org.greyhope.echo.EchoResponse;
import org.greyhope.echo.Message;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

/**
 * 
 * @author ebe
 *
 */
@Endpoint
public class EchoEndpoint {

	private static final String NAMESPACE_URI = "https://greyhope.org/echo";

	public EchoEndpoint() {
		super();
	}

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "EchoRequest")
	@ResponsePayload
	public EchoResponse getStudent(@RequestPayload EchoRequest request) {
		EchoResponse response = new EchoResponse();
		Message msg = new Message();
		msg.setMsg(request.getName());
		msg.setType("echo");
		response.setMessage(msg);
		return response;
	}

}
