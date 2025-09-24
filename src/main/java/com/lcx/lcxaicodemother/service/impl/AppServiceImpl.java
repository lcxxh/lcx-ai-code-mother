package com.lcx.lcxaicodemother.service.impl;

import com.mybatisflex.spring.service.impl.ServiceImpl;
import com.lcx.lcxaicodemother.model.entity.App;
import com.lcx.lcxaicodemother.mapper.AppMapper;
import com.lcx.lcxaicodemother.service.AppService;
import org.springframework.stereotype.Service;

/**
 *  服务层实现。
 *
 * @author lcx
 */
@Service
public class AppServiceImpl extends ServiceImpl<AppMapper, App>  implements AppService{

}
