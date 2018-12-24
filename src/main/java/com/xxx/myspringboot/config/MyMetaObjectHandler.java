package com.xxx.myspringboot.config;

import com.baomidou.mybatisplus.mapper.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;

import java.sql.Timestamp;

/**
 * @ClassName MyMetaObjectHandler
 * @Author hello
 * @Date 2018/12/24 17:37
 **/
public class MyMetaObjectHandler extends MetaObjectHandler {
    @Override
    public void insertFill(MetaObject metaObject) {
        // 更多查看源码测试用例
        System.out.println("*************************");
        System.out.println("insert fill");
        System.out.println("*************************");

        //mybatis-plus版本2.0.9+
        Object createTime = getFieldValByName("createTime", metaObject);
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        if (createTime == null) {
            //mybatis-plus版本2.0.9+
            setFieldValByName("createTime", timestamp, metaObject);
        }
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        //更新填充
        System.out.println("*************************");
        System.out.println("update fill");
        System.out.println("*************************");
        //mybatis-plus版本2.0.9+
        setFieldValByName("modifyTime", new Timestamp(System.currentTimeMillis()), metaObject);
    }
}
