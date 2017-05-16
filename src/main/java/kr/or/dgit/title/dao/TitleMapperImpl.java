package kr.or.dgit.title.dao;

import java.util.List;

import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.apache.ibatis.session.SqlSession;

import kr.or.dgit.title.dto.Title;

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
		log.debug("updateTitle()");
		return sqlSession.update(namespace+"updateTitle", title);
	}

	@Override
	public int deleteTitle(Title title) {
		log.debug("deleteTitle()");
		return sqlSession.delete(namespace+"deleteTitle", title);
	}

	@Override
	public int selectTitleByAllCnt() {
		log.debug("selectTitleByAllCnt()");
		return sqlSession.selectOne(namespace+"selectTitleByAllCnt");
	}

	@Override
	public List<Title> selectTitleByOne(Title title) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
