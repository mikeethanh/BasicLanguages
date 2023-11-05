using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _1._5
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.Write("a = ");
            int a = Convert.ToInt32(Console.ReadLine());
            Console.Write("b = ");
            int b = Convert.ToInt32(Console.ReadLine());
            Console.Write("c = ");
            int c = Convert.ToInt32(Console.ReadLine());
            Console.Write("d = ");
            int d = Convert.ToInt32(Console.ReadLine());
            //if (a == b && b == c && c == d)
            if (a == b && b == c && c == d)
            {
                Console.WriteLine("Khong co gia tri nho nhat ");
            }else
            /*{
                int min = a;
                
                if (min > b)
                {
                   min = b ;
                }if (min > c)
                {
                    min = c ;
                }if (min > d)
                {
                    min = d;               
                }
                /*Console.WriteLine(" So nho nhat trong 4 so la :"+min);
            }

        }
    }
}
