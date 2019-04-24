package com.home.zuul.filters;

import com.netflix.zuul.ZuulFilter;

public class RouteFilter extends ZuulFilter{

	@Override
	public Object run() {
		System.out.println("using route filter");
		return null;
	}

	@Override
	public boolean shouldFilter() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public int filterOrder() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String filterType() {
		// TODO Auto-generated method stub
		return "route";
	}

}
