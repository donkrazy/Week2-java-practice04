package prob3;

public class Book {
    int bookNo;
    String title;
    String author;
    int stateCode;

    public Book(int bookNo,String title,String author){
        this.bookNo = bookNo;
        this.title = title;
        this.author = author;
        this.stateCode = 1;
    }

    public void rent(){
        if(this.stateCode == 1) {
            this.stateCode = 0;
            System.out.println(this.title+"이(가) 대여되었습니다.");
        }
        else if(this.stateCode == 0){
            System.out.println(this.title+"이(가) 이미 대여중입니다.");
        }
        else{
            System.out.println("오류");
        }

    }
    public void print(){
        String inStock;
        if(this.stateCode==0){
            inStock = "대여중";
        }
        else if(this.stateCode==1){
            inStock = "재고 있음";
        }
        else{
            inStock = "재고 error";
        }
        System.out.println("책 제목: "+this.title+", 작가: "+this.author+", 대여 유무: "+inStock);
    }

}
