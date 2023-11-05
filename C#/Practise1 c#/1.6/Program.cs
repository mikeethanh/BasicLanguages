using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _1._6
{
    internal class Program
    {
        static void Main(string[] args)
        {
            // gia tri lon thu ha itrong 4 so 
            Console.Write("a = ");
            int a = Convert.ToInt32(Console.ReadLine());
            Console.Write("b = ");
            int b = Convert.ToInt32(Console.ReadLine());
            Console.Write("c = ");
            int c = Convert.ToInt32(Console.ReadLine());
            Console.Write("d = ");
            int d = Convert.ToInt32(Console.ReadLine());
            if (a == b && b == c && c == d)
            {
                Console.WriteLine("Khong co gia tri lon thu hai");
            }
            else
            {
                int max = a;
                if (b > max)
                {
                    max = b;
                }
                if (c > max)
                {
                    max = c;
                }
                if (d > max)
                {
                    max = d;
                }
                int min = a;
                if (b < min)
                {
                    min = b;
                }
                if (c < min)
                {
                    c = min;
                }
                if (d < min)
                {
                    d = min;
                }
                int max2 = min;
                if (max2 < a && a != max)
                {
                    max2 = a;
                }
                if (max2 < b && b != max)
                {
                    max2 = b;
                }
                if (max2 < c && c != max)
                {
                    max2 = c;
                }
                if (max2 < d && d != max)
                {
                    max2 = d;
                }
                Console.WriteLine("gia tri lon thu 2 la "+max2 );
            }

        }
    }

}
