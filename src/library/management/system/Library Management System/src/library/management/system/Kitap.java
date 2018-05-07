/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.management.system;

/**
 *
 * @author sena
 */
class Kitap {
    private int bookid;
    private String bookname;
    private String publisher;
    private int edition;
    private int price;
    private int pages;
    private int stock;
    
    public Kitap(int bookid,String bookname,String publisher,int edition,int price,int pages,int stock){
        this.bookid=bookid;
        this.bookname=bookname;
        this.publisher=publisher;
        this.edition=edition;
        this.price=price;
        this.pages=pages;
        this.stock=stock;
        
        
    }
    public int getbookid(){
        return bookid;
    }
    public String getbookname(){
        return bookname;
    }
    public String getpublisher(){
        return publisher;
    }
    public int getedition(){
        return edition;
    }
    public int getprice(){
        return price;
    }
    public int getpages(){
        return pages;
    }
    public int getstock(){
        return stock;
    }
    
    
    
}
