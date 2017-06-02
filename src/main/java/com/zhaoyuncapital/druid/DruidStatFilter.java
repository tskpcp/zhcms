package com.zhaoyuncapital.druid;

import com.alibaba.druid.support.http.WebStatFilter;

import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;

/**
 * Created by gongtuo on 2017/6/2.
 */
@WebFilter(filterName = "druidEWebStatFilter",urlPatterns = "/*",initParams = {@WebInitParam(name="exclusions",value="*.js,*.gif,*.jpg,*.bmp,*.png,*.css,*.ico,/druid/*")})
//忽略资源
public class DruidStatFilter extends WebStatFilter {
}
