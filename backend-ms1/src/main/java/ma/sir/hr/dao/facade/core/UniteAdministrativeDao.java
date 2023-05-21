package ma.sir.hr.dao.facade.core;

import org.springframework.data.jpa.repository.Query;
import ma.sir.hr.zynerator.repository.AbstractRepository;
import ma.sir.hr.bean.core.UniteAdministrative;
import org.springframework.stereotype.Repository;
import ma.sir.hr.bean.core.UniteAdministrative;
import java.util.List;


@Repository
public interface UniteAdministrativeDao extends AbstractRepository<UniteAdministrative,Long>  {
    UniteAdministrative findByCode(String code);
    int deleteByCode(String code);


    @Query("SELECT NEW UniteAdministrative(item.id,item.libelle) FROM UniteAdministrative item")
    List<UniteAdministrative> findAllOptimized();
}
