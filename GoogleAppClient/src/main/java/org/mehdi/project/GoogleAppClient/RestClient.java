package org.mehdi.project.GoogleAppClient;

import java.net.URI;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriBuilder;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;

public class RestClient {

	public static void main(String[] args) {
		ClientConfig config = new DefaultClientConfig();
		Client client = Client.create(config);
		WebResource service = client.resource(getBaseURI());
		// Fluent interfaces
		System.out.println(service.path("rest").path("hello")
				.accept(MediaType.TEXT_PLAIN).get(ClientResponse.class)
				.toString());
		// Get plain text
		System.out.println(service.path("rest").path("hello")
				.accept(MediaType.TEXT_PLAIN).get(String.class));
		// Get XML
		System.out.println(service.path("rest").path("hello")
				.accept(MediaType.TEXT_XML).get(String.class));
		// The HTML
		System.out.println(service.path("rest").path("hello")
				.accept(MediaType.TEXT_HTML).get(String.class));

	}

	private static URI getBaseURI() {
		return UriBuilder.fromUri("http://mehdiappk.appspot.com").build();
	}

	public static String sayHello() {

		ClientConfig config = new DefaultClientConfig();
		Client client = Client.create(config);
		WebResource service = client.resource(getBaseURI());

		// The HTML
		return (service.path("rest").path("hello")
				.accept(MediaType.TEXT_HTML).get(String.class));

	}

	public static String sayHellow() {

		return "Hello";

	}
}
