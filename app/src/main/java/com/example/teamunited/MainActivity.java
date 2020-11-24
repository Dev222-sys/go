package com.example.teamunited;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.teamunited.Activity.About_CEP;
import com.example.teamunited.Activity.About_us;
import com.example.teamunited.Activity.About_vesige;
import com.example.teamunited.Activity.Audio_Tools;
import com.example.teamunited.Activity.Business_School;
import com.example.teamunited.Activity.CEO_Meeting;
import com.example.teamunited.Activity.Contact_us;
import com.example.teamunited.Activity.Feedback;
import com.example.teamunited.Activity.Gallery;
import com.example.teamunited.Activity.Gift;
import com.example.teamunited.Activity.Guest_Login;
import com.example.teamunited.Activity.My_Account;
import com.example.teamunited.Activity.News;
import com.example.teamunited.Activity.Notes;
import com.example.teamunited.Activity.Notification;
import com.example.teamunited.Activity.Reading_tools;
import com.example.teamunited.Activity.Self_Analysis;
import com.example.teamunited.Activity.SplashActivity;
import com.example.teamunited.Activity.Testimonial;
import com.example.teamunited.Activity.Video_Tools;
import com.example.teamunited.Fragment.Home;
import com.google.android.material.navigation.NavigationView;

import de.hdodenhof.circleimageview.CircleImageView;

public class MainActivity extends AppCompatActivity  implements NavigationView.OnNavigationItemSelectedListener {
    private DrawerLayout mDrawerLayout;
    private View navHeader;
    TextView name,email,mobile;
    CircleImageView imgProfile,imgEdit;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
       // setContentView(R.layout.activity_main);
        setContentView(R.layout.nav_drawer_layout);

     //   util.blackiteamstatusbar(MainActivity.this,R.color.light_background);

        toolbar=findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        mDrawerLayout=findViewById(R.id.drawer_layout);
        NavigationView navigationView=findViewById(R.id.navigation_view);
        ActionBarDrawerToggle toggle=new ActionBarDrawerToggle(
                this,mDrawerLayout,toolbar,
                R.string.navigation_drawer_open,
                R.string.navigation_drawer_close);

        mDrawerLayout.addDrawerListener(toggle);
        // toggle.getDrawerArrowDrawable().setColor(getResources().getColor(R.color.black));
       toggle.syncState();

        navHeader = navigationView.getHeaderView(0);

        navigationView.setNavigationItemSelectedListener(this);

     if (savedInstanceState==null){
           getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fragment_Container,new Home())

                    .commit();
            navigationView.setCheckedItem(R.id.nav_home);
        }

        /*if (savedInstanceState == null) {
            Toast.makeText(this, "yesssss", Toast.LENGTH_SHORT).show();
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.fragment_Container, new Home()).commit();
        }

        navigationView.setCheckedItem(R.id.home);
*/
    }
    @Override
    public void onBackPressed() {
        if (mDrawerLayout.isDrawerOpen(GravityCompat.START)){
            mDrawerLayout.closeDrawer(GravityCompat.START);
        }else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.nav_home:
               /* getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragment_Container,new Home_Fragment())
                        .commit();*/
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragment_Container,new Home())
                        .commit();
                Toast.makeText(this, "Welcome to home ", Toast.LENGTH_SHORT).show();

              //  startActivity(new Intent(MainActivity.this, Guest_Login.class));

                break;

            case R.id.CEO:

                startActivity(new Intent(MainActivity.this, CEO_Meeting.class));
                Toast.makeText(this, "Welcome to CEO Meeting", Toast.LENGTH_SHORT).show();
                break;
            case R.id.Gallery:
                startActivity(new Intent(MainActivity.this, Gallery.class));

                Toast.makeText(this, "Welcome to Gallery", Toast.LENGTH_SHORT).show();
                break;

            case R.id.School:
                startActivity(new Intent(MainActivity.this, Business_School.class));

                Toast.makeText(this, "Welcome to Business School", Toast.LENGTH_SHORT).show();
                break;

            case R.id.News:
                startActivity(new Intent(MainActivity.this, News.class));

                Toast.makeText(this, "Welcome to News", Toast.LENGTH_SHORT).show();
                break;
            case R.id.selfanalysis:
                ///startActivity(new Intent(MainActivity.this, Contact_Us.class));
                startActivity(new Intent(MainActivity.this, Self_Analysis.class));

                Toast.makeText(this, "Welcome to self Analysis", Toast.LENGTH_SHORT).show();
                break;

            case R.id.videotools:
                //startActivity(new Intent(MainActivity.this, About.class));
                startActivity(new Intent(MainActivity.this, Video_Tools.class));

                Toast.makeText(this, "Welcome to video tools ", Toast.LENGTH_SHORT).show();

                break;

            case R.id.audiotools:
                //startActivity(new Intent(MainActivity.this, About.class));
                startActivity(new Intent(MainActivity.this, Audio_Tools.class));

                Toast.makeText(this, "Welcome to audiotools ", Toast.LENGTH_SHORT).show();

                break;
            case R.id.readingtools:
                //startActivity(new Intent(MainActivity.this, About.class));
                startActivity(new Intent(MainActivity.this, Reading_tools.class));

                Toast.makeText(this, "Welcome to readingtools ", Toast.LENGTH_SHORT).show();

                break;
            case R.id.gift:
                //startActivity(new Intent(MainActivity.this, About.class));
                startActivity(new Intent(MainActivity.this, Gift.class));

                Toast.makeText(this, "Welcome to About_us ", Toast.LENGTH_SHORT).show();

                break;
            case R.id.noots:
                //startActivity(new Intent(MainActivity.this, About.class));
                startActivity(new Intent(MainActivity.this, Notes.class));

                Toast.makeText(this, "Welcome to gift ", Toast.LENGTH_SHORT).show();

                break;
            case R.id.feedback:
                //startActivity(new Intent(MainActivity.this, About.class));
                startActivity(new Intent(MainActivity.this, Feedback.class));

                Toast.makeText(this, "Welcome to feedback ", Toast.LENGTH_SHORT).show();

                break;
            case R.id.testimonial:
                //startActivity(new Intent(MainActivity.this, About.class));
                startActivity(new Intent(MainActivity.this, Testimonial.class));

                Toast.makeText(this, "Welcome to testimonial ", Toast.LENGTH_SHORT).show();

                break;
            case R.id.share:
                //startActivity(new Intent(MainActivity.this, About.class));

                Toast.makeText(this, "Welcome to share ", Toast.LENGTH_SHORT).show();

                break;

            case R.id.notification:
                //startActivity(new Intent(MainActivity.this, About.class));
                Toast.makeText(this, "Welcome to notification ", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(MainActivity.this, Notification.class));

                break;

            case R.id.myaccount:
                //startActivity(new Intent(MainActivity.this, About.class));
                startActivity(new Intent(MainActivity.this, My_Account.class));

                Toast.makeText(this, "Welcome to myaccount ", Toast.LENGTH_SHORT).show();

                break;
            case R.id.nav_about:
                //startActivity(new Intent(MainActivity.this, About.class));
                startActivity(new Intent(MainActivity.this, About_us.class));

                Toast.makeText(this, "Welcome to nav_about ", Toast.LENGTH_SHORT).show();

                break;
                case R.id.aboutvestiage:
                //startActivity(new Intent(MainActivity.this, About.class));
                    startActivity(new Intent(MainActivity.this, About_vesige.class));

                    Toast.makeText(this, "Welcome to aboutvestiage ", Toast.LENGTH_SHORT).show();

                break;   case R.id.about_cep:
                //startActivity(new Intent(MainActivity.this, About.class));
                startActivity(new Intent(MainActivity.this, About_CEP.class));

                Toast.makeText(this, "Welcome to about_cep ", Toast.LENGTH_SHORT).show();

                break;   case R.id.nav_contact:
                //startActivity(new Intent(MainActivity.this, About.class));
                startActivity(new Intent(MainActivity.this, Contact_us.class));

                Toast.makeText(this, "Welcome to nav_contact ", Toast.LENGTH_SHORT).show();


            case R.id.nav_Logout:
                //AlertDialogBox();
                Toast.makeText(this, "Welcome to Logout ", Toast.LENGTH_SHORT).show();
                break;
        }
        mDrawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }



    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
      /*  if (item.getItemId()==android.R.id.home){
            finish();
        }*/
        switch (item.getItemId()) {
            case android.R.id.home:
                // todo: goto back activity from here
                Intent intent = new Intent(MainActivity.this, MainActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
                finish();
                return true;
            default:
        }
        return super.onOptionsItemSelected(item);
    }
}