package Ch8ClassesObjects;

public class Tv {
    //variables
    int chanel,volume;
    boolean status;

    //constructor
    Tv(){
        chanel=1;
        volume=0;
        status=false;}
        //methods
        //1.turn On
          void turOn()
               {
                 if (status==false)
                     status=true;
                  else
                      System.out.println("Error: Tv is already turned on");
                 }
          //2. turn Off
    void turnOff(){
        if(status==true)
            status=false;
        else
            System.out.println("Error:Tv is already turned Off");
    }
    //3.setChanel
    void setChanel(int newChanel1){
        if (status) {
            if (newChanel1 >= 1 && newChanel1 <= 120)
                chanel = newChanel1;
            else
                System.out.println("Error: chanel is not available![1-120]");
        }
        else
            System.out.println("Error: turn on your Tv!");


    }
    //4. chanel up
    void chanelUp(){
        if (status){
            if (chanel < 120)
                chanel++;
            else
                chanel=1;
        }
        else
            System.out.println("Error:turn on your Tv!");
    }
    //5.chanel down
    void chanelDown(){
        if (status){
            if (chanel > 1)
                chanel--;
            else
                chanel=120;
        }
        else
            System.out.println("Error: turn on your tv!");
    }
    //6. volume up
    void volumeUp(){
        if (status){
            if (volume < 7)
                volume++;
            else
                System.out.println("Error: you reached the limit[7 the maximum amount]");
        }
        else
            System.out.println("Error: turn on your Tv!");
    }
    //7. volume down
    void volumeDown(){
        if (status){
            if (volume > 0)
                volume--;
            else
                System.out.println("Error: you reached the limit[0 the minimum amount");
        }
        else
            System.out.println("Error: turn on your Tv!");
    }
    int tempVolume;
    //mute
    void mute(){
        if (status){
            tempVolume=volume;
            System.out.println("muted!");
        }
        else
            System.out.println("Error: turn on your tv!");
    }
    //un muted
    void unMuted(){
        if (status){
            volume=tempVolume;
            System.out.println("UnMuted!");
        }
        else
            System.out.println("Error:turn on your tv!");
    }


    public static void main(String[] args) {
        Tv just = new Tv();
        just.turOn();
        just.chanelUp();
        just.setChanel(4);
        just.volumeUp();
        just.volumeUp();
        System.out.println("volume : "+ just.volume);
        System.out.println("Chanel: "+ just.chanel);
        just.mute();
        System.out.println("volume after muted : "+just.volume);
        just.unMuted();
        System.out.println("volume after UnMuted: "+just.volume);
    }
    }


