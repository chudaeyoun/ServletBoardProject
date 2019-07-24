package com.multicampus.controller.board;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.multicampus.biz.board.BoardDAO;
import com.multicampus.biz.board.BoardVO;

public class UpdateBoardServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
//	private String boardEncoding;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 0. 글로벌 파라미터 정보 추출		
//		ServletContext context = getServletContext();
//		boardEncoding = context.getInitParameter("encoding");
//		
//		// 1. 사용자 입력정보(title, seq, content) 추출
//		request.setCharacterEncoding(boardEncoding);
		String title = request.getParameter("title");
		String seq = request.getParameter("seq");
		String content = request.getParameter("content");
		
		// 2. DB 연동 처리
		BoardVO vo = new BoardVO();
		vo.setTitle(title);
		vo.setSeq(Integer.parseInt(seq));
		vo.setContent(content);
		
		BoardDAO boardDAO = new BoardDAO();
		boardDAO.updateBoard(vo);
		
		// 3. 화면 네비게이션
		response.sendRedirect("getBoardList.do");
	}

}




