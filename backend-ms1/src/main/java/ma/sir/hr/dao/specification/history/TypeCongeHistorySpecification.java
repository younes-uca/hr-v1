package  ma.sir.hr.dao.specification.history;

import ma.sir.hr.zynerator.specification.AbstractHistorySpecification;
import ma.sir.hr.dao.criteria.history.TypeCongeHistoryCriteria;
import ma.sir.hr.bean.history.TypeCongeHistory;


public class TypeCongeHistorySpecification extends AbstractHistorySpecification<TypeCongeHistoryCriteria, TypeCongeHistory> {

    public TypeCongeHistorySpecification(TypeCongeHistoryCriteria criteria) {
        super(criteria);
    }

    public TypeCongeHistorySpecification(TypeCongeHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
