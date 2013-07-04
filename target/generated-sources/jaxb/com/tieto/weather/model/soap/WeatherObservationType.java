//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.07.03 at 12:15:03 PM EEST 
//


package com.tieto.weather.model.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WeatherObservationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WeatherObservationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="location" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="relative_humidity" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="temp_c" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="weather" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="wind_dir" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="wind_string" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WeatherObservationType", propOrder = {
    "location",
    "relativeHumidity",
    "tempC",
    "weather",
    "windDir",
    "windString"
})
public class WeatherObservationType {

    @XmlElement(required = true)
    protected String location;
    @XmlElement(name = "relative_humidity", required = true)
    protected String relativeHumidity;
    @XmlElement(name = "temp_c")
    protected double tempC;
    @XmlElement(required = true)
    protected String weather;
    @XmlElement(name = "wind_dir", required = true)
    protected String windDir;
    @XmlElement(name = "wind_string", required = true)
    protected String windString;

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocation(String value) {
        this.location = value;
    }

    /**
     * Gets the value of the relativeHumidity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelativeHumidity() {
        return relativeHumidity;
    }

    /**
     * Sets the value of the relativeHumidity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelativeHumidity(String value) {
        this.relativeHumidity = value;
    }

    /**
     * Gets the value of the tempC property.
     * 
     */
    public double getTempC() {
        return tempC;
    }

    /**
     * Sets the value of the tempC property.
     * 
     */
    public void setTempC(double value) {
        this.tempC = value;
    }

    /**
     * Gets the value of the weather property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeather() {
        return weather;
    }

    /**
     * Sets the value of the weather property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWeather(String value) {
        this.weather = value;
    }

    /**
     * Gets the value of the windDir property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWindDir() {
        return windDir;
    }

    /**
     * Sets the value of the windDir property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWindDir(String value) {
        this.windDir = value;
    }

    /**
     * Gets the value of the windString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWindString() {
        return windString;
    }

    /**
     * Sets the value of the windString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWindString(String value) {
        this.windString = value;
    }

}
