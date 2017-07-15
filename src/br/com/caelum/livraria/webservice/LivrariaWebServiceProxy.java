package br.com.caelum.livraria.webservice;

public class LivrariaWebServiceProxy implements br.com.caelum.livraria.webservice.LivrariaWebService {
  private String _endpoint = null;
  private br.com.caelum.livraria.webservice.LivrariaWebService livrariaWebService = null;
  
  public LivrariaWebServiceProxy() {
    _initLivrariaWebServiceProxy();
  }
  
  public LivrariaWebServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initLivrariaWebServiceProxy();
  }
  
  private void _initLivrariaWebServiceProxy() {
    try {
      livrariaWebService = (new br.com.caelum.livraria.webservice.LivrariaWebServiceServiceLocator()).getLivrariaWebServicePort();
      if (livrariaWebService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)livrariaWebService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)livrariaWebService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (livrariaWebService != null)
      ((javax.xml.rpc.Stub)livrariaWebService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public br.com.caelum.livraria.webservice.LivrariaWebService getLivrariaWebService() {
    if (livrariaWebService == null)
      _initLivrariaWebServiceProxy();
    return livrariaWebService;
  }
  
  public br.com.caelum.livraria.webservice.Livro[] obterLivrosPeloTitulo(java.lang.String titulo) throws java.rmi.RemoteException{
    if (livrariaWebService == null)
      _initLivrariaWebServiceProxy();
    return livrariaWebService.obterLivrosPeloTitulo(titulo);
  }
  
  
}