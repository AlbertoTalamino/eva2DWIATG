package controlador;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;

import impl.Consultas;



@Controller
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Obtenemos el contexto
		ApplicationContext context = new ClassPathXmlApplicationContext("contexto.xml"); 
		//Añadimos a nuestra clase consulta el contexto
		Consultas consulta = (Consultas) context.getBean(Consultas.class);
		
		//Creamos el DTO
		dto.NotaEv evDTO = new dto.NotaEv("JUF··", 8, "PR");

		//Consulta y paso de DTO a DAO
		consulta.insertarUnPedido(toDAO.DTONotaEvToDAO.convert(evDTO));
		
		System.out.println(consulta.Evaluacion());
	}

}
