package ma.sir.hr.dao.facade.core;

import ma.sir.hr.zynerator.repository.AbstractRepository;
import ma.sir.hr.bean.core.Absence;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface AbsenceDao extends AbstractRepository<Absence,Long>  {

    List<Absence> findByTypeAbsenceId(Long id);
    int deleteByTypeAbsenceId(Long id);
    List<Absence> findByEmployeeId(Long id);
    int deleteByEmployeeId(Long id);

}
