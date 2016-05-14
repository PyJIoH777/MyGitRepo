package fromkeybrd;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class vvod
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        String name = reader.readLine();
        String Age = reader.readLine();
        
        System.out.print(name+" захватит мир через " +Age+" лет. Му-ха-ха!");//Напишите тут ваш код

    }
}