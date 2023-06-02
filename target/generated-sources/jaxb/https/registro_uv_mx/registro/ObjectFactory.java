//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2023.06.02 a las 02:42:16 AM CDT 
//


package https.registro_uv_mx.registro;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the https.registro_uv_mx.registro package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _MostrarRegistrosRequest_QNAME = new QName("https://registro.uv.mx/registro", "MostrarRegistrosRequest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: https.registro_uv_mx.registro
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BuscarRegistroResponse }
     * 
     */
    public BuscarRegistroResponse createBuscarRegistroResponse() {
        return new BuscarRegistroResponse();
    }

    /**
     * Create an instance of {@link MostrarRegistrosResponse }
     * 
     */
    public MostrarRegistrosResponse createMostrarRegistrosResponse() {
        return new MostrarRegistrosResponse();
    }

    /**
     * Create an instance of {@link AddRegistroRequest }
     * 
     */
    public AddRegistroRequest createAddRegistroRequest() {
        return new AddRegistroRequest();
    }

    /**
     * Create an instance of {@link AddRegistroResponse }
     * 
     */
    public AddRegistroResponse createAddRegistroResponse() {
        return new AddRegistroResponse();
    }

    /**
     * Create an instance of {@link BuscarRegistroRequest }
     * 
     */
    public BuscarRegistroRequest createBuscarRegistroRequest() {
        return new BuscarRegistroRequest();
    }

    /**
     * Create an instance of {@link BuscarRegistroResponse.Registro }
     * 
     */
    public BuscarRegistroResponse.Registro createBuscarRegistroResponseRegistro() {
        return new BuscarRegistroResponse.Registro();
    }

    /**
     * Create an instance of {@link MostrarRegistrosResponse.Registro }
     * 
     */
    public MostrarRegistrosResponse.Registro createMostrarRegistrosResponseRegistro() {
        return new MostrarRegistrosResponse.Registro();
    }

    /**
     * Create an instance of {@link EliminarRegistroRequest }
     * 
     */
    public EliminarRegistroRequest createEliminarRegistroRequest() {
        return new EliminarRegistroRequest();
    }

    /**
     * Create an instance of {@link EliminarRegistroResponse }
     * 
     */
    public EliminarRegistroResponse createEliminarRegistroResponse() {
        return new EliminarRegistroResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     */
    @XmlElementDecl(namespace = "https://registro.uv.mx/registro", name = "MostrarRegistrosRequest")
    public JAXBElement<Object> createMostrarRegistrosRequest(Object value) {
        return new JAXBElement<Object>(_MostrarRegistrosRequest_QNAME, Object.class, null, value);
    }

}
