package com.cn.controllers;

import org.junit.Test;
import org.springframework.cache.annotation.Cacheable;

@Cacheable(cacheManager="redisCacheManage")
public class LoginController {

	public void loginsave() {
		
	}
	
	@Test
	public void shou() {
		System.out.println("9999");
		System.out.println("9999");
	}
}
