package com.comento.service;

import java.util.List;

import javax.inject.Inject;

import com.comento.dao.BoardDAO;
import com.comento.domain.BoardVo;

public class BoardServiceImple implements BoardService {


	@Inject
	  private BoardDAO dao;

	@Override
	public void regist(BoardVo board) throws Exception {
		dao.create(board);
	}

	@Override
	public BoardVo read(Integer bno) throws Exception {
		return dao.read(bno);
	}

	@Override
	public void modify(BoardVo board) throws Exception {
		dao.update(board);
	}

	@Override
	public void remove(Integer bno) throws Exception {
		dao.delete(bno);
	}

	@Override
	public List<BoardVo> listAll() throws Exception {
		return dao.listAll();
	}
}
