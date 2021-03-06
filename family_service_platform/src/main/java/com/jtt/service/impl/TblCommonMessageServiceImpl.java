package com.jtt.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jtt.bean.TblCommonMessage;
import com.jtt.mapper.base.TblCommonMessageMapper;
import com.jtt.service.base.TblCommonMessageService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 常用短信 服务实现类
 * </p>
 *
 * @author jia
 * @since 2020-06-03
 */
@Service
public class TblCommonMessageServiceImpl extends ServiceImpl<TblCommonMessageMapper, TblCommonMessage> implements TblCommonMessageService {

}
