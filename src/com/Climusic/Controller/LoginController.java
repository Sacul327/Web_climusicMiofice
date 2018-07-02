package com.Climusic.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import com.Climusic.Modelos.Empleado;

import com.Climusic.Service.LoginService;

@Controller
public class LoginController {
	
	@Autowired
	private LoginService loginService;
	
	@RequestMapping(value="/empleado/ingreso",method=RequestMethod.POST)
	public String handlAdmin(@ModelAttribute("empleado") Empleado empleadoForm, Model model, RedirectAttributes ra
			/*,@RequestParam("fuera") String fuera*/) {
		model.addAttribute("login", new Login());
		if(empleadoForm.getEmail()!=null) {
			if(loginService.checkUser(empleadoForm.getEmail(), empleadoForm.getPassword()) && loginService.comprueboAdmin(empleadoForm.getEmail())) {
				return "/PantallaVentasAdm";
			}
		}
		return "/"; //Redirect envia parametros a otro metodo
	}
}
