
package inheritance;

public class Kubus extends BangunRuang {
    float sisi;  
    
     @Override
    float volume(){
        float volume = sisi * sisi* sisi;
        System.out.println("Volume Kubus: " + volume);
        return volume;
    }
     @Override
    float luaspermukaan(){
        float luaspermukaan =6* sisi* sisi;
        System.out.println("Keliling Kubus: " + luaspermukaan);
        return 0;
    }
}