package ec.edu.ups.presentacion;

import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import ec.edu.ups.modelo.Cliente;
import ec.edu.ups.on.ClienteON;

@Named
@RequestScoped
public class ClienteBean {
private Cliente cliente;
@Inject
ClienteON clienteON;

public ClienteBean() {
	// TODO Auto-generated constructor stub
	init();
}

public void init() {
	cliente = new Cliente();
}

public Cliente getCliente() {
	return cliente;
}

public void setCliente(Cliente cliente) {
	this.cliente = cliente;
}

public String guardar() {
	System.out.println("entra al guardar " + cliente);
	try {
		clienteON.guardarCliente(cliente);
		System.out.println("Guardado");
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
		System.out.println("ERRRORROROROROOROROOROROROROOROROORORO");
	}
	return null;
}

public String buscar() {
	try {
		cliente = clienteON.buscar(cliente.getCedula());
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
		cliente = null;
	}
	return null;
}
}
