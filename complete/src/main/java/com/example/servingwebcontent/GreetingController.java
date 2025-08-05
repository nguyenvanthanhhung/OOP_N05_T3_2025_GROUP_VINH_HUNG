package com.example.servingwebcontent;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.servingwebcontent.Model.KhachHang;

@Controller
public class GreetingController {

	@GetMapping("/greeting")
	public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
		model.addAttribute("name", name);
		return "greeting";
	}

	@GetMapping("/khachang")
	public String myKhachhang(Model model) {

		KhachHang kh = new KhachHang(01, "Nguyen Thi Van", "021098883848");
         KhachHang kh2 = new KhachHang(02, "Nguyen Tran Dung", "021098883848");
		 ArrayList<KhachHang> list = new ArrayList<KhachHang>();
		 list.add(kh);
		 list.add(kh2);
		 

		model.addAttribute("myKH", kh);
		model.addAttribute("mylist", list);
		return "myKhachHang";
	}

}
