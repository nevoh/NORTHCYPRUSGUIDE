package com.example.northcyprusguide;



import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class HotelsActivity extends AppCompatActivity  {






//Individual recylcer views for the hotelse in the different cities
    private RecyclerView recyclerView;
    private RecyclerView girneRecyclerView;
    private RecyclerView magusaRecyclerView;
    private RecyclerView trikomoRecyclerView;

    //Array list for Lefkosa hotels
    private ArrayList<LefkosaModel> imageModelArrayList;
    private LefkosaAdapter adapter;

    //Array list for Girne hotels
    private ArrayList<GirneModel>girneModelArrayList;
    private GirneAdapter girneAdapter;


    //Array list for Magusa hotels
    private ArrayList<MagusaModel> magusaModelArrayList;
    private MagusaAdapter magusaAdapter;

    //Array list for Trikomo hotels
    private ArrayList<TrikomoModel> trikomoModelArrayList;
    private TrikomoAdapter trikomoAdapter;




    //Image resources with respective hotel titles for Lefkosa
    private int[] myImageList = new int[]{R.drawable.merithotel, R.drawable.aaresidence,R.drawable.cityroyal, R.drawable.djumbahotel, R.drawable.greenlandpremium, R.drawable.gulhanim, R.drawable.lefkosasaray, R.drawable.palmgardne};
    private String[] myImageNameList = new String[]{"Merit Hotel", "AA Residence", "City Royal", "Djumba Hotel", " Greenland Premium", "Gul Hanim Hotel", "Lefkosa Saray", "Palm Garden"};
    private String[] myAlphaTest = new String[] {"aa","bb","cc", "dd", "ee", "ff", "gg", "hh"};

    //Image resources with respective hotel titles for Girne
    private int[] myGirneImage = new int[]{R.drawable.anadol, R.drawable.avenuehotel,R.drawable.carringtongold, R.drawable.fivefingers, R.drawable.hotelpiabella, R.drawable.kyreniapalace, R.drawable.meryemshotel, R.drawable.olivetreehotel};
    private String[] myGirneName = new String[]{"Anadol Hotel", "Avenue Hotel", "Carrington Gold Hotel", "Five Fingers Hotel","Hotel Pia Bella", "Kyrenia Place", "Meryem's Hotel", "Olive Tree Hotel"};

    //Image resources with respective hotel titles for Magusa
    private int[] myMagusaImage = new int[]{R.drawable.altuntabya, R.drawable.ingatefamagusta,R.drawable.lusignanshotel, R.drawable.maliaholiday, R.drawable.mysterygardens, R.drawable.portview, R.drawable.premiuminn, R.drawable.thepines};
    private String[] myMagusaName = new String[]{"Altun Tabya Hotel", "Ingate Famagusta Hotel", "Lusignans Hotel", "Malia Holiday Hotel","Mystery Gardens Hotel", "Port View Hotel", "Premium Inn", "The Pines"};



    //Image resources with respective hotel titles for Trikomo
    private int[] myTrikomoImage = new int[]{R.drawable.ceasarresort, R.drawable.concordeluxury,R.drawable.limakcyprusdeluxehotel, R.drawable.longbeachclubresort, R.drawable.meritcyprusgardens, R.drawable.noahsarkdeluxehotel, R.drawable.sealifehotel, R.drawable.thalassabeachresort};
    private String[] myTrikomoName = new String[]{"Ceasar Resort", "Concorde Luxury Hotel", "Limak Cyprus deluxe Hotel", "Long Beach Club Resort","Merit Cyprus Gardens", "Noah's Arc Deluxe Hotel", "Sea Life Hotel", "Thalassa Beach Resort"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hotels);





        recyclerView = (RecyclerView) findViewById(R.id.lefkosaRecyclerView);
        girneRecyclerView = (RecyclerView) findViewById(R.id.girneRecyclerView);
        magusaRecyclerView = (RecyclerView) findViewById(R.id.magusaRecyclerView);
        trikomoRecyclerView = (RecyclerView) findViewById(R.id.trikomoRecyclerView);


        imageModelArrayList = niceHotels();
        adapter = new LefkosaAdapter(imageModelArrayList, this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.HORIZONTAL, false));

        girneModelArrayList = girneHotels();
        girneAdapter = new GirneAdapter(girneModelArrayList, this);
        girneRecyclerView.setAdapter(girneAdapter);
        girneRecyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext(),LinearLayoutManager.HORIZONTAL, false));

        magusaModelArrayList = magusaHotels();
        magusaAdapter = new MagusaAdapter(magusaModelArrayList, this);
        magusaRecyclerView.setAdapter(magusaAdapter);
        magusaRecyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext(),LinearLayoutManager.HORIZONTAL, false));

        trikomoModelArrayList = trikomoHotels();
        trikomoAdapter = new TrikomoAdapter(trikomoModelArrayList, this);
        trikomoRecyclerView.setAdapter(trikomoAdapter);
        trikomoRecyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext(),LinearLayoutManager.HORIZONTAL, false));


    }

    private ArrayList<LefkosaModel> niceHotels(){

        ArrayList<LefkosaModel> list = new ArrayList<>();
        for (int i = 0; i<8; i++){
            LefkosaModel lefkosaModel = new LefkosaModel();
            lefkosaModel.setName(myImageNameList[i]);
            lefkosaModel.setImage(myImageList[i]);
            lefkosaModel.setAlpha(myAlphaTest[i]);
            list.add(lefkosaModel);

        }
        return list;
    }

    private ArrayList<GirneModel> girneHotels(){

        ArrayList<GirneModel> girneList = new ArrayList<>();
        for (int i = 0; i<8; i++){
            GirneModel girneModel = new GirneModel();
            girneModel.setName(myGirneName[i]);
            girneModel.setImage(myGirneImage[i]);
            girneList.add(girneModel);
        }
        return girneList;
    }


    private ArrayList<MagusaModel> magusaHotels(){

        ArrayList<MagusaModel> magusaList = new ArrayList<>();
        for (int i = 0; i<8; i++){
            MagusaModel magusaModel = new MagusaModel();
            magusaModel.setName(myMagusaName[i]);
            magusaModel.setImage(myMagusaImage[i]);
            magusaList.add(magusaModel);
        }
        return magusaList;
    }

    private ArrayList<TrikomoModel> trikomoHotels(){

        ArrayList<TrikomoModel> trikomoList = new ArrayList<>();
        for (int i = 0; i<8; i++){
            TrikomoModel trikomoModel = new TrikomoModel();
            trikomoModel.setName(myTrikomoName[i]);
            trikomoModel.setImage(myTrikomoImage[i]);
            trikomoList.add(trikomoModel);
        }
        return trikomoList;
    }


        }




