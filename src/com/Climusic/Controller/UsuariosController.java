package com.Climusic.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Climusic.Modelos.Empleado;
import com.Climusic.Service.UsuarioService;


public class UsuariosController {
	
	@Autowired
	private UsuarioService usuarioService;
	
	@RequestMapping("/actualizar")
	public String mostrarLista(Model model){
		List<Empleado> empleado= usuarioService.buscarTodos();
		model.addAttribute("empleado", empleado);
		System.out.println("**********llegue a MOSTRARLISTA*****************");
		return "usuarios";
	}

}
