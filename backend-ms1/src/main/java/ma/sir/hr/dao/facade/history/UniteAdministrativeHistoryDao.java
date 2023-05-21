package ma.sir.hr.dao.facade.history;

import ma.sir.hr.zynerator.repository.AbstractHistoryRepository;
import ma.sir.hr.bean.history.UniteAdministrativeHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface UniteAdministrativeHistoryDao extends AbstractHistoryRepository<UniteAdministrativeHistory,Long> {

}
