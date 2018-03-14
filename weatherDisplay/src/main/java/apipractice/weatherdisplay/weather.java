/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apipractice.weatherdisplay;

import java.util.Map;
import java.util.TreeMap;


/**
 *
 * @author aabdin02
 */
public class weather {
    private  String   base;
    private final Map<String,Double> main = new TreeMap();
    
    public weather(){
        
    }
    
    public double getTemp(){
        return main.get("temp");
    }
    
    public double getPressure(){
        return main.get("pressure");
    }
    
    public double getHumidity(){
        return main.get("humidity");
    }
    
    public Map<String,Double> getMain(){
        return main;
    }
    
}
