using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _2._4
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.Write("Nhap n : ");
            int n = Convert.ToInt32(Console.ReadLine());
            int sum = default(int);
            for (int i = 1; i <= n; i++)
            {
                sum = sum + i;
            }
            Console.WriteLine("Trung binh cong cua cac so tu nhien khong lon hon  n  : " + (sum / (n*1.0)));
        }
    }
}
