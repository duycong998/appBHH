package com.example.appbh.Service;

public class APIService {
    private static final String base_url = "https://appbh06051998.000webhostapp.com/appBH/";
    public static DataServiec getData(){
        return APIRetrofitClient.getClient(base_url).create(DataServiec.class);
    }
}
