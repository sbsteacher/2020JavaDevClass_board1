package com.koreait.board;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.koreait.board.dao.BoardDAO;
import com.koreait.board.model.BoardEntity;

@WebServlet("/detail")
public class BoardDetailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String strI_board = request.getParameter("i_board");
		int i_board = Integer.parseInt(strI_board); //클라이언트가 보고싶어하는 글의 pk값!!!!!
		
		System.out.println("i_board : " + strI_board);
				
		BoardEntity param = new BoardEntity();
		param.setI_board(i_board);
		request.setAttribute("data", BoardDAO.selBoard(param));
		
		
		String jsp = "/WEB-INF/jsp/detail.jsp";
		request.getRequestDispatcher(jsp).forward(request, response);
	}

}




