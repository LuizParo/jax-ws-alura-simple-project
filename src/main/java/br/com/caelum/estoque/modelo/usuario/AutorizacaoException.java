package br.com.caelum.estoque.modelo.usuario;

import javax.xml.ws.WebFault;

@WebFault(name = "AutorizacaoFault", messageName = "AutorizacaoFault")
public class AutorizacaoException extends Exception {
    private static final long serialVersionUID = 1L;

    public AutorizacaoException(String message, Throwable cause) {
        super(message, cause);
    }

    public AutorizacaoException(String message) {
        super(message);
    }

    public AutorizacaoException(Throwable cause) {
        super(cause);
    }
    
    public String getFaultInfo() {
        return "Token invalido";
    }
}