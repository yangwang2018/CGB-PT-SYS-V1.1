package com.pt.sys.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SysLogController {
		
		@RequestMapping("doLogListUI")
		public String doLogListUI(){
			return "sys/log_list";
		}
		
		@RequestMapping("doLoadPageUI")
		public String doLoadPageUI(){
			return "common/page";
		}
}
