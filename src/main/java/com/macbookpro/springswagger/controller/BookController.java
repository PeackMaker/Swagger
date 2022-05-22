package com.macbookpro.springswagger.controller;

import io.swagger.annotations.Api;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Desc:
 * @Author: PEACEMAKER
 * @Date: 2022/5/22
 */
@RestController
@RequestMapping("/book")
@Api(tags = "书籍信息管理接口")
public class BookController {

    @Operation(summary = "所有商品")
    @RequestMapping("/bookList")
    public String bookList() {
        return "图书列表";
    }

    @RequestMapping("/queryBookById/{bookId}")
    @Operation(summary = "根据商品编号查询")
    public String queryBookById(@Parameter(description = "商品编号,正整数")
                                @PathVariable("bookId") Integer bookId)
    {
        return "根据商品id查询";
    }
}
