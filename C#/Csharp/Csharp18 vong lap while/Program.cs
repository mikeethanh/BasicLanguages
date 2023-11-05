using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Csharp18_vong_lap_while
{
    internal class Program
    {
        static void Main(string[] args)
        {
            // vong lap while 
            /* while (dk){
             *   noi dung can thuc hien 
             *   }
             */
              
            // cac gia tri so le tu 1 -> n 
            int n = Convert.ToInt32(Console.ReadLine());
            int i = default(int);
            while (i < n)
            {
                if (i % 2 == 1)
                {
                    Console.WriteLine("Cac so le < n : " + i);
                }
                i++;
            }
                // tinh tong gia tri tu a -> b 
                Console.Write(" Nhap a : ");
                int a = Convert.ToInt32(Console.ReadLine());
                Console.Write(" Nhap b : ");
                int b = Convert.ToInt32(Console.ReadLine());
                int c = a;
                int sum = default(int);         
                  while (c <= b)
                  {
                      sum = sum + c;
                      c++;
                  }
                  Console.WriteLine($"tong cac gia tri tu {a} den {b} la : {sum}");




        }
    }
}
