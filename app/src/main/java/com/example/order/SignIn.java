package com.example.order;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.order.Model.User;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.rengwuxian.materialedittext.MaterialEditText;

import static com.google.firebase.database.FirebaseDatabase.getInstance;

public class SignIn extends AppCompatActivity {
    EditText edtPhone,edtPassword;

     Button btnSignIn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);


        edtPassword=(MaterialEditText) findViewById(R.id.edtPassword);
                edtPhone=(MaterialEditText)findViewById(R.id.edtPhone);
                        btnSignIn=(Button)findViewById(R.id.btnSignIn);

         //firebase
        final FirebaseDatabase database = getInstance();
        final DatabaseReference table_user= database.getReference("User");



        btnSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                final ProgressDialog mDialog= new ProgressDialog(SignIn.this);
                        mDialog.setMessage("Please Wait...");
                mDialog.show();



                table_user.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(  DataSnapshot dataSnapshot) {

                       //if user not exists
                        if(dataSnapshot.child(edtPhone.getText().toString()).exists()) {
                            //User information
                            mDialog.dismiss();
                            User user = dataSnapshot.child(edtPhone.getText().toString()).getValue(User.class);


                            if (user.getPassword().equals(edtPassword.getText().toString())) {
                                Toast.makeText(SignIn.this, "SignIn Successfully..!", Toast.LENGTH_SHORT).show();


                            }
                            else {
                                Toast.makeText(SignIn.this, "Wrong Password..!", Toast.LENGTH_SHORT).show();
                            }
                        }
                            else{
                                mDialog.dismiss();
                                Toast.makeText(SignIn.this, "User not Exist in Database!", Toast.LENGTH_SHORT).show();
                            }


                    }

                    @Override
                    public void onCancelled(DatabaseError databaseError) {

                    }
                });

                btnSignIn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent= new Intent(SignIn.this, MainActivity2.class);
                        startActivity(intent);

                    }
                });

            }
        });



    }
}