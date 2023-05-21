package ma.sir.hr.dao.facade.history;

import ma.sir.hr.zynerator.repository.AbstractHistoryRepository;
import ma.sir.hr.bean.history.PointageHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface PointageHistoryDao extends AbstractHistoryRepository<PointageHistory,Long> {

}