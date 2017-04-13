package com.permana.justmuseum;

/**
 * Created by TRINALDI on 19-Feb-17.
 */

public class City {
    private String name;
    private int imageResourceId;
    private String description;

    private City(String name,int imageResourceId,String description){
        this.name = name;
        this.imageResourceId = imageResourceId;
        this.description = description;
    }

    public static final City[] cities = {
            new City("Istanbul",R.drawable.istanbul_pic,"Istanbul (UK /ɪstænbʊl/ or US /-stɑːn-/;[7][8] Turkish: İstanbul [isˈtɑnbuɫ] ( listen)), historically known as Constantinople and Byzantium, is the most populous city in Turkey and the country's economic, cultural, and historic center. Istanbul is a transcontinental city in Eurasia, straddling the Bosphorus strait (which separates Europe and Asia) between the Sea of Marmara and the Black Sea. Its commercial and historical center lies on the European side and about a third of its population lives on the Asian side.[9] The city is the administrative center of the Istanbul Metropolitan Municipality (coterminous with Istanbul Province), both hosting a population of around 14.7 million residents.[3] Istanbul is one of the world's most populous cities and ranks as the world's 7th-largest city proper and the largest European city.\n"),
            new City("Ankara",R.drawable.ankara_pic,"Ankara (English /ˈæŋkərə/;[2] Turkish [ˈaŋ.ka.ɾa] ( listen)), formerly known as Ancyra and Angora, is the capital of the Republic of Turkey. With a population of 4,587,558 in the urban center (2014) and 5,150,072 in its province (2015),[1] it is Turkey's second largest city after Istanbul.\n"),
            new City("Edirne",R.drawable.edirne_pic,"Edirne (Turkish pronunciation: [eˈdiɾne]), is a city in the northwestern Turkish province of Edirne, in the region of East Thrace, close to Turkey's borders with Greece and Bulgaria. Edirne served as the third capital city of the Ottoman Empire from 1363 to 1453,[2] before Constantinople (present-day Istanbul) became the empire's fourth and final capital. At present, Edirne is the capital of Edirne Province in Turkish Thrace. The city's estimated population in 2014 was 165,979.\n"),
            new City("Kayseri",R.drawable.kayseri_pic,"Kayseri (Turkish pronunciation: [ˈkajseɾi]) is a large and industrialized city in Central Anatolia, Turkey. It is the seat of Kayseri Province. The city of Kayseri, as defined by the boundaries of Kayseri Metropolitan Municipality, is structurally composed of five metropolitan districts, the two core districts of Kocasinan and Melikgazi, and since 2004, also Hacılar, İncesu and Talas.\n"),
            new City("Konya",R.drawable.konya_pic,"Konya (Turkish pronunciation: [ˈkon.ja]; Greek: Ἰκόνιον Ikónion, Latin: Iconium) is a major city in the Central Anatolia Region of Turkey. It is the seventh-most-populous city in Turkey. As of 2014, Konya has a population of 1,174,536.[1] Konya is an economically and industrially developed city[2][3][4] and the capital of Konya Province.\n")
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
