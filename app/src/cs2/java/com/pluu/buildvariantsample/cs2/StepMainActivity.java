package com.pluu.buildvariantsample.cs2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.pluu.buildvariantsample.R;

public class StepMainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_step_main);

		Toast.makeText(this, R.string.cs2_text, Toast.LENGTH_SHORT).show();
	}

}
