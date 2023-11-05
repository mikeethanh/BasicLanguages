using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _2._3
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.Write("Nhap n : ");
            int n = Convert.ToInt32(Console.ReadLine());
            double sum = default;
            for (int i = 1; i < n;i++)
            {
                sum = sum + 1.0 / i;

            }
            Console.WriteLine(sum);
        }
    }
}
