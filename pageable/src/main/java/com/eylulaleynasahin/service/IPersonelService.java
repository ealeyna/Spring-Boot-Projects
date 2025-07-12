package com.eylulaleynasahin.service;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.eylulaleynasahin.dto.DtoPersonel;
import com.eylulaleynasahin.model.Personel;

public interface IPersonelService {
	
	Page<Personel> findAllPageable(Pageable pageable);
	
	List<DtoPersonel> toDTOList(List<Personel> personelList);
}
