/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apipractice.weatherdisplay;

import java.net.URL;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
/**
 *
 * @author aabdin02
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
        String url = "http://api.openweathermap.org/data/2.5/forecast?id=524901&APPID=b7b8b4d8ff1a05a46495fc7c424ca118";
        HttpGet get = new HttpGet(url);
       
        HttpResponse response = HttpClientBuilder.create().build().execute(get);
        
        String responseString = "";
        for (int i = 0; i < response.getEntity().getContentLength(); i++) { 
            responseString +=
            Character.toString((char)response.getEntity().getContent().read()); 
        }
        
        
    }
    
}
