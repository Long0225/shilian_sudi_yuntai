package com.cqust.shilian.dto;

import com.cqust.shilian.entity.Dish;
import com.cqust.shilian.entity.DishFlavor;
import lombok.Data;
import java.util.ArrayList;
import java.util.List;

@Data
public class DishDto extends Dish {

    private List<DishFlavor> flavors = new ArrayList<>();

    private String categoryName;

    private Integer copies;
}
