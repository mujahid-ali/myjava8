package com.company.stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamFileCaseStudy {

    public static void main(String[] args) throws IOException {

        Stream<String> rowData = Files.lines(Paths.get(System.getProperty("user.dir")+"/"+"salesdata.csv"));
        //System.out.println(rowData);
        //Get only those data which has sales info
        //Cheese,8000,2020 => [Cheese,8000,2020]
        //int rowCount = (int) rowData.map(x->x.split(",")).filter(arr->arr.length >2).count();
        //System.out.println(rowCount);

        //List<String[]> arrayOfSalesData = rowData.map(x->x.split(",")).filter(arr->arr.length > 2).collect(Collectors.toList());
        //Only for 2020
        /*
        List<String[]> arrayOfSalesData = rowData.map(x->x.split(",")).filter(arr->arr.length > 2 && arr[2].equals("2020")).collect(Collectors.toList());

        for (String[] arrData : arrayOfSalesData) {
            System.out.println(arrData[0] + "  " + arrData[1]);
        }

         */

        //Catergorization of sales data for every pizza type
        //{"Cheese":"8000", "Veggie": "7000"}
        /*
        Map<String, Integer> map = rowData.map(row -> row.split(","))
                .filter(r -> r.length > 2).collect(Collectors.toMap(data -> data[0], value -> Integer.parseInt(value[1])));
        System.out.println(map);
        System.out.println("Sales data for Veggie = " +map.get("Veggie"));
        */

        //Find the total sales for all pizza for year 2020

        Optional<Integer> optTotalSales_2020 = rowData.map(row -> row.split(",")).filter(r -> r.length > 2)
                .map(y -> Integer.parseInt(y[1])).reduce((p,q) -> p + q);

        System.out.println(optTotalSales_2020.get());



    }
}
