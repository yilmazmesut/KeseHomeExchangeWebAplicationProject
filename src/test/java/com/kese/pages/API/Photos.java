package com.kese.pages.API;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class Photos {


    public Map<String,File> PhotosMap() {

        File photo0 = new File(System.getProperty("user.dir")+"/src/test/resources/pictures/1.jpg");
        File photo1 = new File(System.getProperty("user.dir")+"/src/test/resources/pictures/2.jpg");
        File photo2 = new File(System.getProperty("user.dir")+"/src/test/resources/pictures/3.jpg");
        File photo3 = new File(System.getProperty("user.dir")+"/src/test/resources/pictures/4.jpg");
        File photo4 = new File(System.getProperty("user.dir")+"/src/test/resources/pictures/5.jpg");

        Map<String, File> photos = new HashMap<String, File>();


        photos.put("photo0", photo0 );
        photos.put("photo1", photo1 );
        photos.put("photo2", photo2 );
        photos.put("photo3", photo3 );
        photos.put("photo4", photo4 );

        return photos;
    }

    public Map<String,File> carPhotosMap() {

        File photo0 = new File(System.getProperty("user.dir")+"/src/test/resources/pictures/car1.jpg");
        File photo1 = new File(System.getProperty("user.dir")+"/src/test/resources/pictures/car2.jpg");
        File photo2 = new File(System.getProperty("user.dir")+"/src/test/resources/pictures/car3.jpg");
        File photo3 = new File(System.getProperty("user.dir")+"/src/test/resources/pictures/car4.jpg");
        File photo4 = new File(System.getProperty("user.dir")+"/src/test/resources/pictures/car5.jpg");

        Map<String, File> photos = new HashMap<String, File>();


        photos.put("photo0", photo0 );
        photos.put("photo1", photo1 );
        photos.put("photo2", photo2 );
        photos.put("photo3", photo3 );
        photos.put("photo4", photo4 );

        return photos;
    }


}
