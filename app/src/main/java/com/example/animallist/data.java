package com.example.animallist;

import java.util.ArrayList;

public class data {
    private static String[] namahewan={
            "monyet",
            "lebah",
            "ayam",
            "kepiting",
            "gajah",
            "singa",
            "gurita",
            "panda",
            "hiu",
            "siput",

    };


    private static int[] foto={
            R.drawable.monkey,
            R.drawable.bee,
            R.drawable.chicken,
            R.drawable.kepiting_foreground,
            R.drawable.elephant,
            R.drawable.lion,
            R.drawable.octopus,
            R.drawable.panda,
            R.drawable.shark,
            R.drawable.snail,



    };

    private static String[] info ={
            "monyet info ",
            " lebah info",
            "ayam info  ",
            " kepiting info",
            "gajah info ",
            " singa info",
            "gurita info ",
            "panda info ",
            "hiu info",
            " siput info",
    };


    static ArrayList<Hewan> getListData() {
        ArrayList<Hewan> list = new ArrayList<>();
        for (int position = 0; position <namahewan.length; position++) {
            Hewan hewan = new Hewan();
            hewan.setName(namahewan[position]);
            hewan.setFoto(foto[position]);
            hewan.setInfo(info[position]);
            list.add(hewan);
        }
        return list;
    }
}
