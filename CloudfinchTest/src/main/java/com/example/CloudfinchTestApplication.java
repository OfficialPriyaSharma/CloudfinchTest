package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

@SpringBootApplication
public class CloudfinchTestApplication {

	public static void main(String[] args) throws IOException, InterruptedException {

		var url = "https://cloudfinch-public.s3.ap-south-1.amazonaws.com/countries.json";

		var request = HttpRequest.newBuilder().GET().uri(URI.create(url)).build();

		var client  = HttpClient.newBuilder().build();

		var response = client.send(request, HttpResponse.BodyHandlers.ofString());

		System.out.println(response.statusCode());
		System.out.println(response.body());


	}

}
