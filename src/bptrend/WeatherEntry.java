/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bptrend;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author adewoleadewumi
 */
public class WeatherEntry {
    
    //fields to be used from imput files
    Date when;
    float pressure;
    float humidity;
    
    @Override
    public String toString(){
        DateFormat format = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        
        return ("Data for: " + format.format(when)
                + " Barometric Pressure: "
                + Float.toString(pressure)
                + " Humidity: " + Float.toString(humidity));
    }
    
}
