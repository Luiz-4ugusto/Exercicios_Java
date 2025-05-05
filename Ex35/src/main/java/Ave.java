/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author luiza
 */
public class Ave implements Animal {
    private String nome;

    public Ave() {
        this(" ");
    }

    public Ave(String nome) {
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
        System.out.println("ela pia");
    }

    @Override
    public void mover() {
        System.out.println("ela voa");
    }
}

