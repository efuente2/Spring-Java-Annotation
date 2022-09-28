package org.example;

import org.springframework.stereotype.Component;

@Component
public class Address {

        private String city = "atlanta";
        private String state = "Georgia";
        private String country = "united states";
        private String zipcode = "00000";

        @Override
        public String toString(){
                return "city: " + city + " State: " + state + " Country: " + country + " zipcode: " + zipcode + " ";
        }


}
