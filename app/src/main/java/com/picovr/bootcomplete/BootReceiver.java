package com.picovr.bootcomplete;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class BootReceiver extends BroadcastReceiver {

	private static final String TAG = "BootReceiver";

	@Override
	public void onReceive(Context context, Intent intent) {
		
		Log.e(TAG, "----BootReceiver---");
		
		if(intent.getAction().equals(Intent.ACTION_BOOT_COMPLETED)) {
			
			Log.e(TAG, "----BOOT_COMPLETED---");
			Intent intent2 = new Intent(context, MainActivity.class);
			intent2.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);  
            context.startActivity(intent2);  
		}

	}

}
