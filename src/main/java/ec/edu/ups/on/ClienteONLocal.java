package ec.edu.ups.on;

import javax.ejb.Local;

import ec.edu.ups.modelo.Cliente;

@Local
public interface ClienteONLocal {
public Cliente buscar(String cedula) throws Exception;
}
