import java.util.Scanner;
class Function
{
    int fact=1,num,i;
    public void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Factroial no: ");
        num=sc.nextInt();
    } 
    public void loop()
    {
        for(i=num;i>=1;i--)
        {
            fact=fact*i;
        }
    }    
    public void print()
    {    
        System.out.print("Factorial value="+fact);
    }    
    public static void main(String[] args)
    {
    Function fn= new Function();
    fn.input();
    fn.loop();
    fn.print();
    }
}    


