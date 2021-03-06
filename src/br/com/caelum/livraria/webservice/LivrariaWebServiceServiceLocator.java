/**
 * LivrariaWebServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.caelum.livraria.webservice;

public class LivrariaWebServiceServiceLocator extends org.apache.axis.client.Service implements br.com.caelum.livraria.webservice.LivrariaWebServiceService {

    public LivrariaWebServiceServiceLocator() {
    }


    public LivrariaWebServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public LivrariaWebServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for LivrariaWebServicePort
    private java.lang.String LivrariaWebServicePort_address = "http://localhost:8080/livraria/LivrariaWebService";

    public java.lang.String getLivrariaWebServicePortAddress() {
        return LivrariaWebServicePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String LivrariaWebServicePortWSDDServiceName = "LivrariaWebServicePort";

    public java.lang.String getLivrariaWebServicePortWSDDServiceName() {
        return LivrariaWebServicePortWSDDServiceName;
    }

    public void setLivrariaWebServicePortWSDDServiceName(java.lang.String name) {
        LivrariaWebServicePortWSDDServiceName = name;
    }

    public br.com.caelum.livraria.webservice.LivrariaWebService getLivrariaWebServicePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(LivrariaWebServicePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getLivrariaWebServicePort(endpoint);
    }

    public br.com.caelum.livraria.webservice.LivrariaWebService getLivrariaWebServicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            br.com.caelum.livraria.webservice.LivrariaWebServiceServiceSoapBindingStub _stub = new br.com.caelum.livraria.webservice.LivrariaWebServiceServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getLivrariaWebServicePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setLivrariaWebServicePortEndpointAddress(java.lang.String address) {
        LivrariaWebServicePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (br.com.caelum.livraria.webservice.LivrariaWebService.class.isAssignableFrom(serviceEndpointInterface)) {
                br.com.caelum.livraria.webservice.LivrariaWebServiceServiceSoapBindingStub _stub = new br.com.caelum.livraria.webservice.LivrariaWebServiceServiceSoapBindingStub(new java.net.URL(LivrariaWebServicePort_address), this);
                _stub.setPortName(getLivrariaWebServicePortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("LivrariaWebServicePort".equals(inputPortName)) {
            return getLivrariaWebServicePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://webservice.livraria.caelum.com.br/", "LivrariaWebServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://webservice.livraria.caelum.com.br/", "LivrariaWebServicePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("LivrariaWebServicePort".equals(portName)) {
            setLivrariaWebServicePortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
