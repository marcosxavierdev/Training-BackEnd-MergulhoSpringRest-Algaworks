package br.com.msr.logistica.domain.service;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.msr.logistica.domain.exception.NegocioException;
import br.com.msr.logistica.domain.model.Cliente;
import br.com.msr.logistica.domain.model.Entrega;
import br.com.msr.logistica.domain.model.StatusEntrega;
import br.com.msr.logistica.domain.repository.ClienteRepository;
import br.com.msr.logistica.domain.repository.EntregaRepository;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class SolicitacaoEntregaService {
	
	private CatalogoClienteService catalogoClienteService;
	private EntregaRepository entregaRepository;
	
	@Transactional
	public Entrega solicita (Entrega entrega) {
		Cliente cliente = catalogoClienteService.busca(entrega.getCliente().getId());

		entrega.setCliente(cliente);
		entrega.setStatus(StatusEntrega.PENDENTE);
		entrega.setDataPedido(LocalDateTime.now());
		return entregaRepository.save(entrega);
	}
}
