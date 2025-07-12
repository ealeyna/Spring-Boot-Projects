package com.eylulaleynasahin.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eylulaleynasahin.controller.IRestPersonelController;
import com.eylulaleynasahin.dto.DtoPersonel;
import com.eylulaleynasahin.model.Personel;
import com.eylulaleynasahin.service.IPersonelService;
import com.eylulaleynasahin.utils.RestPageableEntity;
import com.eylulaleynasahin.utils.RestPageableRequest;
import com.eylulaleynasahin.utils.RestRootEntity;

@RestController
@RequestMapping("/rest/api/personel")
public class RestPersonelControllerImpl extends RestBaseController implements IRestPersonelController{

	@Autowired
	private IPersonelService personelService;

	@GetMapping("/list/pageable")
	@Override
	public RestRootEntity<RestPageableEntity<DtoPersonel>> findAllPageable(RestPageableRequest pageable) {
		Page<Personel> page = personelService.findAllPageable(toPageable(pageable));
		RestPageableEntity<DtoPersonel> pageableReponse = toPageableReponse(page, personelService.toDTOList(page.getContent()));
		return ok(pageableReponse);
	}
}



