package aate.gob.pe.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import aate.gob.pe.model.Sistema;

//@Repository
public interface ISistemaRepo extends JpaRepository<Sistema, Integer> {
	
	@Query(value = "SELECT SISCOD, SISNOM, SISDES, SISSIG, SISEST, ESTREG FROM ACSE_TB_SISTEMA WHERE TRIM(SISSIG) = :sigla", nativeQuery = true)
	List<Object[]> siglaFindAll(@Param("sigla") String sigla);
	
	@Query("from Sistema s where LOWER(s.SISNOM)  like %:SISNOM% or lower(s.SISSIG) like %:SISSIG% or s.SISEST = :SISEST")
	List<Sistema> buscarSistema( @Param("SISNOM")String SISNOM,  @Param("SISSIG")String SISSIG, @Param("SISEST")char SISEST );

}
