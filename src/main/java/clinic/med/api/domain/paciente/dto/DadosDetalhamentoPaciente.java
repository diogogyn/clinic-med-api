package clinic.med.api.domain.paciente.dto;

import clinic.med.api.domain.endereco.Endereco;
import clinic.med.api.domain.paciente.Paciente;

public record DadosDetalhamentoPaciente(Long id, Boolean ativo, String nome, String email, String cpf, String telefone, Endereco endereco) {

    public DadosDetalhamentoPaciente(Paciente paciente) {
        this(paciente.getId(), paciente.getAtivo(), paciente.getNome(), paciente.getEmail(), paciente.getCpf(), paciente.getTelefone(), paciente.getEndereco());
    }
}
