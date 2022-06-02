package org.example;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

public class GetCurrencyTest {
        public static void main(String []args) throws IOException {
            OkHttpClient client = new OkHttpClient().newBuilder().build();
            Request request = new Request.Builder()
                    .url("https://api.apilayer.com/currency_data/convert?to=RUB&from=USD&amount=10")
                    .addHeader("apikey", "cv1sv5sXeSet0Qx7iFpHzebeyOGPnw5O")
                    .method("GET",null)
                    .build();
            Response response = client.newCall(request).execute();
            System.out.println(response.body().string());
        }
    }
