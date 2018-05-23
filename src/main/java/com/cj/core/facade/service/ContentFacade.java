package com.cj.core.facade.service;

import java.util.List;

import com.cj.common.pojo.TaotaoResult;
import com.cj.core.pojo.TbContent;

public interface ContentFacade {
	
	List<TbContent> getContentList(Long cid);
	//同步缓存数据.
	TaotaoResult syncContent(Long cid);
}	
