package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class EditContactActivity extends AppCompatActivity {

    private EditText etName, etPhone, etEmail, etAddress;
    private ContactsDBHelper dbHelper;
    private Contact contact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_contact);

        dbHelper = new ContactsDBHelper(this);
        etName = findViewById(R.id.etName);
        etPhone = findViewById(R.id.etPhone);
        etEmail = findViewById(R.id.etEmail);
        etAddress = findViewById(R.id.etAddress);
        Button btnUpdate = findViewById(R.id.btnUpdate);
        Button btnDelete = findViewById(R.id.btnDelete);

        Intent intent = getIntent();
        int contactId = intent.getIntExtra("CONTACT_ID", -1);
        contact = dbHelper.getContactById(contactId);

        if (contact != null) {
            etName.setText(contact.getName());
            etPhone.setText(contact.getPhone());
            etEmail.setText(contact.getEmail());
            etAddress.setText(contact.getAddress());
        }

        btnUpdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contact.setName(etName.getText().toString());
                contact.setPhone(etPhone.getText().toString());
                contact.setEmail(etEmail.getText().toString());
                contact.setAddress(etAddress.getText().toString());
                dbHelper.updateContact(contact);
                finish();
            }
        });

        btnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dbHelper.deleteContact(contact.getId());
                finish();
            }
        });
    }
}
