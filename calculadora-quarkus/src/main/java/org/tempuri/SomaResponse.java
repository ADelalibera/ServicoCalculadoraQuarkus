
package org.tempuri;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de anonymous complex type.</p>
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.</p>
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="SomaResult" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "somaResult"
})
@XmlRootElement(name = "SomaResponse")
public class SomaResponse {

    @XmlElement(name = "SomaResult")
    protected Long somaResult;

    /**
     * Obtém o valor da propriedade somaResult.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSomaResult() {
        return somaResult;
    }

    /**
     * Define o valor da propriedade somaResult.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSomaResult(Long value) {
        this.somaResult = value;
    }

}
