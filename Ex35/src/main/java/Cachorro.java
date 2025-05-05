/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author luiza
 */
public class Cachorro implements Animal {
    private String nome;

    public Cachorro() {
        this(" ");
    }

    public Cachorro(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public void produzirSom() {
        System.out.println("ele faz au");
    }

    @Override
    public void mover() {
        System.out.println("ele anda");
    }
}
