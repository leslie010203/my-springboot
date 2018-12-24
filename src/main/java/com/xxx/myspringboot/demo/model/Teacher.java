package com.xxx.myspringboot.demo.model;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @ClassName Teacher
 * @Author hello
 * @Date 2018/12/23 20:17
 **/
@Api("老师实体对象")
@Data
@TableName("t_teacher")
public class Teacher {

    @ApiModelProperty(value = "老师id",example = "123")
    @TableId(type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty("老师姓名")
    private String name;

    @ApiModelProperty(value = "老师年龄",example = "123")
    private Integer age;

    @ApiModelProperty("老师所教学科")
    private String subject;


}
