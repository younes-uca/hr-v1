package ma.sir.hr.service.impl.admin;

import ma.sir.hr.bean.core.UniteAdministrative;
import ma.sir.hr.bean.history.UniteAdministrativeHistory;
import ma.sir.hr.dao.criteria.core.UniteAdministrativeCriteria;
import ma.sir.hr.dao.criteria.history.UniteAdministrativeHistoryCriteria;
import ma.sir.hr.dao.facade.core.UniteAdministrativeDao;
import ma.sir.hr.dao.facade.history.UniteAdministrativeHistoryDao;
import ma.sir.hr.dao.specification.core.UniteAdministrativeSpecification;
import ma.sir.hr.service.facade.admin.UniteAdministrativeAdminService;
import ma.sir.hr.zynerator.service.AbstractServiceImpl;
import ma.sir.hr.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;






import java.util.List;
@Service
public class UniteAdministrativeAdminServiceImpl extends AbstractServiceImpl<UniteAdministrative,UniteAdministrativeHistory, UniteAdministrativeCriteria, UniteAdministrativeHistoryCriteria, UniteAdministrativeDao,
UniteAdministrativeHistoryDao> implements UniteAdministrativeAdminService {


    public UniteAdministrative findByReferenceEntity(UniteAdministrative t){
        return  dao.findByCode(t.getCode());
    }




    public void configure() {
        super.configure(UniteAdministrative.class,UniteAdministrativeHistory.class, UniteAdministrativeHistoryCriteria.class, UniteAdministrativeSpecification.class);
    }


    public UniteAdministrativeAdminServiceImpl(UniteAdministrativeDao dao, UniteAdministrativeHistoryDao historyDao) {
        super(dao, historyDao);
    }

}