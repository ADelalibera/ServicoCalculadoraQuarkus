package br.com.acline.interceptor;

import javax.xml.namespace.QName;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.apache.cxf.binding.soap.SoapMessage;
import org.apache.cxf.binding.soap.interceptor.AbstractSoapInterceptor;
import org.apache.cxf.headers.Header;
import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.phase.Phase;
import org.w3c.dom.DOMException;
import org.w3c.dom.Element;


public class SoapActionInterceptor extends AbstractSoapInterceptor {

    private final String soapAction;
    private final String namespaceUri;
    
        public SoapActionInterceptor(String soapAction, String namespaceUri) {
            super(Phase.PREPARE_SEND);
            this.soapAction = soapAction;
            this.namespaceUri = namespaceUri;
    }

    @Override    
    public void handleMessage(SoapMessage message) throws Fault {
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            factory.setNamespaceAware(true); // Adiciona suporte a namespaces
            DocumentBuilder builder = factory.newDocumentBuilder();
            Element actionElement = builder.newDocument().createElementNS(namespaceUri,"Action");
            actionElement.setTextContent(soapAction);
            Header header = new Header(new QName(namespaceUri,"Action"), actionElement);
            message.getHeaders().add(header);
            
        } catch (ParserConfigurationException | DOMException e) {
            throw new Fault(e);
        }
    }       
}
