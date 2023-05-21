package ma.sir.hr.service.facade.admin;

import java.util.List;
import ma.sir.hr.bean.core.Employee;
import ma.sir.hr.dao.criteria.core.EmployeeCriteria;
import ma.sir.hr.dao.criteria.history.EmployeeHistoryCriteria;
import ma.sir.hr.zynerator.service.IService;


public interface EmployeeAdminService extends  IService<Employee,EmployeeCriteria, EmployeeHistoryCriteria>  {

    List<Employee> findByContratId(Long id);
    int deleteByContratId(Long id);
    List<Employee> findByUniteAdministrativeId(Long id);
    int deleteByUniteAdministrativeId(Long id);
    List<Employee> findByCategorieEmployeeId(Long id);
    int deleteByCategorieEmployeeId(Long id);



}
