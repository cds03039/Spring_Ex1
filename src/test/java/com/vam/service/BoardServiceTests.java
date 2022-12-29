package com.vam.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.vam.mapper.BoardMapperTests;



@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class BoardServiceTests {
	
	
	private static final Logger log = LoggerFactory.getLogger(BoardMapperTests.class);
	
	@Autowired
	private BoardService service;
	
	
	/*@Test
	public void testEnroll() {
		BoardVO vo = new BoardVO();
		
		vo.setTitle("두번째 테스트");
		vo.setContent("mapper test");
		vo.setWriter("mapper test");
		
		service.enroll(vo);
		
	}*/
	
	
	
	@Test
	public void testGetPage() {
		int bno = 8;
		
		log.info(""+ service.getPage(bno));
		
	}
	
	

}
