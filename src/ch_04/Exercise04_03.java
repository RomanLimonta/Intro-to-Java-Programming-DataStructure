package ch_04;

/*
* (Geography: estimate areas) Use the GPS locations for Atlanta, Georgia; Orlando, Florida; Savannah, Georgia: and
* Charlotte, North Carolina in the figure in Section 4.1 to compute the estimated area enclosed by these four cities.
* (Hint: Use the formula in Programming Exercise 4.2 to compute the distance between two cities. Divide the polygon
* into two triangles and use the formula in Programming Exercise 2.19 to compute the area of a triangle.)
*
* Atlanta = (33.7489954, -84.3879824)
* Orlando = (28.5383355, -81.3792365)
* Savannah =(32.0835407, -81.0998342)
* Charlotte = (35.2270869, -80.8431267)
*
* */

public class Exercise04_03 {

    public static void main(String[] args) {

        double AtlLat = Math.toRadians(33.7489954);
        double AtlLon = Math.toRadians(-84.3879824);

        double OrlLat = Math.toRadians(28.5383355);
        double OrlLon = Math.toRadians(-81.3792365);

        double SavLat = Math.toRadians(32.0835407);
        double SavLon = Math.toRadians(-81.0998342);

        double ChaLat = Math.toRadians(35.2270869);
        double ChaLon = Math.toRadians(-80.8431267);


        double atlToOrlDistance = 6371 * Math.acos( (Math.sin(AtlLat) * Math.sin(OrlLat)) + (Math.cos(AtlLat) * Math.cos(OrlLat) * Math.cos(AtlLon - OrlLon)));
        double orlToSavDistance = 6371 * Math.acos( (Math.sin(OrlLat) * Math.sin(SavLat)) + (Math.cos(OrlLat) * Math.cos(SavLat) * Math.cos(OrlLon - SavLon)));
        double savToAtlDistance = 6371 * Math.acos( (Math.sin(SavLat) * Math.sin(AtlLat)) + (Math.cos(SavLat) * Math.cos(AtlLat) * Math.cos(SavLon - AtlLon)));


        double savToChaDistance = 6371 * Math.acos( (Math.sin(SavLat) * Math.sin(ChaLat)) + (Math.cos(SavLat) * Math.cos(ChaLat) * Math.cos(SavLon - ChaLon)));
        double chaToOrlDistance = 6371 * Math.acos( (Math.sin(ChaLat) * Math.sin(OrlLat)) + (Math.cos(ChaLat) * Math.cos(OrlLat) * Math.cos(ChaLon - OrlLon)));



        double atlToOrlToSav = (atlToOrlDistance + orlToSavDistance + savToAtlDistance)/2;

        double areaOfAtlToOrlToSav = Math.pow(atlToOrlToSav *(atlToOrlToSav - atlToOrlDistance)*(atlToOrlToSav -orlToSavDistance)*(atlToOrlToSav -savToAtlDistance), .5);

        double orlToSavToCha = (orlToSavDistance + savToChaDistance + chaToOrlDistance)/2;

        double areaOrlToSavToCha = Math.pow(orlToSavToCha *(orlToSavToCha - orlToSavDistance)*(orlToSavToCha -savToChaDistance)*(orlToSavToCha-chaToOrlDistance), .5);

        System.out.printf("The the estimated area enclosed by these four cities is %.2f", areaOrlToSavToCha + areaOfAtlToOrlToSav);

    }
}
