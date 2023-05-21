package ma.sir.hr.dao.facade.history;

import ma.sir.hr.zynerator.repository.AbstractHistoryRepository;
import ma.sir.hr.bean.history.TypeAbsenceHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeAbsenceHistoryDao extends AbstractHistoryRepository<TypeAbsenceHistory,Long> {

}
