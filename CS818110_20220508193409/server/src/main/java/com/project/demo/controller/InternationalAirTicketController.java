package com.project.demo.controller;

import com.project.demo.entity.InternationalAirTicket;
import com.project.demo.service.InternationalAirTicketService;
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
 *国际机票：(InternationalAirTicket)表控制层
 *
 */
@RestController
@RequestMapping("/international_air_ticket")
public class InternationalAirTicketController extends BaseController<InternationalAirTicket,InternationalAirTicketService> {

    /**
     *国际机票对象
     */
    @Autowired
    public InternationalAirTicketController(InternationalAirTicketService service) {
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
