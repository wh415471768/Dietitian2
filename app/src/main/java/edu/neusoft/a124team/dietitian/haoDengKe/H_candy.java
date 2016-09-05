package edu.neusoft.a124team.dietitian.haoDengKe;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import edu.neusoft.a124team.dietitian.R;
import edu.neusoft.a124team.dietitian.haoDengKe.utils.NetUtils;

public class H_candy extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (!NetUtils.check(H_candy.this)) {
            Toast.makeText(H_candy.this, getString(R.string.network_check), Toast.LENGTH_LONG).show();
            return;
        }
        setContentView(R.layout.activity_h_candy);

    }
}
