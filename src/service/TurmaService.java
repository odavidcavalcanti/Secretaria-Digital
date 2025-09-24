package service;

import model.Aluno;
import model.Turma;

import java.util.ArrayList;
import java.util.List;

public class TurmaService {
    private List<Turma> turmas;
    private long proximoId;

    // Construtor
    public TurmaService() {
        this.turmas = new ArrayList<>();
        this.proximoId = 1L;
    }

    // Métodos
    public void cadatrarTurma(Turma turma) {
        this.turmas.add(turma);
        turma.setIdTurma(proximoId++);
        }

        //Listagem das turmas
        public List<Turma> listarTurmas() {
        return this.turmas;
        }

        // Busca turma por Id
        public Turma buscarTurma(long idTurma) {
        for  (Turma turma : this.turmas) {
            if(turma.getIdTurma() == idTurma) {
                return turma;
            }
        }
        return null;
        }

    }


