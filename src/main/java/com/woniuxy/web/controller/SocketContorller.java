package com.woniuxy.web.controller;
/**
 * 田普旭
 */
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/check")
public class SocketContorller {
	@ResponseBody
	@RequestMapping("/socket/push")
	public void pushToWeb() {  
		String message = "true";
		
		try {
			WebSocketServer.sendInfo(message);
		} catch (IOException e) {
			e.printStackTrace();
			
		}  
		
	} 

	

}
