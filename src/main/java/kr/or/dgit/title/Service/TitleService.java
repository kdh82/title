package kr.or.dgit.title.Service;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;

import kr.or.dgit.title.dao.TitleMapper;
import kr.or.dgit.title.dao.TitleMapperImpl;
import kr.or.dgit.title.dto.Title;
import kr.or.dgit.title.util.MybatisSqlSessionFactory;

public class TitleService {
	private static final TitleService instance = new TitleService();

	private TitleService() {
	}

	public static TitleService getInstance() {
		return instance;
	}

	private static final Logger logger = Logger.getLogger(TitleService.class);

	public int insertTitle(Title title) {
		try (SqlSession sqlSession = MybatisSqlSessionFactory.openSession()) {
			TitleMapper titleMapper = new TitleMapperImpl(sqlSession);
			int res = titleMapper.insertTitle(title);
			sqlSession.commit();
			return res;
		}
	}

	public int updateTitle(Title title) {
		try (SqlSession sqlSession = MybatisSqlSessionFactory.openSession()) {
			TitleMapper titleMapper = new TitleMapperImpl(sqlSession);
			int res = titleMapper.updateTitle(title);
			return res;
		}
	}

	public int deleteTitle(Title title) {
		try (SqlSession sqlSession = MybatisSqlSessionFactory.openSession()) {
			TitleMapper titleMapper = new TitleMapperImpl(sqlSession);
			int res = titleMapper.deleteTitle(title);
			sqlSession.commit();
			return res;
		}
	}
}
