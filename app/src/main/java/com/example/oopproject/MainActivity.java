package com.example.oopproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textview);


        // Constructor
        /*
        User firstUser = new User();
        firstUser.name = "Omer";
        firstUser.job = "Student";

        User secUser = new User();
        secUser.name = "Zeynep";
        secUser.job = "Doctor";

        System.out.println(firstUser.name +" "+ firstUser.job);
        */

        /*
        User firstUser = new User("Seyfullah","Developer",22);
        User secUser = new User("Hanifi","Imam",21);

        textView.setText(firstUser.name + secUser.age);
        */


        // Getter and Setter
        /*
        Musicians solist = new Musicians("Henning", "Ukulele", 29);
        solist.setName("Taylor", "passwd");
        textView.setText(solist.getName());
        */


        // Inheritance
        /*
        UpperMusician taylor = new UpperMusician("Taylor", "Guitar", 35);
        System.out.println(taylor.sing());
        */


        // Polymorphism
            // Static Polymorphism
            /*
            Mathematics math = new Mathematics();
            System.out.println(math.sum());
            System.out.println(math.sum(6,5));
            System.out.println(math.sum(3,9,6));
            */

            // Dynamic Polymorphism
            
    }
}