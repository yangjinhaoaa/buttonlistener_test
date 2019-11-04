/*第一种,使用匿名内部类的方法*/

package com.example.buttonlistener;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    //对象声明

    private TextView print;
    private Button butn;

    @Override
    //onCreate用来初始化对象
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        print=(TextView)findViewById(R.id.textname);
        butn = (Button)findViewById(R.id.button);

        butn.setOnClickListener(new OnClickListener() {
            public void onClick(View v){
                print.setText("you click it");
            }
        });
    }
}


/*第二种方法使用内部类*/
/*
package com.example.buttonlistener;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    private Button btn;
    private TextView print;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=(Button)findViewById(R.id.button);
        print=(TextView)findViewById(R.id.textname);

        btn.setOnClickListener(new buttonClickListener());

    }
    class buttonClickListener implements View.OnClickListener{
        public void onClick(View v){
            print.setText("you click it");

        }
    }



}
*/

/*第三种方法,使用Activity作为监听器*/
/*
package com.example.buttonlistener;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends Activity implements OnClickListener {
    private Button btn;
    private TextView print;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=(Button)findViewById(R.id.button);
        print=(TextView)findViewById(R.id.textname);

        btn.setOnClickListener(this);


    }

    public void onClick(View v){
        print.setText("you click it");

    }



}
*/


/*第四种,使用绑定xml标签*/
/*
package com.example.buttonlistener;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends Activity {

    private TextView print;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        print=(TextView)findViewById(R.id.textname);


    }

    public void btnclick(View source) {
        print.setText("you click it");
    }

}


*/









