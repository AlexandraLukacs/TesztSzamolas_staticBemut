package teszt;

import beugrok.Szamolas;

public class TesztSzamolas {
    
    public static void main(String[] args) {
        TesztSzamolas.TesztEsetek();
    }

    private static void TesztEsetek() {
       osszeadas2PozitivTeszt();
       osszeadas1neg1pozTeszt();
       osszeadas1poz1negTeszt();
       osszeadas2NegativTeszt();
       negyzetgyokNegativTeszt();
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
    
    private static void negyzetgyokNegativTeszt() {
        System.out.println("negatív gyök");
        double kapott = Szamolas.gyokvonas(-1);
        System.out.println("kapott = " + kapott);
        double vart = Double.NaN;
        //if(kapott == vart){
        if(Double.isNaN(kapott)){
            System.out.println("Jó a teszt");
        }else{
            System.out.println("NEM jó a teszt");
        }
        
        //assert kapott == vart:"NEM jó a teszt";
    }

    
    
    
    
   
    
    
    
}
