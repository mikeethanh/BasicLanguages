using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Practise2
{
    internal class Program
    {
        static void Main(string[] args)
        {
            // bai 1.2
            Console.Write("a = ");
            int a = Convert.ToInt32(Console.ReadLine());          
            if (a % 2 == 0)
            {
                Console.WriteLine("a la so : chan ");
            }
            else
            {
                Console.WriteLine("a la so : le ");
            }
            if (a % 3 == 0)
            {
                Console.WriteLine("a chia het cho 3 ");
            }else
            {
                Console.WriteLine("a khong chua het cho 3 ");
            }


        }
    }
}
