package ma.sir.hr.dao.facade.history;

import ma.sir.hr.zynerator.repository.AbstractHistoryRepository;
import ma.sir.hr.bean.history.TypeCongeHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeCongeHistoryDao extends AbstractHistoryRepository<TypeCongeHistory,Long> {

}
