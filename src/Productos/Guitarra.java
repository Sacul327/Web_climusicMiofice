package Productos;

import java.util.ArrayList;
import java.util.List;
import Modelos.Instrumento;
import java.sql.*;

public class Guitarra {
	Instrumento ins = new Instrumento();
	List<Instrumento> guitarraList=new ArrayList<Instrumento>();
	//ejecutar un scanner para agregar productos
	
	
	public List<Instrumento> getGuitarraList() {
		return guitarraList;
	}

	public void setGuitarraList(List<Instrumento> guitarraList) {
		this.guitarraList = guitarraList;
	}
	
	public Guitarra() {
	}
	
	
	public void cargarParametros(String codProducto,String marca,String material, double precio,
			int stock,String modelo) {
		
		int x=0;
		ins.setCodProducto(codProducto);
		ins.setMarca(marca);
		ins.setMaterial(material);
		ins.setPrecio(precio);
		ins.setStock(stock);
		ins.setModelo(modelo);
		if(guitarraList.get(x).getCodProducto().equals(codProducto)){
				System.out.println("El producto ya fue agregado");
			}else {				
				guitarraList.add(ins);
				System.out.println("Llegamos aca");
			}
		}
	
		

	public Guitarra(Instrumento ins, List<Instrumento> guitarraList) {
		super();
		this.ins = ins;
		this.guitarraList = guitarraList;
	}


	public String mostrarListCompleta() {
		for(int x=0;x<guitarraList.size();x++) {
			  System.out.println("Caracteristicas del producto:");
			  System.out.println(guitarraList.get(x).getCodProducto());
			  System.out.println(guitarraList.get(x).getStock());
			  System.out.println(guitarraList.get(x).getMarca());
			  System.out.println(guitarraList.get(x).getMaterial());
			  System.out.println(guitarraList.get(x).getPrecio());
			  System.out.println(guitarraList.get(x).getModelo());
			  
			}
		return null;
	}
	
	public String mostrarList() {
		for(int x=0;x<guitarraList.size();x++) {
			  System.out.println("Caracteristicas del producto:");
			  System.out.println(guitarraList.get(x).getModelo());
			  System.out.println(guitarraList.get(x).getStock());
			}
		return null;
	}

	public Instrumento getIns() {
		return ins;
	}

	public void setIns(Instrumento ins) {
		this.ins = ins;
	}


}
