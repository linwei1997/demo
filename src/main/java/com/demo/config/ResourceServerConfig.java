//package com.demo.config;
//
//import com.fasterxml.jackson.databind.ObjectMapper;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.core.AuthenticationException;
//import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
//import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
//import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer;
//import org.springframework.security.oauth2.provider.token.TokenStore;
//import org.springframework.security.oauth2.provider.token.store.JwtAccessTokenConverter;
//import org.springframework.security.oauth2.provider.token.store.JwtTokenStore;
//import org.springframework.security.web.AuthenticationEntryPoint;
//import org.springframework.web.cors.CorsConfiguration;
//import org.springframework.web.cors.CorsConfigurationSource;
//import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
//
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//import java.util.Arrays;
//import java.util.Date;
//import java.util.HashMap;
//import java.util.Map;
//
//@Configuration
//@EnableResourceServer
//@EnableGlobalMethodSecurity(prePostEnabled = true)
//public class ResourceServerConfig extends ResourceServerConfigurerAdapter {
//	@Bean
//	public TokenStore jwtTokenStore() {
//		return new JwtTokenStore(jwtAccessTokenConverter());
//	}
//
//	@Bean
//	public JwtAccessTokenConverter jwtAccessTokenConverter() {
//		JwtAccessTokenConverter accessTokenConverter = new JwtAccessTokenConverter();
//
//		accessTokenConverter.setSigningKey("dev");
//		accessTokenConverter.setVerifierKey("dev");
//		return accessTokenConverter;
//	}
//
//	@Autowired
//	private TokenStore jwtTokenStore;
//
//	@Override
//	public void configure(ResourceServerSecurityConfigurer resources) throws Exception {
//		resources.tokenStore(jwtTokenStore).authenticationEntryPoint(new AuthenticationEntryPoint() {
//
//			@Override
//			public void commence(HttpServletRequest request, HttpServletResponse response,
//                                 AuthenticationException authException) throws IOException, ServletException {
//				// TODO Auto-generated method stub
//				Map<String, String> map = new HashMap<String, String>();
//				map.put("code", "40001");
//				map.put("message", authException.getMessage());
//				map.put("timestamp", String.valueOf(new Date().getTime()));
//				response.setContentType("application/json");
//				response.setStatus(HttpServletResponse.SC_OK);
//				try {
//					ObjectMapper mapper = new ObjectMapper();
//					mapper.writeValue(response.getOutputStream(), map);
//				} catch (Exception e) {
//					throw new ServletException();
//				}
//			}
//		});
//	}
//
//
//	@Bean
//	public CorsConfigurationSource corsConfigurationSource() {
//		final CorsConfiguration configuration = new CorsConfiguration();
//		configuration.setAllowedOrigins(Arrays.asList("*"));
//		configuration.setAllowedMethods(Arrays.asList("HEAD", "GET", "POST", "PUT", "DELETE", "PATCH"));
//		configuration.setAllowCredentials(true);
//		configuration.setAllowedHeaders(Arrays.asList("*"));
//		final UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
//		source.registerCorsConfiguration("/**", configuration);
//		return source;
//	}
//
//	@Override
//	public void configure(HttpSecurity http) throws Exception {
//		String[] defaltExclude = ("/auth/failed,/auth/post/failed,/db/provider/**,/employeeAccount/**,"
//				+ "/employee/notice/item/read,/logout,/login,/favicon.ico,/log,/account/qrcode/**,/company/rule/preview,"
//				+ "/company/employee/contract/preview,/enum/item/list,/enum/school/list,/enum/profession/get,"
//				+ "/enum/profession/list,/enum/trade/get,/enum/trade/list,/company/apply/examine,/qrcode/**"
//				+ ",/company/employee/batch,/notice/download/file,/register/**,/company/attendance/**/test,"
//				+ "/invitation/**,/force/upgrade/**,/lbm/sr/fileUpload,/enum/new/item/list,/employee/info,/employee/company" +
//				"/staff/**,/instructions/list,/instructions/read")
//				.split(",");
//		http.authorizeRequests().antMatchers(defaltExclude).permitAll().anyRequest().authenticated().and().csrf()
//				.disable().cors();
//	}
//
//}
