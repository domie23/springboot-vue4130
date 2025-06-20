package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 *国际机票：(InternationalAirTicket)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "InternationalAirTicket")
public class InternationalAirTicket implements Serializable {

    //InternationalAirTicket编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "international_air_ticket_id")
    private Integer international_air_ticket_id;
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
    // 剩余票数
    @Basic
    private Integer remaining_votes;
    // 票价
    @Basic
    private Integer ticket_price;
    // 封面
    @Basic
    private String cover;
    // 点击数
    @Basic
    private Integer hits;

    // 更新时间
    @Basic
    private Timestamp update_time;

    // 创建时间
    @Basic
    private Timestamp create_time;

}
