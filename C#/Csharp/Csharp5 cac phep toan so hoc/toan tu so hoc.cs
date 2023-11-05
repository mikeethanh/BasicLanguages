using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Csharp5_cac_phep_toan_so_hoc
{
    internal class Program
    {
        static void Main(string[] args)
        {
            // + - * / % ++ -- 
            //  ep kieu( int - long - float- double )
         
            float a =(float) 13.4;
            uint b = 10;
            float s = (float) (a+b) ;
            Console.WriteLine("a + b = " + s);
            string n = "Hello";
            string m = n + s;
            Console.WriteLine(m);
            float c =(float) 10.54;
            int d = (int)34.5;
            int e = (int)(c + d);
            _ = e;
            Console.WriteLine(" c + d = " + (e));
            //  /: khong lay phan dang sau dau phay ; tu or mau la thuc => so thuc 
            Console.WriteLine( " b / d = "+b/d );
            Console.WriteLine("b / d = " + (float) (b/d)) ;
            Console.WriteLine("b / d = " + 1.0f*b / d);
            Console.WriteLine(  "a / d =" +(a/d));
            // % : phep chia lay phan du 
            Console.WriteLine("a % b = "+(a%b));
            Console.WriteLine(" d % b = " + d % b);
            // ++(+1) --(-1)
            b++;d--;
            Console.WriteLine("b = " + b); 



        }
    }
}
