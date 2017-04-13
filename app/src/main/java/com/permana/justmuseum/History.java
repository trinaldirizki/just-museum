package com.permana.justmuseum;

/**
 * Created by TRINALDI on 19-Feb-17.
 */

public class History {
    private String name;
    private int imageResourceId;
    private String description;

    private History(String name,int imageResourceId,String description){
        this.name = name;
        this.imageResourceId = imageResourceId;
        this.description = description;
    }

    public static final History[] histories = {
            new History("Conquest of Istanbul",R.drawable.conquest_pic,"The Conquest of Istanbul (The Fall of Constantinople) was the capture of the capital of the Byzantine Empire by an invading army of the Ottoman Empire on 29 May 1453. The Ottomans were commanded by the then 21-year-old Mehmed the Conqueror, the seventh sultan of the Ottoman Empire, who defeated an army commanded by Byzantine Emperor Constantine XI Palaiologos. The conquest of Constantinople followed a 53-day siege that had begun on 6 April 1453.\n"),
            new History("Republic of Turkey",R.drawable.turkey_pic,"The Republic of Turkey was created after the overthrow of Sultan Mehmet VI Vahdettin by the new Republican Parliament in 1922. This new regime delivered the coup de grâce to the Ottoman state which had been practically wiped away from the world stage following the First World War.\n")
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
