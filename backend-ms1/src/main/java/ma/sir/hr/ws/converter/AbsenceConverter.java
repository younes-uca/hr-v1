package  ma.sir.hr.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ma.sir.hr.bean.core.Employee;

import ma.sir.hr.zynerator.util.StringUtil;
import ma.sir.hr.zynerator.converter.AbstractConverter;
import ma.sir.hr.zynerator.util.DateUtil;
import ma.sir.hr.bean.history.AbsenceHistory;
import ma.sir.hr.bean.core.Absence;
import ma.sir.hr.ws.dto.AbsenceDto;

@Component
public class AbsenceConverter extends AbstractConverter<Absence, AbsenceDto, AbsenceHistory> {

    @Autowired
    private EmployeeConverter employeeConverter ;
    @Autowired
    private TypeAbsenceConverter typeAbsenceConverter ;
    private boolean typeAbsence;
    private boolean employee;

    public  AbsenceConverter(){
        super(Absence.class, AbsenceDto.class, AbsenceHistory.class);
    }

    @Override
    public Absence toItem(AbsenceDto dto) {
        if (dto == null) {
            return null;
        } else {
        Absence item = new Absence();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getDateDebut()))
                item.setDateDebut(DateUtil.stringEnToDate(dto.getDateDebut()));
            if(StringUtil.isNotEmpty(dto.getDateFinA()))
                item.setDateFinA(DateUtil.stringEnToDate(dto.getDateFinA()));
            if(StringUtil.isNotEmpty(dto.getDescription()))
                item.setDescription(dto.getDescription());
            if(this.typeAbsence && dto.getTypeAbsence()!=null)
                item.setTypeAbsence(typeAbsenceConverter.toItem(dto.getTypeAbsence())) ;

            if(dto.getEmployee() != null && dto.getEmployee().getId() != null){
                item.setEmployee(new Employee());
                item.getEmployee().setId(dto.getEmployee().getId());
            }



        return item;
        }
    }

    @Override
    public AbsenceDto toDto(Absence item) {
        if (item == null) {
            return null;
        } else {
            AbsenceDto dto = new AbsenceDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(item.getDateDebut()!=null)
                dto.setDateDebut(DateUtil.dateTimeToString(item.getDateDebut()));
            if(item.getDateFinA()!=null)
                dto.setDateFinA(DateUtil.dateTimeToString(item.getDateFinA()));
            if(StringUtil.isNotEmpty(item.getDescription()))
                dto.setDescription(item.getDescription());
        if(this.typeAbsence && item.getTypeAbsence()!=null) {
            dto.setTypeAbsence(typeAbsenceConverter.toDto(item.getTypeAbsence())) ;
        }
        if(this.employee && item.getEmployee()!=null) {
            dto.setEmployee(employeeConverter.toDto(item.getEmployee())) ;
        }


        return dto;
        }
    }


    public void initObject(boolean value) {
        this.typeAbsence = value;
        this.employee = value;
    }


    public EmployeeConverter getEmployeeConverter(){
        return this.employeeConverter;
    }
    public void setEmployeeConverter(EmployeeConverter employeeConverter ){
        this.employeeConverter = employeeConverter;
    }
    public TypeAbsenceConverter getTypeAbsenceConverter(){
        return this.typeAbsenceConverter;
    }
    public void setTypeAbsenceConverter(TypeAbsenceConverter typeAbsenceConverter ){
        this.typeAbsenceConverter = typeAbsenceConverter;
    }
    public boolean  isTypeAbsence(){
        return this.typeAbsence;
    }
    public void  setTypeAbsence(boolean typeAbsence){
        this.typeAbsence = typeAbsence;
    }
    public boolean  isEmployee(){
        return this.employee;
    }
    public void  setEmployee(boolean employee){
        this.employee = employee;
    }
}
