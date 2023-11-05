using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _1._9
{
    internal class Program
    {
        static void Main(string[] args)
        {
            // bien luan va giai phuong trinh bac nhat 
            double a = Convert.ToDouble(Console.ReadLine());
            double b = Convert.ToDouble(Console.ReadLine());
            if (a == 0 && b == 0)
            {
                Console.WriteLine("Phuong trinh co vo so nghiem");
            }
            else if (a == 0 && b != 0)
            {
                Console.WriteLine("Phuong trinh vo nghiem ");
            }
            else if (a != 0 && b != 0)
            {
                double x = (double)(-b / a);
                Console.WriteLine($"{x} = -{b} / {a}");
            }
         

        }
    }
}
