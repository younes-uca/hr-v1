package ma.sir.hr.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.hr.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "employee")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="employee_seq",sequenceName="employee_seq",allocationSize=1, initialValue = 1)
public class EmployeeHistory extends HistBusinessObject  {


    public EmployeeHistory() {
    super();
    }

    public EmployeeHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="employee_seq")
    public Long getId() {
    return id;
    }
}

