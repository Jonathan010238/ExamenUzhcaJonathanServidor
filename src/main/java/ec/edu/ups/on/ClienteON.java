package ec.edu.ups.on;

import javax.ejb.Stateless;
import javax.inject.Inject;

import ec.edu.ups.dao.ClienteDAO;
import ec.edu.ups.modelo.Cliente;

@Stateless
public class ClienteON{
	@Inject
	private ClienteDAO clienteDAO;
	public boolean guardarCliente(Cliente cliente) throws Exception{
		boolean bandera;
		try {
			clienteDAO.insert(cliente);
			bandera = true;
		} catch (Exception e) {
			// TODO: handle exception
			bandera = false;
			e.printStackTrace();
			throw new Exception("Erro al registrar el cliente ON");
		}
		return bandera;
	}
	
	public Cliente buscar(String cedula) {
		return clienteDAO.buscar(cedula);
	}

}
