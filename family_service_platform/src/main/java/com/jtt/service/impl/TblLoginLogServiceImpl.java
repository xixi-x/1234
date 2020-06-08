package com.jtt.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jtt.bean.TblLoginLog;
import com.jtt.mapper.base.TblLoginLogMapper;
import com.jtt.service.base.TblLoginLogService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 登录日志 服务实现类
 * </p>
 *
 * @author jia
 * @since 2020-06-03
 */
@Service
public class TblLoginLogServiceImpl extends ServiceImpl<TblLoginLogMapper, TblLoginLog> implements TblLoginLogService {

}
