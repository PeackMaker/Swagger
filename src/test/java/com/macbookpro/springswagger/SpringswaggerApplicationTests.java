package com.macbookpro.springswagger;

import com.macbookpro.springswagger.pojo.Book;
import com.macbookpro.springswagger.service.BookServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

@SpringBootTest(classes = SpringswaggerApplication.class)
class SpringswaggerApplicationTests {

@Autowired
private BookServiceImpl bookServiceImpl;
    @Test
    void contextLoads1() {
        Integer integer = bookServiceImpl.addOne(new Book(null, "李四的幸福生活", "张三", new BigDecimal(39.9), 20, 1000, Timestamp.valueOf("2012-12-01 14:02:02.0"), new Date(), null));
        System.out.println(integer);
    }

    @Test
    void contextLoads2(){
        List<Book> books = bookServiceImpl.queryAll();
        books.forEach(System.out::println);
    }

    @Test
    void contextLoads3() {
        List<Book> books = bookServiceImpl.orderBy();
        books.forEach(System.out::println);
    }

    @Test
    void contextLoads4() {
        Book book = bookServiceImpl.selectOneByName("李四的幸福生活");
        System.out.println(book);
    }
}
