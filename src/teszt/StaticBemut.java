package teszt;

import beugrok.Szamolas;

public class StaticBemut {
    
    public static void main(String[] args) {
        /* static metódust ajánlott az osztály nevével minősíteni
           nem ajánlott: tesztEsetek();
           ajánlott: */
        StaticBemut.tesztEsetek();
        
        Szamolas.main(args);
        
    }

    /* Csak static-ot lát, ezek -egyenlőre- nem léteznek (m1,m2)
    private void m1() {
        
    }
    
    void m2() {
        
    }
    */
    
    static void m3() {
        
    }
    
    private static void tesztEsetek() {
        
    }
    
}
