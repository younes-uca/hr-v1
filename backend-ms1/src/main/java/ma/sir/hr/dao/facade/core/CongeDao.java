package ma.sir.hr.dao.facade.core;

import org.springframework.data.jpa.repository.Query;
import ma.sir.hr.zynerator.repository.AbstractRepository;
import ma.sir.hr.bean.core.Conge;
import org.springframework.stereotype.Repository;
import ma.sir.hr.bean.core.Conge;
import java.util.List;


@Repository
public interface CongeDao extends AbstractRepository<Conge,Long>  {
    Conge findByCode(String code);
    int deleteByCode(String code);

    List<Conge> findByTypeCongeId(Long id);
    int deleteByTypeCongeId(Long id);
    List<Conge> findByEmployeeId(Long id);
    int deleteByEmployeeId(Long id);

    @Query("SELECT NEW Conge(item.id,item.code) FROM Conge item")
    List<Conge> findAllOptimized();
}
