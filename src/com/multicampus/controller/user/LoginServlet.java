package com.multicampus.controller.user;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.multicampus.biz.user.UserDAO;
import com.multicampus.biz.user.UserVO;

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("===> LoginServlet 실행");
		// 1. 사용자 입력정보(id, password) 추출
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		
		// 2. DB 연동 처리
		UserVO vo = new UserVO();
		vo.setId(id);
		vo.setPassword(password);
		
		UserDAO userDAO = new UserDAO();
		UserVO user = userDAO.getUser(vo);
		 
		// 3. 화면 네비게이션
		if(user != null) {
			response.sendRedirect("getBoardList.do");
		} else {
			response.sendRedirect("login.html");
		}
	}

}










