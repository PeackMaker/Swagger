package com.macbookpro.springswagger.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.macbookpro.springswagger.pojo.Book;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Desc:
 * @Author: PEACEMAKER
 * @Date: 2022/5/22
 */
@Mapper
public interface BookMapper extends BaseMapper<Book> {
}
