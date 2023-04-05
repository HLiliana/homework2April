package org.example;

import java.io.*;
import java.util.*;


/**
 * DESCRIPTION - Ski Biathlon Standings
 *
 * write a software that takes as an input a CSV file where every entry // takes
 * represents the results of a biathlon athlete // result, biathlon athlete
 * based on the entries identify the first 3 places
 * (Winner, Runner-up and Third Place) // winner, runner-up, third place
 * the rules are simple, each athlete has a time-results for the entire skiing session, // time-result, skiing session
 * and 3 shooting range results // shooting range results
 * each shooting range has 5 shot results
 * for every missed shot the athlete obtains a 10 second penalty which affects the final time-result //penalty
 * final standings are based on the time-results that have been updated with the shooting range results //update time-results
 * CSV example
 *
 * Nouns: time-result, biathlonAthlete, winner, runner-up, third place, shootingResults, penalty
 * Done ---Verbs: takes/reads, update results
 *
 * COLUMNS
 * AthleteNumber,AthleteName,CountryCode,SkiTimeResult(Minutes:Seconds),
 * FirstShootingRange,SecondShooting,ThirdShooting
 * every shooting range consists of 5 characters, where x means hit, o mean miss
 * for every o there should be 10 seconds added to the final time // add to final time
 *
 * TASK
 *
 * write tests for the CSV parsing and the standing calculation // test for parsing , test for calculation
 * in the your tests you must not use real files // how do we use mocks??
 * make sure the CSVs are read from memory to keep the tests fast // how do we make the read from memory?
 * use Comparator / Comparable for sorting // or use a TreeSet
 * use at least 1 Enum (in any situation)
 * and at least 2 Annotations (they don't need to be custom)
 *
 */
public class Main {
    public static void main(String[] args) throws IOException {
        CsvReader reader = new CsvReader("file.csv");

        List<String> lines = reader.readLine();


        System.out.println(reader.readLine());



    }
}

/**
 *  RESULTS
 *  Winner - Piotr Smitzer 30:10 (30:10 + 0)
 *  Runner-up - Jimmy Smiles 30:15 (29:15 + 60)
 *  Third Place - Umar Jorgson 30:57 (30:27 + 30)
 */