
package org.tempuri;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
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
 *         <element name="x" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="y" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
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
    "x",
    "y"
})
@XmlRootElement(name = "Soma")
public class Soma {

    protected Long x;
    protected Long y;

    /**
     * Obtém o valor da propriedade x.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getX() {
        return x;
    }

    /**
     * Define o valor da propriedade x.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setX(Long value) {
        this.x = value;
    }

    /**
     * Obtém o valor da propriedade y.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getY() {
        return y;
    }

    /**
     * Define o valor da propriedade y.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setY(Long value) {
        this.y = value;
    }

}
