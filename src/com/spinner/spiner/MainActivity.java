package com.spinner.spiner;

import java.util.ArrayList;
import java.util.List;

import com.haiyun.spiner.R;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends Activity {
	private Spinner spinner;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		spinner = (Spinner)findViewById(R.id.spinnerId);
		List<String> list = new ArrayList<String>();
		list.add("haiyun");
		list.add("feizi");
		ArrayAdapter adapter = new ArrayAdapter(this, R.layout.spinner, R.id.textViewId, list);
//		ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.number, android.R.layout.simple_spinner_item );
//		adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		spinner.setAdapter(adapter);
		spinner.setPrompt("NUMber");
		spinner.setOnItemSelectedListener(new SpinnerListener());
		
	}
	class  SpinnerListener implements OnItemSelectedListener {

		@Override
		public void onItemSelected(AdapterView<?> adapterView, View arg1, int position,
				long arg3) {
			String selectedString = adapterView.getItemAtPosition(position).toString();
			
		}

		@Override
		public void onNothingSelected(AdapterView<?> arg0) {
			// TODO Auto-generated method stub
			
		}
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
