package org.rajesh.learning.threadTest;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;

import javax.net.ssl.HttpsURLConnection;

public class PerfTestAPI implements Runnable{

	private String name;
	
	public PerfTestAPI(String name){
		this.name = name;
	}
	
	@Override
	public void run() {
		String url = "https://shrouded-sands-9790.herokuapp.com/users";
		try {
			Date date1 = new Date();
			
			URL requestUrl = new URL(url);
			HttpsURLConnection con = (HttpsURLConnection) requestUrl.openConnection();
			con.setRequestProperty("User-Agent", "Mozilla/5.0");
			BufferedReader sb = new BufferedReader(new InputStreamReader(con.getInputStream()));
			String inputLine;
			StringBuffer response = new StringBuffer();
			while((inputLine = sb.readLine()) != null){
				response.append(inputLine);
			}
			sb.close();
			Date date2 = new Date();
			long diff = date2.getTime() - date1.getTime();
			System.out.println(response.toString());
			System.out.println(diff);
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}

