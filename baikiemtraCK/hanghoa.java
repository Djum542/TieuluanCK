package com.duct2008110309.baikiemtraCK;

import java.sql.Date;
import java.text.NumberFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;

public class hanghoa {
    int loai;
    int id;
    int TenSP;
    float DG;
    double SL;
    Date NgN;
    Scanner nhap = new Scanner(System.in);
    hanghoa(){

    }
     hanghoa(int loai,int id,int TenSP,float DG,double SL,date NgN){
        loai = loai;
        id = id;
        TenSP = TenSP;
        DG = DG;
        SL = SL;
        NgN = NgN;

    }
    void nhaphanghoa(){
        System.out.println("Nhập loại hàng");
        loai = nhap.nextInt();
        System.out.println("Nhập mã hàng");
        id = nhap.nextInt();
        System.out.println("Nhập tên hàng");
        TenSP = nhap.nextInt();
        System.out.println("Nhập dơn giá");
        DG = nhap.nextFloat();
        System.out.println("Nhập ngày nhập hàng");
        id = nhap.nextInt();
    }
    public String toStrong(){
        Locale localeid = new Locale("id", "ma");
        NumberFormat id = id.getCurrencyInstance(localeid);
        String ma = NumberFormat(id);
    }
    public void NgN(int year, int month, int day){
        Calendar NgN = Calendar.getInstance();
        Calendar(year, month - 1, day);
        this.NgN = Calendar();
    }
    public void curency(){
        double currency = 101.999f;
         
        // định dạng tiền tệ của khu vực mặc định của máy ảo JVM
        // khu vực mặc định này là nước Mỹ
        // nên đơn vị của tiền tệ sẽ là $
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();
        String str = currencyFormat.format(currency);
        System.out.println("Số " + currency + " sau khi định dạng = " + str);
             
        long vnd = 10000000L;
             
        // tạo 1 NumberFormat để định dạng tiền tệ theo tiêu chuẩn của Việt Nam
        // đơn vị tiền tệ của Việt Nam là đồng
        Locale localeVN = new Locale("vi", "VN");
        NumberFormat currencyVN = NumberFormat.getCurrencyInstance(localeVN);
        String str1 = currencyVN.format(vnd);
        System.out.println("Số " + vnd + " sau khi định dạng = " + str1);
    }
    void frint(){
        System.out.print("loại"+loai);
        System.out.print("mã"+id); 
        System.out.print("tên hàng "+TenSP);
        System.out.print("đơn giá"+DG);
        System.out.println("ngày nhap hàng"+NgN);




    }
   

}