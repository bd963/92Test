package com.bd.controller;
import java.util.List;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bd.pojo.Admin;
import com.bd.pojo.Student;
import com.bd.pojo.Teacher;
import com.bd.service.AdminService;
@Controller
public class HrefController {
	@Autowired
	private AdminService adminService;
	@RequestMapping("/index")
	public ModelAndView index(Model model) {
		ModelAndView mav = new ModelAndView("index");
		return mav;
	}
	//学生
	@RequestMapping("/hrefaddstu")
	public ModelAndView addstu(Model model) {
		ModelAndView mav = new ModelAndView("admin/addstu");
		return mav;
	}
	@RequestMapping("/hrefmohuname")
	public ModelAndView hrefmohuname(String stuname,Model model,HttpSession session) {
		List<Student> list=adminService.selectbyname(stuname);
		session.setAttribute("list", list);
		ModelAndView mav = new ModelAndView("admin/mohuname");
		return mav;
	}
	@RequestMapping("/hrefxiustu")
	public String xiustu(String id,Model model) {
		Student student=adminService.selectone(id);
		model.addAttribute("student",student);
		return "admin/updatestu";
	}
	@RequestMapping("/hrefstumanage")
	public ModelAndView hrefstumanage(Model model) {
		ModelAndView mav = new ModelAndView("admin/stumanage");
		return mav;
	}
//老师
	@RequestMapping("/hrefaddtea")
	public ModelAndView hrefaddtea(Model model) {
		ModelAndView mav = new ModelAndView("admin/addtea");
		return mav;
	}
	@RequestMapping("/hrefteamanage")
	public ModelAndView hrefteamanage(Model model) {
		ModelAndView mav = new ModelAndView("admin/teamanage");
		return mav;
	}
	@RequestMapping("/hrefmohunametea")
	public ModelAndView hrefmohunametea(String teaname,Model model,HttpSession session) {
		List<Teacher> list=adminService.selectbynametea(teaname);
		session.setAttribute("tealist",list);
		ModelAndView mav = new ModelAndView("admin/mohuname2");
		return mav;
	}
	@RequestMapping("/hrefxiutea")
	public String hrefxiutea(String id,Model model) {
		Teacher teacher=adminService.selectonetea(id);
		model.addAttribute("teacher",teacher);
		return "admin/updatetea";
	}
//管理员
	@RequestMapping("/guanliyuan")
	public ModelAndView guanliyuan(Model model){
		ModelAndView mav = new ModelAndView("admin/adminlist");
		return mav;
	}
	@RequestMapping("/hrefmohunameadm")
	public ModelAndView hrefmohunameadm(String name,Model model,HttpSession session) {
		List<Admin> list=adminService.selectbynameade(name);
		session.setAttribute("list", list);
		ModelAndView mav = new ModelAndView("admin/mohuname3");
		return mav;
	}
	/*@RequestMapping("/hrefxiuadm")
	public String hrefxiuadm(String id,Model model) {
		Admin admin = adminService.selectoneade(id);
		model.addAttribute("admin",admin);
		return "admin/updatestu";
	}*/
}
