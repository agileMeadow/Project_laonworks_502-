package com.laonworks.toyboard.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Pagination {
	private int page;
	private int pageLimit;
	private int totalPost;
	private int startPost;
	private int endPost;
	private int startPage;
	private int endPage;
	
	public Pagination() {
		pageLimit = 10;
	}
	public Pagination(int totalPost) {
		page = 1;
		pageLimit = 10;
		totalPost = (totalPost%pageLimit == 0)? totalPost/pageLimit:(totalPost/pageLimit) +1;
		startPost = totalPost - ((page-1) * pageLimit);
		endPost = (startPost > 10)? startPost - pageLimit + 1 : 1;
		startPage = ((page-1)/5)* 5 + 1;
		endPage = (startPage + 4 > totalPost) ? totalPost : startPage + 4;
	}
	public Pagination(int page, int totalPost) {
		this.page = page;
		pageLimit = 10;
		totalPost = (totalPost%pageLimit == 0)? totalPost/pageLimit:(totalPost/pageLimit) +1;
		startPost = totalPost - ((page-1) * pageLimit);
		endPost = (startPost > 10)? startPost - pageLimit + 1 : 1;
		startPage = ((page-1)/5)* 5 + 1;
		endPage = (startPage + 4 > totalPost) ? totalPost : startPage + 4;
	}

}
