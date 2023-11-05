using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _2._7
{
    internal class Program
    {
        static void Main(string[] args)
        {
            // liet ke cac uoc tu nhien cua 1 so
            Console.Write("Nhap so tu nhien n : ");
            int n = Convert.ToInt32(Console.ReadLine());
            int dem = default;
            if (n > 0)
            {
                for (int i = 1; i <= n ; i++)
                {
                    if (n % i == 0)
                    {
                        Console.WriteLine(i+ " ");
                        dem++;
                    }
                }
                Console.WriteLine("Su uoc tu nhien cua n la : "+ dem);
            } else
            {
                Console.WriteLine("Gia tri khong hop le . Nhap lai n (n > 0)");
            }
        }
    }
}
