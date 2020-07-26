package com.zachary.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.matchers.JUnitMatchers;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.servlet.view.InternalResourceView;

import com.zachary.data.SpittleRepository;
import com.zachary.data.impl.SpittleRepositoryImpl;
import com.zachary.vo.SpittleVO;

class SpittleControllerTest {

	@Test
	void testSpittlesPage() throws Exception {
		List<SpittleVO> expectedSpittles = createSpittleList(20);
		SpittleRepository mockRepository = new SpittleRepositoryImpl();
		// Mockito.when(expectedSpittles).thenReturn(expectedSpittles);
		
		SpittleController controller = new SpittleController(mockRepository);
		
		// 创建MockMvc
		MockMvc mockMvc = MockMvcBuilders
				.standaloneSetup(controller)
				.setSingleView(new InternalResourceView("/WEB-INF/views/spittles.jsp")).build();
		
		// 调用get方法 校验视图名称和传递的数据模型
		mockMvc.perform(MockMvcRequestBuilders.get("/spittles"))
				.andExpect(MockMvcResultMatchers.view().name("spittles"))
				.andExpect(MockMvcResultMatchers.model().attributeExists("spittleList"))
				.andExpect(MockMvcResultMatchers.model().attribute("spittleList", JUnitMatchers.hasItem(expectedSpittles.toArray())));
	}

	private List<SpittleVO> createSpittleList(int count){
		List<SpittleVO> spittles = new ArrayList<SpittleVO>();
		for (int i = 0; i < count; i++) {
			spittles.add(new SpittleVO("Spittle" + i, new Date()));
		}
		return spittles;
	}
}
