/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modeli;


import modeli.Polaznik;

/**
 *
 * @author Nikola
 */
public interface PolaznikFactory {
    Polaznik createPolaznik(int id, String ime, String prezime, String pol, String brojTelefona, String grupa, String trener, String vrstaTreninga, byte[] slika, String korisnickoIme, String lozinka, String datum);
}

