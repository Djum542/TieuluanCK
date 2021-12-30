package com.duct2008110309.baikiemtraCK;

import com.duct2008110309.baikiemtraCK.Node;

public class Node {
    // nội dung dữ liệu
    hanghoa data;
    Node next;
    // liên kết dữ liệu
    data = null;
    next = null;
}
    public Node(hanghoa Hanghoa){
    data = hanghoa;
    next = null;
    }
    public Node(hanghoa Hanghoa,Node node){
    data = hanghoa;
    next = node;
    }
