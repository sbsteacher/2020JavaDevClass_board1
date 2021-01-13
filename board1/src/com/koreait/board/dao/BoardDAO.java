package com.koreait.board.dao;

import java.sql.*;
import java.util.*;
import com.koreait.board.model.*;

public class BoardDAO {
	public static void insBoard(BoardEntity vo) {		
		Connection con = null;
		PreparedStatement ps = null;
		
		String sql = "INSERT INTO t_board"
				+ " (title, ctnt)"
				+ " VALUES"
				+ " (?, ?)";
		try {
			con = DbUtils.getCon();
			ps = con.prepareStatement(sql);
			ps.setString(1, vo.getTitle());
			ps.setString(2, vo.getCtnt());
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DbUtils.close(con, ps);
		}
	}
	
	public static List<BoardEntity> selBoardList() {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = "SELECT i_board, title, r_dt FROM t_board";		
		try {
			con = DbUtils.getCon();
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			List<BoardEntity> list = new ArrayList<>();
			while(rs.next()) {
				BoardEntity vo = new BoardEntity();
				vo.setI_board(rs.getInt("i_board"));
				vo.setTitle(rs.getString("title"));
				vo.setR_dt(rs.getString("r_dt"));
				list.add(vo);
			}
			return list;
		} catch (Exception e) {			
			e.printStackTrace();
		} finally {
			DbUtils.close(con, ps, rs);
		}		
		return null;
	}
}










