package  ma.sir.hr.dao.specification.history;

import ma.sir.hr.zynerator.specification.AbstractHistorySpecification;
import ma.sir.hr.dao.criteria.history.PointageHistoryCriteria;
import ma.sir.hr.bean.history.PointageHistory;


public class PointageHistorySpecification extends AbstractHistorySpecification<PointageHistoryCriteria, PointageHistory> {

    public PointageHistorySpecification(PointageHistoryCriteria criteria) {
        super(criteria);
    }

    public PointageHistorySpecification(PointageHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
