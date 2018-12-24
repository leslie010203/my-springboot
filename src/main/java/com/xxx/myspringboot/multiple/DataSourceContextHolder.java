package com.xxx.myspringboot.multiple;

/**
 * @ClassName DataSourceContextHolder
 * @Author hello
 * @Date 2018/12/23 16:16
 **/
public class DataSourceContextHolder {

    private static final ThreadLocal<String> contenxtHolder = new InheritableThreadLocal<>();

    /**
     * 设置数据源
     * @param db
     */
    public static void setDataSource(String db){
        contenxtHolder.set(db);
    }

    /**
     * 取得当前数据源
     * @return
     */
    public static String getDateSource(){
        return contenxtHolder.get();
    }

    /**
     * 清除上下文数据
     */
    public static void clear(){
        contenxtHolder.remove();
    }

}
