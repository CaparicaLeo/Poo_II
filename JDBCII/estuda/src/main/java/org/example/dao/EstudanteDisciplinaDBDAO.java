package org.example.dao;

import org.example.model.EstudanteDisciplina;

import java.sql.SQLException;
import java.util.List;

public class EstudanteDisciplinaDBDAO implements EstudanteDisciplinaDAO, IConst{

    @Override
    public void insere(EstudanteDisciplina estudanteDisciplina) throws SQLException {

    }

    @Override
    public void atualiza(EstudanteDisciplina estudanteDisciplina) throws SQLException {

    }

    @Override
    public void remove(EstudanteDisciplina estudanteDisciplina) throws SQLException {

    }

    @Override
    public EstudanteDisciplina buscaPorCodigo(int estudanteDisciplina_estudanteID) throws SQLException {
        return null;
    }

    @Override
    public List<EstudanteDisciplina> listTodos() throws SQLException {
        return List.of();
    }
}
