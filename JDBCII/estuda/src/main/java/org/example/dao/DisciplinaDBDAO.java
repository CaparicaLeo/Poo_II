package org.example.dao;

import org.example.model.Disciplina;
import org.example.model.Estudante;

import java.sql.SQLException;
import java.util.List;

public class DisciplinaDBDAO implements DisciplinaDAO, IConst{
    @Override
    public void insere(Disciplina disciplina) throws SQLException {

    }

    @Override
    public void atualiza(Disciplina disciplina) throws SQLException {

    }

    @Override
    public void remove(Disciplina disciplina) throws SQLException {

    }

    @Override
    public Disciplina buscaPorCodigo(int disciplinaID) throws SQLException {
        return null;
    }

    @Override
    public List<Disciplina> listTodos() throws SQLException {
        return List.of();
    }
}
