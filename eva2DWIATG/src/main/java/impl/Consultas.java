package impl;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import dao.Evaulacion;
import dao.NotaEvaulacion;
import dao.NotaEvaulacionServicioImpl;


/**
 * Clase que agrupa las transacaciones contra base de datos.
 * La etiqueta autowired nos permite hacer inyección de dependencia de la clase
 * PedidoServicioImpl.
 * La etiqueta Transactional automatiza la gestión de la transacción.
 *
 */
@Component
public class Consultas{

	@Autowired
	private NotaEvaulacionServicioImpl psi;
	
	@Transactional
	public void insertarUnPedido(NotaEvaulacion ev) {
		psi.insert(ev);
	}	
	
	@Transactional
	public List<NotaEvaulacion> Evaluacion() {
		return psi.select();
	}
	
}
