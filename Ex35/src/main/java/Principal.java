/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author luiz
 */
public class Principal {
    public static void main(String[] args) {
        Animal cachorro1 = new Cachorro("Rex");
        cachorro1.produzirSom();
        cachorro1.mover();

        Animal ave1 = new Ave("Pardal");
        ave1.produzirSom();
        ave1.mover();
    }
}
