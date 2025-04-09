
class time{
    protected int hour;
    protected int minutes;
    protected int sec;
    time(){
        hour=0;
        minutes=0;
        sec=0;

    }
    time(int hour,int minutes,int sec){
        this.minutes=minutes;
        this.hour=hour;
        this.sec=sec;

    }

    public void seettime(int h, int m,int s){
        if(h>=0&&h<24 && m>=0&&m<60 && s>=0&& s<60){
            hour=h;
            minutes=m;
            sec=s;
        }
        else {
            System.out.println("Invalid Time");
            hour=0;
            minutes=0;
            sec=0;

        }

    }
    public void display(){
        System.out.println("Hours"+hour+" "+"Minutes"+minutes+" "+"Seconds"+sec);
    }
}

public class Main {
    public static void main(String[] args) {

        time check=new time(13,45,45);
        check.display();
        check.seettime(13,45,56);
        time t2=new time(25,55,59);
        t2.display();
        t2.seettime(25,55,59);
    }
}