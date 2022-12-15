package toDAO;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Id;

public class DTONotaEvToDAO {

	public static dao.NotaEvaulacion convert(dto.NotaEv DTO){
		
		dao.NotaEvaulacion DAO = new dao.NotaEvaulacion();
		
		DAO.setMd_uuid(DTO.getMd_uuid());
		DAO.setMd_fch(DTO.getMd_fch());
		DAO.setCod_alumno(DTO.getCod_alumno());
		DAO.setNota_evaluacion(DTO.getNota_evaluacion());
		DAO.setCod_evaluacion(DTO.getCod_evaluacion());
		
		return DAO;
	
	}
	
}
