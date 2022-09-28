package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Student {

        private List<Phone> ph;
        private Address add;
        private int id = 10;
        private String name = "ernesto";


        public Address getAdd() {
                return add;
        }

        public void setAdd(Address add) {
                this.add = add;
        }


        public List<Phone> getPh() {
                return ph;
        }

        public void setPh(List<Phone> ph) {
                this.ph = ph;
        }


        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }


        public int getId() {
                return id;
        }

        public void setId(int id) {
                this.id = id;
        }
}
