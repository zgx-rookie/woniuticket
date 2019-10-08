package com.woniuxy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniuxy.dao.RoomMapper;
import com.woniuxy.domain.Page;
import com.woniuxy.domain.Room;
import com.woniuxy.service.IRoomService;

@Service
@Transactional
public class RoomServiceImpl implements IRoomService {

	@Autowired
	private RoomMapper mapper;
	
	
	@Override
	public void save(Room room) {
		mapper.save(room);
	}

	@Override
	public void delete(Integer rid) {
		mapper.deleteByPrimaryKey(rid);
	}

	@Override
	public void update(Room room) {
		mapper.updateByPrimaryKeySelective(room);
	}

	@Override
	public void findOne(Integer rid) {
		mapper.selectByPrimaryKey(rid);
	}

	@Override
	public List<Room> findAll() {
		return mapper.selectByExample(null);
	}

	
	@Override
	public Page findByPage(int startLine, int size) {

		int rowCount=mapper.selectCount();
		Page page=new Page(startLine, rowCount, size);
		List<Room> findBySize =mapper.findBySize(page.getStartLine(), page.getSize());
		for (Room room : findBySize) {
			System.out.println(room);
		}
		page.setList(findBySize);
		
		
		return page;
	}
	

}
