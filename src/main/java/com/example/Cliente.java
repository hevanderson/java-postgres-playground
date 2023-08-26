package com.example;

class Cliente{
    private double renda;
    private char sexo;
    private int anoNascimento;

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    } 

    public double getRenda(){
        return renda;
    }

    public char getSexo(){
        return sexo;
    }

    public int getAnoNascimento(){
        return anoNascimento;
    }

    public void setRenda(double renda){
        if (renda >= 0){
            this.renda = renda;
        }
        else{
            System.out.println("A renda deve ser maior do que zero");
        }

    }

}