package ma.sir.hr.dao.facade.core;

import org.springframework.data.jpa.repository.Query;
import ma.sir.hr.zynerator.repository.AbstractRepository;
import ma.sir.hr.bean.core.Pointage;
import org.springframework.stereotype.Repository;
import ma.sir.hr.bean.core.Pointage;
import java.util.List;


@Repository
public interface PointageDao extends AbstractRepository<Pointage,Long>  {
    Pointage findByCode(String code);
    int deleteByCode(String code);

    List<Pointage> findByEmployeeId(Long id);
    int deleteByEmployeeId(Long id);

    @Query("SELECT NEW Pointage(item.id,item.code) FROM Pointage item")
    List<Pointage> findAllOptimized();
}
