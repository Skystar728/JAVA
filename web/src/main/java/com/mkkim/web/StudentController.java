package com.mkkim.web;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import student.StudentServiceImpl;
import student.StudentVO;

@Controller
public class StudentController {
	@Autowired private StudentServiceImpl service;
	@RequestMapping("/list.st")
	public String list(HttpSession session, Model model) {
		session.setAttribute("category", "st");
		List<StudentVO> list = service.student_list();
		model.addAttribute("list", list);
		return "student/list";
	}
		
	@RequestMapping("/detail.st")
	public String detail(int id, Model model) {
		StudentVO vo = service.student_detail(id);
		model.addAttribute("vo", vo);
		return "student/detail";
	}
	
	@RequestMapping("/new.st")
	public String student() {
		return "student/new";
	}
	
	@RequestMapping("/insert.st")
	public String insert(StudentVO vo) {
		service.student_insert(vo);
		return "redirect:list.st";
	}
	
	@RequestMapping("/modify.st")
	public String modify(int id, Model model) {
		model.addAttribute("vo", service.student_detail(id));
		return "student/modify";
	}
	
	@RequestMapping("/update.st")
	public String update(StudentVO vo) {
		service.student_update(vo);
		return "redirect:detail.st?id=" + vo.getId();
	}
	
	@RequestMapping("/delete.st")
	public String delete(int id) {
		service.student_delete(id);
		return "redirect:list.st";
	}
}