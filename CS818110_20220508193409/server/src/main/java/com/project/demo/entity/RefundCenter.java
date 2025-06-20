package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 *退票中心：(RefundCenter)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "RefundCenter")
public class RefundCenter implements Serializable {

    //RefundCenter编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "refund_center_id")
    private Integer refund_center_id;
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
    private String ticket_price;
    // 购买张数
    @Basic
    private String number_of_purchased_sheets;
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
    // 退票时间
    @Basic
    private Timestamp refund_time;
    // 退票原因
    @Basic
    private String reason_for_refund;
    // 审核状态
    @Basic
    private String examine_state;
    // 审核回复
    @Basic
    private String examine_reply;

    // 更新时间
    @Basic
    private Timestamp update_time;

    // 创建时间
    @Basic
    private Timestamp create_time;

}
