package kr.or.dgit.title.dao;

import java.util.List;

import kr.or.dgit.title.dto.Title;

public interface TitleMapper {

	int insertTitle(Title title);
	int updateTitle(Title title);
	int deleteTitle(Title title);
	
	int selectTitleByAllCnt();
	List<Title> selectTitleByOne(Title title);
}
