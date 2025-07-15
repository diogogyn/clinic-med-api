package clinic.med.api.domain.consulta.validacoes.agendamento;

import clinic.med.api.domain.consulta.dto.DadosAgendamentoConsulta;

public interface ValidadorAgendamentoConsulta {

    void validar(DadosAgendamentoConsulta dados);

}
