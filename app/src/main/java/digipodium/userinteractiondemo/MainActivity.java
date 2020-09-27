package digipodium.userinteractiondemo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;

import digipodium.userinteractiondemo.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {


    private digipodium.userinteractiondemo.databinding.ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        /*
        setContentView(R.layout.activity_main);
        // old way of declaring object in java from xml

        Button btnCounter = findViewById(R.id.btnCounter);
        TextView textCounter = findViewById(R.id.textCounter);
        TextView textName = findViewById(R.id.textName);
        TextView textSizeVal = findViewById(R.id.textSizeVal);
        TextView textDragSlider = findViewById(R.id.textDragSlider);
        ImageView imgChar = findViewById(R.id.imgChar);
        ImageView imgDisk = findViewById(R.id.imgDisk);
        EditText editName = findViewById(R.id.editName);
        SeekBar sizeValue = findViewById(R.id.sizeValue);
        */

        // the easy way of creating java objects from layout ids of XML file
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View screen = binding.getRoot();
        setContentView(screen);

        // using xml items as java objects
        binding.textCounter.setText(String.valueOf(1));
        binding.sizeValue.setProgress(1);
        binding.imgDisk.setImageResource(R.drawable.diskcutter_ylw);



    }
}