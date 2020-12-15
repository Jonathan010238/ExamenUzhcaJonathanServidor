package ec.edu.ups.dao;

import java.sql.Connection;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import ec.edu.ups.modelo.Cliente;

@Stateless
public class ClienteDAO {


@PersistenceContext
private EntityManager em;

public boolean insert(Cliente cliente) {
	em.persist(cliente);
	return true;
}

public Cliente buscar(String cedula) {
	String jpql = "SELECT c from Cliente c where c.cedula= :a";
	Query q = em.createQuery(jpql,Cliente.class);
	q.setParameter("a", cedula);
	Cliente c = (Cliente)q.getSingleResult();
	System.out.println(c.getApellido());
	return c;
}
}
