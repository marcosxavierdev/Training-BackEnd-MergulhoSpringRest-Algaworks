package br.com.msr.logistica.api.model.form;

import javax.validation.constraints.NotBlank;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OcorrenciaForm {

	@NotBlank
	private String descricao;
}
