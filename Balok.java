
package inheritance;

    public class Balok extends BangunRuang {
    float panjang;
    float lebar;
    float tinggi;
      
    @Override
    float volume(){
        float volume = panjang * lebar* tinggi;
        System.out.println("Volume Balok: " + volume);
        return volume;
    }
     @Override
    float luaspermukaan(){
        float luaspermukaan = 2*(panjang *lebar + lebar* tinggi + panjang* tinggi);
        System.out.println("Luas Permukaan Balok: " + luaspermukaan);
        return luaspermukaan;
    }
    }
   
    

