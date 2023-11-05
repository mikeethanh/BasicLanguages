using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _1._10
{
    internal class Program
    {
        static void Main(string[] args)
        {
            // giai va bien luan pt bac hai 
            Console.Write("cho a = ");
            double a = Convert.ToDouble(Console.ReadLine());
            Console.Write("Cho b = ");
            double b = Convert.ToDouble(Console.ReadLine());
            Console.Write("Cho c = ");
            double c = Convert.ToDouble(Console.ReadLine());
            Console.WriteLine($"{a}*x^2 + {b}*x + {c}= 0. Tim x ?" );
            double denta = (Math.Pow(b, 2) - 4 * a * c);
            if (denta < 0 && a != 0)
            {
                Console.WriteLine("Phuong trinh vo nghiem");
            }
            else if (denta == 0 && a != 0)
            {
                double x = (-b / 2 * a);
                Console.WriteLine("Phuong trinh co nghiem kep : x = -b/2a");
                Console.WriteLine($"<=> x = {-b}/2*{a}");
                Console.WriteLine("x = " + x);
            }
            else if (denta > 0 && a != 0)
            {
                double x1 = ((-b + Math.Sqrt(denta))/(2*a));
                double x2 = ((-b - Math.Sqrt(denta)) / (2*a));
                Console.WriteLine("Phuong trinh co 2 nghiem phan biet : x1,2 = (-b = +-can denta)/2*a");
                Console.WriteLine($"<=> x1 ={x1}");
                Console.WriteLine($"    x2 ={x2}");
            }if (a == 0)
            {
                double x  = (-c/b);
                Console.WriteLine("Phuong trinh co 1 nghiem don : x ="+x);
            }

     

        }
    }
}
