/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package centrallibray;

/**
 *
 * @author USER
 */
class book {
     private String BOOK_ID,TITLE,WRITER,ISBN;
    
    public book(String BOOK_ID,String TITLE,String WRITER,String ISBN){
       this.BOOK_ID=BOOK_ID ;
       this.TITLE=TITLE; 
       this.WRITER=WRITER; 
       this.ISBN =ISBN;
      
    }
    public String getBOOK_ID(){
        return BOOK_ID;
    }
    public String getTITLE(){
        return TITLE;
    }
    public String getWRITER(){
        return WRITER;
    }
    public String getISBN(){
        return ISBN;
    }
}
