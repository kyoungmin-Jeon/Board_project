package com.board.service;

import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.board.beans.ContentBean;
import com.board.dao.BoardDaoImpl;

@Service
public class MainServiceImpl implements MainService{

	@Autowired
	private BoardDaoImpl boardDao;
	
	public List<ContentBean> getMainList(int board_info_idx) throws Exception{
		RowBounds rowBounds = new RowBounds(0, 5);
		return boardDao.getContentList(board_info_idx, rowBounds);
	}
}











