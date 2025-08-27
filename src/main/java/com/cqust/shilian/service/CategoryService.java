package com.cqust.shilian.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cqust.shilian.entity.Category;

public interface CategoryService extends IService<Category> {
    public void remove(Long id);
}
