package com.xxx.myspringboot.demo.model;

/**
 * @ClassName Student
 * @Author hello
 * @Date 2018/12/23 20:14
 **/

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
@Api("学生实体对象")
@Data
@TableName("t_student")
public class Student {

    @ApiModelProperty(value = "学生id",example = "12")
    @TableId(type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty("学生姓名")
    private String name;

    @ApiModelProperty(value = "学生年龄",example = "12")
    private Integer age;

    @ApiModelProperty("学生班级")
    private String classname;

}
