package ma.sir.hr.service.impl.admin;

import ma.sir.hr.bean.core.CategorieEmployee;
import ma.sir.hr.bean.history.CategorieEmployeeHistory;
import ma.sir.hr.dao.criteria.core.CategorieEmployeeCriteria;
import ma.sir.hr.dao.criteria.history.CategorieEmployeeHistoryCriteria;
import ma.sir.hr.dao.facade.core.CategorieEmployeeDao;
import ma.sir.hr.dao.facade.history.CategorieEmployeeHistoryDao;
import ma.sir.hr.dao.specification.core.CategorieEmployeeSpecification;
import ma.sir.hr.service.facade.admin.CategorieEmployeeAdminService;
import ma.sir.hr.zynerator.service.AbstractServiceImpl;
import ma.sir.hr.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;






import java.util.List;
@Service
public class CategorieEmployeeAdminServiceImpl extends AbstractServiceImpl<CategorieEmployee,CategorieEmployeeHistory, CategorieEmployeeCriteria, CategorieEmployeeHistoryCriteria, CategorieEmployeeDao,
CategorieEmployeeHistoryDao> implements CategorieEmployeeAdminService {


    public CategorieEmployee findByReferenceEntity(CategorieEmployee t){
        return  dao.findByCode(t.getCode());
    }




    public void configure() {
        super.configure(CategorieEmployee.class,CategorieEmployeeHistory.class, CategorieEmployeeHistoryCriteria.class, CategorieEmployeeSpecification.class);
    }


    public CategorieEmployeeAdminServiceImpl(CategorieEmployeeDao dao, CategorieEmployeeHistoryDao historyDao) {
        super(dao, historyDao);
    }

}