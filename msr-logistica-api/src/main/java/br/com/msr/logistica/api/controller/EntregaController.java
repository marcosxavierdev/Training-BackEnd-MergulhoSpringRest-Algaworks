package br.com.msr.logistica.api.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.msr.logistica.domain.model.Entrega;
import br.com.msr.logistica.domain.service.SolicitacaoEntregaService;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping("/entregas")
public class EntregaController {
	
	private SolicitacaoEntregaService solicitacaoEntregaService;
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Entrega solicita (@RequestBody Entrega entrega) {
		return solicitacaoEntregaService.solicita(entrega);
	}
}
