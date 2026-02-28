package br.com.forum_hub.domain.perfil;

import br.com.forum_hub.domain.PerfilNome;
import jakarta.persistence.*;
import org.springframework.security.core.GrantedAuthority;

@Entity
@Table(name = "perfil")
public class Perfil implements GrantedAuthority {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Enumerated(EnumType.STRING)
    private PerfilNome nome;

    @Override
    public String getAuthority() {
        return "ROLE_" + this.nome;
    }
}