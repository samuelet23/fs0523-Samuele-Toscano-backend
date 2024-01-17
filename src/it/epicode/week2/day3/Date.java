package it.epicode.week2.day3;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Date {

    public static void main(String[] args) {



    }

    public static ZonedDateTime getLocaleDate(String zoneId){
        ZoneId z = ZoneId.of( zoneId );
        LocalDateTime ld = LocalDateTime.now();
        ZonedDateTime zdt = ld.atZone(z);
        return zdt;
    }

}
