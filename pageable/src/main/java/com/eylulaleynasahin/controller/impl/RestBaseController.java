package com.eylulaleynasahin.controller.impl;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.eylulaleynasahin.utils.PagerUtil;
import com.eylulaleynasahin.utils.RestPageableEntity;
import com.eylulaleynasahin.utils.RestPageableRequest;
import com.eylulaleynasahin.utils.RestRootEntity;

public class RestBaseController {

	public Pageable toPageable(RestPageableRequest request) {
		return PagerUtil.toPageable(request);
	}
	
	public <T> RestPageableEntity<T> toPageableReponse(Page<?> page, List<T> content) {
		return PagerUtil.toPageableResponse(page, content);
	}
	
	public <T> RestRootEntity<T> ok(T payload){
		return RestRootEntity.ok(payload);
	}
}

