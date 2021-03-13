package com.example.it_202;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //EditText and TextView
    public EditText getfname, getlname, getOvertime, getnumberOfWork, getRatePerHour;
    public TextView Fullname, Overtime, NumberOfWork, RatePerHour, Salary, Tax, SSS, PagIbig, TotalDeduction, TotalSalary;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void computeOutput(View view) {
        //variables
        String fullname="", Fname="", Lname="";
        int numberOfWork=0, ratePerHour=0, overtime=0, Newovertime=0, salary=0, temp=0, tax=0, sss=0, pagibig=0, totaldeduction=0, totalsalary=0, Newtotalsalary=0;

        //Getter
        getfname = findViewById(R.id.inputFirstname);
        getlname = findViewById(R.id.inputLastname);
        getnumberOfWork = findViewById(R.id.inputNumberOfHoursWork);
        getRatePerHour = findViewById(R.id.inputRatePerHour);
        getOvertime = findViewById(R.id.inputOvertime);

        //Getter Transfer to variable
        Fname = getfname.getText().toString();
        Lname = getlname.getText().toString();
        numberOfWork = Integer.parseInt(getnumberOfWork.getText().toString());
        ratePerHour = Integer.parseInt(getRatePerHour.getText().toString());
        overtime = Integer.parseInt(getOvertime.getText().toString());

        //computation
        fullname = Fname + " " + Lname;
        salary = (ratePerHour * numberOfWork);
        temp = (int)(ratePerHour * .20);
        Newovertime = ((ratePerHour + temp)*overtime);
        tax = (int)(salary * .10);
        sss = (int)(salary * .05);
        pagibig = (int)(salary * .03);
        totaldeduction = (tax + pagibig + sss);
        Newtotalsalary = (salary + Newovertime);
        totalsalary = Newtotalsalary - totaldeduction;

        //set to output
        Fullname = findViewById(R.id.outputName);
        NumberOfWork = findViewById(R.id.outputNumberOfHoursWork);
        RatePerHour = findViewById(R.id.outputRatePerHour);
        Salary = findViewById(R.id.outputSalary);
        Overtime = findViewById(R.id.outputOvertime);
        Tax = findViewById(R.id.outputTax);
        SSS = findViewById(R.id.outputSSS);
        PagIbig = findViewById(R.id.outputPagbig);
        TotalDeduction = findViewById(R.id.outputTotaldeduction);
        TotalSalary = findViewById(R.id.outputTotalsalary);

        //ouput
        Fullname.setText(fullname);
        NumberOfWork.setText(String.valueOf(numberOfWork));
        RatePerHour.setText(String.valueOf(ratePerHour));
        Salary.setText(String.valueOf(salary));
        Overtime.setText(String.valueOf(Newovertime));
        Tax.setText(String.valueOf(tax));
        SSS.setText(String.valueOf(sss));
        PagIbig.setText(String.valueOf(pagibig));
        TotalDeduction.setText(String.valueOf(totaldeduction));
        TotalSalary.setText(String.valueOf(totalsalary));
    }
}