package com.at.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootCacheApplicationTests {
	@Autowired
	StringRedisTemplate stringRedisTemplate;
	@Autowired
	RedisTemplate redisTemplate;
	@Test
	public void contextLoads() {
		//给 redis 保存数据
		stringRedisTemplate.opsForValue().set("msg","hello");//操作字符串
		System.out.println("hello world");
		System.out.println(stringRedisTemplate.opsForValue().get("msg"));//操作字符串
//		stringRedisTemplate.opsForHash();//操作字符串
//		stringRedisTemplate.opsForList();//操作字符串
//		stringRedisTemplate.opsForSet();//操作集合
//		stringRedisTemplate.opsForZSet();//有序集合

	}

}
