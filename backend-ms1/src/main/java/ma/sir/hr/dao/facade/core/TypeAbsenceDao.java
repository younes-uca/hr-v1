package ma.sir.hr.dao.facade.core;

import org.springframework.data.jpa.repository.Query;
import ma.sir.hr.zynerator.repository.AbstractRepository;
import ma.sir.hr.bean.core.TypeAbsence;
import org.springframework.stereotype.Repository;
import ma.sir.hr.bean.core.TypeAbsence;
import java.util.List;


@Repository
public interface TypeAbsenceDao extends AbstractRepository<TypeAbsence,Long>  {
    TypeAbsence findByCode(String code);
    int deleteByCode(String code);


    @Query("SELECT NEW TypeAbsence(item.id,item.libelle) FROM TypeAbsence item")
    List<TypeAbsence> findAllOptimized();
}
