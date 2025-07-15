package clinic.med.api.domain.paciente.dto;

import jakarta.validation.constraints.NotNull;
import clinic.med.api.domain.endereco.dto.DadosEndereco;

public record DadosAtualizacaoPaciente(
        @NotNull
        Long id,
        String nome,
        String telefone,
        DadosEndereco endereco) {
}
