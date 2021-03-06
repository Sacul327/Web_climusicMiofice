package com.Climusic.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Climusic.Modelos.Carro;
import com.Climusic.Modelos.Productos;
import com.Climusic.Service.PantVentaService;



public class PantVentaController {
	
	@Autowired
	private PantVentaService pantVentasService;
	
	@RequestMapping("/mostrarCarro")
	public List<Productos> mostrarLista(Model model){
		List<Productos> carro= pantVentasService.buscarTodos();
		model.addAttribute("carro", carro);
		
		return carro;
	}

	@RequestMapping("/mostrarProductos")
	public List<Productos> mostrarListaprod(Model model){
		List<Productos> productos= pantVentasService.buscarTodosPro();
		model.addAttribute("productos", productos);
		
		return productos;
	}
	
}
