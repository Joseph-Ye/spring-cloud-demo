package net.biancheng.c.service;

import org.springframework.stereotype.Component;

/**
 * @author jhye4@ilfytek.com
 * @date 2023/3/17 16:00
 */
@Component
public class DeptHystrixFallBackService implements DeptHystrixService{
    @Override
    public String deptInfo_Ok(Integer id) {
        return "--------------------C语言中文网提醒您，系统繁忙，请稍后重试！（解耦回退方法触发）-----------------------";
    }
    @Override
    public String deptInfo_Timeout(Integer id) {
        return "--------------------C语言中文网提醒您，系统繁忙，请稍后重试！（解耦回退方法触发）-----------------------";
    }
}
