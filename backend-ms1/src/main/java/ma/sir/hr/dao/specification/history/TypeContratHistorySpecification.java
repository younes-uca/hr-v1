package  ma.sir.hr.dao.specification.history;

import ma.sir.hr.zynerator.specification.AbstractHistorySpecification;
import ma.sir.hr.dao.criteria.history.TypeContratHistoryCriteria;
import ma.sir.hr.bean.history.TypeContratHistory;


public class TypeContratHistorySpecification extends AbstractHistorySpecification<TypeContratHistoryCriteria, TypeContratHistory> {

    public TypeContratHistorySpecification(TypeContratHistoryCriteria criteria) {
        super(criteria);
    }

    public TypeContratHistorySpecification(TypeContratHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
