package com.project.demo.controller;

import com.project.demo.entity.OrderCenter;
import com.project.demo.service.OrderCenterService;
import com.project.demo.controller.base.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Query;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 *订单中心：(OrderCenter)表控制层
 *
 */
@RestController
@RequestMapping("/order_center")
public class OrderCenterController extends BaseController<OrderCenter,OrderCenterService> {

    /**
     *订单中心对象
     */
    @Autowired
    public OrderCenterController(OrderCenterService service) {
        setService(service);
    }

    @PostMapping("/add")
    @Transactional
    public Map<String, Object> add(HttpServletRequest request) throws IOException {
        Map<String,Object> paramMap = service.readBody(request.getReader());
        this.addMap(paramMap);
        return success(1);
    }

}
