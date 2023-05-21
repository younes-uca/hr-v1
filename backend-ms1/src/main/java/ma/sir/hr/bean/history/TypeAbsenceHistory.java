package ma.sir.hr.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.hr.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "type_absence")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="type_absence_seq",sequenceName="type_absence_seq",allocationSize=1, initialValue = 1)
public class TypeAbsenceHistory extends HistBusinessObject  {


    public TypeAbsenceHistory() {
    super();
    }

    public TypeAbsenceHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="type_absence_seq")
    public Long getId() {
    return id;
    }
}

