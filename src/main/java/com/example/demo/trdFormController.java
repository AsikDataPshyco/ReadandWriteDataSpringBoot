package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class trdFormController {
@GetMapping("tradesData")
public String tradesDetails() {
	return "tradesData";
	
}

@PostMapping("/details")
public String viewTrdDetails(
		@RequestParam("trdid") String trdid , 
		@RequestParam("secName") String secName ,
		@RequestParam("cusipId") String cusipId,
		@RequestParam("trdAmt") String trdAmt, ModelMap modmap
		)
{
	
	modmap.put("trdid", trdid);
	modmap.put("secName", secName);
	modmap.put("cusipId", cusipId);
	modmap.put("trdAmt", trdAmt);
	
	return "viewTradeDetails";
}

}
