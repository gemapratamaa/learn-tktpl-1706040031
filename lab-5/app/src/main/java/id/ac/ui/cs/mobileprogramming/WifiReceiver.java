package id.ac.ui.cs.mobileprogramming;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiManager;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

class WifiReceiver extends BroadcastReceiver {
    WifiManager wifiManager;
    StringBuilder sb;
    ListView wifiDeviceList;

    ArrayList<String> wifiNames = new ArrayList<>();

    public WifiReceiver(WifiManager wifiManager, ListView wifiDeviceList) {
        this.wifiManager = wifiManager;
        this.wifiDeviceList = wifiDeviceList;
    }

    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if (WifiManager.SCAN_RESULTS_AVAILABLE_ACTION.equals(action)) {
            sb = new StringBuilder();
            List<ScanResult> wifiList = wifiManager.getScanResults();

            for (ScanResult scanResult : wifiList) {
                sb.append("\n").append(scanResult.SSID);
                wifiNames.add(scanResult.SSID);
            }

            ArrayList<String> uniqueWifiNames = filterUniqueValues(wifiNames);

            ArrayAdapter arrayAdapter = new ArrayAdapter(context, android.R.layout.simple_list_item_1, uniqueWifiNames.toArray());
            wifiDeviceList.setAdapter(arrayAdapter);
        }
    }

    public ArrayList<String> filterUniqueValues(ArrayList<String> arrayList) {
        ArrayList<String> newList = new ArrayList<>();

        for (String element : arrayList) {
            if (!newList.contains(element)) {
                newList.add(element);
            }
        }

        return newList;
    }

}