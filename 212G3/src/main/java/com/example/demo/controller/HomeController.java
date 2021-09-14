package com.example.demo.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	//Definir os endereços de acesso ao site
	//Localhost:8080/
	@GetMapping("/")
	public ModelAndView menu() {
		return new ModelAndView("paginaMenu");
	}
	
	//Localhost:8080/clientes
	@GetMapping("/clientes")
    public ModelAndView cadastrarCliente() {
        return new ModelAndView("cadastrarCliente");
    }
    @GetMapping("/fornecedores")
    public ModelAndView cadastrarFornecedor() {
        return new ModelAndView("cadastrarFornecedor");
    }
}
