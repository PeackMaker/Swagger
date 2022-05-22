package com.macbookpro.springswagger.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.macbookpro.springswagger.mapper.BookMapper;
import com.macbookpro.springswagger.pojo.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Desc:
 * @Author: PEACEMAKER
 * @Date: 2022/5/22
 */
@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookMapper bookMapper;

    @Override
    public List<Book> queryAll() {
        return bookMapper.selectList(null);
    }

    @Override
    public Book selectOneById(Integer bookId) {
        QueryWrapper<Book> wrapper = new QueryWrapper<>();
        wrapper.eq("book_id", bookId);
        return bookMapper.selectOne(wrapper);
    }

    @Override
    public Book selectOneByName(String bookName) {
        QueryWrapper<Book> wrapper = new QueryWrapper<>();
        wrapper.eq("book_name", bookName);
        return bookMapper.selectOne(wrapper);
    }


    @Override
    public Integer addOne(Book book) {
        return bookMapper.insert(book);
    }

    @Override
    public Integer deleteOne(Integer bookId) {
       return bookMapper.deleteById(bookId);
    }

    @Override
    public Integer updateOne(Book book) {
        return null;
    }

    @Override
    public List<Book> orderBy() {
        QueryWrapper<Book> wrapper = new QueryWrapper<>();
        QueryWrapper<Book> bookSales = wrapper.orderByDesc("book_sales");
        return bookMapper.selectList(bookSales);
    }
}
