package com.example.appbh.Service;

import com.example.appbh.Model.KindProduct;
import com.example.appbh.Model.Product;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface DataServiec {
    @GET("loaisanpham.php")
    Call<List<KindProduct>> getData();

    @GET("getsanphammoi.php")
    Call<List<Product>> getDataProduct();

    @FormUrlEncoded
    @POST("getproduct.php")
    Call<List<Product>> getProDuct(@Field("idproduct") int idproduct);

    @FormUrlEncoded
    @POST("thongtinkhachhang.php")
    Call<String> insertClient(@Field("nameClient") String mName
                            ,@Field("phoneClient") String mPhone
                            ,@Field("emailClient") String mEmail);

    @FormUrlEncoded
    @POST("test.php")
    Call<List<Product>> getSearchProduct(@Field("mKey") String mKey);
}
