package  ma.sir.hr.dao.specification.history;

import ma.sir.hr.zynerator.specification.AbstractHistorySpecification;
import ma.sir.hr.dao.criteria.history.TypeAbsenceHistoryCriteria;
import ma.sir.hr.bean.history.TypeAbsenceHistory;


public class TypeAbsenceHistorySpecification extends AbstractHistorySpecification<TypeAbsenceHistoryCriteria, TypeAbsenceHistory> {

    public TypeAbsenceHistorySpecification(TypeAbsenceHistoryCriteria criteria) {
        super(criteria);
    }

    public TypeAbsenceHistorySpecification(TypeAbsenceHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
