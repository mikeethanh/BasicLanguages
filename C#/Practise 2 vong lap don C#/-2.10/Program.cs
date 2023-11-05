using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _2._10
{
    internal class Program
    {
        static void Main(string[] args)
        {
            // viet chuong trinh phan tich 1 so nguyen thanh thua so NT
            /* 
             * vd 
             *20 = 2 x 2 x 5 
             *neu 20 chia het cho 2 hien thi ra so 2 
             *20 = 20 : 2 
             */
            Console.Write("Nhap so nguyen n :");
            int n = Convert.ToInt32(Console.ReadLine());
            if (n > 0)
            {
                int i = 2;
                while (n > 0)
                {
                    if (n % i == 0)
                    {
                        Console.Write(i);
                        if (n != i )
                        {
                            Console.Write("x");
                        }
                        n = n / i;
                    }else
                    {
                        i++; 
                    }


                }


            }
            else
            {
                Console.WriteLine("Nhap so nguyen n > 0 .");
            }
        }
    }
}
