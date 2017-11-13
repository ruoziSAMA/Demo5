package com.example.dengyikang.demo3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

public class MainActivity extends AppCompatActivity {

    private TextView text1;
    private TextView text2;
    private Button button;
    private Button button2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text1 = findViewById(R.id.json_string);
        text2 = findViewById(R.id.json_data);
        button = findViewById(R.id.btn);
        button2 = findViewById(R.id.btn2);
        button.setOnClickListener(onClick);
        button2.setOnClickListener(onClick);
    }

    private View.OnClickListener onClick = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.btn:
                    httpConnect();
                    break;
                case R.id.btn2:
                    parseJson();
                    break;
            }
        }
    };

    private void httpConnect() {
        final String address = "https://api.seniverse.com/v3/weather/daily.json?key=55pl64m71s9njgfm" +
                "&location=beijing&language=zh-Hans&unit=c&start=-1&days=5";
        new Thread(new Runnable() {
            @Override
            public void run() {
                HttpURLConnection connection = null;
                BufferedReader reader = null;
                try {
                    URL url = new URL(address);
                    connection = (HttpURLConnection) url.openConnection();
                    connection.setRequestMethod("GET");
                    connection.setConnectTimeout(8000);
                    connection.setReadTimeout(8000);
                    InputStream inputStream = connection.getInputStream();
                    reader = new BufferedReader(new InputStreamReader(inputStream));
                    StringBuilder response = new StringBuilder();
                    String line;
                    while ((line = reader.readLine()) != null) {
                        response.append(line);
                    }
                    showResult(response.toString());
                } catch (MalformedURLException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                } finally {
                    if (reader != null) {
                        try {
                            reader.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (connection != null) {
                        connection.disconnect();
                    }
                }
            }
        }).start();
    }

    private void showResult(final String s) {
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                //ui
                text1.setText(s);
            }
        });
    }

    private void parseJson() {
        String json = text1.getText().toString();
        try {
            String text = null;
            JSONObject result = new JSONObject(json);
            JSONArray array = result.getJSONArray("results");
            JSONObject object = array.getJSONObject(0);
            JSONArray daily = object.getJSONArray("daily");
            for (int i = 0; i < daily.length(); i++) {
                JSONObject jsonObject = daily.getJSONObject(i);
                text += jsonObject.getString("date");
            }
            text2.setText(text);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

}
