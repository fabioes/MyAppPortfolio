package example.myappportifolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  {

    private Button btnSpotify;
    private Button btnScoresApp;
    private Button btnLibraryApp;
    private Button btnBuildBigger;
    private Button btnXYZ;
    private Button btnCapstone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnSpotify = (Button)findViewById(R.id.btnSpotify);
        btnScoresApp = (Button)findViewById(R.id.btnScoresApp);
        btnLibraryApp = (Button)findViewById(R.id.btnLibraryApp);
        btnBuildBigger = (Button)findViewById(R.id.btnBuidBigger);
        btnXYZ = (Button)findViewById(R.id.btnXYZ);
        btnCapstone = (Button)findViewById(R.id.btnCapstone);

        btnSpotify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        btnScoresApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        btnLibraryApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        btnBuildBigger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        btnXYZ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        btnCapstone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"This button will launch my capstone app",Toast.LENGTH_SHORT).show();

            }
        });
    }

}
