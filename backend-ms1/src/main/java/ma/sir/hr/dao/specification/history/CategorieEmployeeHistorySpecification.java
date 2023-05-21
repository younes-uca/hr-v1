package  ma.sir.hr.dao.specification.history;

import ma.sir.hr.zynerator.specification.AbstractHistorySpecification;
import ma.sir.hr.dao.criteria.history.CategorieEmployeeHistoryCriteria;
import ma.sir.hr.bean.history.CategorieEmployeeHistory;


public class CategorieEmployeeHistorySpecification extends AbstractHistorySpecification<CategorieEmployeeHistoryCriteria, CategorieEmployeeHistory> {

    public CategorieEmployeeHistorySpecification(CategorieEmployeeHistoryCriteria criteria) {
        super(criteria);
    }

    public CategorieEmployeeHistorySpecification(CategorieEmployeeHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
