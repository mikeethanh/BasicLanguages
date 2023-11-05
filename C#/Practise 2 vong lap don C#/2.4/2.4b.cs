using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _2._4
{
    internal class Class1
    {
        static void Main(string[] args)
        {
            Console.Write("Nhap n (n > 0) : ");
            int n = Convert.ToInt32(Console.ReadLine());
            int sum = default(int);
            int soSoHangLe = default;
            for (int i = 1; i <=n ; i++)
            { 
               
                if (i % 2 == 1)
                {
                    sum = sum + i;
                    soSoHangLe++;
                }               
            }
            Console.WriteLine("Tong trung binh cong  cac so tu nhien <= n : "+ ((sum*1.0)/soSoHangLe) );

        }
    }
}
