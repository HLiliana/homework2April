package org.example;

import java.util.ArrayList;
import java.util.List;

public class BiathlonAthlete {
    List<BiathlonAthlete>  biathlonAthleteList = new ArrayList<>();
    int athleteNumber;
    String athleteName;

    String athleteData;
    String countryCode;
    int skiTimeResult;
    String stringTimeResult;
    String firstShootingRange;
    String secondShootingRange;
    String thirdShootingRange;
//    public BiathlonAthlete(int athleteNumber, String athleteName, String countryCode,
//                           String stringTimeResult, String firstShootingRange,
//                           String secondShootingRange, String thirdShootingRange){
//        this.athleteNumber = athleteNumber;
//        this.athleteName = athleteName;
//        this.countryCode = countryCode;
//        this.stringTimeResult = stringTimeResult;
//        this.firstShootingRange = firstShootingRange;
//        this.secondShootingRange = secondShootingRange;
//        this.thirdShootingRange = thirdShootingRange;
//    }
//    public int getAthleteNumber(){ return athleteNumber;}
//    public String getAthleteName(){ return athleteName;}
//    public String getCountryCode(){ return countryCode;}
//    public String getStringTimeResult(){ return stringTimeResult;}
//    public String getFirstShootingRange(){ return firstShootingRange;}
//    public String getSecondShootingRange(){ return secondShootingRange;}
//    public String getThirdShootingRange(){ return thirdShootingRange;}

    public void addBiathlonAthlete(BiathlonAthlete biathlonAthlete){
        biathlonAthleteList.add(biathlonAthlete);

    }
//    public int updateSkiTimeResult(int skiTimeResult){
//        this.skiTimeResult=skiTimeResult;
//        return skiTimeResult-calculateShootingResults();
//    }

    public String sortBiathlonAthlete(String athleteName) {
        return athleteName;
    }
//    public int calculateShootingResults(){
//        return Penalty.PENALTY * "o";
//    }
    }
