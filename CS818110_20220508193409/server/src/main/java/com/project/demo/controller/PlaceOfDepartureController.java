package com.project.demo.controller;

import com.project.demo.entity.PlaceOfDeparture;
import com.project.demo.service.PlaceOfDepartureService;
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
 *出发地：(PlaceOfDeparture)表控制层
 *
 */
@RestController
@RequestMapping("/place_of_departure")
public class PlaceOfDepartureController extends BaseController<PlaceOfDeparture,PlaceOfDepartureService> {

    /**
     *出发地对象
     */
    @Autowired
    public PlaceOfDepartureController(PlaceOfDepartureService service) {
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
