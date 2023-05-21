package ma.sir.hr.dao.facade.history;

import ma.sir.hr.zynerator.repository.AbstractHistoryRepository;
import ma.sir.hr.bean.history.CongeHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface CongeHistoryDao extends AbstractHistoryRepository<CongeHistory,Long> {

}
