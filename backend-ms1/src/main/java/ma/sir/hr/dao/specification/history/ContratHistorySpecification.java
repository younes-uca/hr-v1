package  ma.sir.hr.dao.specification.history;

import ma.sir.hr.zynerator.specification.AbstractHistorySpecification;
import ma.sir.hr.dao.criteria.history.ContratHistoryCriteria;
import ma.sir.hr.bean.history.ContratHistory;


public class ContratHistorySpecification extends AbstractHistorySpecification<ContratHistoryCriteria, ContratHistory> {

    public ContratHistorySpecification(ContratHistoryCriteria criteria) {
        super(criteria);
    }

    public ContratHistorySpecification(ContratHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
