package com.vam.mapper;



import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.vam.model.BoardVO;
import com.vam.service.BoardService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class BoardMapperTests {

	
	private static final Logger log = LoggerFactory.getLogger(BoardMapperTests.class);
	
	@Autowired
	private BoardMapper mapper;
	
	@Autowired
	private BoardService service;
	
	@Test
	public void testEnroll() {
		BoardVO vo = new BoardVO();
		
		vo.setTitle("mapper test");
		vo.setContent("mapper test");
		vo.setWriter("mapper test");
		
		mapper.enroll(vo);
		
	}
	
	//모든 글 조회
	@Test
	public void testGetList() {
		
		service.getList().forEach(board -> log.info(""+board));
	}
	
	//게시판 넘버별 조회
	@Test
	public void testGetPage() {
		
		int bno = 8;
		
		log.info(""+mapper.getPage(bno));
	}
	
}
