package aate.gob.pe.service;

import java.util.List;

import org.springframework.data.repository.query.Param;

import aate.gob.pe.DTO.RolFuncionalidadDTO;
import aate.gob.pe.DTO.SisRolFuncionalidadDTO;
import aate.gob.pe.model.SisRolFuncionalidad;

public interface ISisRolFuncionalidadService extends ICrud<SisRolFuncionalidad>{
	Integer registrarTransaccional(RolFuncionalidadDTO rolfun);
	List<SisRolFuncionalidadDTO> listaSistemaRolFun();
	void eliminarRolMenFunc(SisRolFuncionalidadDTO sisrolfun);
	List<Integer> buscarIdRolMenuFunxSistema(@Param("siscod") Integer siscod, @Param("rolcod") Integer rolcod);
}
