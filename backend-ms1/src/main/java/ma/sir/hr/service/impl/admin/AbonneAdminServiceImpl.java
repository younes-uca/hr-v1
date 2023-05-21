package ma.sir.hr.service.impl.admin;

import ma.sir.hr.bean.core.Abonne;
import ma.sir.hr.bean.history.AbonneHistory;
import ma.sir.hr.dao.criteria.core.AbonneCriteria;
import ma.sir.hr.dao.criteria.history.AbonneHistoryCriteria;
import ma.sir.hr.dao.facade.core.AbonneDao;
import ma.sir.hr.dao.facade.history.AbonneHistoryDao;
import ma.sir.hr.dao.specification.core.AbonneSpecification;
import ma.sir.hr.service.facade.admin.AbonneAdminService;
import ma.sir.hr.zynerator.service.AbstractServiceImpl;
import ma.sir.hr.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;






import java.util.List;
@Service
public class AbonneAdminServiceImpl extends AbstractServiceImpl<Abonne,AbonneHistory, AbonneCriteria, AbonneHistoryCriteria, AbonneDao,
AbonneHistoryDao> implements AbonneAdminService {


    public Abonne findByReferenceEntity(Abonne t){
        return  dao.findByCode(t.getCode());
    }




    public void configure() {
        super.configure(Abonne.class,AbonneHistory.class, AbonneHistoryCriteria.class, AbonneSpecification.class);
    }


    public AbonneAdminServiceImpl(AbonneDao dao, AbonneHistoryDao historyDao) {
        super(dao, historyDao);
    }

}