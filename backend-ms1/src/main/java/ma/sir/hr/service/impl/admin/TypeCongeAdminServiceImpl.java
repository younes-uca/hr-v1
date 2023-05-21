package ma.sir.hr.service.impl.admin;

import ma.sir.hr.bean.core.TypeConge;
import ma.sir.hr.bean.history.TypeCongeHistory;
import ma.sir.hr.dao.criteria.core.TypeCongeCriteria;
import ma.sir.hr.dao.criteria.history.TypeCongeHistoryCriteria;
import ma.sir.hr.dao.facade.core.TypeCongeDao;
import ma.sir.hr.dao.facade.history.TypeCongeHistoryDao;
import ma.sir.hr.dao.specification.core.TypeCongeSpecification;
import ma.sir.hr.service.facade.admin.TypeCongeAdminService;
import ma.sir.hr.zynerator.service.AbstractServiceImpl;
import ma.sir.hr.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;






import java.util.List;
@Service
public class TypeCongeAdminServiceImpl extends AbstractServiceImpl<TypeConge,TypeCongeHistory, TypeCongeCriteria, TypeCongeHistoryCriteria, TypeCongeDao,
TypeCongeHistoryDao> implements TypeCongeAdminService {


    public TypeConge findByReferenceEntity(TypeConge t){
        return  dao.findByCode(t.getCode());
    }




    public void configure() {
        super.configure(TypeConge.class,TypeCongeHistory.class, TypeCongeHistoryCriteria.class, TypeCongeSpecification.class);
    }


    public TypeCongeAdminServiceImpl(TypeCongeDao dao, TypeCongeHistoryDao historyDao) {
        super(dao, historyDao);
    }

}