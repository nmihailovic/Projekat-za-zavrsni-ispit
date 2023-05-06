/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modeli;

/**
 *
 * @author Nikola
 */
public class PolaznikFactoryImpl implements PolaznikFactory {
    @Override
    public Polaznik createPolaznik(int id, String ime, String prezime, String pol, String brojTelefona, String grupa, String trener, String vrstaTreninga, byte[] slika, String korisnickoIme, String lozinka, String datum) {
        return new Polaznik(id, ime, prezime, pol, brojTelefona, grupa, trener, vrstaTreninga, slika, korisnickoIme, lozinka, datum);
    }
}