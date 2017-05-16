package kr.or.dgit.dao;

import java.util.List;

import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.apache.ibatis.session.SqlSession;

import kr.or.dgit.dto.Title;

public class TitleMapperImpl implements TitleMapper {
	private String namespace = "kr.or.dgit.dao.Mapper";
	private static final Log log = LogFactory.getLog(TitleMapperImpl.class);
	private SqlSession sqlSession;
	
	public TitleMapperImpl(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

	@Override
	public int insertTitle(Title title) {
		log.debug("insertTitle()");
		return sqlSession.insert(namespace+"insertTitle", title);
	}

	@Override
	public int updateTitle(Title title) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteTitle(Title title) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int selectTitleByAllCnt() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Title> selectTitleByOne(Title title) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
