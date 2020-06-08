package com.learning.ssm_swagger.controller.user;

import com.learning.ssm_swagger.dao.user.UserMapper;
import com.learning.ssm_swagger.entity.base.Result;
import com.learning.ssm_swagger.entity.user.User;
import com.learning.ssm_swagger.service.user.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.HtmlUtils;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.util.Objects;

/**
 * @author qizy
 */
@Controller
@Api(value="Login Controller", description = "登录接口")
public class LoginController {

    @Autowired
    private UserService userService;

    @Resource
    private UserMapper userMapper;

    @ApiOperation(value = "用户登录", notes = "用户登录", httpMethod = "POST")
    @RequestMapping(value = "api/login", method = RequestMethod.POST)
    @ResponseBody
    @CrossOrigin(origins = "http://localhost:18080")
    public Result getUser(@Valid @RequestBody User requestUser) {
        String username = requestUser.getName();
        username = HtmlUtils.htmlEscape(username);

        try {
            User user = userMapper.getUserByNameAndPwd(username,requestUser.getPassword());
            if (user == null) {
                String message = "账号密码错误";
                return new Result(400);
            } else {
                //用户名密码正确 ：
                //  根据userName 去redis查询有没有token缓存
                //  如果有，刷新相应redis缓存的时间 并返回token
                //  如果没有，生成token，存至redis，并返回token

                return new Result(200);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(400);
        }
    }



}
