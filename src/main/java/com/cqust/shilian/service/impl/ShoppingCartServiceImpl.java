package com.cqust.shilian.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cqust.shilian.entity.ShoppingCart;
import com.cqust.shilian.mapper.ShoppingCartMapper;
import com.cqust.shilian.service.ShoppingCartService;
import org.springframework.stereotype.Service;

@Service
public class ShoppingCartServiceImpl extends ServiceImpl<ShoppingCartMapper, ShoppingCart> implements ShoppingCartService {

}
