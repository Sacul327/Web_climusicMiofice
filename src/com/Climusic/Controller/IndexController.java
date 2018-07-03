package com.Climusic.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Climusic.Modelos.Empleado;

@Controller
public class IndexController {
	
	@RequestMapping("/")
	public String showIndex() {
		return "index";
	}
	
	@RequestMapping("/Productos")
	public String showShopItems() {
		return "shop_items";
	}
	
	@RequestMapping("/login")
	public String showLogin() {
		return "login";
	}
	
	@RequestMapping("/PantallaVentasAdm")
	public String showPantallaVentasAdm() {
		return "pantalla_ventas_admin";
	}
	
	@RequestMapping("/pantallaVentas")
	public String showPantallaVentas() {
		return "pantalla_ventas";
	}
	
	@RequestMapping("/bajos")
	public String showBajos(){
		return "bajos";
	}
	@RequestMapping("/guitarras")
	public String showGuitarras() {
		return "guitarras";
	}
	@RequestMapping("/location")
	public String showLocation() {
		return "location";
	}
	@RequestMapping("/usuarios")
	public String showUsuarios() {
		return "usuarios";
	}
	@RequestMapping("/springLog")
	public String ShowSpringlog(Model model) {
		Empleado empleado= new Empleado();
		model.addAttribute("empleado", empleado);
		return "loginSpring";
	}
	
}
