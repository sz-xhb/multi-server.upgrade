package com.sun.collector.init;

import java.util.concurrent.ConcurrentHashMap;

import com.sun.collector.attribute.DtuContext;

/**
 * 
 * @ClassName: DtuContextMap
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author XS guo
 * @date 2017年7月18日 上午9:47:38
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public abstract class DtuContextMap {

	private static ConcurrentHashMap<String, DtuContext> instance = new ConcurrentHashMap<String, DtuContext>();

	public static ConcurrentHashMap<String, DtuContext> getInstance() {
		return instance;
	}

}
