package com.hompan.tueparking.parkingspace.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hompan.tueparking.parkingspace.entity.Plot;
import com.hompan.tueparking.parkingspace.service.PlotService;

@Controller
@ResponseBody
public class PlotController {

	@Autowired
	PlotService plotService;
	
	@PostMapping("/getPlot")
	public List<Plot> getPlots(@RequestBody HashMap<String,String> map){
		System.out.println("getPlots...");
		return plotService.getPlotList(map);
		
	}
	
	@PostMapping("/deletePlot")
	public boolean deletePlot(@RequestParam("id") int id){
		System.out.println("deletePlot...");
		return plotService.delete(id);
		
	}
}
