package ec.edu.ups.on;

import javax.ejb.Remote;

import ec.edu.ups.modelo.Cliente;

@Remote
public interface ClienteONRemoto {
public boolean guardarCliente(Cliente cliente) throws Exception;
}
