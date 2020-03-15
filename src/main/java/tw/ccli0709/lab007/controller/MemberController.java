package tw.ccli0709.lab007.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tw.ccli0709.lab007.dao.MemberMapper;
import tw.ccli0709.lab007.entity.Member;

@RestController
@RequestMapping(value = "/api/member")
public class MemberController {

	@Autowired
	private MemberMapper mapper;

	@GetMapping("/list")
	public List<Member> list(HttpServletRequest request, HttpServletResponse response) {

		return mapper.selectAll();

	}

	@GetMapping("/hello")
	public String hello() {

		return "Hello, World!";
	}

}
