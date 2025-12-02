
class ADD{
    public int Add(int num1, int num2){
        System.out.println("add called");
        int r= num1+num2;
        return r;
    }
}

public class OOPS1 {

    public static void main(String[] args) {
        int num1=5;
        int num2=10;

        //create refference variable for class
        ADD res = new ADD();
        int addition=res.Add(num1,num2);
        System.out.println(addition);


//        System.out.println(num1+num2);

    }

}
