package br.com.p2center.vitor.lojavirtual.modelo.repositorios;

import java.util.List;

import br.com.p2center.vitor.lojavirtual.representacoes.Produto;

public interface RepositorioDeProdutos {

    void atualiza(Produto produto);

    List<Produto> busca(String nome);

    Produto carrega(Long id);

    void exclui(Produto produto);

    List<Produto> lista();

    void recarrega(Produto produto);

    void salva(Produto produto);

}
