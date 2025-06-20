package com.project.demo.controller;

import com.project.demo.entity.DomesticAirTicket;
import com.project.demo.service.DomesticAirTicketService;
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
 *国内机票：(DomesticAirTicket)表控制层
 *
 */
@RestController
@RequestMapping("/domestic_air_ticket")
public class DomesticAirTicketController extends BaseController<DomesticAirTicket,DomesticAirTicketService> {

    /**
     *国内机票对象
     */
    @Autowired
    public DomesticAirTicketController(DomesticAirTicketService service) {
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
