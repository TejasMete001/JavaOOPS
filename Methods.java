class Computer{
    public void Playmusic(){
        System.out.println("Music Playing");
    }
    public String Gamepass(boolean gamepass){
        if(gamepass==true){
            return "Loading the game";
        }else{
            return "Cannot load game,please buy the game pass";
        }
    }
}


public class Methods {
    public static void main(String[] args) {
        Computer obj= new Computer();
        obj.Playmusic();

        String str = obj.Gamepass(false);
        System.out.println(str);
    }
}
