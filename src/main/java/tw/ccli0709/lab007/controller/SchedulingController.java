package tw.ccli0709.lab007.controller;

import java.time.LocalDateTime;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import tw.ccli0709.lab007.dao.LogMapper;
import tw.ccli0709.lab007.entity.Log;

@EnableScheduling
@Component
public class SchedulingController {
	@Autowired
	private LogMapper mapper;
	Logger logger = LogManager.getLogger(SchedulingController.class);

	@Scheduled(cron = "*/6 * * * * ?")
	private void process() {
		logger.trace("A TRACE Message");
		logger.debug("A DEBUG Message");
		logger.info("An INFO Message");
		logger.warn("A WARN Message");
		logger.error("An ERROR Message");

		Log log = new Log();
		log.setContent("XXX");
		log.setCreateTime(LocalDateTime.now());
		mapper.insert(log);
	}
}