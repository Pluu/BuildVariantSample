package com.pluu.buildvariantsample.cs1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.pluu.buildvariantsample.BuildConfig;
import com.pluu.buildvariantsample.R;

public class StepCSMainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_step_csmain);

		Toast.makeText(this, BuildConfig.CS1_MSG, Toast.LENGTH_SHORT).show();
	}

}
