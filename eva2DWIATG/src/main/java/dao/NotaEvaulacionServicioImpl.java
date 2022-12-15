package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;


/**
 * Clase que implementa la interfaz PedidoServicio
 * Con la etiqueta component decimos que esta clase se puede añadir al contenedor
 * IoC para hacer inyección de dependencias.
 * Con la etiqueta persistence context estamos iyectando un EntityManager.
 *
 */

@Component
public class NotaEvaulacionServicioImpl implements NotaEvaulacionServicio{

	@PersistenceContext
	private EntityManager em;

	public void insert(NotaEvaulacion ev) {
		em.persist(ev);	
	}

	public List<NotaEvaulacion> select() {
		return em.createQuery("SELECT * FROM Evaluacion").getResultList();
	}


	
	

}
