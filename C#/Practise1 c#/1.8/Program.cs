using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _1._8
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.Write("Ban kinh cua hinh tron : ");
            double r = Convert.ToDouble(Console.ReadLine());
            if (r >= 0)
            {
                double cv = (2 * Math.PI * r);
                Console.WriteLine($"Chu vi hinh tron : 2*PI*{r} = {cv} ");
                double s = (Math.PI * r * r);
                Console.WriteLine($"Dien tich hinh tron : PI*{r}*{r} = {s} ");

            }           
            if (r <0)
            {
                Console.WriteLine("Khong the tinh S ; P ");
            }
        }
    }
}
