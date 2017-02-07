package cn.springmvc.dao;

import java.util.List;

import cn.springmvc.model.Book;

public interface BookDao {
	public List<Book> onQuery();
}
