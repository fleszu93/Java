package zadanie5;

public class Zadanie5 {
    public static void main(String[] args) throws Exception {   //wymaga to pewnej dodatkowej zmiany w kodzie
        Len("Alamakota");
        
        try {
            Len(null);
        }
        catch(NullPointerException ex) {
            /*ex.printStackTrace();
            throw ex;   // ślady są takie same
            
            ex.printStackTrace();
            ex.fillInStackTrace();
            throw ex;   // ślady są inne*/
            
            throw new Exception(ex);
        }
    }
    
    static void Len(String napis) {
        System.out.println(napis.length());
    }
}
