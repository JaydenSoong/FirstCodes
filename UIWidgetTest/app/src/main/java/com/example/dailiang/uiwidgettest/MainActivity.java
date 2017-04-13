package com.example.dailiang.uiwidgettest;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.preference.DialogPreference;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //  声明变量 editText
    private EditText editText;
    //  声明变量 imageView
    private ImageView imageView;
    // 声明变量 progressBar
    private ProgressBar progressBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*
         * Button 学习
         */
        // 1.创建 Button
        Button button = (Button) findViewById(R.id.button);
        // 2.添加逻辑——通过匿名内部类
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 在此处添加逻辑——显示 EditText 输入的内容
                String inputText = editText.getText().toString();
                Toast.makeText(MainActivity.this, inputText, Toast.LENGTH_SHORT).show();

                // 更换 ImageView 里的图片
                imageView.setImageResource(R.drawable.wm);

                // 更改进度条的可见性
                /*
                if(progressBar.getVisibility() == View.GONE){
                    progressBar.setVisibility(View.VISIBLE);
                } else {
                    progressBar.setVisibility(View.GONE);
                }*/

                // 更改进度条进度
                int progress = progressBar.getProgress();
                progress += 10;
                progressBar.setProgress(progress);

                /*
                 * AlertDialog 学习
                 */
                // 创建实例
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                // 设置属性
                builder.setTitle("This is Dialog");
                builder.setMessage("Something important ......");
                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                    }
                });
                builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                    }
                });
                builder.show();

                /*
                 * ProgressDialog 学习
                 */
                // 创建实例
                ProgressDialog progressDialog = new ProgressDialog(MainActivity.this);
                // 设置属性
                progressDialog.setTitle("This is ProgressDialog");
                progressDialog.setMessage("Loading...");
                progressDialog.setCancelable(true);
                progressDialog.show();
            }
        });

        /*
         * EditText 学习
         */
        // 1. 声明变量 editText, 在 onCreate() 前面
        // 2. 为 editText 赋值
        editText = (EditText) findViewById(R.id.edit_text);

        /*
         * ImageView 学习
         */
        // 1. 声明变量 imageView, 在 onCreate() 前面
        // 2. 为 imageView 赋值
        imageView = (ImageView) findViewById(R.id.image_view);

        /*
         * ProgressBar 学习
         */
        // 1. 声明变量 progressBar, 在 onCreate() 前面
        // 2. 为 progressBar 赋值
        progressBar = (ProgressBar) findViewById(R.id.progress_bar);
    }
}
