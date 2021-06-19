package com.ilCarro.qa14.tests;

import com.ilCarro.qa14.models.Car;
import com.ilCarro.qa14.models.User;
import org.testng.annotations.DataProvider;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DataProviders {
    @DataProvider
    public Iterator<Object[]> validUser() {
        List<Object[]> list = new ArrayList<>();
        list.add(new Object[]{"fName", "sName", "fBoberkov@gmail.com", "123456789Rfnz"});
        list.add(new Object[]{"fName", "sName", "fBoberkovna@gmail.com", "123456789Rfnz"});
        list.add(new Object[]{"fName", "sName", "fBoberkichi@gmail.com", "123456789Rfnz"});

        return list.iterator();
    }

    @DataProvider
    public Iterator<Object[]> validUserFromCSV() throws IOException {
        List<Object[]> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(new File("src/test/resources/codes.csv")));
        String line = reader.readLine();
        while (line != null) {
            String[] split = line.split(",");
            list.add(new Object[]{new User().withFirstName(split[0]).withSecondName(split[1])
                    .withEmail(split[2]).withPassword(split[3])});
            line = reader.readLine();
        }
        return list.iterator();

    }@DataProvider
    public Iterator<Object[]> validCarFromCSV() throws IOException {
        List<Object[]> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(new File("src/test/resources/Car.csv")));
        String line = reader.readLine();
        while (line != null) {
            String[] split = line.split(",");
            list.add(new Object[]{new Car().setCountry(split[0]).setAddress(split[1]).setDistance(split[3])});
            line = reader.readLine();
        }
        return list.iterator();

    }
}
