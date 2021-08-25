package br.com.msr.logistica.api.assembler;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import br.com.msr.logistica.api.model.dto.OcorrenciaDTO;
import br.com.msr.logistica.api.model.form.OcorrenciaForm;
import br.com.msr.logistica.domain.model.Entrega;
import br.com.msr.logistica.domain.model.Ocorrencia;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Component
public class OcorrenciaAssembler {
	
	private ModelMapper modelMapper;
	
	public OcorrenciaDTO toModel(Ocorrencia  ocorrencia) {
		return modelMapper.map(ocorrencia, OcorrenciaDTO.class);
	}
	
	public List<OcorrenciaDTO> toCollectionModel (List<Ocorrencia> ocorrencia){
		return ocorrencia.stream().map(this::toModel).collect(Collectors.toList());
	}
	
	public Ocorrencia toEntity(OcorrenciaForm ocorrenciaForm) {
		return modelMapper.map(ocorrenciaForm,Ocorrencia.class);
		
	}

}
