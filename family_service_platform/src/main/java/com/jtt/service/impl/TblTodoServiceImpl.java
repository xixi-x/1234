package com.jtt.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jtt.bean.TblTodo;
import com.jtt.mapper.base.TblTodoMapper;
import com.jtt.service.base.TblTodoService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 待办事项 服务实现类
 * </p>
 *
 * @author jia
 * @since 2020-06-03
 */
@Service
public class TblTodoServiceImpl extends ServiceImpl<TblTodoMapper, TblTodo> implements TblTodoService {

}
