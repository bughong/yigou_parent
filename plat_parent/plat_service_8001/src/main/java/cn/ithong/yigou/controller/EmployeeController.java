package cn.ithong.yigou.controller;

import cn.ithong.yigou.domain.Employee;
import cn.ithong.yigou.util.AjaxResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    //前台传过来的数据时json格式，且是resful风格，所以需要使用@requestbody注解
    public AjaxResult login(@RequestBody Employee employee){
        if("admin".equals(employee.getUsername())&&"admin".equals(employee.getPassword())){
            return AjaxResult.me().setMessage("登录成功");
        }
        return AjaxResult.me().setSuccsee(false).setMessage("用户名或密码错误");
    }
}
