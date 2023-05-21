package ma.sir.hr.service.facade.admin;

import java.util.List;
import ma.sir.hr.bean.core.Pointage;
import ma.sir.hr.dao.criteria.core.PointageCriteria;
import ma.sir.hr.dao.criteria.history.PointageHistoryCriteria;
import ma.sir.hr.zynerator.service.IService;


public interface PointageAdminService extends  IService<Pointage,PointageCriteria, PointageHistoryCriteria>  {

    List<Pointage> findByEmployeeId(Long id);
    int deleteByEmployeeId(Long id);



}
