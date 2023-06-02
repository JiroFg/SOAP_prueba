//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2023.06.02 a las 01:34:25 AM CST 
//


package https.registro_uv_mx.registro;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="aula" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "aula"
})
@XmlRootElement(name = "BuscarRegistroRequest")
public class BuscarRegistroRequest {

    @XmlElement(required = true)
    protected String aula;

    /**
     * Obtiene el valor de la propiedad aula.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAula() {
        return aula;
    }

    /**
     * Define el valor de la propiedad aula.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAula(String value) {
        this.aula = value;
    }

}
