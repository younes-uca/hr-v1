package  ma.sir.hr.dao.specification.core;

import ma.sir.hr.zynerator.specification.AbstractSpecification;
import ma.sir.hr.dao.criteria.core.CategorieEmployeeCriteria;
import ma.sir.hr.bean.core.CategorieEmployee;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class CategorieEmployeeSpecification extends  AbstractSpecification<CategorieEmployeeCriteria, CategorieEmployee>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("libelle", criteria.getLibelle(),criteria.getLibelleLike());
        addPredicate("code", criteria.getCode(),criteria.getCodeLike());
    }

    public CategorieEmployeeSpecification(CategorieEmployeeCriteria criteria) {
        super(criteria);
    }

    public CategorieEmployeeSpecification(CategorieEmployeeCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
