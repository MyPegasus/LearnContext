package com.example.mypegasus.learncontext;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by Administrator on 2015/7/27 0027.
 */
public class Main2Activity extends Activity{
    private TextView textView;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        System.out.println("Main2Activity onCreate");

        setContentView(R.layout.activity_main2);

        textView = (TextView) findViewById(R.id.textView);
        editText = (EditText) findViewById(R.id.editText);

        textView.setText("共享的数据是：" + ((MyApplication)getApplicationContext()).getTextDate());

        findViewById(R.id.btn_saveData).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MyApplication) getApplicationContext()).setTextDate(editText.getText().toString());
                textView.setText("共享的数据是：" + editText.getText().toString());
            }
        });
    }
}
