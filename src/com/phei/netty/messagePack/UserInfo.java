package com.phei.netty.messagePack;

import org.msgpack.annotation.Message;

/**
 * @Description:
 * @Author: liboqing
 * @CreateDate: 2019/8/28 16:46
 *
 * 这里出现了两个坑，一个是需要在消息类上加上注解Message，另一个就是必须要有默认的无参构造器，不然就会报如下的错误：
 * *org.msgpack.template.builder.BuildContext build
 * *SEVERE: builder: 这个问题在github上有个issue解释了
 *
 */
@Message
public class UserInfo {

    private String name;

    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public UserInfo(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public UserInfo() {
    }
}
