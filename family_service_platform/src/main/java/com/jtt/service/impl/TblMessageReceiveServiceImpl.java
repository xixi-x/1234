package com.jtt.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jtt.bean.TblMessageReceive;
import com.jtt.mapper.base.TblMessageReceiveMapper;
import com.jtt.service.base.TblMessageReceiveService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 短信接受表 服务实现类
 * </p>
 *
 * @author jia
 * @since 2020-06-03
 */
@Service
public class TblMessageReceiveServiceImpl extends ServiceImpl<TblMessageReceiveMapper, TblMessageReceive> implements TblMessageReceiveService {

}
