package tw.ccli0709.lab007.controller;

import java.time.LocalDateTime;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tw.ccli0709.lab007.dao.LogMapper;
import tw.ccli0709.lab007.entity.Log;

@RestController
@RequestMapping(value = "/api/log")
public class LogController {

	@Autowired
	private LogMapper mapper;

	@GetMapping("/list")
	public List<Log> list(HttpServletRequest request, HttpServletResponse response) {
		Log log = new Log();
		log.setContent("XXX");
		log.setCreateTime(LocalDateTime.now());
		mapper.insert(log);
		return mapper.selectAll();

	}

}
