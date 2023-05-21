package ma.sir.hr.service.impl.admin;

import ma.sir.hr.bean.core.Conge;
import ma.sir.hr.bean.history.CongeHistory;
import ma.sir.hr.dao.criteria.core.CongeCriteria;
import ma.sir.hr.dao.criteria.history.CongeHistoryCriteria;
import ma.sir.hr.dao.facade.core.CongeDao;
import ma.sir.hr.dao.facade.history.CongeHistoryDao;
import ma.sir.hr.dao.specification.core.CongeSpecification;
import ma.sir.hr.service.facade.admin.CongeAdminService;
import ma.sir.hr.zynerator.service.AbstractServiceImpl;
import ma.sir.hr.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;


import ma.sir.hr.service.facade.admin.TypeCongeAdminService ;
import ma.sir.hr.service.facade.admin.EmployeeAdminService ;


import java.util.List;
@Service
public class CongeAdminServiceImpl extends AbstractServiceImpl<Conge,CongeHistory, CongeCriteria, CongeHistoryCriteria, CongeDao,
CongeHistoryDao> implements CongeAdminService {


    public Conge findByReferenceEntity(Conge t){
        return  dao.findByCode(t.getCode());
    }

    public List<Conge> findByTypeCongeId(Long id){
        return dao.findByTypeCongeId(id);
    }
    public int deleteByTypeCongeId(Long id){
        return dao.deleteByTypeCongeId(id);
    }
    public List<Conge> findByEmployeeId(Long id){
        return dao.findByEmployeeId(id);
    }
    public int deleteByEmployeeId(Long id){
        return dao.deleteByEmployeeId(id);
    }



    public void configure() {
        super.configure(Conge.class,CongeHistory.class, CongeHistoryCriteria.class, CongeSpecification.class);
    }

    @Autowired
    private TypeCongeAdminService typeCongeService ;
    @Autowired
    private EmployeeAdminService employeeService ;

    public CongeAdminServiceImpl(CongeDao dao, CongeHistoryDao historyDao) {
        super(dao, historyDao);
    }

}