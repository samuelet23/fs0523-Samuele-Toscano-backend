package it.epicode.week2.day3;

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

    public static class Customer {
        private long id;
        private String name;
        private Integer tier;

        @Override
        public String toString() {
            return "Customer{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", tier=" + tier +
                    '}';
        }

        public Customer(long id, String name, Integer tier) {
            this.id = id;
            this.name = name;
            this.tier = tier;
        }

        public void setId(long id) {
            this.id = id;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setTier(Integer tier) {
            this.tier = tier;
        }

        public long getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public Integer getTier() {
            return tier;
        }
    }
}
