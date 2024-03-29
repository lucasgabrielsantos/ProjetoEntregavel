package br.com.digitalhouse;

import java.util.Date;

public class Matricula {

    private Aluno aluno;
    private Curso curso;
    private Date date;

    public Matricula(Aluno aluno, Curso Curso) {
        this.aluno = aluno;
        this.curso = curso;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

}