package com.eylulaleynasahin.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.eylulaleynasahin.dto.DtoDepartment;
import com.eylulaleynasahin.dto.DtoPersonel;
import com.eylulaleynasahin.model.Personel;
import com.eylulaleynasahin.repository.PersonelRepository;
import com.eylulaleynasahin.service.IPersonelService;

@Service
public class PersonelServiceImpl implements IPersonelService{

	@Autowired
	private PersonelRepository personelRepository;
	
	@Override
	public Page<Personel> findAllPageable(Pageable pageable) {
		 Page<Personel> page = personelRepository.findAllPageable(pageable); 
		 return page;
	}

	@Override
	public List<DtoPersonel> toDTOList(List<Personel> personelList) {
		List<DtoPersonel> dtoList = new ArrayList<>();
		for (Personel personel : personelList) {
			DtoPersonel dtoPersonel = new DtoPersonel();
			DtoDepartment dtoDepartment = new DtoDepartment();
			BeanUtils.copyProperties(personel, dtoPersonel);
			BeanUtils.copyProperties(personel.getDepartment(), dtoDepartment);
			
			dtoPersonel.setDepartment(dtoDepartment);
			dtoList.add(dtoPersonel);
		}
		return dtoList;
	}
}
