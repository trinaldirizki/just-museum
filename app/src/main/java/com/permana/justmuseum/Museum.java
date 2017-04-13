package com.permana.justmuseum;

/**
 * Created by TRINALDI on 19-Feb-17.
 */

public class Museum {
    private String name;
    private int imageResourceId;
    private String description;

    private Museum(String name,int imageResourceId,String description){
        this.name = name;
        this.imageResourceId = imageResourceId;
        this.description = description;

    }

    public static final Museum[] museums = {
            new Museum("Hagia Sophia",R.drawable.hagiasophia_pic,"Hagia Sophia was choosen a world heritage site by UNESCO in 1985. Rebuilt by the orders of Emperor Justinian in 537, for 900 years Hagia Sophia had been the center of Orthodox Christianity until 1453 when the city was concurred by Ottomans. 500 years following the conquest of Muslims, it became a jewel for the Muslim world and as the grand mosque of the sultans. In 1935, Hagia Sophia had been converted into a museum of Turkish Republic by the orders of Ataturk, and became one of the most significant monuments not only in Turkey but on earth with its architecture and its historical richness.\n"),
            new Museum("Miniatürk",R.drawable.miniaturk_pic,"Miniatürk is a miniature park situated at the north-eastern shore of Golden Horn in Istanbul, Turkey. It was opened May 2, 2003. Miniatürk covers a total area of 60,000 square metres (650,000 sq ft). It is one of the world's largest miniature parks with its 15,000 m2 (160,000 sq ft) model area. The park contains 122 models in 1:25 scale. It contains structures from in and around Turkey, as well as interpretations of historic structures.\n"),
            new Museum("Panorama 1453",R.drawable.panorama_pic,"Panorama 1453 Museum of History was opened by on January 31, 2009 upon participation of the Prime Minister Recep Tayyip Erdoğan, and Istanbul metropolitan Municipality gained the museum for our city. As it is situated across the city walls of Topkapı-Edirnekapı where the siege took place, Panorama 1453 Museum of History functions as the gateways that open up the city of Istanbul to the history, and is operated by Kültür A.Ş. Honoured by intense interests from the people following the opening, the cultural venue has been visited Abdullah Gül, the President of Republic, in addition to many significant figures of the state recently.\n"),
            new Museum("Dolmabahçe Palace",R.drawable.dolmabahce_pic,"Dolmabahçe Palace (Turkish: Dolmabahçe Sarayı, IPA: [doɫmabahˈtʃe saɾaˈjɯ]) located in the Beşiktaş district of Istanbul, Turkey, on the European coastline of the Bosphorus strait, served as the main administrative center of the Ottoman Empire from 1856 to 1887 and 1909 to 1922 (with Yıldız Palace being used in the interim).\n")
    };

    public String getName(){
        return name;
    }

    public int getImageResourceId(){
        return imageResourceId;
    }

    public String getDescription(){
        return description;
    }
}
