

package kirjoneulegeneraattori;

import java.util.Scanner;


public class Kayttoliittyma {
    private Scanner lukija;
    public kayttoliittyma(Scanner lukija){
        this.lukija=lukija;
    }
    public void kaynnista(){
        while(true){
            String komento=lukija.nextLine();
        }
        if(komento.equals("lopeta")){
            break;
        }
    }
}
