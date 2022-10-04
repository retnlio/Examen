package pe.edu.upeu.clase01.controller;

import java.util.List;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import pe.edu.upeu.clase01.entity.Orders;
import pe.edu.upeu.clase01.service.OrdersService;




@RestController
@RequestMapping("/api/orders")
public class OrdersController {

	
	@Autowired
	private OrdersService orderService;
	
	@GetMapping ("/all")	
	public List<Map<String, Object>> readAll2(){
		return orderService.readAll2();
	}
}
