package ma.sir.hr.dao.facade.history;

import ma.sir.hr.zynerator.repository.AbstractHistoryRepository;
import ma.sir.hr.bean.history.CategorieEmployeeHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface CategorieEmployeeHistoryDao extends AbstractHistoryRepository<CategorieEmployeeHistory,Long> {

}
