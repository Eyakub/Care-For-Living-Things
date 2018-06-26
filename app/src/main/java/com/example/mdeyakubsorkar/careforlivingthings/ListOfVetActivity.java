package com.example.mdeyakubsorkar.careforlivingthings;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.mdeyakubsorkar.careforlivingthings.VetInfo.Vet;
import com.example.mdeyakubsorkar.careforlivingthings.VetInfo.VetAdapter;

import java.util.ArrayList;
import java.util.List;

public class ListOfVetActivity extends AppCompatActivity {

    private ListView lvVetList;
    private VetAdapter vetArrayAdapter;
    private List<Vet> vetArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_of_vet);
        lvVetList = findViewById(R.id.customListForVetInfo);
        vetListInfo();
    }

    private void vetListInfo() {
        vetArrayList = new ArrayList<>();
        //vetName, vetNumber, vetDistrict, vetLocation, vetEmail, vetPhone, vetURL
        vetArrayList.add(new Vet("Dr. Siamak", "01711561155", "Dhaka", "H-56, R-9/B, Sector - 5, Uttara", "", "88028917249", "None", ""));
        vetArrayList.add(new Vet("Dr. K. B. M. Saiful Islam", "01674173844", "Dhaka", "Vet & Pet Care", "", "", "www.facebook.com/vetnpet.care", "Visiting Hour: 5.00pm - 8.30pm(On Appointments only)"));
        vetArrayList.add(new Vet("Dr. Md. Luthfor Rahman", "01552457085", "Dhaka", "Nikunja-2, Khilkhet, Dhaka", "luthfor75@gmail.com", "", "", "He attends house calls"));
        vetArrayList.add(new Vet("Dr. Kajol", "01711139014", "Dhaka", "", "", "", "", "He attends house calls"));
        vetArrayList.add(new Vet("Dr. Kazi Mujibur Rahman", "01715016218", "Dhaka", "Chief vet, Central Veterinary Hospital, Dhaka", "", "", "", ""));
        vetArrayList.add(new Vet("Dr. Mohammad Shariful Haque", "0173046585", "Dhaka", "ElephantRoad", "", "88028619706", "", ""));
        vetArrayList.add(new Vet("Dr. Lf. Col Shahjada", "01711123288", "", "", "", "", "", "Bangladesh Army(Vet)"));
        vetArrayList.add(new Vet("Dr. Aravinda", "01936617437", "", "", "", "", "", ""));
        vetArrayList.add(new Vet("Dr. Azmat Ali", "01912013615", "Dhaka", "Gulshan Pet-Animal Clinic, 4-5 DCC Super Market, Gulshan-2", "", "", "", "Visiting hour: 9Am-9Pm"));
        vetArrayList.add(new Vet("Dr. Bibek Chandra Sutradhar", "01711057533", "Chittagong", "Chittagaong Vetenary & Animal Science University, Zakir Hossain Road, khulshi, ctg-4225", "bibeksd@yahoo.com", "", "", ""));
        vetArrayList.add(new Vet("Dr. Monowar Sayeed Pallab", "01734930901", "Chittagong", "Chittagaong Vetenary & Animal Science University, Zakir Hossain Road", "mspallab@yahoo.com", "", "", ""));
        vetArrayList.add(new Vet("Dr. Mohammad Golam Morshed", "01718700640", "", "", "", "", "", ""));
        vetArrayList.add(new Vet("Dr. Farhad", "01711172139", "", "", "", "", "", ""));
        vetArrayList.add(new Vet("Dr. A T M Mahbub E Elahi", "01711301042", "Sylhet", "Professor, Dept of Microbiology, SAU", "atm.mahbub.elahi@gmail.com", "", "",""));
        vetArrayList.add(new Vet("Dr. Syed Sayem Uddin Ahmed", "01947706956", "Sylhet", "Sylhet Agricultural University", "sayeem_2000@yahoo.com", "", "", ""));
        vetArrayList.add(new Vet("Dr. Animesh Roy", "01717896167", "Sylhet", "SAU Vet Clinics", "royanimeshvet@yahoo.com", "", "", ""));
        vetArrayList.add(new Vet("Dr. Mahbub", "01711287533", "Sylhet", "District Vet. Hospital, Sylhet", "", "", "", ""));
        vetArrayList.add(new Vet("Dr. Rofiqul Islam", "01199008496", "Sylhet", "", "dr.rafiqsau@yahoo.com", "", "", ""));
        vetArrayList.add(new Vet("Dr. MD Siddiqul Islam", "01711148450", "Sylhet", "", "siddiqulislam27@yahoo.com", "", "",""));
        vetArrayList.add(new Vet("Dr. Sultan Ahmed", "01711140389", "Sylhet", "", "drsultanahmed@yahoo.com", "", "",""));
        vetArrayList.add(new Vet("Dr. Abdullah-Al-Mujahid", "01715728760", "Khulna", "Sonadanga R/A, Phase-2, Sonadanga, Khulna", "", "", "","He attends house calls"));
        //vetArrayList.add(new Vet("", "", "", "", "", "", "",""));

        //vetArrayAdapter = new ArrayAdapter<Vet>(ListOfVetActivity.this, R.layout.list_item_vet, vetArrayList);
        vetArrayAdapter = new VetAdapter(getApplicationContext(), vetArrayList);
        //listView = findViewById(R.id.customListForVetInfo);
        lvVetList.setAdapter(vetArrayAdapter);
    }
}
