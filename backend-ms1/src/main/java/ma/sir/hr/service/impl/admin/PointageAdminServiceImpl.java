package ma.sir.hr.service.impl.admin;

import ma.sir.hr.bean.core.Pointage;
import ma.sir.hr.bean.history.PointageHistory;
import ma.sir.hr.dao.criteria.core.PointageCriteria;
import ma.sir.hr.dao.criteria.history.PointageHistoryCriteria;
import ma.sir.hr.dao.facade.core.PointageDao;
import ma.sir.hr.dao.facade.history.PointageHistoryDao;
import ma.sir.hr.dao.specification.core.PointageSpecification;
import ma.sir.hr.service.facade.admin.PointageAdminService;
import ma.sir.hr.zynerator.service.AbstractServiceImpl;
import ma.sir.hr.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;


import ma.sir.hr.service.facade.admin.EmployeeAdminService ;


import java.util.List;
@Service
public class PointageAdminServiceImpl extends AbstractServiceImpl<Pointage,PointageHistory, PointageCriteria, PointageHistoryCriteria, PointageDao,
PointageHistoryDao> implements PointageAdminService {


    public Pointage findByReferenceEntity(Pointage t){
        return  dao.findByCode(t.getCode());
    }

    public List<Pointage> findByEmployeeId(Long id){
        return dao.findByEmployeeId(id);
    }
    public int deleteByEmployeeId(Long id){
        return dao.deleteByEmployeeId(id);
    }



    public void configure() {
        super.configure(Pointage.class,PointageHistory.class, PointageHistoryCriteria.class, PointageSpecification.class);
    }

    @Autowired
    private EmployeeAdminService employeeService ;

    public PointageAdminServiceImpl(PointageDao dao, PointageHistoryDao historyDao) {
        super(dao, historyDao);
    }

}