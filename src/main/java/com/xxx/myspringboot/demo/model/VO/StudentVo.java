package com.xxx.myspringboot.demo.model.VO;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @ClassName StudentVo
 * @Author hello
 * @Date 2018/12/24 11:45
 **/
@Data
@ApiModel("学生vo")
public class StudentVo {

    @ApiModelProperty("学生姓名")
    private String name;

    @ApiModelProperty(value = "学生年龄",example ="1")
    private Integer age;

    @ApiModelProperty("学生班级")
    private String classname;
}
