package com.cqust.shilian.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cqust.shilian.entity.Employee;
import com.cqust.shilian.mapper.EmployeeMapper;
import com.cqust.shilian.service.EmployeeService;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements EmployeeService {
}
