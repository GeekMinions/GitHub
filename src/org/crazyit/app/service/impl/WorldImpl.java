package org.crazyit.app.service.impl;

import org.crazyit.app.service.World;
import org.springframework.stereotype.Component;

/**
 * Created by ligangxiao on 2017/3/14.
 */
@Component("world")
public class WorldImpl implements World{

    @Override
    public void bar() {
        System.out.println("执行woeld组件的bar()方法");
    }
}
