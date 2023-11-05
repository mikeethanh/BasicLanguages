using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _2._4
{
    internal class Class2
    {
        static void Main(string[] args)
        {
            // TBC cac so chan khong lon hon n 
            Console.Write("Nhap so tu nhien n : ");
            int n  =Convert.ToInt32(Console.ReadLine());
            if (n > 0)
            {
                int sum = default(int);
                int SoSoHangChan = default(int);
                for (int i = 1; i <= n ; i++)
                {
                    if (i % 2 == 0)
                    {
                        sum = sum + i;
                        SoSoHangChan++;
                    }
                }
                Console.WriteLine("TBC cac so chan khong lon hon n : "+((sum *1.0)/SoSoHangChan));
            }else
            {
                Console.WriteLine("Nhap n > 0 ");
            }

        }
    }
}
