package com.cqust.shilian.dto;

import com.cqust.shilian.entity.Setmeal;
import com.cqust.shilian.entity.SetmealDish;
import lombok.Data;
import java.util.List;

@Data
public class SetmealDto extends Setmeal {

    private List<SetmealDish> setmealDishes;

    private String categoryName;
}
