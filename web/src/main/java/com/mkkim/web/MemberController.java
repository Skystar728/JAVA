package com.mkkim.web;

import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import member.MemberServiceImpl;
import member.MemberVO;

@Controller
public class MemberController {
	@Autowired private MemberServiceImpl service;
	
	@ResponseBody @RequestMapping("/login")
	public String login(String id, String pw, HttpSession session) {
		HashMap<String, String> map = new HashMap<String, String>();
		
		map.put("id", id);
		map.put("pw", pw);
		MemberVO vo = service.member_login(map);
		session.setAttribute("login_info", vo);
		
		return vo == null ? "false" : "true";
	}
	
	@ResponseBody @RequestMapping("/logout")
	public void logout(HttpSession session) {
		session.removeAttribute("login_info");
	}
	
	@RequestMapping("/member")
	public String member(HttpSession session) {
		session.setAttribute("category", "join");
		
		return "member/join";
	}
	
	@ResponseBody @RequestMapping("/id_check")
	public boolean id_check(String id) {
		return service.member_id_check(id);
	}
	
	@ResponseBody @RequestMapping(value= "/join", produces= "text/html; charset= utf-8")
	public String join(MemberVO vo, HttpServletRequest request, HttpSession session) {
		String msg = "<script type='text/javascript'>";
		if(service.member_insert(vo)) {
			msg += "alert('회원가입을 축하드립니다!'); location='" + request.getContextPath() + "'";
		} else {
			msg += "alert('회원가입에 실패했습니다!'); history.go(-1)";
		}
		msg += "</script>";
		return msg;
	}
	
}