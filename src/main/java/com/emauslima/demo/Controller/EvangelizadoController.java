package com.emauslima.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EvangelizadoController {

	@GetMapping("/listar/evangelizado")
	public String listar() {
		return "evangelizado/listar";
	}
	@GetMapping("/registrar/evangelizado")
	public String registar() {
		return "evangelizado/registrar";
	}
	@GetMapping("/home")
	public String home() {
		return "index";
	}
}
