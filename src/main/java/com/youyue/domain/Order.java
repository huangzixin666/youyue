package com.youyue.domain;

import java.util.Date;

public class Order {
    private Integer id;
    private String user_id;
    private Date create_time;
    private  Date update_time;
    private  String order_no;
    private  String order_store;
    private  String seat_id;
    private  String seat_location;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public Date getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(Date update_time) {
        this.update_time = update_time;
    }

    public String getOrder_no() {
        return order_no;
    }

    public void setOrder_no(String order_no) {
        this.order_no = order_no;
    }

    public String getOrder_store() {
        return order_store;
    }

    public void setOrder_store(String order_store) {
        this.order_store = order_store;
    }

    public String getSeat_id() {
        return seat_id;
    }

    public void setSeat_id(String seat_id) {
        this.seat_id = seat_id;
    }

    public String getSeat_location() {
        return seat_location;
    }

    public void setSeat_location(String seat_location) {
        this.seat_location = seat_location;
    }
}
