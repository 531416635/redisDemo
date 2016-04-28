package com.yao.service;

import redis.clients.jedis.Jedis;

public interface RediService {
	
	public Jedis getRedisConn() ;

}
