package com.gn.mvc;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CustomInterceptor implements HandlerInterceptor{

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		System.out.println("========== 요청 들어온 순간 ==========");
		
		boolean result = true;
		
		String url = request.getRequestURI();
		String method = request.getMethod();
		
		System.out.println("url : "+url);
		System.out.println("메소드 : "+method);
		
		// 만일 특정 조건을 충족하지못하면 false
		if(1 == 1) {
			response.sendError(403);
		}
		
		return result;
		
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		System.out.println("========== 들어온 요청 처리 후 응답 반환 ==========");
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		System.out.println("========== 반환된 정보 View까지 전달 ==========");
	}

	
}
