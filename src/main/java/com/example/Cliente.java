package com.example;

class Cliente{
    private double renda;
    private char sexo;
    private int anoNascimento;
    private boolean especial = true;

    public boolean isEspecial() {
        return especial;
    }

    public void setEspecial(boolean especial) {
        this.especial = especial;
    }

    public Cliente(){
        System.out.println("Criando um novo cliente");
    }

    public Cliente(double renda){
        this();
        //System.out.println("Criando um novo cliente");
        this.setRenda(renda);
        if (this.renda > 10000) {
            this.especial = true;
        }
    }

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