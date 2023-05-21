package ma.sir.hr.service.facade.admin;

import java.util.List;
import ma.sir.hr.bean.core.Contrat;
import ma.sir.hr.dao.criteria.core.ContratCriteria;
import ma.sir.hr.dao.criteria.history.ContratHistoryCriteria;
import ma.sir.hr.zynerator.service.IService;


public interface ContratAdminService extends  IService<Contrat,ContratCriteria, ContratHistoryCriteria>  {

    List<Contrat> findByEmployeeId(Long id);
    int deleteByEmployeeId(Long id);
    List<Contrat> findByTypeContratId(Long id);
    int deleteByTypeContratId(Long id);



}
