package ma.sir.hr.service.impl.admin;

import ma.sir.hr.bean.core.Contrat;
import ma.sir.hr.bean.history.ContratHistory;
import ma.sir.hr.dao.criteria.core.ContratCriteria;
import ma.sir.hr.dao.criteria.history.ContratHistoryCriteria;
import ma.sir.hr.dao.facade.core.ContratDao;
import ma.sir.hr.dao.facade.history.ContratHistoryDao;
import ma.sir.hr.dao.specification.core.ContratSpecification;
import ma.sir.hr.service.facade.admin.ContratAdminService;
import ma.sir.hr.zynerator.service.AbstractServiceImpl;
import ma.sir.hr.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;


import ma.sir.hr.service.facade.admin.EmployeeAdminService ;
import ma.sir.hr.service.facade.admin.TypeContratAdminService ;


import java.util.List;
@Service
public class ContratAdminServiceImpl extends AbstractServiceImpl<Contrat,ContratHistory, ContratCriteria, ContratHistoryCriteria, ContratDao,
ContratHistoryDao> implements ContratAdminService {


    public Contrat findByReferenceEntity(Contrat t){
        return  dao.findByCode(t.getCode());
    }

    public List<Contrat> findByEmployeeId(Long id){
        return dao.findByEmployeeId(id);
    }
    public int deleteByEmployeeId(Long id){
        return dao.deleteByEmployeeId(id);
    }
    public List<Contrat> findByTypeContratId(Long id){
        return dao.findByTypeContratId(id);
    }
    public int deleteByTypeContratId(Long id){
        return dao.deleteByTypeContratId(id);
    }



    public void configure() {
        super.configure(Contrat.class,ContratHistory.class, ContratHistoryCriteria.class, ContratSpecification.class);
    }

    @Autowired
    private EmployeeAdminService employeeService ;
    @Autowired
    private TypeContratAdminService typeContratService ;

    public ContratAdminServiceImpl(ContratDao dao, ContratHistoryDao historyDao) {
        super(dao, historyDao);
    }

}