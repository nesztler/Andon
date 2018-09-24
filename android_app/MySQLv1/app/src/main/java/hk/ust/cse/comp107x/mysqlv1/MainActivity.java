package hk.ust.cse.comp107x.mysqlv1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import android.media.MediaPlayer;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    // url spécifique à JDBC
    private static final String url ="jdbc:mysql://nesztler3227.hopto.org:3306/tlcd_andon";
    private static final String user ="root";
    private static final String pass ="carolien";
    private TextView tv1, tv2, tv3, tv4, tv5, tv6, tv7, tv8, tv9, tv10;
    private Button buttonLoad;
    public MediaPlayer ring;
    public int rs_last;
    public long run=1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ring=MediaPlayer.create(MainActivity.this,R.raw.doorbell);

        buttonLoad = (Button) findViewById(R.id.buttonLoad);
        tv1 = (TextView) findViewById(R.id.textView1);
        tv2 = (TextView) findViewById(R.id.textView2);
        tv3 = (TextView) findViewById(R.id.textView3);
        tv4 = (TextView) findViewById(R.id.textView4);
        tv5 = (TextView) findViewById(R.id.textView5);
        tv6 = (TextView) findViewById(R.id.textView6);
        tv7 = (TextView) findViewById(R.id.textView7);
        tv8 = (TextView) findViewById(R.id.textView8);
        tv9 = (TextView) findViewById(R.id.textView9);
        tv10 = (TextView) findViewById(R.id.textView10);

        buttonLoad.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                new MyTask().execute();
            }
        });
    }

    private class MyTask extends AsyncTask<Void, Void, Void> {

        private String toto1 = "";
        private String toto2 = "";
        private String toto3 = "";
        private String toto4 = "";
        private String toto5 = "";
        private String toto6 = "";
        private String toto7 = "";
        private String toto8 = "";
        private String toto9 = "";
        private String toto10 = "";
        long run = 1;

      //while (run<=10) {
            @Override
            protected Void doInBackground(Void... params) {

                    /* Chargement du driver JDBC pour MySQL */
                try {
                    ring.start();
                    Class.forName("com.mysql.jdbc.Driver");

                    Connection con = DriverManager.getConnection(url, user, pass);

                    Statement st = con.createStatement();
                    String sql = "SELECT * FROM tlcd";

                    final ResultSet rs = st.executeQuery(sql);
                    ResultSetMetaData rsmd = rs.getMetaData();

                    //for (long i = 0; i <= 50000000; i++) {

                    //}

                    rs.first();
                    toto1 = rsmd.getColumnName(1) + ": " + rs.getString(1) + " --> " + rs.getString(2) + " - " + rs.getString(3) + " - " + rs.getString(4) + " - " + rs.getString(5) + " - " + rs.getString(6) + " - " + rs.getString(7) + " - " + rs.getString(8);
                    rs.next();
                    toto2 = rsmd.getColumnName(1) + ": " + rs.getString(1) + " --> " + rs.getString(2) + " - " + rs.getString(3) + " - " + rs.getString(4) + " - " + rs.getString(5) + " - " + rs.getString(6) + " - " + rs.getString(7) + " - " + rs.getString(8);
                    rs.next();
                    toto3 = rsmd.getColumnName(1) + ": " + rs.getString(1) + " --> " + rs.getString(2) + " - " + rs.getString(3) + " - " + rs.getString(4) + " - " + rs.getString(5) + " - " + rs.getString(6) + " - " + rs.getString(7) + " - " + rs.getString(8);
                    rs.next();
                    toto4 = rsmd.getColumnName(1) + ": " + rs.getString(1) + " --> " + rs.getString(2) + " - " + rs.getString(3) + " - " + rs.getString(4) + " - " + rs.getString(5) + " - " + rs.getString(6) + " - " + rs.getString(7) + " - " + rs.getString(8);
                    rs.next();
                    toto5 = rsmd.getColumnName(1) + ": " + rs.getString(1) + " --> " + rs.getString(2) + " - " + rs.getString(3) + " - " + rs.getString(4) + " - " + rs.getString(5) + " - " + rs.getString(6) + " - " + rs.getString(7) + " - " + rs.getString(8);
                    rs.next();
                    toto6 = rsmd.getColumnName(1) + ": " + rs.getString(1) + " --> " + rs.getString(2) + " - " + rs.getString(3) + " - " + rs.getString(4) + " - " + rs.getString(5) + " - " + rs.getString(6) + " - " + rs.getString(7) + " - " + rs.getString(8);
                    rs.next();
                    toto7 = rsmd.getColumnName(1) + ": " + rs.getString(1) + " --> " + rs.getString(2) + " - " + rs.getString(3) + " - " + rs.getString(4) + " - " + rs.getString(5) + " - " + rs.getString(6) + " - " + rs.getString(7) + " - " + rs.getString(8);
                    rs.next();
                    toto8 = rsmd.getColumnName(1) + ": " + rs.getString(1) + " --> " + rs.getString(2) + " - " + rs.getString(3) + " - " + rs.getString(4) + " - " + rs.getString(5) + " - " + rs.getString(6) + " - " + rs.getString(7) + " - " + rs.getString(8);
                    rs.next();
                    toto9 = rsmd.getColumnName(1) + ": " + rs.getString(1) + " --> " + rs.getString(2) + " - " + rs.getString(3) + " - " + rs.getString(4) + " - " + rs.getString(5) + " - " + rs.getString(6) + " - " + rs.getString(7) + " - " + rs.getString(8);
                    rs.next();
                    toto10 = rsmd.getColumnName(1) + ": " + rs.getString(1) + " --> " + rs.getString(2) + " - " + rs.getString(3) + " - " + rs.getString(4) + " - " + rs.getString(5) + " - " + rs.getString(6) + " - " + rs.getString(7) + " - " + rs.getString(8);
                    //run ++;
                    //while (rs.next()) {
                    //toto1 += rsmd.getColumnName(1) + ": " + rs.getString(1) + " --> " + rs.getString(2) + " - " + rs.getString(3) + " - " + rs.getString(4) + " - " + rs.getString(5)+ " - " + rs.getString(6)+ " - " + rs.getString(7) + " - " + rs.getString(8) + "\n"+ "\n";
                    //}


                    //rs_last= Integer.parseInt(rs.getString(1));
                    //while (true) {
                    //   rs.next();
                    //   if (Integer.parseInt(rs.getString(1))>= 4) {
                    //       ring.start();
                    //       toto += rsmd.getColumnName(1) + ": " + rs.getString(1) + " --> " + rs.getString(2) + " - " + rs.getString(3) + " - " + rs.getString(4) + " - " + rs.getString(5)+ " - " + rs.getString(6)+ " - " + rs.getString(7) + " - " + rs.getString(8) +"\n"+ "\n";
                    //       rs_last= Integer.parseInt(rs.getString(1));
                    //   }
                    //}


                } catch (ClassNotFoundException e) {
                        /* Gestion des éventuelles erreurs si le driver n'est pas chargé */
                    e.printStackTrace();

                } catch (SQLException e) {
                        /* Gestion des éventuelles erreurs du DriverManager */
                    e.printStackTrace();
                }
                return null;
            }


            @Override
            protected void onPostExecute(Void result) {
                tv1.setText(toto1);
                tv2.setText(toto2);
                tv3.setText(toto3);
                tv4.setText(toto4);
                tv5.setText(toto5);
                tv6.setText(toto6);
                tv7.setText(toto7);
                tv8.setText(toto8);
                tv9.setText(toto9);
                tv10.setText(toto10);
                super.onPostExecute(result);
            }
           //run++;
      //}

    }
}