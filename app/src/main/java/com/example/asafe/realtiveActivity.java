package com.example.asafe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.util.HashMap;
import java.util.Map;

public class realtiveActivity extends AppCompatActivity {
    EditText e1,e2,e3,e4;
    Button b1;
    String s1,s2,s3,s4,Sharedval;
    String apilink= Constants.ApiMainLink+"addrelatives_api.php";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_realtive);

        SharedPreferences editor = getSharedPreferences("Login", MODE_PRIVATE);
        Sharedval = editor.getString("uid", null);

        Toast.makeText(getApplicationContext(), "Val "+Sharedval, Toast.LENGTH_LONG).show();
        e2=(EditText)findViewById(R.id.na);
        e3=(EditText)findViewById(R.id.mn);
        e4=(EditText)findViewById(R.id.an);
        b1=(Button)findViewById(R.id.addbtn);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                s2=e2.getText().toString();
                s3=e3.getText().toString();
                s4=e4.getText().toString();
                callapi();
//                if(s3.equals(s4)) {
//
//                    Toast.makeText(getApplicationContext(), "success", Toast.LENGTH_SHORT).show();
//                }
//                else{
//                    Toast.makeText(getApplicationContext(), "Number Missmatch", Toast.LENGTH_SHORT).show();
//                }


            }
        });
    }

    private void callapi() {
        StringRequest stringRequest=new StringRequest(Request.Method.POST,apilink,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        Toast.makeText(getApplicationContext(), response, Toast.LENGTH_LONG).show();

                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        })
        {
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                HashMap<String,String> params = new HashMap<>();
                params.put("userId",Sharedval);
                params.put("name",s2);
                params.put("mobno",s3);
                params.put("almobno",s4);
                return params;
            }
        };
        RequestQueue requestQueue= Volley.newRequestQueue(getApplicationContext());
        requestQueue.add(stringRequest);

    }
}
