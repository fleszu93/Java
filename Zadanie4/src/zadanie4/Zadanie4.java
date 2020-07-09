package zadanie4;

public class Zadanie4 {
    public static void main(String[] args) {
        UczeńKlasy u = new UczeńKlasy();
        
        java.util.Scanner s = new java.util.Scanner(System.in);
        u.Ustaw_Imię(s.nextLine());
        u.Ustaw_Nazwisko(s.nextLine());
        u.Ustaw_Pesel(s.nextLine());
        u.Ustaw_klasę(s.nextInt());
        
        System.out.println(u);
    }
}

class Uczeń {
    String Imię, Nazwisko, Pesel;
    
    public void Ustaw_Imię(String imię) {
        this.Imię = imię;
    }
    
    public void Ustaw_Nazwisko(String nazwisko) {
        this.Nazwisko = nazwisko;
    }
    
    public void Ustaw_Pesel(String pesel) {
        this.Pesel = pesel;
    }
}

class UczeńSzkoły extends Uczeń {
    String Nazwa_szkoły;
    
    public void Ustaw_szkołę(String szkoła) {
        this.Nazwa_szkoły = szkoła;
    }
}

class UczeńKlasy extends Uczeń {
    int Klasa;
    
    public void Ustaw_klasę(int klasa) {
        this.Klasa = klasa;
    }
    
    public String toString() { 
        return String.format(Imię + " " + Nazwisko + " (" + Pesel + "), klasa " + Klasa);
    } 
}