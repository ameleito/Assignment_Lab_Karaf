//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.21 at 06:53:07 PM COT 
//


package com.customer.app;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Rate: "A certain quantity or amount of one thing considered in relation to a unit of another thing and used as a standard or measure: at the rate of 60 miles an hour." - Dictionary.com This class represents a ratio of some Physical Quantity over a period of time. This class is structurally similar to other Ratio classes (e.g., IntegerRatio), except the denominator is by definition a TimeQuantity.
 * 
 * <p>Java class for RateQuantity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RateQuantity"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="denominator" type="{http://www.app.customer.com}TimeQuantity" minOccurs="0"/&gt;
 *         &lt;element name="numerator" type="{http://www.app.customer.com}PhysicalQualtity" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RateQuantity", propOrder = {
    "denominator",
    "numerator"
})
@XmlRootElement(name = "RateQuantity")
public class RateQuantity
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    protected TimeQuantity denominator;
    protected PhysicalQualtity numerator;

    /**
     * Gets the value of the denominator property.
     * 
     * @return
     *     possible object is
     *     {@link TimeQuantity }
     *     
     */
    public TimeQuantity getDenominator() {
        return denominator;
    }

    /**
     * Sets the value of the denominator property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeQuantity }
     *     
     */
    public void setDenominator(TimeQuantity value) {
        this.denominator = value;
    }

    /**
     * Gets the value of the numerator property.
     * 
     * @return
     *     possible object is
     *     {@link PhysicalQualtity }
     *     
     */
    public PhysicalQualtity getNumerator() {
        return numerator;
    }

    /**
     * Sets the value of the numerator property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhysicalQualtity }
     *     
     */
    public void setNumerator(PhysicalQualtity value) {
        this.numerator = value;
    }

}
