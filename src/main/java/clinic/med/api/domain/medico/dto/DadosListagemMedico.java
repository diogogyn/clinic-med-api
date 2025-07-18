package clinic.med.api.domain.medico.dto;

import clinic.med.api.domain.medico.Especialidade;
import clinic.med.api.domain.medico.Medico;

public record DadosListagemMedico(Long id, Boolean ativo, String nome, String email, String crm, Especialidade especialidade) {

    public DadosListagemMedico(Medico medico) {
        this(medico.getId(), medico.getAtivo(), medico.getNome(), medico.getEmail(), medico.getCrm(), medico.getEspecialidade());
    }

}
