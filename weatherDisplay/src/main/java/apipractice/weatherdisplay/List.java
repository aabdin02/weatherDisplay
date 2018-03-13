/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apipractice.weatherdisplay;

import java.util.TreeMap;
import java.util.Map;

/**
 *
 * @author aabdin02
 */
public class List {
    
    long dt;
    Map<String, Double> main = new TreeMap();
    double temp;
    double humidity;
    double pressure;
    
    public Map<String,Double> getMain(){
        return main;
    }
    public double getTemp(){
        temp = main.get("temp");
        return temp;
    }
    
    public double getPressure(){
        pressure = main.get("pressure");
        return pressure;
    }
    
    public double getHumidity(){
        humidity = main.get("humidity");
        return humidity;
    }
    
    public  long getDt(){
        return dt;
    }
    
}
