package com.sgmarghade;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;


/**
 * Hello world!
 */
public class App {

    public static void main(String[] args) throws IOException {



//        new AvroConverter(new Obje`ctMapper()).validate(schema, actual1);
        System.out.println( new AvroConverter(new ObjectMapper()).convert(args));
    }


}