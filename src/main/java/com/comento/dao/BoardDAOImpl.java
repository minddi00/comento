package com.comento.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;

import com.comento.domain.BoardVo;

@Repository
public class BoardDAOImpl  implements BoardDAO {

	@Inject
	private SqlSession session;
	private static String namespace = "com.myp.mapper.BoardMapper";

	@Bean
	public SqlSession sqlSession() {
		return session;
	    // SqlSession을 생성하고 반환하는 코드를 작성하세요.
	}


	@Override
	public void create(BoardVo vo) throws Exception {
		session.insert(namespace+".create", vo);
	}

	@Override
	public BoardVo read(Integer bno) throws Exception {
		return session.selectOne(namespace + ".read", bno);
	}



	@Override
	public void update(BoardVo vo) throws Exception {
		session.update(namespace+".update", vo);
	}



	@Override
	public void delete(Integer bno) throws Exception {
		session.delete(namespace+".delete", bno);
	}

	@Override
	public List<BoardVo> listAll() throws Exception {
		return session.selectList(namespace + ".listAll");
	}
}