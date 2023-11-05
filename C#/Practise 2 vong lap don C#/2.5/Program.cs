using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _2._5
{
    internal class Program
    {
        static void Main(string[] args)
        {
            // tinh tong cac giai thua "!"
            Console.Write("Nhap so nguyen duong n : ");
            int n = Convert.ToInt32(Console.ReadLine());
            int sum = default(int);
            int Giaithua = 1;
            if (n > 0)
            {
                for (int i = 1; i <= n ; i++)
                {
                    // ket thuc 1 vong lap  giai thua sau bang giai thua truoc nhan i 
                    Giaithua = Giaithua * i;
                    sum = sum  + Giaithua ;
                }
                Console.WriteLine("Tong cac giai thua = " + sum );               
            }else
            {
                Console.WriteLine("Nhap n > 0 ");
            }
        }
    }
}
