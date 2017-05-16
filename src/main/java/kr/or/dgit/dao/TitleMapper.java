package kr.or.dgit.dao;

import java.util.List;

import kr.or.dgit.dto.Title;

public interface TitleMapper {

	int insertTitle(Title title);
	int updateTitle(Title title);
	int deleteTitle(Title title);
	
	int selectTitleByAllCnt();
	List<Title> selectTitleByOne(Title title);
}
