/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apipractice.weatherdisplay;

/**
 *
 * @author aabdin02
 */
public class weather {
    private final int precipitationPercentage;
    private final int humidity;
    private final int windMpH;
    private final int temperatureDeg;
    private final int temperatureFah;
    private final double time;
    
    public weather(int prep, int hum, int wind, int tempDeg, int tempFah, double time){
        this.precipitationPercentage = prep;
        this.humidity = hum;
        this.windMpH = wind;
        this.temperatureDeg = tempDeg;
        this.temperatureFah = tempFah;
        this.time = time;
    }
    
    public int getPrecipiPerc(){
        return precipitationPercentage;
    }
    
    public int getHu(){
        return humidity;
    }
    
    public int getWiMpH(){
        return windMpH;
    }
    
    public int getTempDeg(){
        return temperatureDeg;
    }
    
    public int getTempFah(){
        return temperatureFah;
    }
    
    public double getTime(){
        return time;
    }
}
