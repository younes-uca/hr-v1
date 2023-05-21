package ma.sir.hr.service.impl.admin;

import ma.sir.hr.bean.core.TypeContrat;
import ma.sir.hr.bean.history.TypeContratHistory;
import ma.sir.hr.dao.criteria.core.TypeContratCriteria;
import ma.sir.hr.dao.criteria.history.TypeContratHistoryCriteria;
import ma.sir.hr.dao.facade.core.TypeContratDao;
import ma.sir.hr.dao.facade.history.TypeContratHistoryDao;
import ma.sir.hr.dao.specification.core.TypeContratSpecification;
import ma.sir.hr.service.facade.admin.TypeContratAdminService;
import ma.sir.hr.zynerator.service.AbstractServiceImpl;
import ma.sir.hr.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;






import java.util.List;
@Service
public class TypeContratAdminServiceImpl extends AbstractServiceImpl<TypeContrat,TypeContratHistory, TypeContratCriteria, TypeContratHistoryCriteria, TypeContratDao,
TypeContratHistoryDao> implements TypeContratAdminService {


    public TypeContrat findByReferenceEntity(TypeContrat t){
        return  dao.findByCode(t.getCode());
    }




    public void configure() {
        super.configure(TypeContrat.class,TypeContratHistory.class, TypeContratHistoryCriteria.class, TypeContratSpecification.class);
    }


    public TypeContratAdminServiceImpl(TypeContratDao dao, TypeContratHistoryDao historyDao) {
        super(dao, historyDao);
    }

}