package ma.sir.hr.service.facade.admin;

import java.util.List;
import ma.sir.hr.bean.core.Absence;
import ma.sir.hr.dao.criteria.core.AbsenceCriteria;
import ma.sir.hr.dao.criteria.history.AbsenceHistoryCriteria;
import ma.sir.hr.zynerator.service.IService;


public interface AbsenceAdminService extends  IService<Absence,AbsenceCriteria, AbsenceHistoryCriteria>  {

    List<Absence> findByTypeAbsenceId(Long id);
    int deleteByTypeAbsenceId(Long id);
    List<Absence> findByEmployeeId(Long id);
    int deleteByEmployeeId(Long id);



}
