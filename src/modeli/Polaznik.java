/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modeli;

//PolaznikFactory polaznikFactory = new PolaznikFactoryImpl();
//Polaznik polaznik = polaznikFactory.createPolaznik(1, "Marko", "Markovic", "Muski", "123456789", "Grupa 1", "Trener 1", "Kardio", null, "marko", "password", "2022-02-01");

 //* @author Nikola
// */
    public class Polaznik {
    private int id;
    private String ime;
    private String prezime;
    private String pol;
    private String broj_telefona;
    private PolaznikDetalji polaznikDetalji;

    public Polaznik(int id, String ime, String prezime, String pol, String broj_telefona, String polaznikDetalji, String trener, String vrstaTreninga, byte[] slika, String korisnickoIme, String lozinka, String datum) {
        this.id = id;
        this.ime = ime;
        this.prezime = prezime;
        this.pol = pol;
        this.broj_telefona = broj_telefona;
        this.polaznikDetalji = this.polaznikDetalji;
    }

    public void prikaziDetalje() {
        System.out.println("Ime: " + ime);
        System.out.println("Prezime: " + prezime);
        System.out.println("Pol: " + pol);
        System.out.println("Broj telefona: " + broj_telefona);
        System.out.println("Grupa: " + polaznikDetalji.getGrupa());
        System.out.println("Trener: " + polaznikDetalji.getTrener());
        System.out.println("Vrsta treninga: " + polaznikDetalji.getVrstaTreninga());
        System.out.println("Slika: " + polaznikDetalji.getSlika());
        System.out.println("Korisnicko ime: " + polaznikDetalji.getKorisnickoIme());
        System.out.println("Lozinka: " + polaznikDetalji.getLozinka());
        System.out.println("Datum: " + polaznikDetalji.getDatum());
    }

    public static class PolaznikDetalji {
        private String grupa;
        private String trener;
        private String vrstaTreninga;
        private byte[] slika;
        private String korisnickoIme;
        private String lozinka;
        private String datum;
    
     public PolaznikDetalji(String grupa, String trener, String vrstaTreninga, byte[] slika, String korisnickoIme, String lozinka, String datum) {
            this.grupa = grupa;
            this.trener = trener;
            this.vrstaTreninga = vrstaTreninga;
            this.slika = slika;
            this.korisnickoIme = korisnickoIme;
            this.lozinka = lozinka;
            this.datum = datum;
        }

        public String getGrupa() {
            return grupa;
        }

        public String getTrener() {
            return trener;
        }

        public String getVrstaTreninga() {
            return vrstaTreninga;
        }

        public byte[] getSlika() {
            return slika;
        }

        public String getKorisnickoIme() {
            return korisnickoIme;
        }

        public String getLozinka() {
            return lozinka;
        }

        public String getDatum() {
            return datum;
        }
    }
}


