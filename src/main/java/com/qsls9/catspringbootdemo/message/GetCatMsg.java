package com.qsls9.catspringbootdemo.message;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@Controller
public class GetCatMsg {
    @RequestMapping("/sendMsg")
    @CrossOrigin(origins = "*")
    @ResponseBody
    public String getMsg(HttpServletRequest request) throws IOException {
        return M.send_text_msg(request.getParameter("robot_wxid"), request.getParameter("from_wxid"), "我收到啦消息：" + request.getParameter("msg"));
    }
}
