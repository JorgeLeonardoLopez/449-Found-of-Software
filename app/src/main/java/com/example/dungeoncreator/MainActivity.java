package com.example.dungeoncreator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    // Declare button variable
    private Button OpenMainMenuButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize Button Variable: This one takes us to the Main Menu
        OpenMainMenuButton = (Button) findViewById(R.id.OpenMainMenu);
        // OnClickListener triggers functionality
        OpenMainMenuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            // OnClick is the action we want
            public void onClick(View view) {
                openMainMenuMethod();
            }
            // This method will take us to desired activity: In this case Main Menu
            public void openMainMenuMethod(){
                // Intent is a varible used to tell the app what we intend to do
                // getApplicationContext() not sure what it does, MainMenu.class is the activity we want
                Intent intent = new Intent(getApplicationContext(), MainMenu.class);
                // Should take us the specified activity
                startActivity(intent);
            }
        });
    }
}
