package com.yao.redis;

import java.util.List;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import redis.clients.jedis.Jedis;

public class RedisOperat {

	private static final Logger log = LoggerFactory.getLogger(RedisOperat.class);

	public static void main(String[] args) {
		// 连接本地的 Redis 服务
		Jedis jedis = new Jedis("192.168.1.211", 6379);
		// 连接密码
		jedis.auth("yaoyuxiao");
		log.info("Connection to server sucessfully");
		// 查看服务是否运行
		log.error("Server is running: {}" ,jedis.ping());
		/*********  redis对字符串的操作  ***********/
		// 设置redis字符串数据
		jedis.set("key-1", "value1");
		// 获取存储的数据
		// log.info("key1的数据为： "+jedis.get("key1"));
		System.out.println("key-1的数据为： " + jedis.get("key-1"));
		/*********   redis对列表的操作    *************/
		//存储到列表中
		jedis.lpush("key-y","redis11","redis21","redis31");
		//获取存储到列表的数据输出
		List<String> list =jedis.lrange("key-y", 0, 20);
		for(String s:list){
			System.out.println("==="+s);
			/****       删除对应数据   ******/
			jedis.lrem("key-y", 3, s);
		}
		/***   获取redis对应的key值列表      **/
		
		Set<String> keys= jedis.keys("*");
		for(String s:keys){
			System.out.println("key:"+s);
		}
		
	}
}
