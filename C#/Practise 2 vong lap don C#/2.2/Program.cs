using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _2._2
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.Write("Nhap so tu nhien n : ");
            int n = Convert.ToInt32(Console.ReadLine());
            int sum = default (int);
            for (int i = 1; i <= n ; i++)
            {
                sum +=  i; 
            }
            Console.WriteLine($"Tong cac gia tri nguyen tu 1 den {n} la {sum}");


        }
    }
}
