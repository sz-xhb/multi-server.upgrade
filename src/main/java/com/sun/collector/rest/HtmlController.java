package com.sun.collector.rest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 
 * @ClassName: HtmlController
 * @Description: spring boot集成thmyleaf 启动入口
 * @author XS guo
 * @date 2017年8月8日 下午7:11:15
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
@Controller
public class HtmlController {

	@RequestMapping(value = "/page", method = RequestMethod.GET)
	public String page(Model model) {
		return "index";
	}
}
