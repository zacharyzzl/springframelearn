package com.zachary.data;

import java.util.List;

import com.zachary.vo.SpittleVO;

public interface SpittleRepository {
	List<SpittleVO> findSpittles(long max, int count);
}
