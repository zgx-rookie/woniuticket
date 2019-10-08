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
		ds.setUrl("jdbc:mysql:///woniuticket");
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
		realm.setAuthenticationQuery("select password,usalt from user where username=?");
		realm.setUserRolesQuery("select rname from user_role...");
		realm.setPermissionsQuery("select pname from role_permission...");
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
