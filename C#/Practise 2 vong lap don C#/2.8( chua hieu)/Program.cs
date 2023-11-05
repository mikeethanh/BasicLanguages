using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _2._8
{
    internal class Program
    {
        static void Main(string[] args)
        {
            // uoc chung lon nhat va boi chung nho nhat cua 2 so nguyen 
            Console.Write("Nhap so tu nhien a : ");
            int a = Convert.ToInt32(Console.ReadLine());
            Console.Write("Nhap so tu nhien b : ");
            int b = Convert.ToInt32(Console.ReadLine()); 
            for (int i = 1; i < 100; i++)
            {
                if (a == 0 && b == 0 )
                {
                    Console.WriteLine("Khong co BCLN va UCNN ");
                }else if (a == 0 || b ==0 )
                {
                    Console.WriteLine("Khong co BCNN");
                    Console.WriteLine("UCLN la : "+ (a == 0 ? b : a ));// neu a == 0 thi so hien thi ra la b 
                }else if (a > 0 && b > 0)
                {
                    if (i % a == 0 && i % b == 0)
                    {
                        Console.WriteLine(i);
                    }
                }
            }
        }
    }
}
