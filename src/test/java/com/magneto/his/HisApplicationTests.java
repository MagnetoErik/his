package com.magneto.his;

import com.magneto.his.domain.YY_BRXX;
import com.magneto.his.mapper.MZGHMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HisApplicationTests {

    @Autowired
    private MZGHMapper mapper;

	@Test
	public void contextLoads() {
	    for (int i = 1001;i<1500;i++){
            mapper.insert(new YY_BRXX(1,"测试病人"+i,"女","14236521496",""));
        }

	}

}
