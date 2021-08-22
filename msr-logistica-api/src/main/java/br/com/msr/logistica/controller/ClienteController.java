package br.com.msr.logistica.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.msr.logistica.model.Cliente;

@RestController
public class ClienteController {
	
	@GetMapping("/clientes")
	public List<Cliente> lista(){
		var cliente1 = new Cliente();
		cliente1.setId(1L);
		cliente1.setNome("Marcos");
		cliente1.setTelefone("73 1111-2222");
		cliente1.setEmail("marcos@email.com");
		
		var cliente2 = new Cliente();
		cliente2.setId(1L);
		cliente2.setNome("Carol");
		cliente2.setTelefone("73 3333-4444");
		cliente2.setEmail("carol@email.com");
				
		return Arrays.asList(cliente1,cliente2);
	}

}
