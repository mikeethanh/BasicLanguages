using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _2._6
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.Write("Nhap n  : ");
            int n = Convert.ToInt32(Console.ReadLine());
            Console.Write("Nhap k : ");
            int k = Convert.ToInt32(Console.ReadLine());
            if (n > 0 && k > 0)
            {
                int sum = default(int);
                for (int i = 1; i < n; i++)
                {
                    if (i % k == 0)
                    {
                        sum = sum + i; 
                    }                  
                }
                Console.WriteLine("Tong cac so tu nhien khong lon hon n va chia het cho k = "+  sum);

            }else
            {
                Console.WriteLine("Nhap n , k > 0 ");
            }
        }
    }
}
