package com.cj.core.facade.search;

import com.cj.core.pojo.SearchResult;

/**
 * 搜索服务的service
 * 2018/5/17
 * @author cj
 */
public interface SearchFacade {

    SearchResult search(String queryString, int page, int rows) throws Exception ;
}
