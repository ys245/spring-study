package org.example.bao03;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("School")
public class School {
    @Value("清华大学")
    private String name;
    @Value("中国北京")
    private String address;

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
