package pe.edu.upeu.clase01.entity;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Products implements Serializable{
	
	private static final long serialVersionUID= 1L ;
	
	private int ProductoID;
	private String ProductName;
	private int SupplierlID;
	private int CategoryID;
	private String QuantityPerUnit;
	private double UnitPrice;
	private int UnitsInStock;
	private int UnitsOnOrder;
	private int ReorderLevel;
	private int Discontinued;
	

}
