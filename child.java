public class child extends parent{

 private String cName;
    child(){
        System.out.println(" child");
    }
    child( String c , String p){
        super(p);
        cName=c;
    }
    void display(){
        super.display();
        System.out.println(" Child Name :"+cName);

    }
}
