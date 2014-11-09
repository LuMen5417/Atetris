package com.example.atetris;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity 
						  implements View.OnClickListener{
	Button button;
	int touchCount;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		button = new Button(this);
		button.setText("Touch me");
		button.setOnClickListener(this);
		setContentView(button);
	}

	public void onClick(View v){
		touchCount++;
		button.setText("Touched me " + touchCount + " this(s)");
	}

}
