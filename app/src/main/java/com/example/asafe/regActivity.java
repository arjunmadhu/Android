package com.example.asafe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
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

import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class regActivity extends AppCompatActivity {
    EditText e1,e2,e3,e4,e5,e6,e7;
    Button b1,b2;
    String s1,s2,s3,s4,s5,s6,s7;
    String apilink= Constants.ApiMainLink+"insert_api.php";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reg);
        e1=(EditText)findViewById(R.id.name);
        e2=(EditText)findViewById(R.id.address);
        e3=(EditText)findViewById(R.id.pno);
        e4=(EditText)findViewById(R.id.email);
        e5=(EditText)findViewById(R.id.bgroup);
        e6=(EditText)findViewById(R.id.pass);
        e7=(EditText)findViewById(R.id.cpass);
        b1=(Button)findViewById(R.id.regbtn);
        b2=(Button)findViewById(R.id.backlog);



        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s1=e1.getText().toString();
                s2=e2.getText().toString();
                s3=e3.getText().toString();
                s4=e4.getText().toString();
                s5=e5.getText().toString();
                s6=e6.getText().toString();
                s7=e7.getText().toString();

                if (s6.equals(s7)) {
                   // Toast.makeText(getApplicationContext(), "success", Toast.LENGTH_LONG).show();
                    callapi();
                } else {
                    Toast.makeText(getApplicationContext(), "mismatch in password", Toast.LENGTH_LONG).show();
                }
            }

        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
            }
        });

    }

    private void callapi() {
        Toast.makeText(getApplicationContext(), "Api  called", Toast.LENGTH_LONG).show();
        StringRequest stringRequest= new StringRequest(Request.Method.POST, apilink, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                Log.d("res",response);

                try{
                    JSONObject obj = new JSONObject(response);
                    String rslt = obj.getString("status");


                    if (rslt.equals("success")) {
                        Toast.makeText(getApplicationContext(), "Succesfully Registered", Toast.LENGTH_LONG).show();
                        Intent intent=new Intent(getApplicationContext(),MainActivity.class);
                        startActivity(intent);

                    }
                    else{
                        Toast.makeText(getApplicationContext(), "Something went wrong", Toast.LENGTH_LONG).show();

                    }

                }
                catch (Exception e){

                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.d("res",error.toString());

            }
        }){
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                HashMap<String,String> params= new HashMap<>();
                params.put("name",s1);
                params.put("address",s2);
                params.put("phone",s3);
                params.put("email",s4);
                params.put("bloodg",s5);
                params.put("password",s6);

                return params;
            }
        };
        RequestQueue requestQueue= Volley.newRequestQueue(getApplicationContext());
        requestQueue.add(stringRequest);
    }

}
