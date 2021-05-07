package com.company;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    CsvReader csvReader = new CsvReader();
        try {
        List<Netflix> netflixList = csvReader.readCsvFile("C://Users//DELL//IdeaProjects//Assignment1//src//com//company//netflix_titles.csv");
            Scanner sc= new Scanner(System.in);
            System.out.print("Enter a start date in the format dd-Mmm-yy: ");
            String sDate = sc.nextLine();
            Date startDate = new SimpleDateFormat("dd-MMM-yy").parse(sDate);
            System.out.print("Enter a end date in the format dd-Mmm-yy: ");
            String eDate = sc.nextLine();
            Date endDate = new SimpleDateFormat("dd-MMM-yy").parse(eDate);
            System.out.print("Enter a value of n: ");
            int num = sc.nextInt();

        netflixList.stream().filter(netflix -> netflix.getDate_added().after(startDate) && netflix.getDate_added().before(endDate) && netflix.getType().contains("TV Show")).limit(num)
                .forEach((netflix) -> {
            System.out.println("Show_id = " + netflix.getShow_id());
            System.out.println("Type = " + netflix.getType());
            System.out.println("Title = " + netflix.getTitle());
            System.out.println("Director = " + netflix.getDirector());
            System.out.println("Cast = " + netflix.getCast());
            System.out.println("Country = " + netflix.getCountry());
            System.out.println("Date_added = " + netflix.getDate_added());
            System.out.println("Release_year = " + netflix.getRelease_year());
            System.out.println("Rating = " + netflix.getRating());
            System.out.println("getDuration = " + netflix.getDuration());
            System.out.println("Listed_in = " + netflix.getListed_in());
            System.out.println("Description = " + netflix.getDescription());

            System.out.println("--------------------------------------------------------------");
        });

            netflixList.stream().filter(netflix -> netflix.getListed_in().contains("Horror Movies")).limit(num)
                    .forEach((netflix) -> {
                        System.out.println("Show_id = " + netflix.getShow_id());
                        System.out.println("Type = " + netflix.getType());
                        System.out.println("Title = " + netflix.getTitle());
                        System.out.println("Director = " + netflix.getDirector());
                        System.out.println("Cast = " + netflix.getCast());
                        System.out.println("Country = " + netflix.getCountry());
                        System.out.println("Date_added = " + netflix.getDate_added());
                        System.out.println("Release_year = " + netflix.getRelease_year());
                        System.out.println("Rating = " + netflix.getRating());
                        System.out.println("getDuration = " + netflix.getDuration());
                        System.out.println("Listed_in = " + netflix.getListed_in());
                        System.out.println("Description = " + netflix.getDescription());

                        System.out.println("--------------------------------------------------------------");
                    });

            netflixList.stream().filter(netflix -> netflix.getType().contains("Movie") && netflix.getCountry().contains("India")).limit(num)
                    .forEach((netflix) -> {
                        System.out.println("Show_id = " + netflix.getShow_id());
                        System.out.println("Type = " + netflix.getType());
                        System.out.println("Title = " + netflix.getTitle());
                        System.out.println("Director = " + netflix.getDirector());
                        System.out.println("Cast = " + netflix.getCast());
                        System.out.println("Country = " + netflix.getCountry());
                        System.out.println("Date_added = " + netflix.getDate_added());
                        System.out.println("Release_year = " + netflix.getRelease_year());
                        System.out.println("Rating = " + netflix.getRating());
                        System.out.println("getDuration = " + netflix.getDuration());
                        System.out.println("Listed_in = " + netflix.getListed_in());
                        System.out.println("Description = " + netflix.getDescription());

                        System.out.println("--------------------------------------------------------------");
                    });

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}