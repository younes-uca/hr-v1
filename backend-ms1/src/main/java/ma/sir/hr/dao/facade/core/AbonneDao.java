package ma.sir.hr.dao.facade.core;

import org.springframework.data.jpa.repository.Query;
import ma.sir.hr.zynerator.repository.AbstractRepository;
import ma.sir.hr.bean.core.Abonne;
import org.springframework.stereotype.Repository;
import ma.sir.hr.bean.core.Abonne;
import java.util.List;


@Repository
public interface AbonneDao extends AbstractRepository<Abonne,Long>  {
    Abonne findByCode(String code);
    int deleteByCode(String code);


    @Query("SELECT NEW Abonne(item.id,item.code) FROM Abonne item")
    List<Abonne> findAllOptimized();
}
