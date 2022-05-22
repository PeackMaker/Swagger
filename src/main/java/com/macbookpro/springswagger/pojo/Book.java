package com.macbookpro.springswagger.pojo;

import com.baomidou.mybatisplus.annotation.*;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

/**
 * @Desc:
 * @Author: PEACEMAKER
 * @Date: 2022/5/22
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel("书本模型")
@TableName("tb_book")
public class Book implements Serializable {

    private static final String FORMAT = "yyyy-MM-dd";
    public static final String TIME_ZONE = "GMT+8";

    @TableId(type= IdType.AUTO)
    @ApiModelProperty("书本编号")
    private Integer bookId;
    @ApiModelProperty("书名")
    private String bookName;
    @ApiModelProperty("作者")
    private String bookAuthor;
    @ApiModelProperty("价格")
    private BigDecimal bookPrice;
    @ApiModelProperty("销量")
    private Integer bookSales;
    @ApiModelProperty("库存")
    private Integer bookStock;
    @ApiModelProperty("出版时间")
    @JsonFormat(pattern = FORMAT,timezone = TIME_ZONE)
    private Timestamp pubDate;
    @TableField(fill= FieldFill.INSERT)
    @ApiModelProperty("上架时间")
    private Date createTime;
    @TableField(fill = FieldFill.INSERT_UPDATE)
    @ApiModelProperty("更新时间")
    private Date updateTime;
}
