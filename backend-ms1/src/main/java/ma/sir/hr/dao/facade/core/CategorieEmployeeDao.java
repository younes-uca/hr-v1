package ma.sir.hr.dao.facade.core;

import org.springframework.data.jpa.repository.Query;
import ma.sir.hr.zynerator.repository.AbstractRepository;
import ma.sir.hr.bean.core.CategorieEmployee;
import org.springframework.stereotype.Repository;
import ma.sir.hr.bean.core.CategorieEmployee;
import java.util.List;


@Repository
public interface CategorieEmployeeDao extends AbstractRepository<CategorieEmployee,Long>  {
    CategorieEmployee findByCode(String code);
    int deleteByCode(String code);


    @Query("SELECT NEW CategorieEmployee(item.id,item.libelle) FROM CategorieEmployee item")
    List<CategorieEmployee> findAllOptimized();
}
