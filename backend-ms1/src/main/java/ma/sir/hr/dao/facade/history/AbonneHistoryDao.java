package ma.sir.hr.dao.facade.history;

import ma.sir.hr.zynerator.repository.AbstractHistoryRepository;
import ma.sir.hr.bean.history.AbonneHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface AbonneHistoryDao extends AbstractHistoryRepository<AbonneHistory,Long> {

}
