package com.yao.service.imple;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.yao.service.RediService;

import redis.clients.jedis.Jedis;

@Service("rediservice")
public class RediServiceImpl implements RediService{

	private static final Logger log = LoggerFactory.getLogger(RediServiceImpl.class);

	public Jedis getRedisConn() {
		// 连接本地的 Redis 服务
		Jedis jedis = new Jedis("192.168.1.211", 6379);
		// 连接密码
		jedis.auth("yaoyuxiao");
		log.info("Connection to server sucessfully");
		// 查看服务是否运行
		log.info("Server is running: {}", jedis.ping());
		return jedis;

	}
}
