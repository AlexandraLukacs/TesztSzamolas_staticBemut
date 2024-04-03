package teszt;

import beugrok.Szamolas;

public class TesztSzamolas {
    
    public static void main(String[] args) {
        TesztSzamolas.TesztEsetk();
    }

    private static void TesztEsetk() {
       osszeadas2PozitivTeszt();
       osszeadas1neg1pozTeszt();
       osszeadas1poz1negTeszt();
       osszeadas2NegativTeszt();
       osszeadas2Db3jegyűTeszt();
       osszeadas1poz1neg1tobbjegyuTeszt();
       osszeadas1poz2negTeszt();
    }

    private static void osszeadas2PozitivTeszt() {
        System.out.println("2 db pozitív");
        int kapott = Szamolas.osszegzes(1, 2);
        int vart = 3;
        
        assert kapott == vart:"NEM jó a teszt"; //assert engedélyezése: fájl->properties->run->vm options->-ea
        /* assert nélkül: */
        /*
        if(kapott == vart){
            System.out.println("Jó a teszt");
        }else{
            System.out.println("NEM jó a teszt");
        }
        */
    }
    
    private static void osszeadas1neg1pozTeszt() {
        System.out.println("1 db +, 1 db -");
        int kapott = Szamolas.osszegzes(-1, 2);
        int vart = 1;
        
        assert kapott == vart:"NEM jó a teszt";
    }
    
    private static void osszeadas1poz1negTeszt() {
        System.out.println("1 db -, 1 db +");
        int kapott = Szamolas.osszegzes(1, -2);
        int vart = -1;
        
        assert kapott == vart:"NEM jó a teszt";
    }
    
    private static void osszeadas2NegativTeszt() {
        System.out.println("2 db negatív");
        int kapott = Szamolas.osszegzes(-1, -2);
        int vart = -3;
        
        assert kapott == vart:"NEM jó a teszt";
    }
    
    private static void osszeadas2Db3jegyűTeszt() {
        System.out.println("2 db 3 jegyű");
        int kapott = Szamolas.osszegzes(100, 200);
        int vart = 300;
        
        assert kapott == vart:"NEM jó a teszt";
    }
    
    private static void osszeadas1poz1neg1tobbjegyuTeszt() {
        System.out.println("1 db +, 1 db -, 1 db több jegyű");
        int kapott = Szamolas.osszegzes(new int[] {-1, 2, 300});
        int vart = 301;
        
        assert kapott == vart:"NEM jó a teszt";
    }
    
    private static void osszeadas1poz2negTeszt() {
        System.out.println("1 db +, 2 db -");
        int kapott = Szamolas.osszegzes(new int[] {1, -2, -3});
        int vart = -4;
        
        assert kapott == vart:"NEM jó a teszt";
    }
    
    
    
}
