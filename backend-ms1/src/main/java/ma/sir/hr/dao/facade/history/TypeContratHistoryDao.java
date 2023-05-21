package ma.sir.hr.dao.facade.history;

import ma.sir.hr.zynerator.repository.AbstractHistoryRepository;
import ma.sir.hr.bean.history.TypeContratHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeContratHistoryDao extends AbstractHistoryRepository<TypeContratHistory,Long> {

}
