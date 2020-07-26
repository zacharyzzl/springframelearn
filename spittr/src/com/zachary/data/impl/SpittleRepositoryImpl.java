package com.zachary.data.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

import com.zachary.data.SpittleRepository;
import com.zachary.vo.SpittleVO;

@Component
public class SpittleRepositoryImpl implements SpittleRepository {

	@Override
	public List<SpittleVO> findSpittles(long max, int count) {
		List<SpittleVO> spittles = new ArrayList<SpittleVO>();
		for (int i = 0; i < count; i++) {
			spittles.add(new SpittleVO("Spittle" + i, new Date()));
		}
		return spittles;
	}

}
