package cn.springmvc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.springmvc.dao.BookDao;
import cn.springmvc.model.Item;
import cn.springmvc.service.BookService;

@Service
public class BookServiceImpl implements BookService {
	private Item item = new Item();
	@Autowired
	private BookDao bookDao;

	public Item onQuery() {
		// TODO Auto-generated method stub
		item.setBookList(bookDao.onQuery());
		return item;
	}

}
