package  ma.sir.hr.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import ma.sir.hr.zynerator.util.StringUtil;
import ma.sir.hr.zynerator.converter.AbstractConverter;
import ma.sir.hr.zynerator.util.DateUtil;
import ma.sir.hr.bean.history.UniteAdministrativeHistory;
import ma.sir.hr.bean.core.UniteAdministrative;
import ma.sir.hr.ws.dto.UniteAdministrativeDto;

@Component
public class UniteAdministrativeConverter extends AbstractConverter<UniteAdministrative, UniteAdministrativeDto, UniteAdministrativeHistory> {


    public  UniteAdministrativeConverter(){
        super(UniteAdministrative.class, UniteAdministrativeDto.class, UniteAdministrativeHistory.class);
    }

    @Override
    public UniteAdministrative toItem(UniteAdministrativeDto dto) {
        if (dto == null) {
            return null;
        } else {
        UniteAdministrative item = new UniteAdministrative();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getLibelle()))
                item.setLibelle(dto.getLibelle());
            if(StringUtil.isNotEmpty(dto.getCode()))
                item.setCode(dto.getCode());


        return item;
        }
    }

    @Override
    public UniteAdministrativeDto toDto(UniteAdministrative item) {
        if (item == null) {
            return null;
        } else {
            UniteAdministrativeDto dto = new UniteAdministrativeDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getLibelle()))
                dto.setLibelle(item.getLibelle());
            if(StringUtil.isNotEmpty(item.getCode()))
                dto.setCode(item.getCode());


        return dto;
        }
    }


    public void initObject(boolean value) {
    }


}
