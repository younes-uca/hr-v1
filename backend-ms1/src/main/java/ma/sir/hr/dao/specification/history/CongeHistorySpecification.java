package  ma.sir.hr.dao.specification.history;

import ma.sir.hr.zynerator.specification.AbstractHistorySpecification;
import ma.sir.hr.dao.criteria.history.CongeHistoryCriteria;
import ma.sir.hr.bean.history.CongeHistory;


public class CongeHistorySpecification extends AbstractHistorySpecification<CongeHistoryCriteria, CongeHistory> {

    public CongeHistorySpecification(CongeHistoryCriteria criteria) {
        super(criteria);
    }

    public CongeHistorySpecification(CongeHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
