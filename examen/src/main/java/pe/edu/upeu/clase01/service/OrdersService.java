package pe.edu.upeu.clase01.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.clase01.dao.Operaciones;
import pe.edu.upeu.clase01.daoImpl.OrdersDaoImpl;
import pe.edu.upeu.clase01.entity.Orders;

@Service
public class OrdersService implements Operaciones<Orders> {
	
	@Autowired
	private OrdersDaoImpl daoIml;

	@Override
	public int create(Orders t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Orders t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Orders read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Orders> reaAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Map<String, Object>> readAll2() {
		// TODO Auto-generated method stub
		return daoIml.readAll2();
	}

	@Override
	public List<Map<String, Object>> readAll3() {
		// TODO Auto-generated method stub
		return null;
	}

}
