package com.example.taron.simple_login_form;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;


public class LoginActivity extends AppCompatActivity {

    ArrayList<User> userArrayList = new ArrayList<>();

    public static final String EXTRA_MESSANGE = "com.example.taron.contrainslayoutfirstprogram.MainActivity";

    public String logFullName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        init();
    }

    public void init(){
        userArrayList.add(0,new User(1,"a","123456","a_123456"));
        userArrayList.add(1,new User(2,"Gevorg","asdfgh","Gevorg_asdfgh"));
        userArrayList.add(2,new User(3,"Macak","asd123","Macak_asd123"));
    }

    public void nextActivity(View view){
        int count = 0;
        EditText editText = (EditText)findViewById(R.id.editText1);
        String userName = editText.getText().toString();
        EditText editText1 = (EditText)findViewById(R.id.editText2);
        String password = editText1.getText().toString();
        TextView textView = (TextView)findViewById(R.id.aboutLogin);
        TextView textView1 = (TextView)findViewById(R.id.aboutPasword);
        for (int i = 0; i < userArrayList.size(); i++){
            if (userName.equals(userArrayList.get(i).username))
            {
                textView.setText("Correct login");
                if (password.equals(userArrayList.get(i).password)) {
                    textView1.setText("Correct password");
                    logFullName = userArrayList.get(i).fullName;
                    sendMessage();
                }
                else
                    textView1.setText("Wrong password");
            }
            else {
                count++;
                if(count == userArrayList.size())
                    textView.setText("Wrong login");
            }
        }

    }

    public void sendMessage(){
        Intent intent = new Intent(this,Main_Activity.class);
        intent.putExtra(EXTRA_MESSANGE,logFullName);
        startActivity(intent);
    }
}
