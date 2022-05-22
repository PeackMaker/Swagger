package com.macbookpro.springswagger.controller.handler;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @Desc:  时间填充策略
 * @Author: PEACEMAKER
 * @Date: 2022/5/22
 */
@Slf4j
@Component
public class MybatisPlusHandler implements MetaObjectHandler{
        @Override
        public void insertFill(MetaObject metaObject) {
            log.info("start insert fill......");
            this.setInsertFieldValByName("createTime", new Date(), metaObject);
        }

        @Override
        public void updateFill(MetaObject metaObject) {
            log.info("start update fill......");
            this.setInsertFieldValByName("updateTime", new Date(), metaObject);
        }
    }

