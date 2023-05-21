package ma.sir.hr.service.impl.admin;

import ma.sir.hr.bean.core.TypeAbsence;
import ma.sir.hr.bean.history.TypeAbsenceHistory;
import ma.sir.hr.dao.criteria.core.TypeAbsenceCriteria;
import ma.sir.hr.dao.criteria.history.TypeAbsenceHistoryCriteria;
import ma.sir.hr.dao.facade.core.TypeAbsenceDao;
import ma.sir.hr.dao.facade.history.TypeAbsenceHistoryDao;
import ma.sir.hr.dao.specification.core.TypeAbsenceSpecification;
import ma.sir.hr.service.facade.admin.TypeAbsenceAdminService;
import ma.sir.hr.zynerator.service.AbstractServiceImpl;
import ma.sir.hr.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;






import java.util.List;
@Service
public class TypeAbsenceAdminServiceImpl extends AbstractServiceImpl<TypeAbsence,TypeAbsenceHistory, TypeAbsenceCriteria, TypeAbsenceHistoryCriteria, TypeAbsenceDao,
TypeAbsenceHistoryDao> implements TypeAbsenceAdminService {


    public TypeAbsence findByReferenceEntity(TypeAbsence t){
        return  dao.findByCode(t.getCode());
    }




    public void configure() {
        super.configure(TypeAbsence.class,TypeAbsenceHistory.class, TypeAbsenceHistoryCriteria.class, TypeAbsenceSpecification.class);
    }


    public TypeAbsenceAdminServiceImpl(TypeAbsenceDao dao, TypeAbsenceHistoryDao historyDao) {
        super(dao, historyDao);
    }

}