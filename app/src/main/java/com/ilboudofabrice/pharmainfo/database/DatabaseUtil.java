package com.ilboudofabrice.pharmainfo.database;

import android.content.Context;

import com.ilboudofabrice.pharmainfo.model.CityConstant;
import com.ilboudofabrice.pharmainfo.model.Pharmacy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by fabrice on 2016-11-10.
 */

public class DatabaseUtil {
    private static List<Pharmacy> pharmacies = new ArrayList<>();

    public static void initializeDB(Context context,DatabaseAdapter adapter){
        if(adapter == null) {
            adapter = new DatabaseAdapter(context);
        }
        saveGroup1Pharmacies();

        int counter = 0;
        for(Pharmacy pharmacy : pharmacies)
        {
            adapter.insertData(counter,pharmacy.getName(), pharmacy.getAddress(), pharmacy.getPhone(), pharmacy.getCity());
            counter++;
        }
    }

    public  static void saveGroup1Pharmacies() {
        Pharmacy p1 = new Pharmacy();
        p1.setName("Avenir");
        p1.setPhone("25-36-13-38");
        p1.setCity(CityConstant.OUAGADOUGOU);
        p1.setGroup("1");
        pharmacies.add(p1);

        Pharmacy p2 = new Pharmacy();
        p2.setName("Baowendsom");
        p2.setPhone("25-41-44-99");
        p2.setCity(CityConstant.OUAGADOUGOU);
        p2.setGroup("1");
        pharmacies.add(p2);

        Pharmacy p3 = new Pharmacy();
        p3.setName("Beatitudes");
        p3.setPhone("25-37-47-11");
        p3.setCity(CityConstant.OUAGADOUGOU);
        p3.setGroup("1");
        pharmacies.add(p3);

        Pharmacy p4 = new Pharmacy();
        p4.setName("Benaia");
        p4.setPhone("25-37-28-30");
        p4.setCity(CityConstant.OUAGADOUGOU);
        p4.setGroup("1");
        pharmacies.add(p4);

        Pharmacy p5 = new Pharmacy();
        p5.setName("Camille");
        p5.setPhone("25-36-61-27");
        p5.setCity(CityConstant.OUAGADOUGOU);
        p5.setGroup("1");
        pharmacies.add(p5);

        Pharmacy p6 = new Pharmacy();
        p6.setName("Benaia");
        p6.setPhone("25-37-28-30");
        p6.setCity(CityConstant.OUAGADOUGOU);
        p6.setGroup("1");
        pharmacies.add(p6);

        Pharmacy p7 = new Pharmacy();
        p7.setName("Carrefour");
        p7.setPhone("25-33-23-10");
        p7.setCity(CityConstant.OUAGADOUGOU);
        p7.setGroup("1");
        pharmacies.add(p7);

        Pharmacy p8 = new Pharmacy();
        p8.setName("Centre");
        p8.setPhone("25-31-16-60");
        p8.setCity(CityConstant.OUAGADOUGOU);
        p8.setGroup("1");
        pharmacies.add(p8);

        Pharmacy p9 = new Pharmacy();
        p9.setName("Desa");
        p9.setPhone("25 47 50 50");
        p9.setCity(CityConstant.OUAGADOUGOU);
        p9.setGroup("1");
        pharmacies.add(p9);

        Pharmacy p10 = new Pharmacy();
        p10.setName("Elite");
        p10.setPhone("25 41 91 77");
        p10.setCity(CityConstant.OUAGADOUGOU);
        p10.setGroup("1");
        pharmacies.add(p10);

        Pharmacy p11 = new Pharmacy();
        p11.setName("Goulmou");
        p11.setPhone("25 43 63 05");
        p11.setCity(CityConstant.OUAGADOUGOU);
        p11.setGroup("1");
        pharmacies.add(p11);

        Pharmacy p12 = new Pharmacy();
        p12.setName("Indépendance");
        p12.setPhone("25 31 27 17");
        p12.setCity(CityConstant.OUAGADOUGOU);
        p12.setGroup("1");
        pharmacies.add(p12);

        Pharmacy p13 = new Pharmacy();
        p13.setName("Jober");
        p13.setPhone("25 43 63 05");
        p13.setCity(CityConstant.OUAGADOUGOU);
        p13.setGroup("1");
        pharmacies.add(p13);

        Pharmacy p14 = new Pharmacy();
        p14.setName("Kabore dominique");
        p14.setPhone("25 38 48 84");
        p14.setCity(CityConstant.OUAGADOUGOU);
        p14.setGroup("1");
        pharmacies.add(p14);

        Pharmacy p15 = new Pharmacy();
        p15.setName("Keneya");
        p15.setPhone("25 30 71 38");
        p15.setCity(CityConstant.OUAGADOUGOU);
        p15.setGroup("1");
        pharmacies.add(p15);

        Pharmacy p16 = new Pharmacy();
        p16.setName("Kossodo");
        p16.setPhone("25 35 63 04");
        p16.setCity(CityConstant.OUAGADOUGOU);
        p16.setGroup("1");
        pharmacies.add(p16);

        Pharmacy p17 = new Pharmacy();
        p17.setName("Liberté");
        p17.setPhone("25 30 74 52");
        p17.setCity(CityConstant.OUAGADOUGOU);
        p17.setGroup("1");
        pharmacies.add(p17);

        Pharmacy p18 = new Pharmacy();
        p18.setName("Magnificat");
        p18.setPhone("25 39 63 38");
        p18.setCity(CityConstant.OUAGADOUGOU);
        p18.setGroup("1");
        pharmacies.add(p18);

        Pharmacy p19 = new Pharmacy();
        p19.setName("Maré");
        p19.setPhone("25 34 11 28");
        p19.setCity(CityConstant.OUAGADOUGOU);
        p19.setGroup("1");
        pharmacies.add(p19);

        Pharmacy p20 = new Pharmacy();
        p20.setName("Monderou");
        p20.setPhone("25 34 05 28");
        p20.setCity(CityConstant.OUAGADOUGOU);
        p20.setGroup("1");
        pharmacies.add(p20);

        Pharmacy p21 = new Pharmacy();
        p21.setName("Nouvelle");
        p21.setPhone("25 30 61 33");
        p21.setCity(CityConstant.OUAGADOUGOU);
        p21.setGroup("1");
        pharmacies.add(p21);

        Pharmacy p22 = new Pharmacy();
        p22.setName("Pelega");
        p22.setPhone("25 35 05 01");
        p22.setCity(CityConstant.OUAGADOUGOU);
        p22.setGroup("1");
        pharmacies.add(p22);

        Pharmacy p23 = new Pharmacy();
        p23.setName("Rivage");
        p23.setPhone("25 34 19 39");
        p23.setCity(CityConstant.OUAGADOUGOU);
        p23.setGroup("1");
        pharmacies.add(p23);

        Pharmacy p24 = new Pharmacy();
        p24.setName("Saint Bernard");
        p24.setPhone("25 45 14 82");
        p24.setCity(CityConstant.OUAGADOUGOU);
        p24.setGroup("1");
        pharmacies.add(p24);

        Pharmacy p25 = new Pharmacy();
        p25.setName("Saint Jean");
        p25.setPhone("25 37 00 33");
        p25.setCity(CityConstant.OUAGADOUGOU);
        p25.setGroup("1");
        pharmacies.add(p25);

        Pharmacy p26 = new Pharmacy();
        p26.setName("Silmissin");
        p26.setPhone("25 37 20 13");
        p26.setCity(CityConstant.OUAGADOUGOU);
        p26.setGroup("1");
        pharmacies.add(p26);

        Pharmacy p27 = new Pharmacy();
        p27.setName("Siloé");
        p27.setPhone("25 31 50 68");
        p27.setCity(CityConstant.OUAGADOUGOU);
        p27.setGroup("1");
        pharmacies.add(p27);

        Pharmacy p28 = new Pharmacy();
        p28.setName("Song Taaba");
        p28.setPhone("25 36 64 62");
        p28.setCity(CityConstant.OUAGADOUGOU);
        p28.setGroup("1");
        pharmacies.add(p28);

        Pharmacy p29 = new Pharmacy();
        p29.setName("St François D’Assise");
        p29.setPhone("25 36 85 85");
        p29.setCity(CityConstant.OUAGADOUGOU);
        p29.setGroup("1");
        pharmacies.add(p29);

        Pharmacy p30 = new Pharmacy();
        p30.setName("Trypano");
        p30.setPhone("25 33 29 41");
        p30.setCity(CityConstant.OUAGADOUGOU);
        p30.setGroup("1");
        pharmacies.add(p30);

        Pharmacy p31 = new Pharmacy();
        p31.setName("Wend La Laafi");
        p31.setPhone("25 43 12 13");
        p31.setCity(CityConstant.OUAGADOUGOU);
        p31.setGroup("1");
        pharmacies.add(p31);

        Pharmacy p32 = new Pharmacy();
        p32.setName("Wend lamita");
        p32.setPhone("25 34 15 87");
        p32.setCity(CityConstant.OUAGADOUGOU);
        p32.setGroup("1");
        pharmacies.add(p32);

        Pharmacy p33 = new Pharmacy();
        p33.setName("Yathrib");
        p33.setPhone("70 24 97 63");
        p33.setCity(CityConstant.OUAGADOUGOU);
        p33.setGroup("1");
        pharmacies.add(p33);
    }
}
