package com.kese.pages.API;

import com.kese.utilities.ConfigurationReader;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.junit.Before;

public class KeseApiBaseUrl {

    protected RequestSpecification spec;


   // @Before //If you use @Before annotation at the top of a method, it means the method will be executed before every test method
    public void setUp(){

        spec = new RequestSpecBuilder().setBaseUri("https://test.kese.nl/api/").build().pathParams("first", "homes", "second", "61fe52dae970093ad0e4bef3", "third", "benzerilanlar").
                queryParam("address", "Frankfurt, Almanya", "address_list", "Frankfurt, Almanya");
    }

}
