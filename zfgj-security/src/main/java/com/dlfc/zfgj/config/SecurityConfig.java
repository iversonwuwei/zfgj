package com.dlfc.zfgj.config;

import com.dlfc.admin.common.security.shiro.cache.JedisCacheManager;
import com.dlfc.admin.common.security.shiro.session.JedisSessionDAO;
import com.dlfc.admin.common.utils.IdGen;
import org.apache.shiro.cas.CasRealm;
import org.apache.shiro.spring.LifecycleBeanPostProcessor;
import org.apache.shiro.spring.security.interceptor.AuthorizationAttributeSourceAdvisor;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.apache.shiro.web.servlet.SimpleCookie;
import org.apache.shiro.web.session.mgt.DefaultWebSessionManager;
import org.springframework.aop.framework.autoproxy.DefaultAdvisorAutoProxyCreator;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.HashMap;

/**
 * Created by walden on 2017/2/20.
 */
@Configuration
@Profile("dev-security")
public class SecurityConfig {

    @Value("${cas.server.url}")
    private String casServerUrl;

    @Value("${cas.project.url}")
    private String casProjectUrl;

    @Value("${admin.path}")
    private String adminPath;

    @Value("${session.sessionTimeout}")
    private Long  sessionTimeOut;

    @Value("${session.sessionTimeoutClean}")
    private Long sessionTimeOutClean;

    @Value("${redis.keyPrefix}")
    private String  keyPrefix;


    @Bean
    public ShiroFilterFactoryBean shiroFilterFactoryBean(){
        ShiroFilterFactoryBean shiroFilterFactoryBean = new ShiroFilterFactoryBean();
        shiroFilterFactoryBean.setSecurityManager(securityManager());
        shiroFilterFactoryBean.setFilters(new HashMap<>());
        shiroFilterFactoryBean.setFilterChainDefinitionMap(new HashMap<>());
        return shiroFilterFactoryBean;
    }

    @Bean
    public DefaultWebSecurityManager securityManager(){
        DefaultWebSecurityManager defaultWebSecurityManager = new DefaultWebSecurityManager();
        defaultWebSecurityManager.setSessionManager(sessionManager());
        defaultWebSecurityManager.setCacheManager(jedisCacheManager());
        defaultWebSecurityManager.setRealm(casRealm());

        return defaultWebSecurityManager;
    }

    @Bean
    public CasRealm casRealm(){
        CasRealm casRealm = new CasRealm();
        casRealm.setCasService(casProjectUrl+adminPath+"/cas");
        casRealm.setDefaultRoles("ROLE_USER");
        casRealm.setCasServerUrlPrefix(casServerUrl);
        return casRealm;
    }

    @Bean
    public DefaultWebSessionManager sessionManager(){
        DefaultWebSessionManager sessionManager = new DefaultWebSessionManager();
        sessionManager.setGlobalSessionTimeout(sessionTimeOut);
        sessionManager.setSessionDAO(jedisSessionDAO());
        sessionManager.setSessionValidationInterval(sessionTimeOutClean);
        sessionManager.setSessionValidationSchedulerEnabled(true);
        sessionManager.setSessionIdCookie(simpleCookie());
        sessionManager.setSessionIdCookieEnabled(true);
        return sessionManager;
    }

    @Bean
    public JedisSessionDAO jedisSessionDAO(){
        JedisSessionDAO jedisSessionDAO = new JedisSessionDAO();
        jedisSessionDAO.setSessionKeyPrefix(keyPrefix+"_session_");
        jedisSessionDAO.setSessionIdGenerator(idGen());
        return jedisSessionDAO;
    }

    @Bean
    public IdGen idGen(){
        IdGen idGen = new IdGen();
        return idGen;
    }

    @Bean
    public SimpleCookie simpleCookie(){
        SimpleCookie simpleCookie = new SimpleCookie();
        simpleCookie.setName("dlfc.session.id");
        return simpleCookie;
    }

    @Bean
    public JedisCacheManager jedisCacheManager(){
        JedisCacheManager jedisCacheManager = new JedisCacheManager();
        return jedisCacheManager;
    }

    @Bean
    public LifecycleBeanPostProcessor lifecycleBeanPostProcessor(){
        LifecycleBeanPostProcessor lifecycleBeanPostProcessor = new LifecycleBeanPostProcessor();
        return lifecycleBeanPostProcessor;
    }

    @Bean
    public DefaultAdvisorAutoProxyCreator defaultAdvisorAutoProxyCreator(){
        DefaultAdvisorAutoProxyCreator defaultAdvisorAutoProxyCreator = new DefaultAdvisorAutoProxyCreator();
        defaultAdvisorAutoProxyCreator.setProxyTargetClass(true);
        return defaultAdvisorAutoProxyCreator;
    }

    @Bean
    public AuthorizationAttributeSourceAdvisor authorizationAttributeSourceAdvisor(){
        AuthorizationAttributeSourceAdvisor authorizationAttributeSourceAdvisor = new AuthorizationAttributeSourceAdvisor();
        authorizationAttributeSourceAdvisor.setSecurityManager(securityManager());
        return authorizationAttributeSourceAdvisor;
    }
}
