package com.sun.collector.mapper.device;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.sun.collector.entity.ReceiptCollector;

/**
 * 
 * @ClassName: ReceiptCollectorDao
 * @Description: 采集器dao
 * @author XS guo
 * @date 2017年6月30日 上午11:23:51
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
@Repository
public interface ReceiptCollectorDao extends MongoRepository<ReceiptCollector, String> {

	/**
	 * 
	 * @Title: findCollectorByNo @Description: 根据编号查询采集器 @return
	 *         ReceiptCollector @throws
	 */
	public ReceiptCollector findByCollectorNo(String collectorNo);

}
