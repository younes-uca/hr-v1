package ma.sir.hr.dao.facade.history;

import ma.sir.hr.zynerator.repository.AbstractHistoryRepository;
import ma.sir.hr.bean.history.EmployeeHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeHistoryDao extends AbstractHistoryRepository<EmployeeHistory,Long> {

}
