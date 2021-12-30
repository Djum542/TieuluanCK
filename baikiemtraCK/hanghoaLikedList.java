package com.duct2008110309.baikiemtraCK;

import org.w3c.dom.Node;

public class hanghoaLikedList {
    Node head = null;
    Node tail = null;
    Scanner nhap = new Scanner(System.in);
    public hanghoaLikedList(){}
    public void nhapthongtin(){
        Scanner hanghoa = new Scanner(System.in);
        head = null;
        tail = null;

        for (int i = 0; i < sL; i++) {
            System.out.println("hàng hóa " + i);
            System.out.print("Mã id  :");
            int id = hanghoa.nextInt();
            HH.nextLine();
            System.out.print("tÊN SẢN PHẨM : ");
            int TenSP = hanghoa.nextInt();
            System.out.print("Giá sản phẩm : ");
            Double DG = hanghoa.nextDouble();
            System.out.print("Số lượng : ");
            Double SL = hanghoa.nextDouble();
            System.out.print("Ngày nhập hàng : ");
            Double NgN = hanghoa.nextDate();
            addTail(new hanghoa(id, TenSP, DG, SL, NgN));
        }

    }
    Boolean isempty(hanghoa HH) {
        boolean empty =null;
            if(head = null){
                empty = True;

            }else{
                empty = False;

            }
            return empty;
    }
    public void themdau(hanghoa HH) {
        // kiểm tra danh sách có trống hay không
        if(isempty()){
            Node newNode = new Node(HH);
            head = newNode;
            tail = newNode;
        }else{
            newNode.next = head;
            head = newNode;
        }
    }
    public void themcuoi(hanghoa HH) {
        Node newNode = new Node(HH);
        if(isempty()){
        head = newNode;
        tail = newNode;

        }else{
        tail.next = newNode;
        tail = newNode;
        }
    }
    public Node Find(int loai) {
        Node node = null;
        if(isempty()){
            System.out.println("danh sách rỗng");
        }else{
            Node curent;
            curent = head;
            while (curent != null) {
                if(curent.data.loai = loai){
                    node = curent;
                }
                curent = curent.next;
            }
        }
        return node;
    }
    public void addHalf(int id, hanghoa HH) {
        Node node = null;
        Node Half;
        if(isempty()){
            System.out.println("Danh sách rỗng");
        }else{
            Node curent;
            curent = head;
            while(curent.next != null){
                Half = curent;
                if(curent.data.l = id){
                    // node = curent;
                    Node newNode = new Node(hanghoa);

                }
                curent = curent.next;
            }
        }
        return ;
    }
    public void delete(hanghoa HH) {
        if(isempty()){
            System.out.println("Không có gì để xóa");
        }else{
            Node curent;
            curent = head;
            while (curent != null) {
                if(curent.data.id = id){
                    tail = curent;
                    tail.next = null;
                }
                curent = curent.next;
            }
        }
        return curent;
    }
    public static void slectionshort(int[] arr){
        if(isempty()){

        }else{
            Node curent;
            
            while (curent != null) {
                
            
            if(curent.data.DG = DG){
                for(int i = 0; i < arr.length;i++){
                 int index = i;
                for(int j = 0;j < arr.length;j++){
                if(arr[j] > arr[i]){
                    index = j;
                }
            }
            }
            int bigerDG = arr[index];
                arr[index]=arr[i];
                arr[i] = bigerDG;
            }
        }
        }
        
    }
    public static void bubllesort(int[] arr){
        if(isempty()){

        }else{
            Node temp;
            
            while (temp != null) {
                if (temp.data.DG = DG) {
                    int n = arr.length;
                    
                    for(int i = 0;i<n;i++){
                        for(int j = 1;j<(n-i);j++){
                            if(arr[j-1]<arr[j]){
                                curent = arr[j-1];
                                arr[j-1] = arr[j];
                                arr[j]= curent;
                            }
                        }
                    }
                }
            }
        }
    }
    public void print(hanghoa HH) {
        System.out.println("- loai: "+loai);
        System.out.println("- mã: "+id);
        System.out.println("- tên sản phẩm: "+TenSP);   
        System.out.println("- đơn giá: "+DG);
        System.out.println("- số lượng: "+SL);
        System.out.println("- ngày nhập kho: "+NgN);
        System.out.println("___________________________");
    }
    public void Tonghanghoa() {
        if(isempty()){

        }else{
            Node curent;
            curent = head;
            while (curent != null) {
                if (curent.data.SL = SL) {
                    for(int i = 0;i< Tonghanghoa;i++){
                    Tonghanghoa = Tonghanghoa + i;
                    }
                    System.out.println("Tổng hàng hóa trong kho:"+Tonghanghoa);
                }
            }
        }
    }
}
