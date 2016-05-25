package br.com.caelum.estoque.modelo.ws;

import javax.xml.ws.Endpoint;

public class PublicaEstoqueWS {
    public static void main(String[] args) {
        EstoqueWS implementacao = new EstoqueWS();
        String url = "http://localhost:8080/estoquews";
        
        System.out.println("EstoqueWS rodando: " + url + "?wsdl");
        Endpoint.publish(url, implementacao);
    }
}