package data;

import com.github.javafaker.Faker;

import java.util.Locale;

public class TestData {

    Faker faker = new Faker(new Locale("ru"));

    public String lastName = faker.name().lastName();
    public String firstName = faker.name().firstName();
    public String userEmail = faker.internet().emailAddress();
    public String setNumber = faker.phoneNumber().subscriberNumber(10);



}
