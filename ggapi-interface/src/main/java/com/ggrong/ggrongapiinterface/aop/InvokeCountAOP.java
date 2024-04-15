package com.ggrong.ggrongapiinterface.aop;


import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.annotation.Resource;

/**
 * 调用次数统计切面
 */
@RestControllerAdvice
public class InvokeCountAOP {
//    @Resource
//    private UserInterfaceInfoServide userInterfaceInfoServide;
//
//    //伪代码
//    //定义切面触发时机（什么时候执行方法） controller接口的方法执行成功后，执行下述方法
//    public void doInvokeCount(){
//        //调用方法
//        object.proceed();
////        调用成功后，次数+1
//        userInterfaceInfoServide.invokeCount();
//    }

}
