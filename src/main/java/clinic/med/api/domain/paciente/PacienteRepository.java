package clinic.med.api.domain.paciente;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface PacienteRepository extends JpaRepository<Paciente, Long> {
    @Query("""
            select p.ativo
            from Paciente p
            where
            p.id = :id
            """)
    boolean findAtivoById(Long id);

    boolean existsByEmailOrCpf(String email, String cpf);

}
