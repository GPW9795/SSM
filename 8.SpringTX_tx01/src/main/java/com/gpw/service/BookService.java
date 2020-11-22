package com.gpw.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gpw.dao.BookDao;

@Service
public class BookService {
	
	@Autowired
	BookDao bookDao;
	
	/**
	 * 结账；传入哪个用户买了哪本书
	 * @param username
	 * @param isbn
	 */
	@Transactional
	public void checkout(String username,String isbn){
		//1、减库存
		bookDao.updateStock(isbn);
		
		int price = bookDao.getPrice(isbn);
		//2、减余额
		bookDao.updateBalance(username, price);
	}
	
	
	
	

}
