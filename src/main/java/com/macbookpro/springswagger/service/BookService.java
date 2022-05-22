package com.macbookpro.springswagger.service;

import com.macbookpro.springswagger.pojo.Book;

import java.util.List;

/**
 * @Desc:
 * @Author: PEACEMAKER
 * @Date: 2022/5/22
 */
public interface BookService {
    /**
     * 查询所有书本
     */
    List<Book> queryAll();

    /**
     * 根据名/id查单本
     */
    Book selectOneById(Integer bookId);
    Book selectOneByName(String bookName);

    /**
     * 新增书本
     */
    Integer addOne(Book book);

    /**
     * 删除书本
     */

    Integer deleteOne(Integer bookId);

    /**
     * 更新书本
     */
    Integer updateOne(Book book);

    /**
     * 按照销量排序
     */
    List<Book> orderBy();
}
