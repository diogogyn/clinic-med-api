package clinic.med.api.domain.medico.dto;


import clinic.med.api.domain.endereco.Endereco;
import clinic.med.api.domain.medico.Especialidade;
import clinic.med.api.domain.medico.Medico;

public record DadosDetalhamentoMedico(Long id, Boolean ativo, String nome, String email, String crm, String telefone, Especialidade especialidade, Endereco endereco) {

    public DadosDetalhamentoMedico(Medico medico) {
        this(medico.getId(), medico.getAtivo(), medico.getNome(), medico.getEmail(), medico.getCrm(), medico.getTelefone(), medico.getEspecialidade(), medico.getEndereco());
    }
}
