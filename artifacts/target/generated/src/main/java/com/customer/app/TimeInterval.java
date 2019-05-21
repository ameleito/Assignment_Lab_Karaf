//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.20 at 09:55:46 AM COT 
//


package com.customer.app;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This data type represents an Interval, where the Low and High Limits are Points In Time. An Interval is a "set of consecutive values of an ordered base data type." - HL7 V3 A PointInTime is "a quantity specifying a point on the axis of natural time. A point in time is most often represented as a calendar expression." - HL7 V3
 * 
 * <p>Java class for TimeInterval complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TimeInterval"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="high" type="{http://www.app.customer.com}PointInTime" minOccurs="0"/&gt;
 *         &lt;element name="low" type="{http://www.app.customer.com}PointInTime" minOccurs="0"/&gt;
 *         &lt;element name="width" type="{http://www.app.customer.com}TimeQuantity" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeInterval", propOrder = {
    "high",
    "low",
    "width"
})
@XmlRootElement(name = "TimeInterval")
public class TimeInterval
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    protected PointInTime high;
    protected PointInTime low;
    protected TimeQuantity width;

    /**
     * Gets the value of the high property.
     * 
     * @return
     *     possible object is
     *     {@link PointInTime }
     *     
     */
    public PointInTime getHigh() {
        return high;
    }

    /**
     * Sets the value of the high property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointInTime }
     *     
     */
    public void setHigh(PointInTime value) {
        this.high = value;
    }

    /**
     * Gets the value of the low property.
     * 
     * @return
     *     possible object is
     *     {@link PointInTime }
     *     
     */
    public PointInTime getLow() {
        return low;
    }

    /**
     * Sets the value of the low property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointInTime }
     *     
     */
    public void setLow(PointInTime value) {
        this.low = value;
    }

    /**
     * Gets the value of the width property.
     * 
     * @return
     *     possible object is
     *     {@link TimeQuantity }
     *     
     */
    public TimeQuantity getWidth() {
        return width;
    }

    /**
     * Sets the value of the width property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeQuantity }
     *     
     */
    public void setWidth(TimeQuantity value) {
        this.width = value;
    }

}
