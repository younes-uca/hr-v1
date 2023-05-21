package  ma.sir.hr.dao.specification.history;

import ma.sir.hr.zynerator.specification.AbstractHistorySpecification;
import ma.sir.hr.dao.criteria.history.UniteAdministrativeHistoryCriteria;
import ma.sir.hr.bean.history.UniteAdministrativeHistory;


public class UniteAdministrativeHistorySpecification extends AbstractHistorySpecification<UniteAdministrativeHistoryCriteria, UniteAdministrativeHistory> {

    public UniteAdministrativeHistorySpecification(UniteAdministrativeHistoryCriteria criteria) {
        super(criteria);
    }

    public UniteAdministrativeHistorySpecification(UniteAdministrativeHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
