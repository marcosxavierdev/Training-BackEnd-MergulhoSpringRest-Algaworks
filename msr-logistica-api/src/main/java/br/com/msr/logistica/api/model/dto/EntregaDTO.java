package br.com.msr.logistica.api.model.dto;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

import br.com.msr.logistica.domain.model.StatusEntrega;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EntregaDTO {
	
	private Long id;
	private ClienteResumoDTO cliente;
	private DestinatarioDTO destinatario;
	private BigDecimal taxa;
	private StatusEntrega status;
	private OffsetDateTime dataPedido;
	private OffsetDateTime dataFinalizacao;
	

}
