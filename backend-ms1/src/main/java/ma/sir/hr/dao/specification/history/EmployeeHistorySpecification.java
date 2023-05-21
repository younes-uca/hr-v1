package  ma.sir.hr.dao.specification.history;

import ma.sir.hr.zynerator.specification.AbstractHistorySpecification;
import ma.sir.hr.dao.criteria.history.EmployeeHistoryCriteria;
import ma.sir.hr.bean.history.EmployeeHistory;


public class EmployeeHistorySpecification extends AbstractHistorySpecification<EmployeeHistoryCriteria, EmployeeHistory> {

    public EmployeeHistorySpecification(EmployeeHistoryCriteria criteria) {
        super(criteria);
    }

    public EmployeeHistorySpecification(EmployeeHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
