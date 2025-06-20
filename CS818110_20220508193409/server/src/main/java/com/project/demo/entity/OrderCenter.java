package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 *订单中心：(OrderCenter)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "OrderCenter")
public class OrderCenter implements Serializable {

    //OrderCenter编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_center_id")
    private Integer order_center_id;
    // 客机编号
    @Basic
    private String passenger_plane_number;
    // 客机型号
    @Basic
    private String aircraft_model;
    // 出发地
    @Basic
    private String place_of_departure;
    // 目的地
    @Basic
    private String destination;
    // 出发时间
    @Basic
    private Timestamp departure_time;
    // 到达时间
    @Basic
    private Timestamp arrival_time;
    // 座位类型
    @Basic
    private String seat_type;
    // 票价
    @Basic
    private Integer ticket_price;
    // 购买张数
    @Basic
    private Integer number_of_purchased_sheets;
    // 总金额
    @Basic
    private String total_amount;
    // 用户账号
    @Basic
    private Integer user_account;
    // 姓名
    @Basic
    private String full_name;
    // 身份证
    @Basic
    private String id;
    // 支付状态
    @Basic
    private String pay_state;

    // 支付类型: 微信、支付宝、网银
    @Basic
    private String pay_type;

    // 更新时间
    @Basic
    private Timestamp update_time;

    // 创建时间
    @Basic
    private Timestamp create_time;

}
