package com.auribises;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

// Asynchronous Communication
class FetchDataFromServer extends Thread{
	
	public void run() {
		String url = "http://auribises.com";
		
		StringBuffer response = new StringBuffer();
		
		try {
			
			URL uRef = new URL(url);
			URLConnection connection = uRef.openConnection(); // Sending Request from Client to Server
			InputStream stream = connection.getInputStream(); // Reading the Response from Server
			BufferedReader reader = new BufferedReader(new InputStreamReader(stream));
			
			String line = "";
			
			while((line = reader.readLine()) != null){
				response.append(line+"\n");
			}
			
			System.out.println(">> Response from Server i.e. newsapi.org is: "+response);
			
		} catch (Exception e) {
			System.out.println(">> Some Error: "+e);
		}
	}
}

public class App {

	public static void main(String[] args) {
		
		System.out.println(">> App Started");

		FetchDataFromServer sRef = new FetchDataFromServer();
		sRef.start();
		
		for(int i=1;i<=10;i++){
			System.out.println(i);
		}
		
		System.out.println(">> App Finished");
		
	}

}

// JSON Parsing in Java
// extract title and description from news api Response :) 
