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

@PostMapping("/viewTradeDetails")
public String viewTrdDetails(
		@RequestParam("trdid") String trdid , 
		@RequestParam("secName") String SecName ,
		@RequestParam("cusipId") String CusipID,
		@RequestParam("trdamt") String TradeAmt, ModelMap modmap
		)
{
	
	modmap.put("trdid", trdid);
	modmap.put("secName", SecName);
	modmap.put("cusipId", CusipID);
	modmap.put("trdamt", TradeAmt);
	
	return "viewTradeDetails";
}

}
