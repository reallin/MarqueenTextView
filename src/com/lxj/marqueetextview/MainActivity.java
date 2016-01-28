package com.lxj.marqueetextview;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

public class MainActivity extends Activity {
	MarqueeTextView txv;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		txv = (MarqueeTextView)super.findViewById(R.id.home_location_tv);
		txv.setText("中国湖北省武汉市珞瑜路华中科技大学XXX");
		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {//android4.4
            Window window = getWindow();
             window.addFlags(WindowManager.LayoutParams. FLAG_TRANSLUCENT_STATUS);
            View titleBar = findViewById(R.id.titlebar_layout );
             titleBar.setPadding(0, getStatusBarHeight(), 0, 0);
       }

		

	}
	public int getStatusBarHeight() {
        int result = 0;
        int resourceId = this.getResources().getIdentifier(
                  "status_bar_height", "dimen" , "android" );
        if ( resourceId > 0) {
             result = this.getResources().getDimensionPixelSize( resourceId);
       }
        return result;
 }

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
