import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {

        ArrList<String> stringArrList = new ArrList<> ();
        stringArrList.add ( "Hello" );
        stringArrList.add ( "my name is" );
        stringArrList.add ( "Alina" );
        stringArrList.add ( "i'm 20 " );
        stringArrList.add ( "years" );
        stringArrList.add ( "old" );
        System.out.println (stringArrList.getByIndex ( 0 ) );
        System.out.println (stringArrList.getByIndex ( 1 ) );
        System.out.println (stringArrList.getByIndex ( 2 ) );

        stringArrList.remove ( 2 );
        System.out.println (stringArrList.getByIndex ( 2 ) );

        System.out.println (stringArrList.getByIndex ( 3 ) );
        System.out.println (stringArrList.getByIndex ( 4 ) );


    }

}