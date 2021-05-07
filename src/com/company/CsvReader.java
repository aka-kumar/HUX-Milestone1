package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class CsvReader {
    public List<Netflix> readCsvFile(String filePath) throws Exception {
        List<Netflix> netflixList = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String line = null;
        int count = 0;
        while ((line = reader.readLine()) != null) {
            //Skip the header row
            if (count == 0) {
                count++;
                continue;
            }
            String[] lineContents = line.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)");
            Netflix netflix = new Netflix();
            netflix.setShowId(lineContents[0]);
            netflix.setType(lineContents[1]);
            netflix.setTitle(lineContents[2]);
            netflix.setDirector(lineContents[3]);
            netflix.setCast(lineContents[4]);
            netflix.setCountry(lineContents[5]);
       //     netflix.setDate_added(LocalDate.parse(lineContents[6], DateTimeFormatter.ofPattern("dd-Mmm-yy", Locale.ENGLISH)));
            netflix.setDateAdded(lineContents[6]);
            netflix.setReleaseYear(lineContents[7]);
            netflix.setRating(lineContents[8]);
            netflix.setDuration(lineContents[9]);
            netflix.setListed_in(lineContents[10]);
            netflix.setDescription(lineContents[11]);
            netflixList.add(netflix);
            count++;
        }
        return netflixList;
    }
}
