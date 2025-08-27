package com.cqust.shilian.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cqust.shilian.entity.AddressBook;
import com.cqust.shilian.mapper.AddressBookMapper;
import com.cqust.shilian.service.AddressBookService;
import org.springframework.stereotype.Service;

@Service
public class AddressBookServiceImpl extends ServiceImpl<AddressBookMapper, AddressBook> implements AddressBookService {

}
