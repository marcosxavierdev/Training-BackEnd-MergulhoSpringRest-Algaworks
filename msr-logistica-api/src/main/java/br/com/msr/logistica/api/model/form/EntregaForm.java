package br.com.msr.logistica.api.model.form;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EntregaForm {
	
	@Valid
	@NotNull
	private ClienteIdForm cliente;
	
	@Valid
	@NotNull
	private DestinatarioForm destinatario;
	
	@NotNull
	private BigDecimal taxa;

	

}
