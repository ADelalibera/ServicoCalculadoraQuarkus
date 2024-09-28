package br.com.acline;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.tempuri.IServicoCalculadora;

import br.com.acline.interceptor.SoapActionInterceptor;

public class CalculadoraHandler {
    
    private IServicoCalculadora createServicoCalculadora(String endpointUrl, String soapAction, String soapBinding, String namespaceUri)  {
        JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
        factory.setServiceClass(IServicoCalculadora.class);
        factory.setAddress(endpointUrl);
        factory.setBindingId(soapBinding);
        factory.getOutInterceptors().add(new SoapActionInterceptor(soapAction, namespaceUri));
        return (IServicoCalculadora)factory.create();        
    }

    public long Somar(long x, long y) {

        String endpointUrl = "http://192.168.68.115:8000/ServicoCalculadora";
        String soapAction = "http://tempuri.org/IServicoCalculadora/Soma";
        String soapBinding = "http://schemas.xmlsoap.org/wsdl/soap12/";
        String namespaceUri = "http://www.w3.org/2005/08/addressing";

        var service = createServicoCalculadora(endpointUrl, soapAction, soapBinding, namespaceUri);
        
        return service.soma(x, y);
        
    }    
}
