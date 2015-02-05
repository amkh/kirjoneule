package kirjoneulegeneraattori;

import java.util.ArrayList;

/*
 Hakemistossa on muistissa valmiit mallit. Hakeminen tapahtuu nimellä.
 */
public class Hakemisto {

    private ArrayList<Malli> hakemisto;

    public Hakemisto() {

        hakemisto = new ArrayList<Malli>();

    }

    /**
     * metodi lisää mallin listaan.
     *
     * @param malli Lisättävä malli
     */
    public void lisaaMalli(Malli malli) {

        hakemisto.add(malli);
    }

    /**
     * Metodi etsii mallin nimen avulla.
     *
     * @param nimi Etsittävän mallin nimi
     * @return haluttu malli
     */
    public Malli haeMalli(String nimi) {

        for (Malli m : hakemisto) {
            if (m.nimi().equals(nimi)) {
                return m;

            }

        }
        return null;
    }

    /**
     * Metodi poistaa mallin hakemistosta
     *
     * @param malli Poistettava malli
     */

    public void poistaMalli(Malli malli) {

        if (hakemisto.contains(malli)) {
            hakemisto.remove(malli);
        }

    }

}
