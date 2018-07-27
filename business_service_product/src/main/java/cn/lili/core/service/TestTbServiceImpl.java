package cn.lili.core.service;

import cn.lili.core.bean.TestTb;
import cn.lili.core.dao.TestTbDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**测试*/
@Service("testTbService")
public class TestTbServiceImpl implements TestTbService {

	public void insertTestTb(TestTb testTb){
		System.out.println("testing !!!!!!!!!!!!!!!!!!!!!!!!");
	}
}
