package com.learning.ssm_swagger.controller.user;

import com.learning.ssm_swagger.entity.user.User;
import com.learning.ssm_swagger.service.user.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/user")
@Api(value="User Controller", description = "用户信息接口")
public class UserController {

    @Autowired
    private UserService userService;

    @ApiOperation(value = "查询用户信息", notes = "查询用户信息", httpMethod = "GET")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public String getUser(@PathVariable int id) {
        return userService.get(id).toString();
    }

    @ApiOperation(value = "查询所有用户信息", notes = "查询用户信息", httpMethod = "GET")
    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseBody
    public List<User> getUsers() {
        return userService.getAll();
    }

    @ApiOperation(value = "新增用户信息", notes = "新增用户信息", httpMethod = "POST")
    @RequestMapping(value = "/", method = RequestMethod.POST)
    @ResponseBody
    public String addUser(@Valid User user) {
        userService.add(user);
        return "新增成功";
    }

    @ApiOperation(value = "更新用户信息", notes = "更新用户信息", httpMethod = "PUT")
    @RequestMapping(value = "/", method = RequestMethod.PUT)
    @ResponseBody
    public String updateUser(@Valid User user) {
        userService.update(user);
        return "更新成功";
    }

    @ApiOperation(value = "删除用户信息", notes = "删除用户信息", httpMethod = "DELETE")
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public String deleteUser(@PathVariable int id) {
        userService.delete(id);
        return "删除成功";
    }

}
