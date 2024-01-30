
package inheritance;


public class LimasSegitiga extends BangunRuang {
    float a;
    float ts;
    float tl;
    float lst;
    
     @Override
    float volume(){
        float volume =a* ts/2 * tl/3;
        System.out.println("Volume Limas Segitiga: " + volume);
        return 0;
    }

     @Override
    float luaspermukaan(){
        float luaspermukaan =a* ts/2 + 3* lst;
        System.out.println("Keliling Persegi: " + luaspermukaan);
        return luaspermukaan;
    }
}
    

