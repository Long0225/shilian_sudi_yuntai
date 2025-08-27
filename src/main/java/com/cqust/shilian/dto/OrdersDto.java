package com.cqust.shilian.dto;

import com.cqust.shilian.entity.OrderDetail;
import com.cqust.shilian.entity.Orders;
import lombok.Data;

import java.util.List;

@Data
public class OrdersDto extends Orders {

    private String userName;

    private String phone;

    private String address;

    private String consignee;

    private List<OrderDetail> orderDetails;

}
