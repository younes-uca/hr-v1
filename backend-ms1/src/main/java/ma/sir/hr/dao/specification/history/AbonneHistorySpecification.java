package  ma.sir.hr.dao.specification.history;

import ma.sir.hr.zynerator.specification.AbstractHistorySpecification;
import ma.sir.hr.dao.criteria.history.AbonneHistoryCriteria;
import ma.sir.hr.bean.history.AbonneHistory;


public class AbonneHistorySpecification extends AbstractHistorySpecification<AbonneHistoryCriteria, AbonneHistory> {

    public AbonneHistorySpecification(AbonneHistoryCriteria criteria) {
        super(criteria);
    }

    public AbonneHistorySpecification(AbonneHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
