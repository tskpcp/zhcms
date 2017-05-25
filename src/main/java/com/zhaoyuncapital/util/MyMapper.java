package com.zhaoyuncapital.util;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * Created by gongtuo on 2017/5/22.
 */
public interface MyMapper<T> extends Mapper<T>, MySqlMapper<T> {
}
