package com.company;

import java.util.List;
import java.util.Scanner;

public class Main {
        static int num;
    public static void main(String[] args) {
	    CsvReader csvReader = new CsvReader();
        try {
        List<Netflix> netflixList = csvReader.readCsvFile("C://Users//DELL//IdeaProjects//Assignment1//src//com//company//netflix_titles.csv");
            Scanner sc= new Scanner(System.in);
            System.out.print("Enter a start date in the format dd-Mmm-yy: ");
            String sDate = sc.nextLine();
          //  LocalDate startDate = LocalDate.parse(sDate, DateTimeFormatter.ofPattern("dd-Mmm-yy", Locale.ENGLISH));
            System.out.print("Enter a end date in the format dd-Mmm-yy: ");
            String eDate = sc.nextLine();
          //  LocalDate endDate = LocalDate.parse(eDate, DateTimeFormatter.ofPattern("dd-Mmm-yy", Locale.ENGLISH));
            System.out.print("Enter a value of n: ");
            num = sc.nextInt();

            // starting time
            long start = System.currentTimeMillis();

            printQuestion1(netflixList);
         //   printQuestion2(netflixList);
         //   printQuestion3(netflixList);

            // ending time
            long end = System.currentTimeMillis();
            System.out.println("Time: " +
                    (end - start) + "ms");

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void printQuestion1(List<Netflix> netflixList){
        netflixList.stream().filter(netflix -> netflix.getType().contains("TV Show")).limit(num)
                .forEach((netflix) -> {
                    System.out.println("Show_id = " + netflix.getShowId());
                    System.out.println("Type = " + netflix.getType());
                    System.out.println("Title = " + netflix.getTitle());
                    System.out.println("Director = " + netflix.getDirector());
                    System.out.println("Cast = " + netflix.getCast());
                    System.out.println("Country = " + netflix.getCountry());
                    System.out.println("Date_added = " + netflix.getDateAdded());
                    System.out.println("Release_year = " + netflix.getReleaseYear());
                    System.out.println("Rating = " + netflix.getRating());
                    System.out.println("getDuration = " + netflix.getDuration());
                    System.out.println("Listed_in = " + netflix.getListed_in());
                    System.out.println("Description = " + netflix.getDescription());

                    System.out.println("--------------------------------------------------------------");
                });
    }

    public static void printQuestion2(List<Netflix> netflixList){
        netflixList.stream().filter(netflix -> netflix.getListed_in().contains("Horror Movies")).limit(num)
                .forEach((netflix) -> {
                    System.out.println("Show_id = " + netflix.getShowId());
                    System.out.println("Type = " + netflix.getType());
                    System.out.println("Title = " + netflix.getTitle());
                    System.out.println("Director = " + netflix.getDirector());
                    System.out.println("Cast = " + netflix.getCast());
                    System.out.println("Country = " + netflix.getCountry());
                    System.out.println("Date_added = " + netflix.getDateAdded());
                    System.out.println("Release_year = " + netflix.getReleaseYear());
                    System.out.println("Rating = " + netflix.getRating());
                    System.out.println("getDuration = " + netflix.getDuration());
                    System.out.println("Listed_in = " + netflix.getListed_in());
                    System.out.println("Description = " + netflix.getDescription());

                    System.out.println("--------------------------------------------------------------");
                });
    }

    public static void printQuestion3(List<Netflix> netflixList){
        netflixList.stream().filter(netflix -> netflix.getType().contains("Movie") && netflix.getCountry().contains("India")).limit(num)
                .forEach((netflix) -> {
                    System.out.println("Show_id = " + netflix.getShowId());
                    System.out.println("Type = " + netflix.getType());
                    System.out.println("Title = " + netflix.getTitle());
                    System.out.println("Director = " + netflix.getDirector());
                    System.out.println("Cast = " + netflix.getCast());
                    System.out.println("Country = " + netflix.getCountry());
                    System.out.println("Date_added = " + netflix.getDateAdded());
                    System.out.println("Release_year = " + netflix.getReleaseYear());
                    System.out.println("Rating = " + netflix.getRating());
                    System.out.println("getDuration = " + netflix.getDuration());
                    System.out.println("Listed_in = " + netflix.getListed_in());
                    System.out.println("Description = " + netflix.getDescription());

                    System.out.println("--------------------------------------------------------------");
                });
    }
}