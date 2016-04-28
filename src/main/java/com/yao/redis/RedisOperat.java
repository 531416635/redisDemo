package com.yao.redis;

import java.util.List;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import redis.clients.jedis.Jedis;

public class RedisOperat {

	private static final Logger log = LoggerFactory.getLogger(RedisOperat.class);

	public static void main(String[] args) {
		// ���ӱ��ص� Redis ����
		Jedis jedis = new Jedis("192.168.1.211", 6379);
		// ��������
		jedis.auth("yaoyuxiao");
		log.info("Connection to server sucessfully");
		// �鿴�����Ƿ�����
		log.error("Server is running: {}" ,jedis.ping());
		/*********  redis���ַ����Ĳ���  ***********/
		// ����redis�ַ�������
		jedis.set("key-1", "value1");
		// ��ȡ�洢������
		// log.info("key1������Ϊ�� "+jedis.get("key1"));
		System.out.println("key-1������Ϊ�� " + jedis.get("key-1"));
		/*********   redis���б�Ĳ���    *************/
		//�洢���б���
		jedis.lpush("key-y","redis11","redis21","redis31");
		//��ȡ�洢���б���������
		List<String> list =jedis.lrange("key-y", 0, 20);
		for(String s:list){
			System.out.println("==="+s);
			/****       ɾ����Ӧ����   ******/
			jedis.lrem("key-y", 3, s);
		}
		/***   ��ȡredis��Ӧ��keyֵ�б�      **/
		
		Set<String> keys= jedis.keys("*");
		for(String s:keys){
			System.out.println("key:"+s);
		}
		
	}
}
