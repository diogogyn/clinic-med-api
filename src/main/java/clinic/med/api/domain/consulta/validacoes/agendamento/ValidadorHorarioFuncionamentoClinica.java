package clinic.med.api.domain.consulta.validacoes.agendamento;

import clinic.med.api.domain.ValidacaoException;
import clinic.med.api.domain.consulta.dto.DadosAgendamentoConsulta;
import org.springframework.stereotype.Component;

import java.time.DayOfWeek;
@Component
public class ValidadorHorarioFuncionamentoClinica implements ValidadorAgendamentoConsulta {

    public void validar(DadosAgendamentoConsulta dados) {
        var dataConsulta = dados.data();

        var domingo = dataConsulta.getDayOfWeek().equals(DayOfWeek.SUNDAY);
        var antesDaAberturaDaClinica = dataConsulta.getHour() < 7;
        var depoisDoEncerramentoDaClinica = dataConsulta.getHour() > 18;
        if (domingo || antesDaAberturaDaClinica || depoisDoEncerramentoDaClinica) {
            throw new ValidacaoException("Consulta fora do horário de funcionamento da clínica");
        }
    }

}
