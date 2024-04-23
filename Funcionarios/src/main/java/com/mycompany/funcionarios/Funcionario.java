package com.mycompany.funcionarios;

/**
 *
 * @author rafaz
 */
public class Funcionario {
    private String Nome;
    private String Cargo;
    private double Salario;
    
    public Funcionario(String Nome, String Cargo, double Salario)
    {
        this.Nome = Nome;
        this.Cargo = Cargo;
        this.Salario = Salario;
    }
    
    public void setNome(String Nome)
    {
        this.Nome = Nome;
    }
    
    public void setCargo(String Cargo)
    {
        this.Cargo = Cargo;
    }
    
    public void setSalario(double Salario)
    {
        this.Salario = Salario;    
    }
    
    public String getNome()
    {
        return Nome;
    }
    
    public String getCargo()
    {
        return Cargo;
    }
    
    public double getSalario()
    {
        return Salario;
    }
    
    public String toString() {
       return "Funcionario [Nome: " + Nome + ", Cargo: " + Cargo + ", Salario: " + Salario + "]";
    }
    
    public void aumentaSalario(double novoSalario)
    {
       this.setSalario(novoSalario);
    }
}