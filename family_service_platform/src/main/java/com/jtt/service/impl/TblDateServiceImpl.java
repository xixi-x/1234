package com.jtt.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jtt.bean.TblDate;
import com.jtt.mapper.base.TblDateMapper;
import com.jtt.service.base.TblDateService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 工作日期 服务实现类
 * </p>
 *
 * @author jia
 * @since 2020-06-03
 */
@Service
public class TblDateServiceImpl extends ServiceImpl<TblDateMapper, TblDate> implements TblDateService {

}
