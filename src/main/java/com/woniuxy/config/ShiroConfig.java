package com.woniuxy.config;

import javax.sql.DataSource;
import org.apache.shiro.authc.credential.HashedCredentialsMatcher;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.realm.jdbc.JdbcRealm;
import org.apache.shiro.realm.jdbc.JdbcRealm.SaltStyle;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.alibaba.druid.pool.DruidDataSource;

@Configuration
public class ShiroConfig {
	
	@Bean
	public DataSource ds() {
		DruidDataSource ds=new DruidDataSource();
		ds.setDriverClassName("com.mysql.jdbc.Driver");
		ds.setUrl("jdbc:mysql:///woniuticket?characterEncoding=utf8");
		ds.setUsername("root");
		ds.setPassword("java");
		return  ds;
		
	}

	@Bean
	public HashedCredentialsMatcher hcm() {
		HashedCredentialsMatcher hcm =new HashedCredentialsMatcher();
		hcm.setHashAlgorithmName("md5");
		hcm.setHashIterations(1024);
		return hcm;
	}
	
	
	@Bean
	public JdbcRealm jdbcReallm() {
		JdbcRealm realm =new JdbcRealm();
		realm.setDataSource(ds());
		realm.setAuthenticationQuery("SELECT password,password_salt FROM users WHERE username=?");
		// 根据用户名查询角色
		realm.setUserRolesQuery("SELECT rname FROM users_roles ur INNER JOIN users u ON ur.`uid` = u.`uid` INNER JOIN roles r ON ur.rid = r.rid AND username = ?");
		// 根据角色名查询权限
		realm.setPermissionsQuery("SELECT pname FROM roles_permissions rp INNER JOIN roles r ON rp.`rid` = r.`rid` INNER JOIN permissions p ON rp.`pid` = p.`pid` AND rname = ?");
		realm.setSaltStyle(SaltStyle.COLUMN);
		realm.setCredentialsMatcher(hcm());
		realm.setPermissionsLookupEnabled(true);
		
		return realm;
	}

	@Bean
	public SecurityManager securityManager() {
		DefaultWebSecurityManager securityManager=new DefaultWebSecurityManager();
		securityManager.setRealm(jdbcReallm());
		return securityManager;
	}
	
	@Bean
	public ShiroFilterFactoryBean sf() {
		ShiroFilterFactoryBean sf=new ShiroFilterFactoryBean();
		sf.setSecurityManager(securityManager());
		return sf;
	}
	
}
