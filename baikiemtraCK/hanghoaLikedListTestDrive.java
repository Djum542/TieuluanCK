package com.duct2008110309.baikiemtraCK;
import java.util.LinkedList;
import java.util.Scanner;

public class hanghoaLinkedListTestDriver {
    public static void main(String[] args) {
        hanghoaLinkedList HanghoaLinkedList = new hanghoaLinkedList<>();
        Scanner hanghoa = new Scanner(System.in);
        HanghoaLinkedList.add("Thực phẩm ", "THP358784", "thịt", "150.000", "150", "30/11/2021");
        HanghoaLinkedList.add("Thực phẩm ", "THP676575", "Bơ ", "15.000", "300", "30/11/2021");
        HanghoaLinkedList.add("Thực phẩm ", "THP629388", "sữa chua", "20.000", "1000", "30/11/2021");
        HanghoaLinkedList.add("Thực phẩm ", "THP532837", "Xúc xích", "55.000", "1200", "30/11/2021");
        HanghoaLinkedList.add("Thực phẩm ", "THP237382", "Lạp xưởng", "180.000", "500", "30/11/2021");
        HanghoaLinkedList.add("Thực phẩm ", "THP236382", "Kem", "4.000", "325", "30/11/2021");
        HanghoaLinkedList.add("Thực phẩm ", "THP364647", "Dầu thực vật", "62.000", "150", "30/11/2021");
        HanghoaLinkedList.add("Thực phẩm ", "THP472829", "Mì tôm", "135.000", "500", "30/11/2021");
        HanghoaLinkedList.add("Thực phẩm ", "THP382362", "Mực", "120.000", "650", "30/11/2021");
        HanghoaLinkedList.add("Thực phẩm ", "THP469327", "Tôm", "90.000", "700", "30/11/2021");
        HanghoaLinkedList.add("Thực phẩm ", "THP434938", "Gạo", "14.000", "1000", "30/11/2021");
        HanghoaLinkedList.add("Thực phẩm ", "THP537498", "Ngũ cốc", "68.000", "727", "30/11/2021");
        HanghoaLinkedList.add("Thực phẩm ", "THP456343", "Sữa", "240.000", "3540", "30/11/2021");
        HanghoaLinkedList.add("Thực phẩm ", "THP343873", "Bia", "167.000", "4500", "30/11/2021");
        HanghoaLinkedList.add("Thực phẩm ", "THP463745", "Nước ngọt", "448.000", "4300", "30/11/2021");
        HanghoaLinkedList.add("Thực phẩm ", "THP564364", "Gia vị", "745.000", "4578", "30/11/2021");
        HanghoaLinkedList.add("Gốm sứ", "GS585494", "Bình ", "88.000", "380", "25/07/2021");
        HanghoaLinkedList.add("Gốm sứ ", "GS358784", "Hộp ", "125.000", "4678", "25/07/2021");
        HanghoaLinkedList.add("Gốm sứ ", "GS568338", "Đĩa", "134.000", "457", "25/07/2021");
        HanghoaLinkedList.add("Điện tử ", "DT563478", "tivi", "3.460.000", "487", "06/5/2021");
        HanghoaLinkedList.add("Điện tử ", "DT647346", "Tủ lạnh", "6.760.000", "867", "06/5/2021");
        HanghoaLinkedList.add("Điện tử ", "DT675438", "Lò vi ba", "4.050.000", "486", "06/5/2021");
        HanghoaLinkedList.add("Điện tử ", "DT5462384", "Quạt ", "1.578.000", "459", "06/5/2021");

        Scanner nhap = new Scanner(System.in);
        int chon;
        do{
            System.out.println("============= MENU ===========");
            System.out.println(">>1, Thêm hàng hóa vào đầu danh sách");
            System.out.println(">>2, Thêm hàng hóa vào giữa danh sách");

            System.out.println(">>3, Xóa hàng hóa trong danh sách");
            System.out.println(">>4, Thêm hang hóa vào cuối danh sách");
            System.out.println(">>5, Tìm kiếm hàng hóa trong danh sách");
            System.out.println(">>6, Sắp xếp hàng hóa trong danh sách");
            System.out.println(">>7, In ra hàng hóa trong danh sách");
            System.out.println(">>8, Tổng số lượng hàng hóa ");
            System.out.println(">>9, kết thúc chương trình");
            System.out.println(">>0, Nhập vào lựa chọn từ (1-> 7): ");
            chon = nhap.nextInt();
            switch(chon){
                case 1:
                    HanghoaLinkedList.themdau();
                    break;
                case 2:
                    HanghoaLinkedList.addHalf();
                    break;
                case 3:
                    HanghoaLinkedList.delete();
                    break;
                case 4:
                    HanghoaLinkedList.themcuoi();
                    break;
                case 5:
                    HanghoaLinkedList.find();
                    break;
                case 6:
                    HanghoaLinkedList.selectionshort();
                    break;
                case 7:
                    HanghoaLinkedList.print();
                    break;
                case 8:
                    HanghoaLinkedList.Tonghanghoa();
                case 9:
                    System.out.println("Kết thúc");
                    break;
            
            System.out.println("Quay lại MENU (1:yes/0:no):");
            chon = nhap.nextInt();
            }
        }while(chon == 1);
        nhap.close();
    }
}