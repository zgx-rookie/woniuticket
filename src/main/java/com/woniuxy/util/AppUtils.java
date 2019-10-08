package com.woniuxy.util;

import java.util.UUID;

import org.apache.shiro.crypto.hash.SimpleHash;

public class AppUtils {
	public static String encrypt(String source, String salt) {
		SimpleHash sh = new SimpleHash("md5", source, salt, 1024);
		return sh.toHex();
	}
	
	public static String uuid() {
		return UUID.randomUUID().toString().replace("-", "");
	}
}
