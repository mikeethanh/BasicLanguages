using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _1._7
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.Write("Chieu dai hcn : ");
            int a = Convert.ToInt32(Console.ReadLine());
            Console.Write("Chieu rong hcn : ");
            int b = Convert.ToInt32(Console.ReadLine());
            int mul = (a * b);
            Console.WriteLine($"Dien tich hcn : {a} * {b} = {mul}");
            int cv = ((a + b) * 2);
            Console.WriteLine($"Chu vi hcn la : ({a} + {b}) * 2)= {cv}");
        }
    }
}
