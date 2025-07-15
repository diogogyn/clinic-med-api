package clinic.med.api.domain.paciente;

import clinic.med.api.domain.ValidacaoException;
import clinic.med.api.domain.paciente.dto.DadosCadastroPaciente;
import clinic.med.api.domain.paciente.dto.DadosDetalhamentoPaciente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CadastroPacienteService {

    @Autowired
    private PacienteRepository repository;

    public DadosDetalhamentoPaciente cadastrar(DadosCadastroPaciente dados) {
        var jaCadastrado = repository.existsByEmailOrCpf(dados.email(), dados.cpf());
        if (jaCadastrado) {
            throw new ValidacaoException("Já existe outro paciente com o email ou cpf informado!");
        }

        var paciente = new Paciente(dados);
        repository.save(paciente);
        return new DadosDetalhamentoPaciente(paciente);
    }

}
