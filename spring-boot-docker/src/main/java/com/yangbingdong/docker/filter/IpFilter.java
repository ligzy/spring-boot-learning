package com.yangbingdong.docker.filter;

import com.yangbingdong.docker.domain.core.root.AccessLog;
import com.yangbingdong.springboot.common.utils.IpUtil;
import org.slf4j.MDC;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author ybd
 * @date 18-4-8
 * @contact yangbingdong1994@gmail.com
 */
public class IpFilter extends OncePerRequestFilter {
	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
		try {
			String ipAddr = IpUtil.realIp(request);
			MDC.put("IP", ipAddr);
			request.setAttribute(AccessLog.IP, ipAddr);
			filterChain.doFilter(request, response);
		} finally {
			MDC.clear();
		}
	}
}
