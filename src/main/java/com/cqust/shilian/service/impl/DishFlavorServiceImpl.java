package com.cqust.shilian.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cqust.shilian.entity.DishFlavor;
import com.cqust.shilian.mapper.DishFlavorMapper;
import com.cqust.shilian.service.DishFlavorService;
import org.springframework.stereotype.Service;

@Service
public class DishFlavorServiceImpl extends ServiceImpl<DishFlavorMapper,DishFlavor> implements DishFlavorService {
}
