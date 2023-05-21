package ma.sir.hr.dao.facade.core;

import org.springframework.data.jpa.repository.Query;
import ma.sir.hr.zynerator.repository.AbstractRepository;
import ma.sir.hr.bean.core.TypeConge;
import org.springframework.stereotype.Repository;
import ma.sir.hr.bean.core.TypeConge;
import java.util.List;


@Repository
public interface TypeCongeDao extends AbstractRepository<TypeConge,Long>  {
    TypeConge findByCode(String code);
    int deleteByCode(String code);


    @Query("SELECT NEW TypeConge(item.id,item.code) FROM TypeConge item")
    List<TypeConge> findAllOptimized();
}
