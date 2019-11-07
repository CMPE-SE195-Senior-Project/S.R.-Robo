package com.example.srrobo;

import androidx.appcompat.app.AppCompatActivity;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.*;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;
import android.widget.AdapterView;
import android.util.*;

import java.util.*;

import android.os.Bundle;


public class BluetoothConnection extends AppCompatActivity {

    TextView connectionStatus;
    Button onBtn, offBtn, pairNewBtn, listDevBtn;


    BluetoothAdapter bluetoothAdapter;

    public ArrayList<BluetoothDevice> mBTDevices = new ArrayList<>();


    ListView lvNewDevices;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bluetooth_connection);
        connectionStatus = findViewById(R.id.statusText);
        onBtn = findViewById(R.id.onButton);
        offBtn = findViewById(R.id.offButton);
        pairNewBtn = findViewById(R.id.newConnectButton);
        listDevBtn = findViewById(R.id.showConnectionButton);
        bluetoothAdapter = BluetoothAdapter.getDefaultAdapter();

        if (bluetoothAdapter == null){
            connectionStatus.setText("Bluetooth is not connected");
        } else {
            connectionStatus.setText("Bluetooth is connected");

        }
    }
}
