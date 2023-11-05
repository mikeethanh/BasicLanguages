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
            Console.Write("Nhap so tu nhien n : ");
            int n = Convert.ToInt32(Console.ReadLine());
            // nhan biet so nguyen to 
            if ( n >= 2)
            {
                // khong hiu 
                bool lasoNT = true;
                for (int i = 2; i < (n-1); i++)
                {                   
                    if (n % i == 0)
                    {
                        lasoNT = false;
                    }                  
                }if (lasoNT)
                {
                    Console.WriteLine($"{n} la so nguyen to ");
                }else
                {
                    Console.WriteLine($"{n} khong phai la so nguyen to ");
                }

            }else
            {
                Console.WriteLine("n khong phai la so nguyen");
            }
            
            
        }
    }
}
