package com.japanese.appliaction.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JSPController {
	
	@GetMapping("/userlist") 
		public String getsubuser() {
			return "user/userlist";
		}
	
	@GetMapping("/createroles") 
	public String getroles() {
		return "user/createroles";
	}
	
	@GetMapping("/createuser") 
	public String getcreateroles() {
		return "user/createuser";
	}
	
	@GetMapping("/addteacher") 
	public String getcreateteacher() {
		return "teacher/addteacher";
	}
	
	@GetMapping("/manageteacher") 
	public String getmanageteacher() {
		return "teacher/manageteacher";
	}
	
	@GetMapping("/manageuserlist") 
	public String getmanageuser() {
		return "user/manageuserlist";
	}
	
	@GetMapping("/managecreaterole") 
	public String getmanagecreaterole() {
		return "user/managecreaterole";
	}
	
	@GetMapping("/managestudents") 
	public String getmanagestudents() {
		return "student/managestudents";
	}
	
	@GetMapping("/rolespermission") 
	public String getrolespermission() {
		return "teacher/role";
	}
	
	@GetMapping("/attendanceofstudents") 
	public String getattendance() {
		return "teacher/attendanceofstudents";
	}
	
	@GetMapping("/addstudents") 
	public String getaddstudent() {
		return "student/addstudents";
	}
	
	@GetMapping("/courses") 
	public String getaddcourse() {
		return "courses/addcourses";
	}
	
	@GetMapping("/managecourse") 
	public String getmanagecourse() {
		return "courses/managecourse";
	}
	
	@GetMapping("/batches") 
	public String getbatch() {
		return "batch/batch";
	}
	
	@GetMapping("/managebatch") 
	public String getmanagebatch() {
		return "batch/managebatch";
	}
	
	@GetMapping("/subscription") 
	public String getsubscription() {
		return "Subscription/subscription";
	}
	
	@GetMapping("/addcategory") 
	public String getaddcategory() {
		return "studymaterial/addcategory";
	}
	
	@GetMapping("/managecategory") 
	public String getmanagecategory() {
		return "studymaterial/managecategory";
	}
	
	@GetMapping("/studymaterial") 
	public String getstudymaterial() {
		return "studymaterial/studymaterial";
	}
	
	@GetMapping("/managestudymaterial") 
	public String getmanagestudymaterial() {
		return "studymaterial/managestudymaterial";
	}
	
	@GetMapping("/addmaterial") 
	public String getaddmaterial() {
		return "studymaterial/addmaterial";
	}
	
	@GetMapping("/manageaddmaterial") 
	public String getmanageaddmaterial() {
		return "studymaterial/manageaddmaterial";
	}
	
	@GetMapping("/addlist") 
	public String getaddlist() {
		return "allotment/addlist";
	}
	
	@GetMapping("/allot") 
	public String getallotment() {
		return "allotment/allot";
	}
	
	@GetMapping("/manageallot") 
	public String getmanageallotment() {
		return "allotment/manageallot";
	}
	
	@GetMapping("/subs") 
	public String getsubs() {
		return "student/subs";
	}
	
	@GetMapping("/enroll") 
	public String getenroll() {
		return "student/enroll";
	}
}

