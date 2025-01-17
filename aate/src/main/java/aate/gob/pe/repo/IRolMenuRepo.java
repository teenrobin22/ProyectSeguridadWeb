package aate.gob.pe.repo;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import aate.gob.pe.DTO.SistemaRolDTO;
import aate.gob.pe.model.RolMenu;

public interface IRolMenuRepo extends JpaRepository<RolMenu,Integer> {
	
	@Query(value = "select distinct new aate.gob.pe.DTO.SistemaRolDTO(s.SISCOD,r) from RolMenu rm join Sistema s on s.SISCOD = rm.SISCOD join rm.rol r")
	List<SistemaRolDTO> buscarSistemaRol();
	
	@Query(value = "select rm.ROLMENCOD from RolMenu rm join rm.menu m join m.sistema s join rm.rol r where s.SISCOD = :siscod and r.ROLCOD = :rolcod")
	List<Integer> buscarIdRolMenuxSistema(@Param("siscod") Integer siscod, @Param("rolcod") Integer rolcod);
	
}
