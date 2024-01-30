
package inheritance;


public class Bola extends BangunRuang{
       float r;
       
      @Override
    float volume(){
        float volume = (float) (r * r * r);
        System.out.println("Volume Bola: " + volume);
        return 0;
    }
     @Override
    float luaspermukaan(){
        float luaspermukaan = (float) (4 * Math.PI * r* r);
        System.out.println("Luas Permukaan Bola: " + luaspermukaan);
        return 0;
}
}
