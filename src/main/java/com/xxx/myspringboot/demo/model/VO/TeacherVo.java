package com.xxx.myspringboot.demo.model.VO;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @ClassName TeacherVo
 * @Author hello
 * @Date 2018/12/24 11:46
 **/
@Data
@ApiModel("老师vo")
public class TeacherVo {
    @ApiModelProperty("老师姓名")
    private String name;

    @ApiModelProperty(value = "老师年龄",example ="1")
    private Integer age;

    @ApiModelProperty("老师教的学科")
    private String subject;
}
