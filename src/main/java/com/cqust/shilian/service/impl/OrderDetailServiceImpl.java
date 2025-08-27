package com.cqust.shilian.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cqust.shilian.entity.OrderDetail;
import com.cqust.shilian.mapper.OrderDetailMapper;
import com.cqust.shilian.service.OrderDetailService;
import org.springframework.stereotype.Service;

@Service
public class OrderDetailServiceImpl extends ServiceImpl<OrderDetailMapper, OrderDetail> implements OrderDetailService {

}
