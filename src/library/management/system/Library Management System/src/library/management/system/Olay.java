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
class Olay {

    private String name2;
    private String surname;
    private String email;
    private int bookid;
    private String name;
    private int edition;
    private String publisher;
    private int price;
    private int pages;
    private int dateofissue;

    public Olay(String name2, String surname, String email, int bookid, String name, int edition, String publisher, int price, int pages, int dateofissue) {
        this.name2 = name2;
        this.surname = surname;
        this.email = email;
        this.bookid = bookid;
        this.name = name;
        this.edition = edition;
        this.publisher = publisher;
        this.price = price;
        this.pages = pages;
        this.dateofissue = dateofissue;

    }

    public String getname2() {
        return name2;

    }

    public String getsurname() {
        return surname;

    }

    public String getemail() {
        return email;

    }

    public int getbookid() {
        return bookid;

    }

    public String getname() {
        return name;

    }

    public int getedition() {
        return edition;

    }

    public String getpublisher() {
        return publisher;

    }

    public int getprice() {
        return price;

    }

    public int getpages() {
        return pages;

    }

    public int getdateofissue() {
        return dateofissue;

    }

}
