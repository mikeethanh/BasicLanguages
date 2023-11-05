using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _1._3
{
    internal class Program
    {
        static void Main(string[] args)
        {
            // float div  = (float ) khong can ngoac 
            Console.Write( "a = ");
            int a  =Convert.ToInt32(Console.ReadLine()) ;
            Console.Write("b  = ");
            int b = Convert.ToInt32(Console.ReadLine());           
            int sum = (a + b);
           int tru = (a - b);
            int nhan = (a * b);
            float  div = (float)a / b;
            int div1 = (a % b);
            Console.WriteLine( "a + b  = "+ sum);
            Console.WriteLine("a - b  = " + tru);
            Console.WriteLine("a * b  = " + nhan);
            Console.WriteLine("a / b = "+ div);
            Console.WriteLine( "a % b  = "  + div1 );

        }
    }
}
