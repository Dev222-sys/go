package com.example.teamunited.Activity;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.hardware.Camera;
import android.media.Image;
import android.os.Build;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.widget.Button;

import com.example.teamunited.CheckInternetConnection;
import com.example.teamunited.R;

public class Select_Area extends AppCompatActivity {
    View image;
    Progress progress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select__area);
        image=findViewById(R.id.image);
        progress=new Progress();
        progress.createdialog(Select_Area.this);
        progress.showpDialog();
        progress.hidepDialog();

    }


    public void Onclick_Guestarea(View view) {


        startActivity(new Intent(Select_Area.this, Guest_Login.class));
        /*Intent login=new Intent(Select_Area.this,Guest_Login.class);

        ActivityOptions options= null;
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP) {
            options = ActivityOptions.makeSceneTransitionAnimation(Select_Area.this,
                    Pair.create(image,"image")


            );
        }
        startActivity(login,options.toBundle());
*/

    }

    public void Onclick_Distributorarea(View view) {



    }
    @Override
    protected void onResume() {
        super.onResume();
        //check Internet Connection

        new CheckInternetConnection(this).checkConnection();
    }

}