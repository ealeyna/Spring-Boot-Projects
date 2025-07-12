package com.eylulaleynasahin.controller;

import com.eylulaleynasahin.dto.DtoPersonel;
import com.eylulaleynasahin.utils.RestPageableEntity;
import com.eylulaleynasahin.utils.RestPageableRequest;
import com.eylulaleynasahin.utils.RestRootEntity;

public interface IRestPersonelController {

	public RestRootEntity<RestPageableEntity<DtoPersonel>> findAllPageable(RestPageableRequest pageable);
}
