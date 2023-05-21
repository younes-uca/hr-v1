package ma.sir.hr.service.facade.admin;

import java.util.List;
import ma.sir.hr.bean.core.Conge;
import ma.sir.hr.dao.criteria.core.CongeCriteria;
import ma.sir.hr.dao.criteria.history.CongeHistoryCriteria;
import ma.sir.hr.zynerator.service.IService;


public interface CongeAdminService extends  IService<Conge,CongeCriteria, CongeHistoryCriteria>  {

    List<Conge> findByTypeCongeId(Long id);
    int deleteByTypeCongeId(Long id);
    List<Conge> findByEmployeeId(Long id);
    int deleteByEmployeeId(Long id);



}
