package com.sun.collector.mapper.device;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.sun.collector.entity.ReceiptMeter;

/**
 * 
 * @ClassName: ReceiptMeterDao
 * @Description: 电表Dao层
 * @author XS guo
 * @date 2017年6月30日 上午11:26:25
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
@Repository
public interface ReceiptMeterDao extends MongoRepository<ReceiptMeter, String> {

	/**
	 * 
	 * @Title: findMetersByCollectorId @Description: 根据采集器状态id，查询其下属设备 @return
	 *         List<ReceiptMeter> @throws
	 */
	ReceiptMeter findByCollectorId(String collectorId);

	/**
	 * 
	 * @Title: findMeterByCollIdAndMeterNo @Description:
	 *         根据采集器id和电表No查询单个电表信息 @return ReceiptMeter @throws
	 */
	ReceiptMeter findByCollectorIdAndMeterNo(Long collectorId, String meterNo);

	/**
	 * 
	 * @Title: findMetersByType @Description: 根据协议类型查询电表 @return
	 *         List<ReceiptMeter> @throws
	 */
	List<ReceiptMeter> findByMeterType(String proType);

}
