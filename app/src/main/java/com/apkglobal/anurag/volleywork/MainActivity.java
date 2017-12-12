package com.apkglobal.anurag.volleywork;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
EditText et_name,et_email,et_idea;
    Button send;
    String sname,semail,sidea;
    String url="http://searchkero.com/amit/insertme.php";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et_name=(EditText)findViewById(R.id.et_name);
        et_email=(EditText)findViewById(R.id.et_email);
        et_idea=(EditText)findViewById(R.id.et_idea);
        send=(Button)findViewById(R.id.send);
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                 datasendbyvolley();

            }
        });
    }

    private void datasendbyvolley() {
        sname=et_name.getText().toString();
        semail=et_email.getText().toString();
        sidea=et_idea.getText().toString();
        StringRequest sr=new StringRequest(Request.Method.POST, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        })
        {
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                Map<String,String> map=new HashMap<String,String>();
                map.put("name",sname);
                map.put("email",semail);
                map.put("idea",sidea);
                return map;


            }
        };
        RequestQueue requestqueue= Volley.newRequestQueue(MainActivity.this);
        requestqueue.add(sr);
        // String Request Object
    }
}
