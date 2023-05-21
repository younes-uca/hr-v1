package ma.sir.hr.service.facade.admin;

import java.util.List;
import ma.sir.hr.bean.core.CategorieEmployee;
import ma.sir.hr.dao.criteria.core.CategorieEmployeeCriteria;
import ma.sir.hr.dao.criteria.history.CategorieEmployeeHistoryCriteria;
import ma.sir.hr.zynerator.service.IService;


public interface CategorieEmployeeAdminService extends  IService<CategorieEmployee,CategorieEmployeeCriteria, CategorieEmployeeHistoryCriteria>  {




}
