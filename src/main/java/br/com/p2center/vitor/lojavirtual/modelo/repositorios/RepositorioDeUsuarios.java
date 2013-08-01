package br.com.p2center.vitor.lojavirtual.modelo.repositorios;

import br.com.p2center.vitor.lojavirtual.representacoes.Usuario;

public interface RepositorioDeUsuarios {

    void adiciona(Usuario usuario);

    Usuario carrega(Usuario usuario);

    boolean existeUsuario(Usuario usuario);

}
